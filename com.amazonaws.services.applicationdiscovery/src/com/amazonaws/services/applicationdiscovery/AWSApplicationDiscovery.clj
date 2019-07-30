(ns com.amazonaws.services.applicationdiscovery.AWSApplicationDiscovery
  "Interface for accessing AWS Application Discovery Service.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSApplicationDiscovery instead.


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
  (:import [com.amazonaws.services.applicationdiscovery AWSApplicationDiscovery]))

(defn delete-tags
  "Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
   configuration items.

  delete-tags-request - `com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest delete-tags-request]
    (-> this (.deleteTags delete-tags-request))))

(defn delete-applications
  "Deletes a list of applications and their associations with configuration items.

  delete-applications-request - `com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest`

  returns: Result of the DeleteApplications operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest delete-applications-request]
    (-> this (.deleteApplications delete-applications-request))))

(defn start-import-task
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

  returns: Result of the StartImportTask operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartImportTaskResult`

  throws: com.amazonaws.services.applicationdiscovery.model.ResourceInUseException - This issue occurs when the same clientRequestToken is used with the StartImportTask action, but with different parameters. For example, you use the same request token but have two different import URLs, you can encounter this issue. If the import tasks are meant to be different, use a different clientRequestToken, and try again."
  (^com.amazonaws.services.applicationdiscovery.model.StartImportTaskResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest start-import-task-request]
    (-> this (.startImportTask start-import-task-request))))

(defn describe-tags
  "Retrieves a list of configuration items that have tags as specified by the key-value pairs, name and value,
   passed to the optional parameter filters.


   There are three valid tag filter names:




   tagKey




   tagValue




   configurationId




   Also, all configuration items associated with your user account that have tags can be listed if you call
   DescribeTags as is without passing any parameters.

  describe-tags-request - `com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest describe-tags-request]
    (-> this (.describeTags describe-tags-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSApplicationDiscovery this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn start-continuous-export
  "Start the continuous flow of agent's discovered data into Amazon Athena.

  start-continuous-export-request - `com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest`

  returns: Result of the StartContinuousExport operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartContinuousExportResult`

  throws: com.amazonaws.services.applicationdiscovery.model.ConflictErrorException"
  (^com.amazonaws.services.applicationdiscovery.model.StartContinuousExportResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest start-continuous-export-request]
    (-> this (.startContinuousExport start-continuous-export-request))))

(defn stop-data-collection-by-agent-ids
  "Instructs the specified agents or connectors to stop collecting data.

  stop-data-collection-by-agent-ids-request - `com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest`

  returns: Result of the StopDataCollectionByAgentIds operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest stop-data-collection-by-agent-ids-request]
    (-> this (.stopDataCollectionByAgentIds stop-data-collection-by-agent-ids-request))))

(defn get-discovery-summary
  "Retrieves a short summary of discovered assets.


   This API operation takes no request parameters and is called as is at the command prompt as shown in the example.

  get-discovery-summary-request - `com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest`

  returns: Result of the GetDiscoverySummary operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest get-discovery-summary-request]
    (-> this (.getDiscoverySummary get-discovery-summary-request))))

(defn describe-import-tasks
  "Returns an array of import tasks for your account, including status information, times, IDs, the Amazon S3 Object
   URL for the import file, and more.

  describe-import-tasks-request - `com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest`

  returns: Result of the DescribeImportTasks operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest describe-import-tasks-request]
    (-> this (.describeImportTasks describe-import-tasks-request))))

(defn list-configurations
  "Retrieves a list of configuration items as specified by the value passed to the required paramater
   configurationType. Optional filtering may be applied to refine search results.

  list-configurations-request - `com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest`

  returns: Result of the ListConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest list-configurations-request]
    (-> this (.listConfigurations list-configurations-request))))

(defn list-server-neighbors
  "Retrieves a list of servers that are one network hop away from a specified server.

  list-server-neighbors-request - `com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest`

  returns: Result of the ListServerNeighbors operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest list-server-neighbors-request]
    (-> this (.listServerNeighbors list-server-neighbors-request))))

(defn start-export-task
  "Begins the export of discovered data to an S3 bucket.


   If you specify agentIds in a filter, the task exports up to 72 hours of detailed data collected by
   the identified Application Discovery Agent, including network, process, and performance details. A time range for
   exported agent data may be set by using startTime and endTime. Export of detailed agent
   data is limited to five concurrently running exports.


   If you do not include an agentIds filter, summary data is exported that includes both AWS Agentless
   Discovery Connector data and summary data from AWS Discovery Agents. Export of summary data is limited to two
   exports per day.

  start-export-task-request - `com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest`

  returns: Result of the StartExportTask operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest start-export-task-request]
    (-> this (.startExportTask start-export-task-request))))

