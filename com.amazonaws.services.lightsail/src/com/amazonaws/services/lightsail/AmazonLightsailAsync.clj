(ns com.amazonaws.services.lightsail.AmazonLightsailAsync
  "Interface for accessing Amazon Lightsail asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonLightsailAsync instead.



  Amazon Lightsail is the easiest way to get started with AWS for developers who just need virtual private servers.
  Lightsail includes everything you need to launch your project quickly - a virtual machine, a managed database,
  SSD-based storage, data transfer, DNS management, and a static IP - for a low, predictable price. You manage those
  Lightsail servers through the Lightsail console or by using the API or command-line interface (CLI).


  For more information about Lightsail concepts and tasks, see the Lightsail Dev Guide.


  To use the Lightsail API or the CLI, you will need to use AWS Identity and Access Management (IAM) to generate access
  keys. For details about how to set this up, see the Lightsail Dev Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lightsail AmazonLightsailAsync]))

(defn untag-resource-async
  "Deletes the specified set of tag keys and their values from the specified Amazon Lightsail resource.


   The untag resource operation supports tag-based access control via request tags and resource tags
   applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.

  untag-resource-request - `com.amazonaws.services.lightsail.model.UntagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UntagResourceRequest untag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync untag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UntagResourceRequest untag-resource-request]
    (-> this (.untagResourceAsync untag-resource-request))))

(defn get-load-balancer-metric-data-async
  "Returns information about health metrics for your Lightsail load balancer.

  get-load-balancer-metric-data-request - `com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoadBalancerMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest get-load-balancer-metric-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoadBalancerMetricDataAsync get-load-balancer-metric-data-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest get-load-balancer-metric-data-request]
    (-> this (.getLoadBalancerMetricDataAsync get-load-balancer-metric-data-request))))

(defn get-relational-databases-async
  "Returns information about all of your databases in Amazon Lightsail.

  get-relational-databases-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabasesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabasesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabasesRequest get-relational-databases-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabasesAsync get-relational-databases-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabasesRequest get-relational-databases-request]
    (-> this (.getRelationalDatabasesAsync get-relational-databases-request))))

(defn reboot-relational-database-async
  "Restarts a specific database in Amazon Lightsail.


   The reboot relational database operation supports tag-based access control via resource tags applied
   to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  reboot-relational-database-request - `com.amazonaws.services.lightsail.model.RebootRelationalDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.RebootRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.RebootRelationalDatabaseRequest reboot-relational-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootRelationalDatabaseAsync reboot-relational-database-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.RebootRelationalDatabaseRequest reboot-relational-database-request]
    (-> this (.rebootRelationalDatabaseAsync reboot-relational-database-request))))

(defn delete-known-host-keys-async
  "Deletes the known host key or certificate used by the Amazon Lightsail browser-based SSH or RDP clients to
   authenticate an instance. This operation enables the Lightsail browser-based SSH or RDP clients to connect to the
   instance after a host key mismatch.



   Perform this operation only if you were expecting the host key or certificate mismatch or if you are familiar
   with the new host key or certificate on the instance. For more information, see Troubleshooting connection issues when using the Amazon Lightsail browser-based SSH or RDP client.

  delete-known-host-keys-request - `com.amazonaws.services.lightsail.model.DeleteKnownHostKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteKnownHostKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteKnownHostKeysResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteKnownHostKeysRequest delete-known-host-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteKnownHostKeysAsync delete-known-host-keys-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteKnownHostKeysRequest delete-known-host-keys-request]
    (-> this (.deleteKnownHostKeysAsync delete-known-host-keys-request))))

(defn get-regions-async
  "Returns a list of all valid regions for Amazon Lightsail. Use the include availability zones
   parameter to also return the Availability Zones in a region.

  get-regions-request - `com.amazonaws.services.lightsail.model.GetRegionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRegions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRegionsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRegionsRequest get-regions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRegionsAsync get-regions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRegionsRequest get-regions-request]
    (-> this (.getRegionsAsync get-regions-request))))

(defn delete-disk-async
  "Deletes the specified block storage disk. The disk must be in the available state (not attached to a
   Lightsail instance).



   The disk may remain in the deleting state for several minutes.



   The delete disk operation supports tag-based access control via resource tags applied to the
   resource identified by diskName. For more information, see the Lightsail Dev Guide.

  delete-disk-request - `com.amazonaws.services.lightsail.model.DeleteDiskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDisk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteDiskResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteDiskRequest delete-disk-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDiskAsync delete-disk-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteDiskRequest delete-disk-request]
    (-> this (.deleteDiskAsync delete-disk-request))))

(defn attach-static-ip-async
  "Attaches a static IP address to a specific Amazon Lightsail instance.

  attach-static-ip-request - `com.amazonaws.services.lightsail.model.AttachStaticIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachStaticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.AttachStaticIpResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.AttachStaticIpRequest attach-static-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachStaticIpAsync attach-static-ip-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.AttachStaticIpRequest attach-static-ip-request]
    (-> this (.attachStaticIpAsync attach-static-ip-request))))

(defn stop-relational-database-async
  "Stops a specific database that is currently running in Amazon Lightsail.


   The stop relational database operation supports tag-based access control via resource tags applied
   to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  stop-relational-database-request - `com.amazonaws.services.lightsail.model.StopRelationalDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.StopRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.StopRelationalDatabaseRequest stop-relational-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopRelationalDatabaseAsync stop-relational-database-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.StopRelationalDatabaseRequest stop-relational-database-request]
    (-> this (.stopRelationalDatabaseAsync stop-relational-database-request))))

(defn get-disks-async
  "Returns information about all block storage disks in your AWS account and region.


   If you are describing a long list of disks, you can paginate the output to make the list more manageable. You can
   use the pageToken and nextPageToken values to retrieve the next items in the list.

  get-disks-request - `com.amazonaws.services.lightsail.model.GetDisksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDisks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDisksResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDisksRequest get-disks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDisksAsync get-disks-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDisksRequest get-disks-request]
    (-> this (.getDisksAsync get-disks-request))))

(defn delete-domain-async
  "Deletes the specified domain recordset and all of its domain records.


   The delete domain operation supports tag-based access control via resource tags applied to the
   resource identified by domainName. For more information, see the Lightsail Dev Guide.

  delete-domain-request - `com.amazonaws.services.lightsail.model.DeleteDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteDomainResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteDomainRequest delete-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainAsync delete-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteDomainRequest delete-domain-request]
    (-> this (.deleteDomainAsync delete-domain-request))))

