(ns com.amazonaws.services.applicationdiscovery.AWSApplicationDiscoveryAsyncClient
  "Client for accessing AWS Application Discovery Service asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  AWS Application Discovery Service

  AWS Application Discovery Service helps you plan application migration projects by automatically identifying servers,
  virtual machines (VMs), software, and software dependencies running in your on-premises data centers. Application
  Discovery Service also collects application performance data, which can help you assess the outcome of your
  migration. The data collected by Application Discovery Service is securely retained in an AWS-hosted and managed
  database in the cloud. You can export the data as a CSV or XML file into your preferred visualization tool or
  cloud-migration solution to plan your migration. For more information, see AWS Application Discovery Service FAQ.


  Application Discovery Service offers two modes of operation:




  Agentless discovery mode is recommended for environments that use VMware vCenter Server. This mode doesn't
  require you to install an agent on each host. Agentless discovery gathers server information regardless of the
  operating systems, which minimizes the time required for initial on-premises infrastructure assessment. Agentless
  discovery doesn't collect information about software and software dependencies. It also doesn't work in non-VMware
  environments.




  Agent-based discovery mode collects a richer set of data than agentless discovery by using the AWS Application
  Discovery Agent, which you install on one or more hosts in your data center. The agent captures infrastructure and
  application information, including an inventory of installed software applications, system and process performance,
  resource utilization, and network dependencies between workloads. The information collected by agents is secured at
  rest and in transit to the Application Discovery Service database in the cloud.




  We recommend that you use agent-based discovery for non-VMware environments and to collect information about software
  and software dependencies. You can also run agent-based and agentless discovery simultaneously. Use agentless
  discovery to quickly complete the initial infrastructure assessment and then install agents on select hosts.


  Application Discovery Service integrates with application discovery solutions from AWS Partner Network (APN)
  partners. Third-party application discovery tools can query Application Discovery Service and write to the
  Application Discovery Service database using a public API. You can then import the data into either a visualization
  tool or cloud-migration solution.



  Application Discovery Service doesn't gather sensitive information. All data is handled according to the AWS Privacy Policy. You can operate Application Discovery Service offline
  to inspect collected data before it is shared with the service.



  This API reference provides descriptions, syntax, and usage examples for each of the actions and data types for
  Application Discovery Service. The topic for each action shows the API request parameters and the response.
  Alternatively, you can use one of the AWS SDKs to access an API that is tailored to the programming language or
  platform that you're using. For more information, see AWS SDKs.


  This guide is intended for use with the
  AWS Application Discovery Service User Guide ."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationdiscovery AWSApplicationDiscoveryAsyncClient]))

(defn ->aws-application-discovery-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSApplicationDiscoveryAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSApplicationDiscoveryAsyncClient aws-credentials client-configuration executor-service))
  (^AWSApplicationDiscoveryAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSApplicationDiscoveryAsyncClient aws-credentials executor-service))
  (^AWSApplicationDiscoveryAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSApplicationDiscoveryAsyncClient client-configuration))
  (^AWSApplicationDiscoveryAsyncClient []
    (new AWSApplicationDiscoveryAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.applicationdiscovery.AWSApplicationDiscoveryAsyncClientBuilder`"
  (^com.amazonaws.services.applicationdiscovery.AWSApplicationDiscoveryAsyncClientBuilder []
    (AWSApplicationDiscoveryAsyncClient/asyncBuilder )))

(defn describe-continuous-exports-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeContinuousExports operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeContinuousExportsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest request]
    (-> this (.describeContinuousExportsAsync request))))

(defn batch-delete-import-data-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteImportData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteImportDataAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest request]
    (-> this (.batchDeleteImportDataAsync request))))

(defn describe-agents-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAgents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAgentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest request]
    (-> this (.describeAgentsAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSApplicationDiscoveryAsyncClient this]
    (-> this (.getExecutorService))))

(defn export-configurations-async
  "Deprecated.

  request - `com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest request]
    (-> this (.exportConfigurationsAsync request))))

(defn start-import-task-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartImportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StartImportTaskResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startImportTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest request]
    (-> this (.startImportTaskAsync request))))

(defn describe-import-tasks-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImportTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImportTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest request]
    (-> this (.describeImportTasksAsync request))))

(defn delete-tags-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest request]
    (-> this (.deleteTagsAsync request))))

(defn update-application-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest request]
    (-> this (.updateApplicationAsync request))))

(defn start-continuous-export-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartContinuousExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StartContinuousExportResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startContinuousExportAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest request]
    (-> this (.startContinuousExportAsync request))))

(defn get-discovery-summary-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDiscoverySummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDiscoverySummaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest request]
    (-> this (.getDiscoverySummaryAsync request))))

(defn delete-applications-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest request]
    (-> this (.deleteApplicationsAsync request))))

(defn stop-data-collection-by-agent-ids-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDataCollectionByAgentIds operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDataCollectionByAgentIdsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest request]
    (-> this (.stopDataCollectionByAgentIdsAsync request))))

(defn create-application-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest request]
    (-> this (.createApplicationAsync request))))

(defn list-configurations-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest request]
    (-> this (.listConfigurationsAsync request))))

(defn describe-export-tasks-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExportTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExportTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest request]
    (-> this (.describeExportTasksAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSApplicationDiscoveryAsyncClient this]
    (-> this (.shutdown))))

(defn create-tags-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest request]
    (-> this (.createTagsAsync request))))

(defn associate-configuration-items-to-application-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateConfigurationItemsToApplication operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateConfigurationItemsToApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest request]
    (-> this (.associateConfigurationItemsToApplicationAsync request))))

(defn list-server-neighbors-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServerNeighbors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServerNeighborsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest request]
    (-> this (.listServerNeighborsAsync request))))

(defn describe-export-configurations-async
  "Deprecated.

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExportConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExportConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest request]
    (-> this (.describeExportConfigurationsAsync request))))

(defn describe-tags-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest request]
    (-> this (.describeTagsAsync request))))

(defn describe-configurations-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest request]
    (-> this (.describeConfigurationsAsync request))))

(defn stop-continuous-export-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopContinuousExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StopContinuousExportResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopContinuousExportAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest request]
    (-> this (.stopContinuousExportAsync request))))

(defn disassociate-configuration-items-from-application-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateConfigurationItemsFromApplication operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateConfigurationItemsFromApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest request]
    (-> this (.disassociateConfigurationItemsFromApplicationAsync request))))

(defn start-data-collection-by-agent-ids-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDataCollectionByAgentIds operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDataCollectionByAgentIdsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest request]
    (-> this (.startDataCollectionByAgentIdsAsync request))))

(defn start-export-task-async
  "Description copied from interface: AWSApplicationDiscoveryAsync

  request - `com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartExportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startExportTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsyncClient this ^com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest request]
    (-> this (.startExportTaskAsync request))))