(defn create-tags
  "Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
   accepts a list of multiple configuration items.

  create-tags-request - `com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.CreateTagsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.CreateTagsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest create-tags-request]
    (-> this (.createTags create-tags-request))))

(defn batch-delete-import-data
  "Deletes one or more import tasks, each identified by their import ID. Each import task has a number of records
   that can identify servers or applications.


   AWS Application Discovery Service has built-in matching logic that will identify when discovered servers match
   existing entries that you've previously discovered, the information for the already-existing discovered server is
   updated. When you delete an import task that contains records that were used to match, the information in those
   matched records that comes from the deleted records will also be deleted.

  batch-delete-import-data-request - `com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest`

  returns: Result of the BatchDeleteImportData operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest batch-delete-import-data-request]
    (-> this (.batchDeleteImportData batch-delete-import-data-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSApplicationDiscovery this]
    (-> this (.shutdown))))

(defn describe-continuous-exports
  "Lists exports as specified by ID. All continuous exports associated with your user account can be listed if you
   call DescribeContinuousExports as is without passing any parameters.

  describe-continuous-exports-request - `com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest`

  returns: Result of the DescribeContinuousExports operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest describe-continuous-exports-request]
    (-> this (.describeContinuousExports describe-continuous-exports-request))))

(defn update-application
  "Updates metadata about an application.

  update-application-request - `com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest update-application-request]
    (-> this (.updateApplication update-application-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"discovery.us-west-2.amazonaws.com\") or a full URL, including the protocol (ex: \"https://discovery.us-west-2.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSApplicationDiscovery this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn disassociate-configuration-items-from-application
  "Disassociates one or more configuration items from an application.

  disassociate-configuration-items-from-application-request - `com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest`

  returns: Result of the DisassociateConfigurationItemsFromApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest disassociate-configuration-items-from-application-request]
    (-> this (.disassociateConfigurationItemsFromApplication disassociate-configuration-items-from-application-request))))

(defn describe-agents
  "Lists agents or connectors as specified by ID or other filters. All agents/connectors associated with your user
   account can be listed if you call DescribeAgents as is without passing any parameters.

  describe-agents-request - `com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest`

  returns: Result of the DescribeAgents operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest describe-agents-request]
    (-> this (.describeAgents describe-agents-request))))

(defn create-application
  "Creates an application with the given name and description.

  create-application-request - `com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest create-application-request]
    (-> this (.createApplication create-application-request))))

(defn describe-export-configurations
  "Deprecated.

  describe-export-configurations-request - `com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest`

  returns: Result of the DescribeExportConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest describe-export-configurations-request]
    (-> this (.describeExportConfigurations describe-export-configurations-request))))

(defn describe-export-tasks
  "Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.

  describe-export-tasks-request - `com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest`

  returns: Result of the DescribeExportTasks operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest describe-export-tasks-request]
    (-> this (.describeExportTasks describe-export-tasks-request))))

(defn start-data-collection-by-agent-ids
  "Instructs the specified agents or connectors to start collecting data.

  start-data-collection-by-agent-ids-request - `com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest`

  returns: Result of the StartDataCollectionByAgentIds operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest start-data-collection-by-agent-ids-request]
    (-> this (.startDataCollectionByAgentIds start-data-collection-by-agent-ids-request))))

(defn stop-continuous-export
  "Stop the continuous flow of agent's discovered data into Amazon Athena.

  stop-continuous-export-request - `com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest`

  returns: Result of the StopContinuousExport operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StopContinuousExportResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.StopContinuousExportResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest stop-continuous-export-request]
    (-> this (.stopContinuousExport stop-continuous-export-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSApplicationDiscovery this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn export-configurations
  "Deprecated.

  export-configurations-request - `com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest`

  returns: Result of the ExportConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest export-configurations-request]
    (-> this (.exportConfigurations export-configurations-request))))

(defn associate-configuration-items-to-application
  "Associates one or more configuration items with an application.

  associate-configuration-items-to-application-request - `com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest`

  returns: Result of the AssociateConfigurationItemsToApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest associate-configuration-items-to-application-request]
    (-> this (.associateConfigurationItemsToApplication associate-configuration-items-to-application-request))))

(defn describe-configurations
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

  returns: Result of the DescribeConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult [^AWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest describe-configurations-request]
    (-> this (.describeConfigurations describe-configurations-request))))