(defn get-relational-database-log-streams-async
  "Returns a list of available log streams for a specific database in Amazon Lightsail.

  get-relational-database-log-streams-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseLogStreams operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsRequest get-relational-database-log-streams-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseLogStreamsAsync get-relational-database-log-streams-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsRequest get-relational-database-log-streams-request]
    (-> this (.getRelationalDatabaseLogStreamsAsync get-relational-database-log-streams-request))))

(defn delete-disk-snapshot-async
  "Deletes the specified disk snapshot.


   When you make periodic snapshots of a disk, the snapshots are incremental, and only the blocks on the device that
   have changed since your last snapshot are saved in the new snapshot. When you delete a snapshot, only the data
   not needed for any other snapshot is removed. So regardless of which prior snapshots have been deleted, all
   active snapshots will have access to all the information needed to restore the disk.


   The delete disk snapshot operation supports tag-based access control via resource tags applied to
   the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.

  delete-disk-snapshot-request - `com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDiskSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest delete-disk-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDiskSnapshotAsync delete-disk-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest delete-disk-snapshot-request]
    (-> this (.deleteDiskSnapshotAsync delete-disk-snapshot-request))))

(defn update-load-balancer-attribute-async
  "Updates the specified attribute for a load balancer. You can only update one attribute at a time.


   The update load balancer attribute operation supports tag-based access control via resource tags
   applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  update-load-balancer-attribute-request - `com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLoadBalancerAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest update-load-balancer-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLoadBalancerAttributeAsync update-load-balancer-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest update-load-balancer-attribute-request]
    (-> this (.updateLoadBalancerAttributeAsync update-load-balancer-attribute-request))))

(defn update-relational-database-async
  "Allows the update of one or more attributes of a database in Amazon Lightsail.


   Updates are applied immediately, or in cases where the updates could result in an outage, are applied during the
   database's predefined maintenance window.


   The update relational database operation supports tag-based access control via resource tags applied
   to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  update-relational-database-request - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseRequest update-relational-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRelationalDatabaseAsync update-relational-database-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseRequest update-relational-database-request]
    (-> this (.updateRelationalDatabaseAsync update-relational-database-request))))

(defn update-relational-database-parameters-async
  "Allows the update of one or more parameters of a database in Amazon Lightsail.


   Parameter updates don't cause outages; therefore, their application is not subject to the preferred maintenance
   window. However, there are two ways in which paramater updates are applied: dynamic or
   pending-reboot. Parameters marked with a dynamic apply type are applied immediately.
   Parameters marked with a pending-reboot apply type are applied only after the database is rebooted
   using the reboot relational database operation.


   The update relational database parameters operation supports tag-based access control via resource
   tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  update-relational-database-parameters-request - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRelationalDatabaseParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersRequest update-relational-database-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRelationalDatabaseParametersAsync update-relational-database-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersRequest update-relational-database-parameters-request]
    (-> this (.updateRelationalDatabaseParametersAsync update-relational-database-parameters-request))))

(defn create-load-balancer-tls-certificate-async
  "Creates a Lightsail load balancer TLS certificate.


   TLS is just an updated, more secure version of Secure Socket Layer (SSL).


   The create load balancer tls certificate operation supports tag-based access control via resource
   tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  create-load-balancer-tls-certificate-request - `com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancerTlsCertificate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest create-load-balancer-tls-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerTlsCertificateAsync create-load-balancer-tls-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest create-load-balancer-tls-certificate-request]
    (-> this (.createLoadBalancerTlsCertificateAsync create-load-balancer-tls-certificate-request))))

(defn get-instance-port-states-async
  "Returns the port states for a specific virtual private server, or instance.

  get-instance-port-states-request - `com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstancePortStates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstancePortStatesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest get-instance-port-states-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstancePortStatesAsync get-instance-port-states-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest get-instance-port-states-request]
    (-> this (.getInstancePortStatesAsync get-instance-port-states-request))))

(defn get-static-ip-async
  "Returns information about a specific static IP.

  get-static-ip-request - `com.amazonaws.services.lightsail.model.GetStaticIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStaticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetStaticIpResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetStaticIpRequest get-static-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStaticIpAsync get-static-ip-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetStaticIpRequest get-static-ip-request]
    (-> this (.getStaticIpAsync get-static-ip-request))))

(defn get-relational-database-events-async
  "Returns a list of events for a specific database in Amazon Lightsail.

  get-relational-database-events-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsRequest get-relational-database-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseEventsAsync get-relational-database-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsRequest get-relational-database-events-request]
    (-> this (.getRelationalDatabaseEventsAsync get-relational-database-events-request))))

(defn unpeer-vpc-async
  "Attempts to unpeer the Lightsail VPC from the user's default VPC.

  unpeer-vpc-request - `com.amazonaws.services.lightsail.model.UnpeerVpcRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnpeerVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UnpeerVpcResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UnpeerVpcRequest unpeer-vpc-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unpeerVpcAsync unpeer-vpc-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UnpeerVpcRequest unpeer-vpc-request]
    (-> this (.unpeerVpcAsync unpeer-vpc-request))))

(defn detach-disk-async
  "Detaches a stopped block storage disk from a Lightsail instance. Make sure to unmount any file systems on the
   device within your operating system before stopping the instance and detaching the disk.


   The detach disk operation supports tag-based access control via resource tags applied to the
   resource identified by diskName. For more information, see the Lightsail Dev Guide.

  detach-disk-request - `com.amazonaws.services.lightsail.model.DetachDiskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachDisk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DetachDiskResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DetachDiskRequest detach-disk-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachDiskAsync detach-disk-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DetachDiskRequest detach-disk-request]
    (-> this (.detachDiskAsync detach-disk-request))))

(defn delete-domain-entry-async
  "Deletes a specific domain entry.


   The delete domain entry operation supports tag-based access control via resource tags applied to the
   resource identified by domainName. For more information, see the Lightsail Dev Guide.

  delete-domain-entry-request - `com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomainEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteDomainEntryResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest delete-domain-entry-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainEntryAsync delete-domain-entry-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest delete-domain-entry-request]
    (-> this (.deleteDomainEntryAsync delete-domain-entry-request))))

