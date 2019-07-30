(ns com.amazonaws.services.databasemigrationservice.AWSDatabaseMigrationService
  "Interface for accessing AWS Database Migration Service.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSDatabaseMigrationService instead.


  AWS Database Migration Service

  AWS Database Migration Service (AWS DMS) can migrate your data to and from the most widely used commercial and
  open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora,
  MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to
  Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL
  Server to PostgreSQL.


  For more information about AWS DMS, see What
  Is AWS Database Migration Service? in the AWS Database Migration User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.databasemigrationservice AWSDatabaseMigrationService]))

(defn reboot-replication-instance
  "Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes
   available again.

  reboot-replication-instance-request - `com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest`

  returns: Result of the RebootReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest reboot-replication-instance-request]
    (-> this (.rebootReplicationInstance reboot-replication-instance-request))))

(defn list-tags-for-resource
  "Lists all tags for an AWS DMS resource.

  list-tags-for-resource-request - `com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResource list-tags-for-resource-request))))

(defn describe-replication-subnet-groups
  "Returns information about the replication subnet groups.

  describe-replication-subnet-groups-request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest`

  returns: Result of the DescribeReplicationSubnetGroups operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest describe-replication-subnet-groups-request]
    (-> this (.describeReplicationSubnetGroups describe-replication-subnet-groups-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSDatabaseMigrationService this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn start-replication-task-assessment
  "Starts the replication task assessment for unsupported data types in the source database.

  start-replication-task-assessment-request - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest`

  returns: Result of the StartReplicationTaskAssessment operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest start-replication-task-assessment-request]
    (-> this (.startReplicationTaskAssessment start-replication-task-assessment-request))))

(defn describe-replication-tasks
  "Returns information about replication tasks for your account in the current region.

  describe-replication-tasks-request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest`

  returns: Result of the DescribeReplicationTasks operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest describe-replication-tasks-request]
    (-> this (.describeReplicationTasks describe-replication-tasks-request))))

(defn create-event-subscription
  "Creates an AWS DMS event notification subscription.


   You can specify the type of source (SourceType) you want to be notified of, provide a list of AWS
   DMS source IDs (SourceIds) that triggers the events, and provide a list of event categories (
   EventCategories) for events you want to be notified of. If you specify both the
   SourceType and SourceIds, such as SourceType = replication-instance and
   SourceIdentifier = my-replinstance, you will be notified of all the replication instance events for
   the specified source. If you specify a SourceType but don't specify a SourceIdentifier,
   you receive notice of the events for that source type for all your AWS DMS sources. If you don't specify either
   SourceType nor SourceIdentifier, you will be notified of events generated from all AWS
   DMS sources belonging to your customer account.


   For more information about AWS DMS events, see Working with Events and
   Notifications in the AWS Database Migration Service User Guide.

  create-event-subscription-request - `com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest`

  returns: Result of the CreateEventSubscription operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest create-event-subscription-request]
    (-> this (.createEventSubscription create-event-subscription-request))))

(defn waiters
  "returns: `com.amazonaws.services.databasemigrationservice.waiters.AWSDatabaseMigrationServiceWaiters`"
  (^com.amazonaws.services.databasemigrationservice.waiters.AWSDatabaseMigrationServiceWaiters [^AWSDatabaseMigrationService this]
    (-> this (.waiters))))

(defn describe-event-subscriptions
  "Lists all the event subscriptions for a customer account. The description of a subscription includes
   SubscriptionName, SNSTopicARN, CustomerID, SourceType,
   SourceID, CreationTime, and Status.


   If you specify SubscriptionName, this action lists the description for that subscription.

  describe-event-subscriptions-request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest`

  returns: Result of the DescribeEventSubscriptions operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest describe-event-subscriptions-request]
    (-> this (.describeEventSubscriptions describe-event-subscriptions-request))))

(defn create-replication-subnet-group
  "Creates a replication subnet group given a list of the subnet IDs in a VPC.

  create-replication-subnet-group-request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest`

  returns: Result of the CreateReplicationSubnetGroup operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult`

  throws: com.amazonaws.services.databasemigrationservice.model.AccessDeniedException - AWS DMS was denied access to the endpoint. Check that the role is correctly configured."
  (^com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest create-replication-subnet-group-request]
    (-> this (.createReplicationSubnetGroup create-replication-subnet-group-request))))

(defn delete-endpoint
  "Deletes the specified endpoint.



   All tasks associated with the endpoint must be deleted before you can delete the endpoint.

  delete-endpoint-request - `com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest`

  returns: Result of the DeleteEndpoint operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest delete-endpoint-request]
    (-> this (.deleteEndpoint delete-endpoint-request))))

(defn create-replication-instance
  "Creates the replication instance using the specified parameters.

  create-replication-instance-request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest`

  returns: Result of the CreateReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest create-replication-instance-request]
    (-> this (.createReplicationInstance create-replication-instance-request))))

