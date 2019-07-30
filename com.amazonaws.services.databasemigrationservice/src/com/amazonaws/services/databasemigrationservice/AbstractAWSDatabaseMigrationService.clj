(ns com.amazonaws.services.databasemigrationservice.AbstractAWSDatabaseMigrationService
  "Abstract implementation of AWSDatabaseMigrationService. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.databasemigrationservice AbstractAWSDatabaseMigrationService]))

(defn reboot-replication-instance
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest`

  returns: Result of the RebootReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult`"
  (^com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest request]
    (-> this (.rebootReplicationInstance request))))

(defn list-tags-for-resource
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult`"
  (^com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-replication-subnet-groups
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest`

  returns: Result of the DescribeReplicationSubnetGroups operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest request]
    (-> this (.describeReplicationSubnetGroups request))))

(defn set-region
  "Description copied from interface: AWSDatabaseMigrationService

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSDatabaseMigrationService this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn start-replication-task-assessment
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest`

  returns: Result of the StartReplicationTaskAssessment operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult`"
  (^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest request]
    (-> this (.startReplicationTaskAssessment request))))

(defn describe-replication-tasks
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest`

  returns: Result of the DescribeReplicationTasks operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest request]
    (-> this (.describeReplicationTasks request))))

(defn create-event-subscription
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest`

  returns: Result of the CreateEventSubscription operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult`"
  (^com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscription request))))

(defn waiters
  "returns: `com.amazonaws.services.databasemigrationservice.waiters.AWSDatabaseMigrationServiceWaiters`"
  (^com.amazonaws.services.databasemigrationservice.waiters.AWSDatabaseMigrationServiceWaiters [^AbstractAWSDatabaseMigrationService this]
    (-> this (.waiters))))

(defn describe-event-subscriptions
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest`

  returns: Result of the DescribeEventSubscriptions operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptions request))))

(defn create-replication-subnet-group
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest`

  returns: Result of the CreateReplicationSubnetGroup operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult`"
  (^com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest request]
    (-> this (.createReplicationSubnetGroup request))))

(defn delete-endpoint
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest`

  returns: Result of the DeleteEndpoint operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpoint request))))

(defn create-replication-instance
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest`

  returns: Result of the CreateReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult`"
  (^com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest request]
    (-> this (.createReplicationInstance request))))

(defn describe-pending-maintenance-actions
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest`

  returns: Result of the DescribePendingMaintenanceActions operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActions request))))

(defn create-endpoint
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest`

  returns: Result of the CreateEndpoint operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult`"
  (^com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest request]
    (-> this (.createEndpoint request))))

(defn describe-connections
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest`

  returns: Result of the DescribeConnections operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest request]
    (-> this (.describeConnections request))))

(defn describe-replication-instance-task-logs
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest`

  returns: Result of the DescribeReplicationInstanceTaskLogs operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest request]
    (-> this (.describeReplicationInstanceTaskLogs request))))

(defn describe-schemas
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest`

  returns: Result of the DescribeSchemas operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest request]
    (-> this (.describeSchemas request))))

(defn refresh-schemas
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest`

  returns: Result of the RefreshSchemas operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult`"
  (^com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest request]
    (-> this (.refreshSchemas request))))

(defn modify-replication-instance
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest`

  returns: Result of the ModifyReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult`"
  (^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest request]
    (-> this (.modifyReplicationInstance request))))

(defn describe-certificates
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest`

  returns: Result of the DescribeCertificates operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest request]
    (-> this (.describeCertificates request))))

(defn import-certificate
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest`

  returns: Result of the ImportCertificate operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult`"
  (^com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest request]
    (-> this (.importCertificate request))))

(defn test-connection
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest`

  returns: Result of the TestConnection operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.TestConnectionResult`"
  (^com.amazonaws.services.databasemigrationservice.model.TestConnectionResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest request]
    (-> this (.testConnection request))))