(defn open-instance-public-ports-async
  "Adds public ports to an Amazon Lightsail instance.


   The open instance public ports operation supports tag-based access control via resource tags applied
   to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  open-instance-public-ports-request - `com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the OpenInstancePublicPorts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest open-instance-public-ports-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.openInstancePublicPortsAsync open-instance-public-ports-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest open-instance-public-ports-request]
    (-> this (.openInstancePublicPortsAsync open-instance-public-ports-request))))

(defn create-key-pair-async
  "Creates an SSH key pair.


   The create key pair operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-key-pair-request - `com.amazonaws.services.lightsail.model.CreateKeyPairRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateKeyPairRequest create-key-pair-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createKeyPairAsync create-key-pair-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateKeyPairRequest create-key-pair-request]
    (-> this (.createKeyPairAsync create-key-pair-request))))

(defn create-domain-entry-async
  "Creates one of the following entry records associated with the domain: Address (A), canonical name (CNAME), mail
   exchanger (MX), name server (NS), start of authority (SOA), service locator (SRV), or text (TXT).


   The create domain entry operation supports tag-based access control via resource tags applied to the
   resource identified by domainName. For more information, see the Lightsail Dev Guide.

  create-domain-entry-request - `com.amazonaws.services.lightsail.model.CreateDomainEntryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomainEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateDomainEntryResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateDomainEntryRequest create-domain-entry-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainEntryAsync create-domain-entry-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateDomainEntryRequest create-domain-entry-request]
    (-> this (.createDomainEntryAsync create-domain-entry-request))))

(defn download-default-key-pair-async
  "Downloads the default SSH key pair from the user's account.

  download-default-key-pair-request - `com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DownloadDefaultKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest download-default-key-pair-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.downloadDefaultKeyPairAsync download-default-key-pair-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest download-default-key-pair-request]
    (-> this (.downloadDefaultKeyPairAsync download-default-key-pair-request))))

(defn start-relational-database-async
  "Starts a specific database from a stopped state in Amazon Lightsail. To restart a database, use the
   reboot relational database operation.


   The start relational database operation supports tag-based access control via resource tags applied
   to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  start-relational-database-request - `com.amazonaws.services.lightsail.model.StartRelationalDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.StartRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.StartRelationalDatabaseRequest start-relational-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startRelationalDatabaseAsync start-relational-database-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.StartRelationalDatabaseRequest start-relational-database-request]
    (-> this (.startRelationalDatabaseAsync start-relational-database-request))))

(defn detach-instances-from-load-balancer-async
  "Detaches the specified instances from a Lightsail load balancer.


   This operation waits until the instances are no longer needed before they are detached from the load balancer.


   The detach instances from load balancer operation supports tag-based access control via resource
   tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  detach-instances-from-load-balancer-request - `com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachInstancesFromLoadBalancer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest detach-instances-from-load-balancer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachInstancesFromLoadBalancerAsync detach-instances-from-load-balancer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest detach-instances-from-load-balancer-request]
    (-> this (.detachInstancesFromLoadBalancerAsync detach-instances-from-load-balancer-request))))

(defn get-relational-database-metric-data-async
  "Returns the data points of the specified metric for a database in Amazon Lightsail.

  get-relational-database-metric-data-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseMetricData operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataRequest get-relational-database-metric-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseMetricDataAsync get-relational-database-metric-data-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataRequest get-relational-database-metric-data-request]
    (-> this (.getRelationalDatabaseMetricDataAsync get-relational-database-metric-data-request))))

(defn detach-static-ip-async
  "Detaches a static IP from the Amazon Lightsail instance to which it is attached.

  detach-static-ip-request - `com.amazonaws.services.lightsail.model.DetachStaticIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachStaticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DetachStaticIpResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DetachStaticIpRequest detach-static-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachStaticIpAsync detach-static-ip-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DetachStaticIpRequest detach-static-ip-request]
    (-> this (.detachStaticIpAsync detach-static-ip-request))))

(defn put-instance-public-ports-async
  "Sets the specified open ports for an Amazon Lightsail instance, and closes all ports for every protocol not
   included in the current request.


   The put instance public ports operation supports tag-based access control via resource tags applied
   to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  put-instance-public-ports-request - `com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutInstancePublicPorts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest put-instance-public-ports-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putInstancePublicPortsAsync put-instance-public-ports-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest put-instance-public-ports-request]
    (-> this (.putInstancePublicPortsAsync put-instance-public-ports-request))))

(defn get-relational-database-parameters-async
  "Returns all of the runtime parameters offered by the underlying database software, or engine, for a specific
   database in Amazon Lightsail.


   In addition to the parameter names and values, this operation returns other information about each parameter.
   This information includes whether changes require a reboot, whether the parameter is modifiable, the allowed
   values, and the data types.

  get-relational-database-parameters-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersRequest get-relational-database-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseParametersAsync get-relational-database-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersRequest get-relational-database-parameters-request]
    (-> this (.getRelationalDatabaseParametersAsync get-relational-database-parameters-request))))

(defn delete-instance-snapshot-async
  "Deletes a specific snapshot of a virtual private server (or instance).


   The delete instance snapshot operation supports tag-based access control via resource tags applied
   to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.

  delete-instance-snapshot-request - `com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInstanceSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest delete-instance-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInstanceSnapshotAsync delete-instance-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest delete-instance-snapshot-request]
    (-> this (.deleteInstanceSnapshotAsync delete-instance-snapshot-request))))

(defn get-key-pairs-async
  "Returns information about all key pairs in the user's account.

  get-key-pairs-request - `com.amazonaws.services.lightsail.model.GetKeyPairsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetKeyPairs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetKeyPairsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetKeyPairsRequest get-key-pairs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getKeyPairsAsync get-key-pairs-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetKeyPairsRequest get-key-pairs-request]
    (-> this (.getKeyPairsAsync get-key-pairs-request))))

(defn get-disk-async
  "Returns information about a specific block storage disk.

  get-disk-request - `com.amazonaws.services.lightsail.model.GetDiskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDisk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDiskResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDiskRequest get-disk-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDiskAsync get-disk-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDiskRequest get-disk-request]
    (-> this (.getDiskAsync get-disk-request))))

(defn get-static-ips-async
  "Returns information about all static IPs in the user's account.

  get-static-ips-request - `com.amazonaws.services.lightsail.model.GetStaticIpsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStaticIps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetStaticIpsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetStaticIpsRequest get-static-ips-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStaticIpsAsync get-static-ips-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetStaticIpsRequest get-static-ips-request]
    (-> this (.getStaticIpsAsync get-static-ips-request))))