(defn describe-pending-maintenance-actions
  "For internal use only

  describe-pending-maintenance-actions-request - `com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest`

  returns: Result of the DescribePendingMaintenanceActions operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest describe-pending-maintenance-actions-request]
    (-> this (.describePendingMaintenanceActions describe-pending-maintenance-actions-request))))

(defn create-endpoint
  "Creates an endpoint using the provided settings.

  create-endpoint-request - `com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest`

  returns: Result of the CreateEndpoint operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult`

  throws: com.amazonaws.services.databasemigrationservice.model.KMSKeyNotAccessibleException - AWS DMS cannot access the AWS KMS key."
  (^com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest create-endpoint-request]
    (-> this (.createEndpoint create-endpoint-request))))

(defn describe-connections
  "Describes the status of the connections that have been made between the replication instance and an endpoint.
   Connections are created when you test an endpoint.

  describe-connections-request - `com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest`

  returns: Result of the DescribeConnections operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest describe-connections-request]
    (-> this (.describeConnections describe-connections-request))))

(defn describe-replication-instance-task-logs
  "Returns information about the task logs for the specified task.

  describe-replication-instance-task-logs-request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest`

  returns: Result of the DescribeReplicationInstanceTaskLogs operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest describe-replication-instance-task-logs-request]
    (-> this (.describeReplicationInstanceTaskLogs describe-replication-instance-task-logs-request))))

(defn describe-schemas
  "Returns information about the schema for the specified endpoint.

  describe-schemas-request - `com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest`

  returns: Result of the DescribeSchemas operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest describe-schemas-request]
    (-> this (.describeSchemas describe-schemas-request))))

(defn refresh-schemas
  "Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes.
   You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.

  refresh-schemas-request - `com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest`

  returns: Result of the RefreshSchemas operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest refresh-schemas-request]
    (-> this (.refreshSchemas refresh-schemas-request))))

(defn modify-replication-instance
  "Modifies the replication instance to apply new settings. You can change one or more parameters by specifying
   these parameters and the new values in the request.


   Some settings are applied during the maintenance window.

  modify-replication-instance-request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest`

  returns: Result of the ModifyReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.AccessDeniedException - AWS DMS was denied access to the endpoint. Check that the role is correctly configured."
  (^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest modify-replication-instance-request]
    (-> this (.modifyReplicationInstance modify-replication-instance-request))))

(defn describe-certificates
  "Provides a description of the certificate.

  describe-certificates-request - `com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest`

  returns: Result of the DescribeCertificates operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest describe-certificates-request]
    (-> this (.describeCertificates describe-certificates-request))))

(defn import-certificate
  "Uploads the specified certificate.

  import-certificate-request - `com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest`

  returns: Result of the ImportCertificate operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceAlreadyExistsException - The resource you are attempting to create already exists."
  (^com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest import-certificate-request]
    (-> this (.importCertificate import-certificate-request))))

(defn test-connection
  "Tests the connection between the replication instance and the endpoint.

  test-connection-request - `com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest`

  returns: Result of the TestConnection operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.TestConnectionResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.TestConnectionResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest test-connection-request]
    (-> this (.testConnection test-connection-request))))

(defn reload-tables
  "Reloads the target database table with the source data.

  reload-tables-request - `com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest`

  returns: Result of the ReloadTables operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest reload-tables-request]
    (-> this (.reloadTables reload-tables-request))))

(defn modify-event-subscription
  "Modifies an existing AWS DMS event notification subscription.

  modify-event-subscription-request - `com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest`

  returns: Result of the ModifyEventSubscription operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest modify-event-subscription-request]
    (-> this (.modifyEventSubscription modify-event-subscription-request))))

(defn describe-account-attributes
  "Lists all of the AWS DMS attributes for a customer account. These attributes include AWS DMS quotas for the
   account and a unique account identifier in a particular DMS region. DMS quotas include a list of resource quotas
   supported by the account, such as the number of replication instances allowed. The description for each resource
   quota, includes the quota name, current usage toward that quota, and the quota's maximum value. DMS uses the
   unique account identifier to name each artifact used by DMS in the given region.


   This command does not take any parameters.

  describe-account-attributes-request - `com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest describe-account-attributes-request]
    (-> this (.describeAccountAttributes describe-account-attributes-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSDatabaseMigrationService this]
    (-> this (.shutdown))))

