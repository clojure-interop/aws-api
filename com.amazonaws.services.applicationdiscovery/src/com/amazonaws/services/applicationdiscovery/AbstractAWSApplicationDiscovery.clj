(ns com.amazonaws.services.applicationdiscovery.AbstractAWSApplicationDiscovery
  "Abstract implementation of AWSApplicationDiscovery. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.applicationdiscovery AbstractAWSApplicationDiscovery]))

(defn delete-tags
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest`

  returns: Result of the DeleteTags operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.DeleteTagsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DeleteTagsRequest request]
    (-> this (.deleteTags request))))

(defn delete-applications
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest`

  returns: Result of the DeleteApplications operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DeleteApplicationsRequest request]
    (-> this (.deleteApplications request))))

(defn start-import-task
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest`

  returns: Result of the StartImportTask operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartImportTaskResult`"
  (^com.amazonaws.services.applicationdiscovery.model.StartImportTaskResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StartImportTaskRequest request]
    (-> this (.startImportTask request))))

(defn describe-tags
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest`

  returns: Result of the DescribeTags operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.DescribeTagsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeTagsRequest request]
    (-> this (.describeTags request))))

(defn set-region
  "Description copied from interface: AWSApplicationDiscovery

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSApplicationDiscovery this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn start-continuous-export
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest`

  returns: Result of the StartContinuousExport operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartContinuousExportResult`"
  (^com.amazonaws.services.applicationdiscovery.model.StartContinuousExportResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StartContinuousExportRequest request]
    (-> this (.startContinuousExport request))))

(defn stop-data-collection-by-agent-ids
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest`

  returns: Result of the StopDataCollectionByAgentIds operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StopDataCollectionByAgentIdsRequest request]
    (-> this (.stopDataCollectionByAgentIds request))))

(defn get-discovery-summary
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest`

  returns: Result of the GetDiscoverySummary operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult`"
  (^com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.GetDiscoverySummaryRequest request]
    (-> this (.getDiscoverySummary request))))

(defn describe-import-tasks
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest`

  returns: Result of the DescribeImportTasks operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksResult`"
  (^com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeImportTasksRequest request]
    (-> this (.describeImportTasks request))))

(defn list-configurations
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest`

  returns: Result of the ListConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.ListConfigurationsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.ListConfigurationsRequest request]
    (-> this (.listConfigurations request))))

(defn list-server-neighbors
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest`

  returns: Result of the ListServerNeighbors operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.ListServerNeighborsRequest request]
    (-> this (.listServerNeighbors request))))

(defn start-export-task
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest`

  returns: Result of the StartExportTask operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult`"
  (^com.amazonaws.services.applicationdiscovery.model.StartExportTaskResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StartExportTaskRequest request]
    (-> this (.startExportTask request))))

(defn create-tags
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest`

  returns: Result of the CreateTags operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.CreateTagsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.CreateTagsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.CreateTagsRequest request]
    (-> this (.createTags request))))

(defn batch-delete-import-data
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest`

  returns: Result of the BatchDeleteImportData operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataResult`"
  (^com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.BatchDeleteImportDataRequest request]
    (-> this (.batchDeleteImportData request))))

(defn shutdown
  "Description copied from interface: AWSApplicationDiscovery"
  ([^AbstractAWSApplicationDiscovery this]
    (-> this (.shutdown))))

(defn describe-continuous-exports
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest`

  returns: Result of the DescribeContinuousExports operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeContinuousExportsRequest request]
    (-> this (.describeContinuousExports request))))

(defn update-application
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest`

  returns: Result of the UpdateApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult`"
  (^com.amazonaws.services.applicationdiscovery.model.UpdateApplicationResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.UpdateApplicationRequest request]
    (-> this (.updateApplication request))))

(defn set-endpoint
  "Description copied from interface: AWSApplicationDiscovery

  endpoint - The endpoint (ex: \"discovery.us-west-2.amazonaws.com\") or a full URL, including the protocol (ex: \"https://discovery.us-west-2.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSApplicationDiscovery this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn disassociate-configuration-items-from-application
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest`

  returns: Result of the DisassociateConfigurationItemsFromApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult`"
  (^com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DisassociateConfigurationItemsFromApplicationRequest request]
    (-> this (.disassociateConfigurationItemsFromApplication request))))

(defn describe-agents
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest`

  returns: Result of the DescribeAgents operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.DescribeAgentsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeAgentsRequest request]
    (-> this (.describeAgents request))))

(defn create-application
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest`

  returns: Result of the CreateApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult`"
  (^com.amazonaws.services.applicationdiscovery.model.CreateApplicationResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.CreateApplicationRequest request]
    (-> this (.createApplication request))))

(defn describe-export-configurations
  "Deprecated.

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest`

  returns: Result of the DescribeExportConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportConfigurationsRequest request]
    (-> this (.describeExportConfigurations request))))

(defn describe-export-tasks
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest`

  returns: Result of the DescribeExportTasks operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult`"
  (^com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeExportTasksRequest request]
    (-> this (.describeExportTasks request))))

(defn start-data-collection-by-agent-ids
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest`

  returns: Result of the StartDataCollectionByAgentIds operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StartDataCollectionByAgentIdsRequest request]
    (-> this (.startDataCollectionByAgentIds request))))

(defn stop-continuous-export
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest`

  returns: Result of the StopContinuousExport operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.StopContinuousExportResult`"
  (^com.amazonaws.services.applicationdiscovery.model.StopContinuousExportResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.StopContinuousExportRequest request]
    (-> this (.stopContinuousExport request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSApplicationDiscovery

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSApplicationDiscovery this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn export-configurations
  "Deprecated.

  request - `com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest`

  returns: Result of the ExportConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.ExportConfigurationsRequest request]
    (-> this (.exportConfigurations request))))

(defn associate-configuration-items-to-application
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest`

  returns: Result of the AssociateConfigurationItemsToApplication operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult`"
  (^com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.AssociateConfigurationItemsToApplicationRequest request]
    (-> this (.associateConfigurationItemsToApplication request))))

(defn describe-configurations
  "Description copied from interface: AWSApplicationDiscovery

  request - `com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest`

  returns: Result of the DescribeConfigurations operation returned by the service. - `com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult`"
  (^com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsResult [^AbstractAWSApplicationDiscovery this ^com.amazonaws.services.applicationdiscovery.model.DescribeConfigurationsRequest request]
    (-> this (.describeConfigurations request))))