(defn attach-instances-to-load-balancer-async
  "Attaches one or more Lightsail instances to a load balancer.


   After some time, the instances are attached to the load balancer and the health check status is available.


   The attach instances to load balancer operation supports tag-based access control via resource tags
   applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  attach-instances-to-load-balancer-request - `com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachInstancesToLoadBalancer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest attach-instances-to-load-balancer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachInstancesToLoadBalancerAsync attach-instances-to-load-balancer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest attach-instances-to-load-balancer-request]
    (-> this (.attachInstancesToLoadBalancerAsync attach-instances-to-load-balancer-request))))

(defn reboot-instance-async
  "Restarts a specific instance.


   The reboot instance operation supports tag-based access control via resource tags applied to the
   resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  reboot-instance-request - `com.amazonaws.services.lightsail.model.RebootInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.RebootInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.RebootInstanceRequest reboot-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootInstanceAsync reboot-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.RebootInstanceRequest reboot-instance-request]
    (-> this (.rebootInstanceAsync reboot-instance-request))))

(defn get-relational-database-master-user-password-async
  "Returns the current, previous, or pending versions of the master user password for a Lightsail database.


   The asdf operation GetRelationalDatabaseMasterUserPassword supports tag-based access control via
   resource tags applied to the resource identified by relationalDatabaseName.

  get-relational-database-master-user-password-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseMasterUserPassword operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordRequest get-relational-database-master-user-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseMasterUserPasswordAsync get-relational-database-master-user-password-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordRequest get-relational-database-master-user-password-request]
    (-> this (.getRelationalDatabaseMasterUserPasswordAsync get-relational-database-master-user-password-request))))

(defn get-relational-database-log-events-async
  "Returns a list of log events for a database in Amazon Lightsail.

  get-relational-database-log-events-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseLogEvents operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsRequest get-relational-database-log-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseLogEventsAsync get-relational-database-log-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsRequest get-relational-database-log-events-request]
    (-> this (.getRelationalDatabaseLogEventsAsync get-relational-database-log-events-request))))

(defn update-domain-entry-async
  "Updates a domain recordset after it is created.


   The update domain entry operation supports tag-based access control via resource tags applied to the
   resource identified by domainName. For more information, see the Lightsail Dev Guide.

  update-domain-entry-request - `com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UpdateDomainEntryResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest update-domain-entry-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainEntryAsync update-domain-entry-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest update-domain-entry-request]
    (-> this (.updateDomainEntryAsync update-domain-entry-request))))

(defn release-static-ip-async
  "Deletes a specific static IP from your account.

  release-static-ip-request - `com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReleaseStaticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.ReleaseStaticIpResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest release-static-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.releaseStaticIpAsync release-static-ip-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest release-static-ip-request]
    (-> this (.releaseStaticIpAsync release-static-ip-request))))

(defn close-instance-public-ports-async
  "Closes the public ports on a specific Amazon Lightsail instance.


   The close instance public ports operation supports tag-based access control via resource tags
   applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  close-instance-public-ports-request - `com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CloseInstancePublicPorts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest close-instance-public-ports-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.closeInstancePublicPortsAsync close-instance-public-ports-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest close-instance-public-ports-request]
    (-> this (.closeInstancePublicPortsAsync close-instance-public-ports-request))))

(defn delete-relational-database-async
  "Deletes a database in Amazon Lightsail.


   The delete relational database operation supports tag-based access control via resource tags applied
   to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  delete-relational-database-request - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseRequest delete-relational-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRelationalDatabaseAsync delete-relational-database-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseRequest delete-relational-database-request]
    (-> this (.deleteRelationalDatabaseAsync delete-relational-database-request))))

(defn create-disk-async
  "Creates a block storage disk that can be attached to a Lightsail instance in the same Availability Zone (e.g.,
   us-east-2a). The disk is created in the regional endpoint that you send the HTTP request to. For
   more information, see Regions and Availability Zones in Lightsail.


   The create disk operation supports tag-based access control via request tags. For more information,
   see the Lightsail Dev Guide.

  create-disk-request - `com.amazonaws.services.lightsail.model.CreateDiskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDisk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateDiskResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateDiskRequest create-disk-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDiskAsync create-disk-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateDiskRequest create-disk-request]
    (-> this (.createDiskAsync create-disk-request))))

(defn get-load-balancer-tls-certificates-async
  "Returns information about the TLS certificates that are associated with the specified Lightsail load balancer.


   TLS is just an updated, more secure version of Secure Socket Layer (SSL).


   You can have a maximum of 2 certificates associated with a Lightsail load balancer. One is active and the other
   is inactive.

  get-load-balancer-tls-certificates-request - `com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoadBalancerTlsCertificates operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest get-load-balancer-tls-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoadBalancerTlsCertificatesAsync get-load-balancer-tls-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest get-load-balancer-tls-certificates-request]
    (-> this (.getLoadBalancerTlsCertificatesAsync get-load-balancer-tls-certificates-request))))

(defn is-vpc-peered-async
  "Returns a Boolean value indicating whether your Lightsail VPC is peered.

  is-vpc-peered-request - `com.amazonaws.services.lightsail.model.IsVpcPeeredRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IsVpcPeered operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.IsVpcPeeredResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.IsVpcPeeredRequest is-vpc-peered-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.isVpcPeeredAsync is-vpc-peered-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.IsVpcPeeredRequest is-vpc-peered-request]
    (-> this (.isVpcPeeredAsync is-vpc-peered-request))))

(defn get-instance-state-async
  "Returns the state of a specific instance. Works on one instance at a time.

  get-instance-state-request - `com.amazonaws.services.lightsail.model.GetInstanceStateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceStateResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceStateRequest get-instance-state-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceStateAsync get-instance-state-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceStateRequest get-instance-state-request]
    (-> this (.getInstanceStateAsync get-instance-state-request))))

(defn get-instance-async
  "Returns information about a specific Amazon Lightsail instance, which is a virtual private server.

  get-instance-request - `com.amazonaws.services.lightsail.model.GetInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceRequest get-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceAsync get-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceRequest get-instance-request]
    (-> this (.getInstanceAsync get-instance-request))))

(defn attach-load-balancer-tls-certificate-async
  "Attaches a Transport Layer Security (TLS) certificate to your load balancer. TLS is just an updated, more secure
   version of Secure Socket Layer (SSL).


   Once you create and validate your certificate, you can attach it to your load balancer. You can also use this API
   to rotate the certificates on your account. Use the AttachLoadBalancerTlsCertificate operation with
   the non-attached certificate, and it will replace the existing one and become the attached certificate.


   The attach load balancer tls certificate operation supports tag-based access control via resource
   tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  attach-load-balancer-tls-certificate-request - `com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachLoadBalancerTlsCertificate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest attach-load-balancer-tls-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachLoadBalancerTlsCertificateAsync attach-load-balancer-tls-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest attach-load-balancer-tls-certificate-request]
    (-> this (.attachLoadBalancerTlsCertificateAsync attach-load-balancer-tls-certificate-request))))

(defn get-operations-for-resource-async
  "Gets operations for a specific resource (e.g., an instance or a static IP).

  get-operations-for-resource-request - `com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOperationsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetOperationsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest get-operations-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOperationsForResourceAsync get-operations-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest get-operations-for-resource-request]
    (-> this (.getOperationsForResourceAsync get-operations-for-resource-request))))

