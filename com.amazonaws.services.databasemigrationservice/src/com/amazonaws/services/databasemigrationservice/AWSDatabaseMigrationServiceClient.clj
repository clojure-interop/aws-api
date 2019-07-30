(ns com.amazonaws.services.databasemigrationservice.AWSDatabaseMigrationServiceClient
  "Client for accessing AWS Database Migration Service. All service calls made using this client are blocking, and will
  not return until the service call completes.

  AWS Database Migration Service

  AWS Database Migration Service (AWS DMS) can migrate your data to and from the most widely used commercial and
  open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora,
  MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to
  Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL
  Server to PostgreSQL.


  For more information about AWS DMS, see What
  Is AWS Database Migration Service? in the AWS Database Migration User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.databasemigrationservice AWSDatabaseMigrationServiceClient]))

(defn ->aws-database-migration-service-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Database Migration Service (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSDatabaseMigrationServiceClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSDatabaseMigrationServiceClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSDatabaseMigrationServiceClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSDatabaseMigrationServiceClient aws-credentials client-configuration))
  (^AWSDatabaseMigrationServiceClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSDatabaseMigrationServiceClient client-configuration))
  (^AWSDatabaseMigrationServiceClient []
    (new AWSDatabaseMigrationServiceClient )))

(defn *builder
  "returns: `com.amazonaws.services.databasemigrationservice.AWSDatabaseMigrationServiceClientBuilder`"
  (^com.amazonaws.services.databasemigrationservice.AWSDatabaseMigrationServiceClientBuilder []
    (AWSDatabaseMigrationServiceClient/builder )))

(defn reboot-replication-instance
  "Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes
   available again.

  request - `com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest`

  returns: Result of the RebootReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest request]
    (-> this (.rebootReplicationInstance request))))

(defn list-tags-for-resource
  "Lists all tags for an AWS DMS resource.

  request - `com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn describe-replication-subnet-groups
  "Returns information about the replication subnet groups.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest`

  returns: Result of the DescribeReplicationSubnetGroups operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest request]
    (-> this (.describeReplicationSubnetGroups request))))

(defn start-replication-task-assessment
  "Starts the replication task assessment for unsupported data types in the source database.

  request - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest`

  returns: Result of the StartReplicationTaskAssessment operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest request]
    (-> this (.startReplicationTaskAssessment request))))

(defn describe-replication-tasks
  "Returns information about replication tasks for your account in the current region.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest`

  returns: Result of the DescribeReplicationTasks operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest request]
    (-> this (.describeReplicationTasks request))))

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

  request - `com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest`

  returns: Result of the CreateEventSubscription operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscription request))))

(defn waiters
  "returns: `com.amazonaws.services.databasemigrationservice.waiters.AWSDatabaseMigrationServiceWaiters`"
  (^com.amazonaws.services.databasemigrationservice.waiters.AWSDatabaseMigrationServiceWaiters [^AWSDatabaseMigrationServiceClient this]
    (-> this (.waiters))))

(defn describe-event-subscriptions
  "Lists all the event subscriptions for a customer account. The description of a subscription includes
   SubscriptionName, SNSTopicARN, CustomerID, SourceType,
   SourceID, CreationTime, and Status.


   If you specify SubscriptionName, this action lists the description for that subscription.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest`

  returns: Result of the DescribeEventSubscriptions operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptions request))))

(defn create-replication-subnet-group
  "Creates a replication subnet group given a list of the subnet IDs in a VPC.

  request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest`

  returns: Result of the CreateReplicationSubnetGroup operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult`

  throws: com.amazonaws.services.databasemigrationservice.model.AccessDeniedException - AWS DMS was denied access to the endpoint. Check that the role is correctly configured."
  (^com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest request]
    (-> this (.createReplicationSubnetGroup request))))

(defn delete-endpoint
  "Deletes the specified endpoint.



   All tasks associated with the endpoint must be deleted before you can delete the endpoint.

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest`

  returns: Result of the DeleteEndpoint operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpoint request))))

(defn create-replication-instance
  "Creates the replication instance using the specified parameters.

  request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest`

  returns: Result of the CreateReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest request]
    (-> this (.createReplicationInstance request))))

(defn describe-pending-maintenance-actions
  "For internal use only

  request - `com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest`

  returns: Result of the DescribePendingMaintenanceActions operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActions request))))

(defn create-endpoint
  "Creates an endpoint using the provided settings.

  request - `com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest`

  returns: Result of the CreateEndpoint operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult`

  throws: com.amazonaws.services.databasemigrationservice.model.KMSKeyNotAccessibleException - AWS DMS cannot access the AWS KMS key."
  (^com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest request]
    (-> this (.createEndpoint request))))