(defn describe-events
  "Lists events for a given source identifier and source type. You can also specify a start and end time. For more
   information on AWS DMS events, see Working with Events and
   Notifications in the AWS Database Migration User Guide.

  describe-events-request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEvents describe-events-request))))

(defn describe-replication-instances
  "Returns information about replication instances for your account in the current region.

  describe-replication-instances-request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest`

  returns: Result of the DescribeReplicationInstances operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest describe-replication-instances-request]
    (-> this (.describeReplicationInstances describe-replication-instances-request))))

(defn describe-endpoint-types
  "Returns information about the type of endpoints available.

  describe-endpoint-types-request - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest`

  returns: Result of the DescribeEndpointTypes operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest describe-endpoint-types-request]
    (-> this (.describeEndpointTypes describe-endpoint-types-request))))

(defn describe-refresh-schemas-status
  "Returns the status of the RefreshSchemas operation.

  describe-refresh-schemas-status-request - `com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest`

  returns: Result of the DescribeRefreshSchemasStatus operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest describe-refresh-schemas-status-request]
    (-> this (.describeRefreshSchemasStatus describe-refresh-schemas-status-request))))

(defn delete-replication-instance
  "Deletes the specified replication instance.



   You must delete any migration tasks that are associated with the replication instance before you can delete it.

  delete-replication-instance-request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest`

  returns: Result of the DeleteReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest delete-replication-instance-request]
    (-> this (.deleteReplicationInstance delete-replication-instance-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"dms.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"dms.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSDatabaseMigrationService this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn delete-certificate
  "Deletes the specified certificate.

  delete-certificate-request - `com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest`

  returns: Result of the DeleteCertificate operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest delete-certificate-request]
    (-> this (.deleteCertificate delete-certificate-request))))

(defn describe-event-categories
  "Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of
   the event categories and source types in Working with Events and
   Notifications in the AWS Database Migration Service User Guide.

  describe-event-categories-request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest describe-event-categories-request]
    (-> this (.describeEventCategories describe-event-categories-request))))

(defn delete-event-subscription
  "Deletes an AWS DMS event subscription.

  delete-event-subscription-request - `com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest`

  returns: Result of the DeleteEventSubscription operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest delete-event-subscription-request]
    (-> this (.deleteEventSubscription delete-event-subscription-request))))

(defn modify-replication-subnet-group
  "Modifies the settings for the specified replication subnet group.

  modify-replication-subnet-group-request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest`

  returns: Result of the ModifyReplicationSubnetGroup operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult`

  throws: com.amazonaws.services.databasemigrationservice.model.AccessDeniedException - AWS DMS was denied access to the endpoint. Check that the role is correctly configured."
  (^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest modify-replication-subnet-group-request]
    (-> this (.modifyReplicationSubnetGroup modify-replication-subnet-group-request))))

(defn delete-replication-task
  "Deletes the specified replication task.

  delete-replication-task-request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest`

  returns: Result of the DeleteReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest delete-replication-task-request]
    (-> this (.deleteReplicationTask delete-replication-task-request))))