(defn stop-instance-async
  "Stops a specific Amazon Lightsail instance that is currently running.



   When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
   address after stopping and starting an instance, create a static IP address and attach it to the instance. For
   more information, see the Lightsail Dev Guide.



   The stop instance operation supports tag-based access control via resource tags applied to the
   resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  stop-instance-request - `com.amazonaws.services.lightsail.model.StopInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.StopInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.StopInstanceRequest stop-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopInstanceAsync stop-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.StopInstanceRequest stop-instance-request]
    (-> this (.stopInstanceAsync stop-instance-request))))

(defn create-domain-async
  "Creates a domain resource for the specified domain (e.g., example.com).


   The create domain operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-domain-request - `com.amazonaws.services.lightsail.model.CreateDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateDomainResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateDomainRequest create-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainAsync create-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateDomainRequest create-domain-request]
    (-> this (.createDomainAsync create-domain-request))))

(defn create-disk-from-snapshot-async
  "Creates a block storage disk from a disk snapshot that can be attached to a Lightsail instance in the same
   Availability Zone (e.g., us-east-2a). The disk is created in the regional endpoint that you send the
   HTTP request to. For more information, see Regions and Availability Zones in Lightsail.


   The create disk from snapshot operation supports tag-based access control via request tags and
   resource tags applied to the resource identified by diskSnapshotName. For more information, see the Lightsail Dev Guide.

  create-disk-from-snapshot-request - `com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDiskFromSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest create-disk-from-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDiskFromSnapshotAsync create-disk-from-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest create-disk-from-snapshot-request]
    (-> this (.createDiskFromSnapshotAsync create-disk-from-snapshot-request))))

(defn get-export-snapshot-records-async
  "Returns the export snapshot record created as a result of the export snapshot operation.


   An export snapshot record can be used to create a new Amazon EC2 instance and its related resources with the
   create cloud formation stack operation.

  get-export-snapshot-records-request - `com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExportSnapshotRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsRequest get-export-snapshot-records-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExportSnapshotRecordsAsync get-export-snapshot-records-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsRequest get-export-snapshot-records-request]
    (-> this (.getExportSnapshotRecordsAsync get-export-snapshot-records-request))))

(defn allocate-static-ip-async
  "Allocates a static IP address.

  allocate-static-ip-request - `com.amazonaws.services.lightsail.model.AllocateStaticIpRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateStaticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.AllocateStaticIpResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.AllocateStaticIpRequest allocate-static-ip-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateStaticIpAsync allocate-static-ip-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.AllocateStaticIpRequest allocate-static-ip-request]
    (-> this (.allocateStaticIpAsync allocate-static-ip-request))))

(defn get-disk-snapshots-async
  "Returns information about all block storage disk snapshots in your AWS account and region.


   If you are describing a long list of disk snapshots, you can paginate the output to make the list more
   manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.

  get-disk-snapshots-request - `com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDiskSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest get-disk-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDiskSnapshotsAsync get-disk-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest get-disk-snapshots-request]
    (-> this (.getDiskSnapshotsAsync get-disk-snapshots-request))))

(defn get-relational-database-blueprints-async
  "Returns a list of available database blueprints in Amazon Lightsail. A blueprint describes the major engine
   version of a database.


   You can use a blueprint ID to create a new database that runs a specific database engine.

  get-relational-database-blueprints-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseBlueprints operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsRequest get-relational-database-blueprints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseBlueprintsAsync get-relational-database-blueprints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsRequest get-relational-database-blueprints-request]
    (-> this (.getRelationalDatabaseBlueprintsAsync get-relational-database-blueprints-request))))

(defn create-instances-async
  "Creates one or more Amazon Lightsail virtual private servers, or instances. Create instances using active
   blueprints. Inactive blueprints are listed to support customers with existing instances but are not necessarily
   available for launch of new instances. Blueprints are marked inactive when they become outdated due to operating
   system updates or new application releases. Use the get blueprints operation to return a list of available
   blueprints.


   The create instances operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-instances-request - `com.amazonaws.services.lightsail.model.CreateInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateInstancesRequest create-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstancesAsync create-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateInstancesRequest create-instances-request]
    (-> this (.createInstancesAsync create-instances-request))))

(defn delete-load-balancer-tls-certificate-async
  "Deletes an SSL/TLS certificate associated with a Lightsail load balancer.


   The delete load balancer tls certificate operation supports tag-based access control via resource
   tags applied to the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  delete-load-balancer-tls-certificate-request - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancerTlsCertificate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest delete-load-balancer-tls-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerTlsCertificateAsync delete-load-balancer-tls-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest delete-load-balancer-tls-certificate-request]
    (-> this (.deleteLoadBalancerTlsCertificateAsync delete-load-balancer-tls-certificate-request))))

(defn get-load-balancers-async
  "Returns information about all load balancers in an account.


   If you are describing a long list of load balancers, you can paginate the output to make the list more
   manageable. You can use the pageToken and nextPageToken values to retrieve the next items in the list.

  get-load-balancers-request - `com.amazonaws.services.lightsail.model.GetLoadBalancersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetLoadBalancersRequest get-load-balancers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoadBalancersAsync get-load-balancers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetLoadBalancersRequest get-load-balancers-request]
    (-> this (.getLoadBalancersAsync get-load-balancers-request))))

(defn delete-instance-async
  "Deletes a specific Amazon Lightsail virtual private server, or instance.


   The delete instance operation supports tag-based access control via resource tags applied to the
   resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  delete-instance-request - `com.amazonaws.services.lightsail.model.DeleteInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteInstanceRequest delete-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInstanceAsync delete-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteInstanceRequest delete-instance-request]
    (-> this (.deleteInstanceAsync delete-instance-request))))

(defn create-relational-database-async
  "Creates a new database in Amazon Lightsail.


   The create relational database operation supports tag-based access control via request tags. For
   more information, see the Lightsail Dev Guide.

  create-relational-database-request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseRequest create-relational-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRelationalDatabaseAsync create-relational-database-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseRequest create-relational-database-request]
    (-> this (.createRelationalDatabaseAsync create-relational-database-request))))

(defn get-disk-snapshot-async
  "Returns information about a specific block storage disk snapshot.

  get-disk-snapshot-request - `com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDiskSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDiskSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest get-disk-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDiskSnapshotAsync get-disk-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest get-disk-snapshot-request]
    (-> this (.getDiskSnapshotAsync get-disk-snapshot-request))))