(defn reload-tables
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest`

  returns: Result of the ReloadTables operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest request]
    (-> this (.reloadTables request))))

(defn modify-event-subscription
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest`

  returns: Result of the ModifyEventSubscription operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult`"
  (^com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscription request))))

(defn describe-account-attributes
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request))))

(defn shutdown
  "Description copied from interface: AWSDatabaseMigrationService"
  ([^AbstractAWSDatabaseMigrationService this]
    (-> this (.shutdown))))

(defn describe-events
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn describe-replication-instances
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest`

  returns: Result of the DescribeReplicationInstances operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest request]
    (-> this (.describeReplicationInstances request))))

(defn describe-endpoint-types
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest`

  returns: Result of the DescribeEndpointTypes operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest request]
    (-> this (.describeEndpointTypes request))))

(defn describe-refresh-schemas-status
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest`

  returns: Result of the DescribeRefreshSchemasStatus operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest request]
    (-> this (.describeRefreshSchemasStatus request))))

(defn delete-replication-instance
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest`

  returns: Result of the DeleteReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest request]
    (-> this (.deleteReplicationInstance request))))

(defn set-endpoint
  "Description copied from interface: AWSDatabaseMigrationService

  endpoint - The endpoint (ex: \"dms.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"dms.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSDatabaseMigrationService this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-certificate
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest`

  returns: Result of the DeleteCertificate operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest request]
    (-> this (.deleteCertificate request))))

(defn describe-event-categories
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategories request))))

(defn delete-event-subscription
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest`

  returns: Result of the DeleteEventSubscription operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscription request))))

(defn modify-replication-subnet-group
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest`

  returns: Result of the ModifyReplicationSubnetGroup operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult`"
  (^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest request]
    (-> this (.modifyReplicationSubnetGroup request))))

(defn delete-replication-task
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest`

  returns: Result of the DeleteReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest request]
    (-> this (.deleteReplicationTask request))))

(defn modify-replication-task
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest`

  returns: Result of the ModifyReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult`"
  (^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest request]
    (-> this (.modifyReplicationTask request))))

(defn create-replication-task
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest`

  returns: Result of the CreateReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult`"
  (^com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest request]
    (-> this (.createReplicationTask request))))

(defn remove-tags-from-resource
  "Description copied from interface: AWSDatabaseMigrationService

  request - Removes one or more tags from an AWS DMS resource. - `com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult`"
  (^com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn describe-replication-task-assessment-results
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest`

  returns: Result of the DescribeReplicationTaskAssessmentResults operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest request]
    (-> this (.describeReplicationTaskAssessmentResults request))))

(defn describe-orderable-replication-instances
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest`

  returns: Result of the DescribeOrderableReplicationInstances operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest request]
    (-> this (.describeOrderableReplicationInstances request))))

(defn stop-replication-task
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest`

  returns: Result of the StopReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult`"
  (^com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest request]
    (-> this (.stopReplicationTask request))))

(defn add-tags-to-resource
  "Description copied from interface: AWSDatabaseMigrationService

  request - Associates a set of tags with an AWS DMS resource. - `com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult`"
  (^com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn delete-replication-subnet-group
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest`

  returns: Result of the DeleteReplicationSubnetGroup operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest request]
    (-> this (.deleteReplicationSubnetGroup request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSDatabaseMigrationService

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn modify-endpoint
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest`

  returns: Result of the ModifyEndpoint operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult`"
  (^com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest request]
    (-> this (.modifyEndpoint request))))

(defn start-replication-task
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest`

  returns: Result of the StartReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult`"
  (^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest request]
    (-> this (.startReplicationTask request))))

(defn describe-endpoints
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest`

  returns: Result of the DescribeEndpoints operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest request]
    (-> this (.describeEndpoints request))))

(defn apply-pending-maintenance-action
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest`

  returns: Result of the ApplyPendingMaintenanceAction operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionResult`"
  (^com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceAction request))))

(defn describe-table-statistics
  "Description copied from interface: AWSDatabaseMigrationService

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest`

  returns: Result of the DescribeTableStatistics operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult [^AbstractAWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest request]
    (-> this (.describeTableStatistics request))))

