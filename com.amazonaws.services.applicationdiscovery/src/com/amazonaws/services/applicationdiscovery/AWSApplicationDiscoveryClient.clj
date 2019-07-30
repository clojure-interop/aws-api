(ns com.amazonaws.services.applicationdiscovery.AWSApplicationDiscoveryClient
  "Client for accessing AWS Application Discovery Service. All service calls made using this client are blocking, and
  will not return until the service call completes.

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
  (:import [com.amazonaws.services.applicationdiscovery AWSApplicationDiscoveryClient]))

(defn ->aws-application-discovery-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Application Discovery Service (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSApplicationDiscoveryClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSApplicationDiscoveryClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSApplicationDiscoveryClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSApplicationDiscoveryClient aws-credentials client-configuration))
  (^AWSApplicationDiscoveryClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSApplicationDiscoveryClient client-configuration))
  (^AWSApplicationDiscoveryClient []
    (new AWSApplicationDiscoveryClient )))

(defn *builder
  "returns: `com.amazonaws.services.applicationdiscovery.AWSApplicationDiscoveryClientBuilder`"
  (^com.amazonaws.services.applicationdiscovery.AWSApplicationDiscoveryClientBuilder []
    (AWSApplicationDiscoveryClient/builder )))

(defn delete-tags
  "Deletes the association between configuration items and one or more tags. This API accepts a list of multiple
   configuration items.

  request - `com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn delete-applications
  "Deletes a list of applications and their associations with configuration items.

  request - `com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest`

  returns: Result of the DeleteApplications operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest request]
    (-> this (.deleteApplications request))))

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

  request - `com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest`

  returns: Result of the StartImportTask operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartImportTaskResult`

  throws: com.amazonaws.services.applicationdiscovery.model.ResourceInUseException - This issue occurs when the same clientRequestToken is used with the StartImportTask action, but with different parameters. For example, you use the same request token but have two different import URLs, you can encounter this issue. If the import tasks are meant to be different, use a different clientRequestToken, and try again."
  (^com.amazonaws.services.applicationdiscovery.model.StartImportTaskResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest request]
    (-> this (.startImportTask request))))

(defn describe-tags
  "Retrieves a list of configuration items that have tags as specified by the key-value pairs, name and value,
   passed to the optional parameter filters.


   There are three valid tag filter names:




   tagKey




   tagValue




   configurationId




   Also, all configuration items associated with your user account that have tags can be listed if you call
   DescribeTags as is without passing any parameters.

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn start-continuous-export
  "Start the continuous flow of agent's discovered data into Amazon Athena.

  request - `com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest`

  returns: Result of the StartContinuousExport operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartContinuousExportResult`

  throws: com.amazonaws.services.applicationdiscovery.model.ConflictErrorException"
  (^com.amazonaws.services.applicationdiscovery.model.StartContinuousExportResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest request]
    (-> this (.startContinuousExport request))))

(defn stop-data-collection-by-agent-ids
  "Instructs the specified agents or connectors to stop collecting data.

  request - `com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest`

  returns: Result of the StopDataCollectionByAgentIds operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest request]
    (-> this (.stopDataCollectionByAgentIds request))))

(defn get-discovery-summary
  "Retrieves a short summary of discovered assets.


   This API operation takes no request parameters and is called as is at the command prompt as shown in the example.

  request - `com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest`

  returns: Result of the GetDiscoverySummary operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest request]
    (-> this (.getDiscoverySummary request))))

(defn describe-import-tasks
  "Returns an array of import tasks for your account, including status information, times, IDs, the Amazon S3 Object
   URL for the import file, and more.

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest`

  returns: Result of the DescribeImportTasks operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest request]
    (-> this (.describeImportTasks request))))

(defn list-configurations
  "Retrieves a list of configuration items as specified by the value passed to the required paramater
   configurationType. Optional filtering may be applied to refine search results.

  request - `com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest`

  returns: Result of the ListConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest request]
    (-> this (.listConfigurations request))))

(defn list-server-neighbors
  "Retrieves a list of servers that are one network hop away from a specified server.

  request - `com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest`

  returns: Result of the ListServerNeighbors operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest request]
    (-> this (.listServerNeighbors request))))