(defn create-instances-from-snapshot-async
  "Uses a specific snapshot as a blueprint for creating one or more new instances that are based on that identical
   configuration.


   The create instances from snapshot operation supports tag-based access control via request tags and
   resource tags applied to the resource identified by instanceSnapshotName. For more information, see the Lightsail Dev Guide.

  create-instances-from-snapshot-request - `com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstancesFromSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest create-instances-from-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstancesFromSnapshotAsync create-instances-from-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest create-instances-from-snapshot-request]
    (-> this (.createInstancesFromSnapshotAsync create-instances-from-snapshot-request))))

(defn create-relational-database-snapshot-async
  "Creates a snapshot of your database in Amazon Lightsail. You can use snapshots for backups, to make copies of a
   database, and to save data before deleting a database.


   The create relational database snapshot operation supports tag-based access control via request
   tags. For more information, see the Lightsail Dev Guide.

  create-relational-database-snapshot-request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRelationalDatabaseSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotRequest create-relational-database-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRelationalDatabaseSnapshotAsync create-relational-database-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotRequest create-relational-database-snapshot-request]
    (-> this (.createRelationalDatabaseSnapshotAsync create-relational-database-snapshot-request))))

(defn peer-vpc-async
  "Tries to peer the Lightsail VPC with the user's default VPC.

  peer-vpc-request - `com.amazonaws.services.lightsail.model.PeerVpcRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PeerVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.PeerVpcResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.PeerVpcRequest peer-vpc-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.peerVpcAsync peer-vpc-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.PeerVpcRequest peer-vpc-request]
    (-> this (.peerVpcAsync peer-vpc-request))))

(defn get-relational-database-async
  "Returns information about a specific database in Amazon Lightsail.

  get-relational-database-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseRequest get-relational-database-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseAsync get-relational-database-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseRequest get-relational-database-request]
    (-> this (.getRelationalDatabaseAsync get-relational-database-request))))

(defn get-instance-snapshot-async
  "Returns information about a specific instance snapshot.

  get-instance-snapshot-request - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest get-instance-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceSnapshotAsync get-instance-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest get-instance-snapshot-request]
    (-> this (.getInstanceSnapshotAsync get-instance-snapshot-request))))

(defn get-key-pair-async
  "Returns information about a specific key pair.

  get-key-pair-request - `com.amazonaws.services.lightsail.model.GetKeyPairRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetKeyPairRequest get-key-pair-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getKeyPairAsync get-key-pair-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetKeyPairRequest get-key-pair-request]
    (-> this (.getKeyPairAsync get-key-pair-request))))

(defn delete-key-pair-async
  "Deletes a specific SSH key pair.


   The delete key pair operation supports tag-based access control via resource tags applied to the
   resource identified by keyPairName. For more information, see the Lightsail Dev Guide.

  delete-key-pair-request - `com.amazonaws.services.lightsail.model.DeleteKeyPairRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteKeyPairRequest delete-key-pair-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteKeyPairAsync delete-key-pair-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteKeyPairRequest delete-key-pair-request]
    (-> this (.deleteKeyPairAsync delete-key-pair-request))))

(defn get-operation-async
  "Returns information about a specific operation. Operations include events such as when you create an instance,
   allocate a static IP, attach a static IP, and so on.

  get-operation-request - `com.amazonaws.services.lightsail.model.GetOperationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOperation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetOperationResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetOperationRequest get-operation-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOperationAsync get-operation-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetOperationRequest get-operation-request]
    (-> this (.getOperationAsync get-operation-request))))

(defn get-cloud-formation-stack-records-async
  "Returns the CloudFormation stack record created as a result of the create cloud formation stack
   operation.


   An AWS CloudFormation stack is used to create a new Amazon EC2 instance from an exported Lightsail snapshot.

  get-cloud-formation-stack-records-request - `com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCloudFormationStackRecords operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsRequest get-cloud-formation-stack-records-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCloudFormationStackRecordsAsync get-cloud-formation-stack-records-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsRequest get-cloud-formation-stack-records-request]
    (-> this (.getCloudFormationStackRecordsAsync get-cloud-formation-stack-records-request))))

(defn get-relational-database-bundles-async
  "Returns the list of bundles that are available in Amazon Lightsail. A bundle describes the performance
   specifications for a database.


   You can use a bundle ID to create a new database with explicit performance specifications.

  get-relational-database-bundles-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseBundles operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesRequest get-relational-database-bundles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseBundlesAsync get-relational-database-bundles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesRequest get-relational-database-bundles-request]
    (-> this (.getRelationalDatabaseBundlesAsync get-relational-database-bundles-request))))

(defn create-cloud-formation-stack-async
  "Creates an AWS CloudFormation stack, which creates a new Amazon EC2 instance from an exported Amazon Lightsail
   snapshot. This operation results in a CloudFormation stack record that can be used to track the AWS
   CloudFormation stack created. Use the get cloud formation stack records operation to get a list of
   the CloudFormation stacks created.



   Wait until after your new Amazon EC2 instance is created before running the
   create cloud formation stack operation again with the same export snapshot record.

  create-cloud-formation-stack-request - `com.amazonaws.services.lightsail.model.CreateCloudFormationStackRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCloudFormationStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateCloudFormationStackResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateCloudFormationStackRequest create-cloud-formation-stack-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCloudFormationStackAsync create-cloud-formation-stack-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateCloudFormationStackRequest create-cloud-formation-stack-request]
    (-> this (.createCloudFormationStackAsync create-cloud-formation-stack-request))))

(defn create-instance-snapshot-async
  "Creates a snapshot of a specific virtual private server, or instance. You can use a snapshot to create a
   new instance that is based on that snapshot.


   The create instance snapshot operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-instance-snapshot-request - `com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstanceSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest create-instance-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstanceSnapshotAsync create-instance-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest create-instance-snapshot-request]
    (-> this (.createInstanceSnapshotAsync create-instance-snapshot-request))))

