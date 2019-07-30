(ns com.amazonaws.services.lightsail.AmazonLightsailAsyncClient
  "Client for accessing Amazon Lightsail asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Amazon Lightsail is the easiest way to get started with AWS for developers who just need virtual private servers.
  Lightsail includes everything you need to launch your project quickly - a virtual machine, a managed database,
  SSD-based storage, data transfer, DNS management, and a static IP - for a low, predictable price. You manage those
  Lightsail servers through the Lightsail console or by using the API or command-line interface (CLI).


  For more information about Lightsail concepts and tasks, see the Lightsail Dev Guide.


  To use the Lightsail API or the CLI, you will need to use AWS Identity and Access Management (IAM) to generate access
  keys. For details about how to set this up, see the Lightsail Dev Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lightsail AmazonLightsailAsyncClient]))

(defn ->amazon-lightsail-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonLightsailAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonLightsailAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonLightsailAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonLightsailAsyncClient aws-credentials executor-service))
  (^AmazonLightsailAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonLightsailAsyncClient client-configuration))
  (^AmazonLightsailAsyncClient []
    (new AmazonLightsailAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.lightsail.AmazonLightsailAsyncClientBuilder`"
  (^com.amazonaws.services.lightsail.AmazonLightsailAsyncClientBuilder []
    (AmazonLightsailAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-load-balancer-metric-data-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoadBalancerMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoadBalancerMetricDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetLoadBalancerMetricDataRequest request]
    (-> this (.getLoadBalancerMetricDataAsync request))))

(defn get-relational-databases-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabasesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabasesRequest request]
    (-> this (.getRelationalDatabasesAsync request))))

(defn reboot-relational-database-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.RebootRelationalDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.RebootRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.RebootRelationalDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootRelationalDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.RebootRelationalDatabaseRequest request]
    (-> this (.rebootRelationalDatabaseAsync request))))

(defn delete-known-host-keys-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteKnownHostKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteKnownHostKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteKnownHostKeysResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteKnownHostKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteKnownHostKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteKnownHostKeysRequest request]
    (-> this (.deleteKnownHostKeysAsync request))))

(defn get-regions-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRegionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRegions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRegionsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRegionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRegionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRegionsRequest request]
    (-> this (.getRegionsAsync request))))

(defn delete-disk-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteDiskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDisk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteDiskResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteDiskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDiskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteDiskRequest request]
    (-> this (.deleteDiskAsync request))))

(defn attach-static-ip-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.AttachStaticIpRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachStaticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.AttachStaticIpResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.AttachStaticIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachStaticIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.AttachStaticIpRequest request]
    (-> this (.attachStaticIpAsync request))))

(defn stop-relational-database-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.StopRelationalDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.StopRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.StopRelationalDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopRelationalDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.StopRelationalDatabaseRequest request]
    (-> this (.stopRelationalDatabaseAsync request))))

(defn get-disks-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetDisksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDisks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDisksResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDisksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDisksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDisksRequest request]
    (-> this (.getDisksAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonLightsailAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-domain-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteDomainResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteDomainRequest request]
    (-> this (.deleteDomainAsync request))))

(defn get-relational-database-log-streams-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseLogStreams operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseLogStreamsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogStreamsRequest request]
    (-> this (.getRelationalDatabaseLogStreamsAsync request))))

(defn delete-disk-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDiskSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteDiskSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDiskSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteDiskSnapshotRequest request]
    (-> this (.deleteDiskSnapshotAsync request))))

(defn update-load-balancer-attribute-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLoadBalancerAttribute operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLoadBalancerAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UpdateLoadBalancerAttributeRequest request]
    (-> this (.updateLoadBalancerAttributeAsync request))))

(defn update-relational-database-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRelationalDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseRequest request]
    (-> this (.updateRelationalDatabaseAsync request))))

(defn update-relational-database-parameters-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRelationalDatabaseParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRelationalDatabaseParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UpdateRelationalDatabaseParametersRequest request]
    (-> this (.updateRelationalDatabaseParametersAsync request))))

(defn create-load-balancer-tls-certificate-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancerTlsCertificate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerTlsCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerTlsCertificateRequest request]
    (-> this (.createLoadBalancerTlsCertificateAsync request))))

(defn get-instance-port-states-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstancePortStates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstancePortStatesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstancePortStatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstancePortStatesRequest request]
    (-> this (.getInstancePortStatesAsync request))))

(defn get-static-ip-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetStaticIpRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStaticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetStaticIpResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetStaticIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStaticIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetStaticIpRequest request]
    (-> this (.getStaticIpAsync request))))

(defn get-relational-database-events-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseEventsRequest request]
    (-> this (.getRelationalDatabaseEventsAsync request))))

(defn unpeer-vpc-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.UnpeerVpcRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UnpeerVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UnpeerVpcResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UnpeerVpcRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unpeerVpcAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UnpeerVpcRequest request]
    (-> this (.unpeerVpcAsync request))))

(defn detach-disk-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DetachDiskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachDisk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DetachDiskResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DetachDiskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachDiskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DetachDiskRequest request]
    (-> this (.detachDiskAsync request))))

(defn delete-domain-entry-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDomainEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteDomainEntryResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDomainEntryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteDomainEntryRequest request]
    (-> this (.deleteDomainEntryAsync request))))

(defn open-instance-public-ports-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the OpenInstancePublicPorts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.OpenInstancePublicPortsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.openInstancePublicPortsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.OpenInstancePublicPortsRequest request]
    (-> this (.openInstancePublicPortsAsync request))))

(defn create-key-pair-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateKeyPairRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateKeyPairRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createKeyPairAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateKeyPairRequest request]
    (-> this (.createKeyPairAsync request))))

(defn create-domain-entry-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateDomainEntryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomainEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateDomainEntryResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateDomainEntryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainEntryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateDomainEntryRequest request]
    (-> this (.createDomainEntryAsync request))))

(defn download-default-key-pair-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DownloadDefaultKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.downloadDefaultKeyPairAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DownloadDefaultKeyPairRequest request]
    (-> this (.downloadDefaultKeyPairAsync request))))

(defn start-relational-database-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.StartRelationalDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.StartRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.StartRelationalDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startRelationalDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.StartRelationalDatabaseRequest request]
    (-> this (.startRelationalDatabaseAsync request))))

(defn detach-instances-from-load-balancer-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachInstancesFromLoadBalancer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachInstancesFromLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DetachInstancesFromLoadBalancerRequest request]
    (-> this (.detachInstancesFromLoadBalancerAsync request))))

(defn get-relational-database-metric-data-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseMetricData operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseMetricDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMetricDataRequest request]
    (-> this (.getRelationalDatabaseMetricDataAsync request))))

(defn detach-static-ip-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DetachStaticIpRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachStaticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DetachStaticIpResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DetachStaticIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachStaticIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DetachStaticIpRequest request]
    (-> this (.detachStaticIpAsync request))))

(defn put-instance-public-ports-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutInstancePublicPorts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.PutInstancePublicPortsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putInstancePublicPortsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.PutInstancePublicPortsRequest request]
    (-> this (.putInstancePublicPortsAsync request))))

(defn get-relational-database-parameters-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseParametersRequest request]
    (-> this (.getRelationalDatabaseParametersAsync request))))

(defn delete-instance-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInstanceSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInstanceSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteInstanceSnapshotRequest request]
    (-> this (.deleteInstanceSnapshotAsync request))))

(defn get-key-pairs-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetKeyPairsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetKeyPairs operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetKeyPairsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetKeyPairsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getKeyPairsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetKeyPairsRequest request]
    (-> this (.getKeyPairsAsync request))))

(defn get-disk-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetDiskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDisk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDiskResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDiskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDiskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDiskRequest request]
    (-> this (.getDiskAsync request))))

(defn get-static-ips-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetStaticIpsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetStaticIps operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetStaticIpsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetStaticIpsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getStaticIpsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetStaticIpsRequest request]
    (-> this (.getStaticIpsAsync request))))

(defn attach-instances-to-load-balancer-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachInstancesToLoadBalancer operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachInstancesToLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.AttachInstancesToLoadBalancerRequest request]
    (-> this (.attachInstancesToLoadBalancerAsync request))))

(defn reboot-instance-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.RebootInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.RebootInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.RebootInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.RebootInstanceRequest request]
    (-> this (.rebootInstanceAsync request))))

(defn get-relational-database-master-user-password-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseMasterUserPassword operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseMasterUserPasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseMasterUserPasswordRequest request]
    (-> this (.getRelationalDatabaseMasterUserPasswordAsync request))))

(defn get-relational-database-log-events-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseLogEvents operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseLogEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseLogEventsRequest request]
    (-> this (.getRelationalDatabaseLogEventsAsync request))))

(defn update-domain-entry-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainEntry operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.UpdateDomainEntryResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainEntryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.UpdateDomainEntryRequest request]
    (-> this (.updateDomainEntryAsync request))))

(defn release-static-ip-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReleaseStaticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.ReleaseStaticIpResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.releaseStaticIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.ReleaseStaticIpRequest request]
    (-> this (.releaseStaticIpAsync request))))

(defn close-instance-public-ports-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CloseInstancePublicPorts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CloseInstancePublicPortsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.closeInstancePublicPortsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CloseInstancePublicPortsRequest request]
    (-> this (.closeInstancePublicPortsAsync request))))

(defn delete-relational-database-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRelationalDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseRequest request]
    (-> this (.deleteRelationalDatabaseAsync request))))

(defn create-disk-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateDiskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDisk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateDiskResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateDiskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDiskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateDiskRequest request]
    (-> this (.createDiskAsync request))))

(defn get-load-balancer-tls-certificates-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoadBalancerTlsCertificates operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoadBalancerTlsCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetLoadBalancerTlsCertificatesRequest request]
    (-> this (.getLoadBalancerTlsCertificatesAsync request))))

(defn is-vpc-peered-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.IsVpcPeeredRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IsVpcPeered operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.IsVpcPeeredResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.IsVpcPeeredRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.isVpcPeeredAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.IsVpcPeeredRequest request]
    (-> this (.isVpcPeeredAsync request))))

(defn get-instance-state-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetInstanceStateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceState operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceStateResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceStateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceStateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceStateRequest request]
    (-> this (.getInstanceStateAsync request))))

(defn get-instance-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceRequest request]
    (-> this (.getInstanceAsync request))))

(defn attach-load-balancer-tls-certificate-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachLoadBalancerTlsCertificate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachLoadBalancerTlsCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.AttachLoadBalancerTlsCertificateRequest request]
    (-> this (.attachLoadBalancerTlsCertificateAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonLightsailAsyncClient this]
    (-> this (.shutdown))))

(defn get-operations-for-resource-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOperationsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetOperationsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOperationsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetOperationsForResourceRequest request]
    (-> this (.getOperationsForResourceAsync request))))

(defn stop-instance-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.StopInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.StopInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.StopInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.StopInstanceRequest request]
    (-> this (.stopInstanceAsync request))))

(defn create-domain-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateDomainResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateDomainRequest request]
    (-> this (.createDomainAsync request))))

(defn create-disk-from-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDiskFromSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDiskFromSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateDiskFromSnapshotRequest request]
    (-> this (.createDiskFromSnapshotAsync request))))

(defn get-export-snapshot-records-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetExportSnapshotRecords operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getExportSnapshotRecordsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetExportSnapshotRecordsRequest request]
    (-> this (.getExportSnapshotRecordsAsync request))))

(defn allocate-static-ip-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.AllocateStaticIpRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AllocateStaticIp operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.AllocateStaticIpResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.AllocateStaticIpRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.allocateStaticIpAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.AllocateStaticIpRequest request]
    (-> this (.allocateStaticIpAsync request))))

(defn get-disk-snapshots-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDiskSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDiskSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDiskSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotsRequest request]
    (-> this (.getDiskSnapshotsAsync request))))

(defn get-relational-database-blueprints-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseBlueprints operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseBlueprintsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBlueprintsRequest request]
    (-> this (.getRelationalDatabaseBlueprintsAsync request))))

(defn create-instances-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateInstancesRequest request]
    (-> this (.createInstancesAsync request))))

(defn delete-load-balancer-tls-certificate-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancerTlsCertificate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerTlsCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerTlsCertificateRequest request]
    (-> this (.deleteLoadBalancerTlsCertificateAsync request))))

(defn get-load-balancers-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetLoadBalancersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoadBalancers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetLoadBalancersResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetLoadBalancersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoadBalancersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetLoadBalancersRequest request]
    (-> this (.getLoadBalancersAsync request))))

(defn delete-instance-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteInstanceRequest request]
    (-> this (.deleteInstanceAsync request))))

(defn create-relational-database-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRelationalDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseRequest request]
    (-> this (.createRelationalDatabaseAsync request))))

(defn get-disk-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDiskSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDiskSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDiskSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDiskSnapshotRequest request]
    (-> this (.getDiskSnapshotAsync request))))

(defn create-instances-from-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstancesFromSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstancesFromSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateInstancesFromSnapshotRequest request]
    (-> this (.createInstancesFromSnapshotAsync request))))

(defn create-relational-database-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRelationalDatabaseSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRelationalDatabaseSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseSnapshotRequest request]
    (-> this (.createRelationalDatabaseSnapshotAsync request))))

(defn peer-vpc-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.PeerVpcRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PeerVpc operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.PeerVpcResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.PeerVpcRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.peerVpcAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.PeerVpcRequest request]
    (-> this (.peerVpcAsync request))))

(defn get-relational-database-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseRequest request]
    (-> this (.getRelationalDatabaseAsync request))))

(defn get-instance-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotRequest request]
    (-> this (.getInstanceSnapshotAsync request))))

(defn get-key-pair-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetKeyPairRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetKeyPairRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getKeyPairAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetKeyPairRequest request]
    (-> this (.getKeyPairAsync request))))

(defn delete-key-pair-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteKeyPairRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteKeyPairRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteKeyPairAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteKeyPairRequest request]
    (-> this (.deleteKeyPairAsync request))))

(defn get-operation-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetOperationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOperation operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetOperationResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetOperationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOperationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetOperationRequest request]
    (-> this (.getOperationAsync request))))

(defn get-cloud-formation-stack-records-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCloudFormationStackRecords operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCloudFormationStackRecordsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetCloudFormationStackRecordsRequest request]
    (-> this (.getCloudFormationStackRecordsAsync request))))

(defn get-relational-database-bundles-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseBundles operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseBundlesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseBundlesRequest request]
    (-> this (.getRelationalDatabaseBundlesAsync request))))

(defn create-cloud-formation-stack-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateCloudFormationStackRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCloudFormationStack operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateCloudFormationStackResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateCloudFormationStackRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCloudFormationStackAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateCloudFormationStackRequest request]
    (-> this (.createCloudFormationStackAsync request))))

(defn create-instance-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstanceSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateInstanceSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstanceSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateInstanceSnapshotRequest request]
    (-> this (.createInstanceSnapshotAsync request))))

(defn start-instance-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.StartInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.StartInstanceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.StartInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.StartInstanceRequest request]
    (-> this (.startInstanceAsync request))))

(defn get-relational-database-snapshots-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseSnapshots operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotsRequest request]
    (-> this (.getRelationalDatabaseSnapshotsAsync request))))

(defn get-bundles-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetBundlesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBundles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetBundlesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetBundlesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBundlesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetBundlesRequest request]
    (-> this (.getBundlesAsync request))))

(defn get-instance-access-details-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceAccessDetails operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceAccessDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceAccessDetailsRequest request]
    (-> this (.getInstanceAccessDetailsAsync request))))

(defn export-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.ExportSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.ExportSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.ExportSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.ExportSnapshotRequest request]
    (-> this (.exportSnapshotAsync request))))

(defn attach-disk-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.AttachDiskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachDisk operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.AttachDiskResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.AttachDiskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachDiskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.AttachDiskRequest request]
    (-> this (.attachDiskAsync request))))

(defn delete-load-balancer-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteLoadBalancerRequest request]
    (-> this (.deleteLoadBalancerAsync request))))

(defn delete-relational-database-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRelationalDatabaseSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRelationalDatabaseSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.DeleteRelationalDatabaseSnapshotRequest request]
    (-> this (.deleteRelationalDatabaseSnapshotAsync request))))

(defn get-blueprints-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetBlueprintsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetBlueprints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetBlueprintsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetBlueprintsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getBlueprintsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetBlueprintsRequest request]
    (-> this (.getBlueprintsAsync request))))

(defn copy-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CopySnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopySnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CopySnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CopySnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copySnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CopySnapshotRequest request]
    (-> this (.copySnapshotAsync request))))

(defn create-load-balancer-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateLoadBalancerRequest request]
    (-> this (.createLoadBalancerAsync request))))

(defn create-relational-database-from-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRelationalDatabaseFromSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRelationalDatabaseFromSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateRelationalDatabaseFromSnapshotRequest request]
    (-> this (.createRelationalDatabaseFromSnapshotAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn create-disk-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDiskSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.CreateDiskSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDiskSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.CreateDiskSnapshotRequest request]
    (-> this (.createDiskSnapshotAsync request))))

(defn get-relational-database-snapshot-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRelationalDatabaseSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRelationalDatabaseSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetRelationalDatabaseSnapshotRequest request]
    (-> this (.getRelationalDatabaseSnapshotAsync request))))

(defn import-key-pair-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.ImportKeyPairRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportKeyPair operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.ImportKeyPairResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.ImportKeyPairRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importKeyPairAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.ImportKeyPairRequest request]
    (-> this (.importKeyPairAsync request))))

(defn get-instance-snapshots-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceSnapshotsRequest request]
    (-> this (.getInstanceSnapshotsAsync request))))

(defn get-domain-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetDomainRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDomainResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDomainRequest request]
    (-> this (.getDomainAsync request))))

(defn get-instance-metric-data-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceMetricData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstanceMetricDataResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceMetricDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstanceMetricDataRequest request]
    (-> this (.getInstanceMetricDataAsync request))))

(defn get-operations-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetOperationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOperations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetOperationsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetOperationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOperationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetOperationsRequest request]
    (-> this (.getOperationsAsync request))))

(defn get-domains-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetDomainsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetDomainsResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDomainsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetDomainsRequest request]
    (-> this (.getDomainsAsync request))))

(defn get-load-balancer-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetLoadBalancerRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoadBalancer operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetLoadBalancerResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetLoadBalancerRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoadBalancerAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetLoadBalancerRequest request]
    (-> this (.getLoadBalancerAsync request))))

(defn get-active-names-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetActiveNamesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetActiveNames operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetActiveNamesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetActiveNamesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getActiveNamesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetActiveNamesRequest request]
    (-> this (.getActiveNamesAsync request))))

(defn get-instances-async
  "Description copied from interface: AmazonLightsailAsync

  request - `com.amazonaws.services.lightsail.model.GetInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lightsail.model.GetInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLightsailAsyncClient this ^com.amazonaws.services.lightsail.model.GetInstancesRequest request]
    (-> this (.getInstancesAsync request))))