(defn describe-connections
  "Describes the status of the connections that have been made between the replication instance and an endpoint.
   Connections are created when you test an endpoint.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest`

  returns: Result of the DescribeConnections operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest request]
    (-> this (.describeConnections request))))

(defn describe-replication-instance-task-logs
  "Returns information about the task logs for the specified task.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest`

  returns: Result of the DescribeReplicationInstanceTaskLogs operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest request]
    (-> this (.describeReplicationInstanceTaskLogs request))))

(defn describe-schemas
  "Returns information about the schema for the specified endpoint.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest`

  returns: Result of the DescribeSchemas operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest request]
    (-> this (.describeSchemas request))))

(defn refresh-schemas
  "Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes.
   You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.

  request - `com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest`

  returns: Result of the RefreshSchemas operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest request]
    (-> this (.refreshSchemas request))))

(defn modify-replication-instance
  "Modifies the replication instance to apply new settings. You can change one or more parameters by specifying
   these parameters and the new values in the request.


   Some settings are applied during the maintenance window.

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest`

  returns: Result of the ModifyReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.AccessDeniedException - AWS DMS was denied access to the endpoint. Check that the role is correctly configured."
  (^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest request]
    (-> this (.modifyReplicationInstance request))))

(defn describe-certificates
  "Provides a description of the certificate.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest`

  returns: Result of the DescribeCertificates operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest request]
    (-> this (.describeCertificates request))))

(defn import-certificate
  "Uploads the specified certificate.

  request - `com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest`

  returns: Result of the ImportCertificate operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceAlreadyExistsException - The resource you are attempting to create already exists."
  (^com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest request]
    (-> this (.importCertificate request))))

(defn test-connection
  "Tests the connection between the replication instance and the endpoint.

  request - `com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest`

  returns: Result of the TestConnection operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.TestConnectionResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.TestConnectionResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest request]
    (-> this (.testConnection request))))

(defn reload-tables
  "Reloads the target database table with the source data.

  request - `com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest`

  returns: Result of the ReloadTables operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest request]
    (-> this (.reloadTables request))))

(defn modify-event-subscription
  "Modifies an existing AWS DMS event notification subscription.

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest`

  returns: Result of the ModifyEventSubscription operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscription request))))

(defn describe-account-attributes
  "Lists all of the AWS DMS attributes for a customer account. These attributes include AWS DMS quotas for the
   account and a unique account identifier in a particular DMS region. DMS quotas include a list of resource quotas
   supported by the account, such as the number of replication instances allowed. The description for each resource
   quota, includes the quota name, current usage toward that quota, and the quota's maximum value. DMS uses the
   unique account identifier to name each artifact used by DMS in the given region.


   This command does not take any parameters.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest`

  returns: Result of the DescribeAccountAttributes operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributes request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AWSDatabaseMigrationServiceClient this]
    (-> this (.shutdown))))

(defn describe-events
  "Lists events for a given source identifier and source type. You can also specify a start and end time. For more
   information on AWS DMS events, see Working with Events and
   Notifications in the AWS Database Migration User Guide.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest`

  returns: Result of the DescribeEvents operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest request]
    (-> this (.describeEvents request))))

(defn describe-replication-instances
  "Returns information about replication instances for your account in the current region.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest`

  returns: Result of the DescribeReplicationInstances operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest request]
    (-> this (.describeReplicationInstances request))))

(defn describe-endpoint-types
  "Returns information about the type of endpoints available.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest`

  returns: Result of the DescribeEndpointTypes operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest request]
    (-> this (.describeEndpointTypes request))))

(defn describe-refresh-schemas-status
  "Returns the status of the RefreshSchemas operation.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest`

  returns: Result of the DescribeRefreshSchemasStatus operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest request]
    (-> this (.describeRefreshSchemasStatus request))))

(defn delete-replication-instance
  "Deletes the specified replication instance.



   You must delete any migration tasks that are associated with the replication instance before you can delete it.

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest`

  returns: Result of the DeleteReplicationInstance operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest request]
    (-> this (.deleteReplicationInstance request))))

(defn delete-certificate
  "Deletes the specified certificate.

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest`

  returns: Result of the DeleteCertificate operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest request]
    (-> this (.deleteCertificate request))))