(defn start-instance-async
  "Starts a specific Amazon Lightsail instance from a stopped state. To restart an instance, use the
   reboot instance operation.



   When you start a stopped instance, Lightsail assigns a new public IP address to the instance. To use the same IP
   address after stopping and starting an instance, create a static IP address and attach it to the instance. For
   more information, see the Lightsail Dev Guide.



   The start instance operation supports tag-based access control via resource tags applied to the
   resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  start-instance-request - `com.amazonaws.services.lightsail.model.StartInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.StartInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.StartInstanceRequest start-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startInstanceAsync start-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.StartInstanceRequest start-instance-request]
    (-> this (.startInstanceAsync start-instance-request))))

(defn get-relational-database-snapshots-async
  "Returns information about all of your database snapshots in Amazon Lightsail.

  get-relational-database-snapshots-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseSnapshots operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsRequest get-relational-database-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseSnapshotsAsync get-relational-database-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsRequest get-relational-database-snapshots-request]
    (-> this (.getRelationalDatabaseSnapshotsAsync get-relational-database-snapshots-request))))

(defn get-bundles-async
  "Returns the list of bundles that are available for purchase. A bundle describes the specs for your virtual
   private server (or instance).

  get-bundles-request - `com.amazonaws.services.lightsail.model.GetBundlesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBundles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetBundlesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetBundlesRequest get-bundles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBundlesAsync get-bundles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetBundlesRequest get-bundles-request]
    (-> this (.getBundlesAsync get-bundles-request))))

(defn get-instance-access-details-async
  "Returns temporary SSH keys you can use to connect to a specific virtual private server, or instance.


   The get instance access details operation supports tag-based access control via resource tags
   applied to the resource identified by instanceName. For more information, see the Lightsail Dev Guide.

  get-instance-access-details-request - `com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceAccessDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest get-instance-access-details-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceAccessDetailsAsync get-instance-access-details-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest get-instance-access-details-request]
    (-> this (.getInstanceAccessDetailsAsync get-instance-access-details-request))))

(defn export-snapshot-async
  "Exports an Amazon Lightsail instance or block storage disk snapshot to Amazon Elastic Compute Cloud (Amazon EC2).
   This operation results in an export snapshot record that can be used with the
   create cloud formation stack operation to create new Amazon EC2 instances.


   Exported instance snapshots appear in Amazon EC2 as Amazon Machine Images (AMIs), and the instance system disk
   appears as an Amazon Elastic Block Store (Amazon EBS) volume. Exported disk snapshots appear in Amazon EC2 as
   Amazon EBS volumes. Snapshots are exported to the same Amazon Web Services Region in Amazon EC2 as the source
   Lightsail snapshot.



   The export snapshot operation supports tag-based access control via resource tags applied to the
   resource identified by sourceSnapshotName. For more information, see the Lightsail Dev Guide.



   Use the get instance snapshots or get disk snapshots operations to get a list of
   snapshots that you can export to Amazon EC2.

  export-snapshot-request - `com.amazonaws.services.lightsail.model.ExportSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.ExportSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.ExportSnapshotRequest export-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportSnapshotAsync export-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.ExportSnapshotRequest export-snapshot-request]
    (-> this (.exportSnapshotAsync export-snapshot-request))))

(defn attach-disk-async
  "Attaches a block storage disk to a running or stopped Lightsail instance and exposes it to the instance with the
   specified disk name.


   The attach disk operation supports tag-based access control via resource tags applied to the
   resource identified by diskName. For more information, see the Lightsail Dev Guide.

  attach-disk-request - `com.amazonaws.services.lightsail.model.AttachDiskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachDisk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.AttachDiskResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.AttachDiskRequest attach-disk-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachDiskAsync attach-disk-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.AttachDiskRequest attach-disk-request]
    (-> this (.attachDiskAsync attach-disk-request))))

(defn delete-load-balancer-async
  "Deletes a Lightsail load balancer and all its associated SSL/TLS certificates. Once the load balancer is deleted,
   you will need to create a new load balancer, create a new certificate, and verify domain ownership again.


   The delete load balancer operation supports tag-based access control via resource tags applied to
   the resource identified by loadBalancerName. For more information, see the Lightsail Dev Guide.

  delete-load-balancer-request - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest delete-load-balancer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerAsync delete-load-balancer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest delete-load-balancer-request]
    (-> this (.deleteLoadBalancerAsync delete-load-balancer-request))))

(defn delete-relational-database-snapshot-async
  "Deletes a database snapshot in Amazon Lightsail.


   The delete relational database snapshot operation supports tag-based access control via resource
   tags applied to the resource identified by relationalDatabaseName. For more information, see the Lightsail Dev Guide.

  delete-relational-database-snapshot-request - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRelationalDatabaseSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotRequest delete-relational-database-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRelationalDatabaseSnapshotAsync delete-relational-database-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotRequest delete-relational-database-snapshot-request]
    (-> this (.deleteRelationalDatabaseSnapshotAsync delete-relational-database-snapshot-request))))

(defn get-blueprints-async
  "Returns the list of available instance images, or blueprints. You can use a blueprint to create a new
   virtual private server already running a specific operating system, as well as a preinstalled app or development
   stack. The software each instance is running depends on the blueprint image you choose.

  get-blueprints-request - `com.amazonaws.services.lightsail.model.GetBlueprintsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBlueprints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetBlueprintsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetBlueprintsRequest get-blueprints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBlueprintsAsync get-blueprints-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetBlueprintsRequest get-blueprints-request]
    (-> this (.getBlueprintsAsync get-blueprints-request))))

(defn copy-snapshot-async
  "Copies an instance or disk snapshot from one AWS Region to another in Amazon Lightsail.

  copy-snapshot-request - `com.amazonaws.services.lightsail.model.CopySnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopySnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CopySnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CopySnapshotRequest copy-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copySnapshotAsync copy-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CopySnapshotRequest copy-snapshot-request]
    (-> this (.copySnapshotAsync copy-snapshot-request))))

(defn create-load-balancer-async
  "Creates a Lightsail load balancer. To learn more about deciding whether to load balance your application, see
   Configure your Lightsail instances for load balancing. You can create up to 5 load balancers per AWS Region
   in your account.


   When you create a load balancer, you can specify a unique name and port settings. To change additional load
   balancer settings, use the UpdateLoadBalancerAttribute operation.


   The create load balancer operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-load-balancer-request - `com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest create-load-balancer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerAsync create-load-balancer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest create-load-balancer-request]
    (-> this (.createLoadBalancerAsync create-load-balancer-request))))