(defn modify-replication-task
  "Modifies the specified replication task.


   You can't modify the task endpoints. The task must be stopped before you can modify it.


   For more information about AWS DMS tasks, see Working with Migration Tasks in the
   AWS Database Migration Service User Guide.

  modify-replication-task-request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest`

  returns: Result of the ModifyReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest modify-replication-task-request]
    (-> this (.modifyReplicationTask modify-replication-task-request))))

(defn create-replication-task
  "Creates a replication task using the specified parameters.

  create-replication-task-request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest`

  returns: Result of the CreateReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult`

  throws: com.amazonaws.services.databasemigrationservice.model.AccessDeniedException - AWS DMS was denied access to the endpoint. Check that the role is correctly configured."
  (^com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest create-replication-task-request]
    (-> this (.createReplicationTask create-replication-task-request))))

(defn remove-tags-from-resource
  "Removes metadata tags from a DMS resource.

  remove-tags-from-resource-request - Removes one or more tags from an AWS DMS resource. - `com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResource remove-tags-from-resource-request))))

(defn describe-replication-task-assessment-results
  "Returns the task assessment results from Amazon S3. This action always returns the latest results.

  describe-replication-task-assessment-results-request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest`

  returns: Result of the DescribeReplicationTaskAssessmentResults operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest describe-replication-task-assessment-results-request]
    (-> this (.describeReplicationTaskAssessmentResults describe-replication-task-assessment-results-request))))

(defn describe-orderable-replication-instances
  "Returns information about the replication instance types that can be created in the specified region.

  describe-orderable-replication-instances-request - `com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest`

  returns: Result of the DescribeOrderableReplicationInstances operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest describe-orderable-replication-instances-request]
    (-> this (.describeOrderableReplicationInstances describe-orderable-replication-instances-request))))

(defn stop-replication-task
  "Stops the replication task.

  stop-replication-task-request - `com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest`

  returns: Result of the StopReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest stop-replication-task-request]
    (-> this (.stopReplicationTask stop-replication-task-request))))

(defn add-tags-to-resource
  "Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and
   migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS
   resources, or used in a Condition statement in an IAM policy for DMS.

  add-tags-to-resource-request - Associates a set of tags with an AWS DMS resource. - `com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResource add-tags-to-resource-request))))

(defn delete-replication-subnet-group
  "Deletes a subnet group.

  delete-replication-subnet-group-request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest`

  returns: Result of the DeleteReplicationSubnetGroup operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest delete-replication-subnet-group-request]
    (-> this (.deleteReplicationSubnetGroup delete-replication-subnet-group-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSDatabaseMigrationService this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn modify-endpoint
  "Modifies the specified endpoint.

  modify-endpoint-request - `com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest`

  returns: Result of the ModifyEndpoint operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest modify-endpoint-request]
    (-> this (.modifyEndpoint modify-endpoint-request))))

(defn start-replication-task
  "Starts the replication task.


   For more information about AWS DMS tasks, see Working with Migration Tasks  in the
   AWS Database Migration Service User Guide.

  start-replication-task-request - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest`

  returns: Result of the StartReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest start-replication-task-request]
    (-> this (.startReplicationTask start-replication-task-request))))

(defn describe-endpoints
  "Returns information about the endpoints for your account in the current region.

  describe-endpoints-request - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest`

  returns: Result of the DescribeEndpoints operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest describe-endpoints-request]
    (-> this (.describeEndpoints describe-endpoints-request))))

(defn apply-pending-maintenance-action
  "Applies a pending maintenance action to a resource (for example, to a replication instance).

  apply-pending-maintenance-action-request - `com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest`

  returns: Result of the ApplyPendingMaintenanceAction operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest apply-pending-maintenance-action-request]
    (-> this (.applyPendingMaintenanceAction apply-pending-maintenance-action-request))))

(defn describe-table-statistics
  "Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and
   rows deleted.


   Note that the \"last updated\" column the DMS console only indicates the time that AWS DMS last updated the table
   statistics record for a table. It does not indicate the time of the last update to the table.

  describe-table-statistics-request - `com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest`

  returns: Result of the DescribeTableStatistics operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult [^AWSDatabaseMigrationService this ^com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest describe-table-statistics-request]
    (-> this (.describeTableStatistics describe-table-statistics-request))))

