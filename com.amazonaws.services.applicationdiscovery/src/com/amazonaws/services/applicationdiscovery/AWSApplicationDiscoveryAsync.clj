(ns com.amazonaws.services.applicationdiscovery.AWSApplicationDiscoveryAsync
  "Interface for accessing AWS Application Discovery Service asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSApplicationDiscoveryAsync instead.


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
  (:import [com.amazonaws.services.applicationdiscovery AWSApplicationDiscoveryAsync]))

(defn describe-continuous-exports-async
  "Lists exports as specified by ID. All continuous exports associated with your user account can be listed if you
   call DescribeContinuousExports as is without passing any parameters.

  describe-continuous-exports-request - `com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeContinuousExports operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest describe-continuous-exports-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeContinuousExportsAsync describe-continuous-exports-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest describe-continuous-exports-request]
    (-> this (.describeContinuousExportsAsync describe-continuous-exports-request))))

(defn batch-delete-import-data-async
  "Deletes one or more import tasks, each identified by their import ID. Each import task has a number of records
   that can identify servers or applications.


   AWS Application Discovery Service has built-in matching logic that will identify when discovered servers match
   existing entries that you've previously discovered, the information for the already-existing discovered server is
   updated. When you delete an import task that contains records that were used to match, the information in those
   matched records that comes from the deleted records will also be deleted.

  batch-delete-import-data-request - `com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchDeleteImportData operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest batch-delete-import-data-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchDeleteImportDataAsync batch-delete-import-data-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest batch-delete-import-data-request]
    (-> this (.batchDeleteImportDataAsync batch-delete-import-data-request))))

(defn describe-agents-async
  "Lists agents or connectors as specified by ID or other filters. All agents/connectors associated with your user
   account can be listed if you call DescribeAgents as is without passing any parameters.

  describe-agents-request - `com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAgents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest describe-agents-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAgentsAsync describe-agents-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest describe-agents-request]
    (-> this (.describeAgentsAsync describe-agents-request))))

(defn export-configurations-async
  "Deprecated.

  export-configurations-request - `com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExportConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest export-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.exportConfigurationsAsync export-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest export-configurations-request]
    (-> this (.exportConfigurationsAsync export-configurations-request))))

(defn start-import-task-async
  "Starts an import task, which allows you to import details of your on-premises environment directly into AWS
   without having to use the Application Discovery Service (ADS) tools such as the Discovery Connector or Discovery
   Agent. This gives you the option to perform migration assessment and planning directly from your imported data,
   including the ability to group your devices as applications and track their migration status.


   To start an import request, do this:




   Download the specially formatted comma separated value (CSV) import template, which you can find here: https://s3-us-west-2.amazonaws.com/templates-7cffcf56-bd96-4b1c-b45b-a5b42f282e46/import_template.csv.




   Fill out the template with your server and application data.




   Upload your import file to an Amazon S3 bucket, and make a note of it's Object URL. Your import file must be in
   the CSV format.




   Use the console or the StartImportTask command with the AWS CLI or one of the AWS SDKs to import the
   records from your file.




   For more information, including step-by-step procedures, see Migration Hub
   Import in the AWS Application Discovery Service User Guide.



   There are limits to the number of import tasks you can create (and delete) in an AWS account. For more
   information, see AWS Application
   Discovery Service Limits in the AWS Application Discovery Service User Guide.

  start-import-task-request - `com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartImportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StartImportTaskResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest start-import-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startImportTaskAsync start-import-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest start-import-task-request]
    (-> this (.startImportTaskAsync start-import-task-request))))

(defn describe-import-tasks-async
  "Returns an array of import tasks for your account, including status information, times, IDs, the Amazon S3 Object
   URL for the import file, and more.

  describe-import-tasks-request - `com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeImportTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest describe-import-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeImportTasksAsync describe-import-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest describe-import-tasks-request]
    (-> this (.describeImportTasksAsync describe-import-tasks-request))))

(defn delete-tags-async
  "Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
   configuration items.

  delete-tags-request - `com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest delete-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsAsync delete-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTagsAsync delete-tags-request))))

(defn update-application-async
  "Updates metadata about an application.

  update-application-request - `com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest update-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateApplicationAsync update-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest update-application-request]
    (-> this (.updateApplicationAsync update-application-request))))

(defn start-continuous-export-async
  "Start the continuous flow of agent's discovered data into Amazon Athena.

  start-continuous-export-request - `com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartContinuousExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StartContinuousExportResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest start-continuous-export-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startContinuousExportAsync start-continuous-export-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest start-continuous-export-request]
    (-> this (.startContinuousExportAsync start-continuous-export-request))))

(defn get-discovery-summary-async
  "Retrieves a short summary of discovered assets.


   This API operation takes no request parameters and is called as is at the command prompt as shown in the example.

  get-discovery-summary-request - `com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDiscoverySummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest get-discovery-summary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDiscoverySummaryAsync get-discovery-summary-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest get-discovery-summary-request]
    (-> this (.getDiscoverySummaryAsync get-discovery-summary-request))))

(defn delete-applications-async
  "Deletes a list of applications and their associations with configuration items.

  delete-applications-request - `com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest delete-applications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteApplicationsAsync delete-applications-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest delete-applications-request]
    (-> this (.deleteApplicationsAsync delete-applications-request))))

(defn stop-data-collection-by-agent-ids-async
  "Instructs the specified agents or connectors to stop collecting data.

  stop-data-collection-by-agent-ids-request - `com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDataCollectionByAgentIds operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest stop-data-collection-by-agent-ids-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDataCollectionByAgentIdsAsync stop-data-collection-by-agent-ids-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest stop-data-collection-by-agent-ids-request]
    (-> this (.stopDataCollectionByAgentIdsAsync stop-data-collection-by-agent-ids-request))))