(defn create-relational-database-from-snapshot-async
  "Creates a new database from an existing database snapshot in Amazon Lightsail.


   You can create a new database from a snapshot in if something goes wrong with your original database, or to
   change it to a different plan, such as a high availability or standard plan.


   The create relational database from snapshot operation supports tag-based access control via request
   tags and resource tags applied to the resource identified by relationalDatabaseSnapshotName. For more
   information, see the Lightsail Dev Guide.

  create-relational-database-from-snapshot-request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRelationalDatabaseFromSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotRequest create-relational-database-from-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRelationalDatabaseFromSnapshotAsync create-relational-database-from-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotRequest create-relational-database-from-snapshot-request]
    (-> this (.createRelationalDatabaseFromSnapshotAsync create-relational-database-from-snapshot-request))))

(defn tag-resource-async
  "Adds one or more tags to the specified Amazon Lightsail resource. Each resource can have a maximum of 50 tags.
   Each tag consists of a key and an optional value. Tag keys must be unique per resource. For more information
   about tags, see the Lightsail Dev Guide.


   The tag resource operation supports tag-based access control via request tags and resource tags
   applied to the resource identified by resourceName. For more information, see the Lightsail Dev Guide.

  tag-resource-request - `com.amazonaws.services.lightsail.model.TagResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.TagResourceRequest tag-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync tag-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.TagResourceRequest tag-resource-request]
    (-> this (.tagResourceAsync tag-resource-request))))

(defn create-disk-snapshot-async
  "Creates a snapshot of a block storage disk. You can use snapshots for backups, to make copies of disks, and to
   save data before shutting down a Lightsail instance.


   You can take a snapshot of an attached disk that is in use; however, snapshots only capture data that has been
   written to your disk at the time the snapshot command is issued. This may exclude any data that has been cached
   by any applications or the operating system. If you can pause any file systems on the disk long enough to take a
   snapshot, your snapshot should be complete. Nevertheless, if you cannot pause all file writes to the disk, you
   should unmount the disk from within the Lightsail instance, issue the create disk snapshot command, and then
   remount the disk to ensure a consistent and complete snapshot. You may remount and use your disk while the
   snapshot status is pending.


   You can also use this operation to create a snapshot of an instance's system volume. You might want to do this,
   for example, to recover data from the system volume of a botched instance or to create a backup of the system
   volume like you would for a block storage disk. To create a snapshot of a system volume, just define the
   instance name parameter when issuing the snapshot command, and a snapshot of the defined instance's
   system volume will be created. After the snapshot is available, you can create a block storage disk from the
   snapshot and attach it to a running instance to access the data on the disk.


   The create disk snapshot operation supports tag-based access control via request tags. For more
   information, see the Lightsail Dev Guide.

  create-disk-snapshot-request - `com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDiskSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest create-disk-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDiskSnapshotAsync create-disk-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest create-disk-snapshot-request]
    (-> this (.createDiskSnapshotAsync create-disk-snapshot-request))))

(defn get-relational-database-snapshot-async
  "Returns information about a specific database snapshot in Amazon Lightsail.

  get-relational-database-snapshot-request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotRequest get-relational-database-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseSnapshotAsync get-relational-database-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotRequest get-relational-database-snapshot-request]
    (-> this (.getRelationalDatabaseSnapshotAsync get-relational-database-snapshot-request))))

(defn import-key-pair-async
  "Imports a public SSH key from a specific key pair.

  import-key-pair-request - `com.amazonaws.services.lightsail.model.ImportKeyPairRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.ImportKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.ImportKeyPairRequest import-key-pair-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importKeyPairAsync import-key-pair-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.ImportKeyPairRequest import-key-pair-request]
    (-> this (.importKeyPairAsync import-key-pair-request))))

(defn get-instance-snapshots-async
  "Returns all instance snapshots for the user's account.

  get-instance-snapshots-request - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest get-instance-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceSnapshotsAsync get-instance-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest get-instance-snapshots-request]
    (-> this (.getInstanceSnapshotsAsync get-instance-snapshots-request))))

(defn get-domain-async
  "Returns information about a specific domain recordset.

  get-domain-request - `com.amazonaws.services.lightsail.model.GetDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDomainResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDomainRequest get-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainAsync get-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDomainRequest get-domain-request]
    (-> this (.getDomainAsync get-domain-request))))

(defn get-instance-metric-data-async
  "Returns the data points for the specified Amazon Lightsail instance metric, given an instance name.

  get-instance-metric-data-request - `com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest get-instance-metric-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceMetricDataAsync get-instance-metric-data-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest get-instance-metric-data-request]
    (-> this (.getInstanceMetricDataAsync get-instance-metric-data-request))))

(defn get-operations-async
  "Returns information about all operations.


   Results are returned from oldest to newest, up to a maximum of 200. Results can be paged by making each
   subsequent call to GetOperations use the maximum (last) statusChangedAt value from the
   previous request.

  get-operations-request - `com.amazonaws.services.lightsail.model.GetOperationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOperations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetOperationsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetOperationsRequest get-operations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOperationsAsync get-operations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetOperationsRequest get-operations-request]
    (-> this (.getOperationsAsync get-operations-request))))

(defn get-domains-async
  "Returns a list of all domains in the user's account.

  get-domains-request - `com.amazonaws.services.lightsail.model.GetDomainsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDomainsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDomainsRequest get-domains-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainsAsync get-domains-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetDomainsRequest get-domains-request]
    (-> this (.getDomainsAsync get-domains-request))))

(defn get-load-balancer-async
  "Returns information about the specified Lightsail load balancer.

  get-load-balancer-request - `com.amazonaws.services.lightsail.model.GetLoadBalancerRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetLoadBalancerRequest get-load-balancer-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoadBalancerAsync get-load-balancer-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetLoadBalancerRequest get-load-balancer-request]
    (-> this (.getLoadBalancerAsync get-load-balancer-request))))

(defn get-active-names-async
  "Returns the names of all active (not deleted) resources.

  get-active-names-request - `com.amazonaws.services.lightsail.model.GetActiveNamesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetActiveNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetActiveNamesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetActiveNamesRequest get-active-names-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getActiveNamesAsync get-active-names-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetActiveNamesRequest get-active-names-request]
    (-> this (.getActiveNamesAsync get-active-names-request))))

(defn get-instances-async
  "Returns information about all Amazon Lightsail virtual private servers, or instances.

  get-instances-request - `com.amazonaws.services.lightsail.model.GetInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstancesRequest get-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstancesAsync get-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsync this ^com.amazonaws.services.lightsail.model.GetInstancesRequest get-instances-request]
    (-> this (.getInstancesAsync get-instances-request))))