(defn describe-event-categories
  "Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of
   the event categories and source types in Working with Events and
   Notifications in the AWS Database Migration Service User Guide.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest`

  returns: Result of the DescribeEventCategories operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategories request))))

(defn delete-event-subscription
  "Deletes an AWS DMS event subscription.

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest`

  returns: Result of the DeleteEventSubscription operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscription request))))

(defn modify-replication-subnet-group
  "Modifies the settings for the specified replication subnet group.

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest`

  returns: Result of the ModifyReplicationSubnetGroup operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult`

  throws: com.amazonaws.services.databasemigrationservice.model.AccessDeniedException - AWS DMS was denied access to the endpoint. Check that the role is correctly configured."
  (^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest request]
    (-> this (.modifyReplicationSubnetGroup request))))

(defn delete-replication-task
  "Deletes the specified replication task.

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest`

  returns: Result of the DeleteReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest request]
    (-> this (.deleteReplicationTask request))))

(defn modify-replication-task
  "Modifies the specified replication task.


   You can't modify the task endpoints. The task must be stopped before you can modify it.


   For more information about AWS DMS tasks, see Working with Migration Tasks in the
   AWS Database Migration Service User Guide.

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest`

  returns: Result of the ModifyReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest request]
    (-> this (.modifyReplicationTask request))))

(defn create-replication-task
  "Creates a replication task using the specified parameters.

  request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest`

  returns: Result of the CreateReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult`

  throws: com.amazonaws.services.databasemigrationservice.model.AccessDeniedException - AWS DMS was denied access to the endpoint. Check that the role is correctly configured."
  (^com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest request]
    (-> this (.createReplicationTask request))))

(defn remove-tags-from-resource
  "Removes metadata tags from a DMS resource.

  request - `com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest`

  returns: Result of the RemoveTagsFromResource operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResource request))))

(defn describe-replication-task-assessment-results
  "Returns the task assessment results from Amazon S3. This action always returns the latest results.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest`

  returns: Result of the DescribeReplicationTaskAssessmentResults operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest request]
    (-> this (.describeReplicationTaskAssessmentResults request))))

(defn describe-orderable-replication-instances
  "Returns information about the replication instance types that can be created in the specified region.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest`

  returns: Result of the DescribeOrderableReplicationInstances operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult`"
  (^com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest request]
    (-> this (.describeOrderableReplicationInstances request))))

(defn stop-replication-task
  "Stops the replication task.

  request - `com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest`

  returns: Result of the StopReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest request]
    (-> this (.stopReplicationTask request))))

(defn add-tags-to-resource
  "Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and
   migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS
   resources, or used in a Condition statement in an IAM policy for DMS.

  request - `com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest`

  returns: Result of the AddTagsToResource operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResource request))))

(defn delete-replication-subnet-group
  "Deletes a subnet group.

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest`

  returns: Result of the DeleteReplicationSubnetGroup operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest request]
    (-> this (.deleteReplicationSubnetGroup request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn modify-endpoint
  "Modifies the specified endpoint.

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest`

  returns: Result of the ModifyEndpoint operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult`

  throws: com.amazonaws.services.databasemigrationservice.model.InvalidResourceStateException - The resource is in a state that prevents it from being used for database migration."
  (^com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest request]
    (-> this (.modifyEndpoint request))))

(defn start-replication-task
  "Starts the replication task.


   For more information about AWS DMS tasks, see Working with Migration Tasks  in the
   AWS Database Migration Service User Guide.

  request - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest`

  returns: Result of the StartReplicationTask operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest request]
    (-> this (.startReplicationTask request))))

(defn describe-endpoints
  "Returns information about the endpoints for your account in the current region.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest`

  returns: Result of the DescribeEndpoints operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest request]
    (-> this (.describeEndpoints request))))

(defn apply-pending-maintenance-action
  "Applies a pending maintenance action to a resource (for example, to a replication instance).

  request - `com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest`

  returns: Result of the ApplyPendingMaintenanceAction operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceAction request))))

(defn describe-table-statistics
  "Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and
   rows deleted.


   Note that the \"last updated\" column the DMS console only indicates the time that AWS DMS last updated the table
   statistics record for a table. It does not indicate the time of the last update to the table.

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest`

  returns: Result of the DescribeTableStatistics operation returned by the service. - `com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult`

  throws: com.amazonaws.services.databasemigrationservice.model.ResourceNotFoundException - The resource could not be found."
  (^com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult [^AWSDatabaseMigrationServiceClient this ^com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest request]
    (-> this (.describeTableStatistics request))))