(defn create-application-async
  "Creates an application with the given name and description.

  create-application-request - `com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest create-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createApplicationAsync create-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplicationAsync create-application-request))))

(defn list-configurations-async
  "Retrieves a list of configuration items as specified by the value passed to the required paramater
   configurationType. Optional filtering may be applied to refine search results.

  list-configurations-request - `com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest list-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationsAsync list-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest list-configurations-request]
    (-> this (.listConfigurationsAsync list-configurations-request))))

(defn describe-export-tasks-async
  "Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.

  describe-export-tasks-request - `com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExportTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest describe-export-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExportTasksAsync describe-export-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest describe-export-tasks-request]
    (-> this (.describeExportTasksAsync describe-export-tasks-request))))

(defn create-tags-async
  "Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
   accepts a list of multiple configuration items.

  create-tags-request - `com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.CreateTagsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest create-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTagsAsync create-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest create-tags-request]
    (-> this (.createTagsAsync create-tags-request))))

(defn associate-configuration-items-to-application-async
  "Associates one or more configuration items with an application.

  associate-configuration-items-to-application-request - `com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateConfigurationItemsToApplication operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest associate-configuration-items-to-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateConfigurationItemsToApplicationAsync associate-configuration-items-to-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest associate-configuration-items-to-application-request]
    (-> this (.associateConfigurationItemsToApplicationAsync associate-configuration-items-to-application-request))))

(defn list-server-neighbors-async
  "Retrieves a list of servers that are one network hop away from a specified server.

  list-server-neighbors-request - `com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServerNeighbors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest list-server-neighbors-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServerNeighborsAsync list-server-neighbors-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest list-server-neighbors-request]
    (-> this (.listServerNeighborsAsync list-server-neighbors-request))))

(defn describe-export-configurations-async
  "Deprecated.

  describe-export-configurations-request - `com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeExportConfigurations operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest describe-export-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeExportConfigurationsAsync describe-export-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest describe-export-configurations-request]
    (-> this (.describeExportConfigurationsAsync describe-export-configurations-request))))

(defn describe-tags-async
  "Retrieves a list of configuration items that have tags as specified by the key-value pairs, name and value,
   passed to the optional parameter filters.


   There are three valid tag filter names:




   tagKey




   tagValue




   configurationId




   Also, all configuration items associated with your user account that have tags can be listed if you call
   DescribeTags as is without passing any parameters.

  describe-tags-request - `com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest describe-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTagsAsync describe-tags-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTagsAsync describe-tags-request))))

(defn describe-configurations-async
  "Retrieves attributes for a list of configuration item IDs.



   All of the supplied IDs must be for the same asset type from one of the following:




   server




   application




   process




   connection




   Output fields are specific to the asset type specified. For example, the output for a server configuration
   item includes a list of attributes about the server, such as host name, operating system, number of network
   cards, etc.


   For a complete list of outputs for each asset type, see Using the DescribeConfigurations Action.

  describe-configurations-request - `com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest describe-configurations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationsAsync describe-configurations-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest describe-configurations-request]
    (-> this (.describeConfigurationsAsync describe-configurations-request))))

(defn stop-continuous-export-async
  "Stop the continuous flow of agent's discovered data into Amazon Athena.

  stop-continuous-export-request - `com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopContinuousExport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StopContinuousExportResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest stop-continuous-export-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopContinuousExportAsync stop-continuous-export-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest stop-continuous-export-request]
    (-> this (.stopContinuousExportAsync stop-continuous-export-request))))

(defn disassociate-configuration-items-from-application-async
  "Disassociates one or more configuration items from an application.

  disassociate-configuration-items-from-application-request - `com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateConfigurationItemsFromApplication operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest disassociate-configuration-items-from-application-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateConfigurationItemsFromApplicationAsync disassociate-configuration-items-from-application-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest disassociate-configuration-items-from-application-request]
    (-> this (.disassociateConfigurationItemsFromApplicationAsync disassociate-configuration-items-from-application-request))))

(defn start-data-collection-by-agent-ids-async
  "Instructs the specified agents or connectors to start collecting data.

  start-data-collection-by-agent-ids-request - `com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDataCollectionByAgentIds operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest start-data-collection-by-agent-ids-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDataCollectionByAgentIdsAsync start-data-collection-by-agent-ids-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest start-data-collection-by-agent-ids-request]
    (-> this (.startDataCollectionByAgentIdsAsync start-data-collection-by-agent-ids-request))))

(defn start-export-task-async
  "Begins the export of discovered data to an S3 bucket.


   If you specify agentIds in a filter, the task exports up to 72 hours of detailed data collected by
   the identified Application Discovery Agent, including network, process, and performance details. A time range for
   exported agent data may be set by using startTime and endTime. Export of detailed agent
   data is limited to five concurrently running exports.


   If you do not include an agentIds filter, summary data is exported that includes both AWS Agentless
   Discovery Connector data and summary data from AWS Discovery Agents. Export of summary data is limited to two
   exports per day.

  start-export-task-request - `com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartExportTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult>`"
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest start-export-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startExportTaskAsync start-export-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSApplicationDiscoveryAsync this ^com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest start-export-task-request]
    (-> this (.startExportTaskAsync start-export-task-request))))