(defn start-export-task
  "Begins the export of discovered data to an S3 bucket.


   If you specify agentIds in a filter, the task exports up to 72 hours of detailed data collected by
   the identified Application Discovery Agent, including network, process, and performance details. A time range for
   exported agent data may be set by using startTime and endTime. Export of detailed agent
   data is limited to five concurrently running exports.


   If you do not include an agentIds filter, summary data is exported that includes both AWS Agentless
   Discovery Connector data and summary data from AWS Discovery Agents. Export of summary data is limited to two
   exports per day.

  request - `com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest`

  returns: Result of the StartExportTask operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest request]
    (-> this (.startExportTask request))))

(defn create-tags
  "Creates one or more tags for configuration items. Tags are metadata that help you categorize IT assets. This API
   accepts a list of multiple configuration items.

  request - `com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.CreateTagsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.CreateTagsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn batch-delete-import-data
  "Deletes one or more import tasks, each identified by their import ID. Each import task has a number of records
   that can identify servers or applications.


   AWS Application Discovery Service has built-in matching logic that will identify when discovered servers match
   existing entries that you've previously discovered, the information for the already-existing discovered server is
   updated. When you delete an import task that contains records that were used to match, the information in those
   matched records that comes from the deleted records will also be deleted.

  request - `com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest`

  returns: Result of the BatchDeleteImportData operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest request]
    (-> this (.batchDeleteImportData request))))

(defn describe-continuous-exports
  "Lists exports as specified by ID. All continuous exports associated with your user account can be listed if you
   call DescribeContinuousExports as is without passing any parameters.

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest`

  returns: Result of the DescribeContinuousExports operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest request]
    (-> this (.describeContinuousExports request))))

(defn update-application
  "Updates metadata about an application.

  request - `com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest request]
    (-> this (.updateApplication request))))

(defn disassociate-configuration-items-from-application
  "Disassociates one or more configuration items from an application.

  request - `com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest`

  returns: Result of the DisassociateConfigurationItemsFromApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest request]
    (-> this (.disassociateConfigurationItemsFromApplication request))))

(defn describe-agents
  "Lists agents or connectors as specified by ID or other filters. All agents/connectors associated with your user
   account can be listed if you call DescribeAgents as is without passing any parameters.

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest`

  returns: Result of the DescribeAgents operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest request]
    (-> this (.describeAgents request))))

(defn create-application
  "Creates an application with the given name and description.

  request - `com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn describe-export-configurations
  "Deprecated.

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest`

  returns: Result of the DescribeExportConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest request]
    (-> this (.describeExportConfigurations request))))

(defn describe-export-tasks
  "Retrieve status of one or more export tasks. You can retrieve the status of up to 100 export tasks.

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest`

  returns: Result of the DescribeExportTasks operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest request]
    (-> this (.describeExportTasks request))))

(defn start-data-collection-by-agent-ids
  "Instructs the specified agents or connectors to start collecting data.

  request - `com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest`

  returns: Result of the StartDataCollectionByAgentIds operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest request]
    (-> this (.startDataCollectionByAgentIds request))))

(defn stop-continuous-export
  "Stop the continuous flow of agent's discovered data into Amazon Athena.

  request - `com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest`

  returns: Result of the StopContinuousExport operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StopContinuousExportResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.StopContinuousExportResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest request]
    (-> this (.stopContinuousExport request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSApplicationDiscoveryClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn export-configurations
  "Deprecated.

  request - `com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest`

  returns: Result of the ExportConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest request]
    (-> this (.exportConfigurations request))))

(defn associate-configuration-items-to-application
  "Associates one or more configuration items with an application.

  request - `com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest`

  returns: Result of the AssociateConfigurationItemsToApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest request]
    (-> this (.associateConfigurationItemsToApplication request))))

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

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest`

  returns: Result of the DescribeConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult`

  throws: com.amazonaws.services.applicationdiscovery.model.AuthorizationErrorException - The AWS user account does not have permission to perform the action. Check the IAM policy associated with this account."
  (^com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult [^AWSApplicationDiscoveryClient this ^com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest request]
    (-> this (.describeConfigurations request))))

