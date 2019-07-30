(ns com.amazonaws.services.databasemigrationservice.AWSDatabaseMigrationServiceAsync
  "Interface for accessing AWS Database Migration Service asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSDatabaseMigrationServiceAsync instead.


  AWS Database Migration Service

  AWS Database Migration Service (AWS DMS) can migrate your data to and from the most widely used commercial and
  open-source databases such as Oracle, PostgreSQL, Microsoft SQL Server, Amazon Redshift, MariaDB, Amazon Aurora,
  MySQL, and SAP Adaptive Server Enterprise (ASE). The service supports homogeneous migrations such as Oracle to
  Oracle, as well as heterogeneous migrations between different database platforms, such as Oracle to MySQL or SQL
  Server to PostgreSQL.


  For more information about AWS DMS, see What
  Is AWS Database Migration Service? in the AWS Database Migration User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.databasemigrationservice AWSDatabaseMigrationServiceAsync]))

(defn describe-replication-instance-task-logs-async
  "Returns information about the task logs for the specified task.

  describe-replication-instance-task-logs-request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationInstanceTaskLogs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest describe-replication-instance-task-logs-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationInstanceTaskLogsAsync describe-replication-instance-task-logs-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest describe-replication-instance-task-logs-request]
    (-> this (.describeReplicationInstanceTaskLogsAsync describe-replication-instance-task-logs-request))))

(defn describe-schemas-async
  "Returns information about the schema for the specified endpoint.

  describe-schemas-request - `com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSchemas operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest describe-schemas-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSchemasAsync describe-schemas-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest describe-schemas-request]
    (-> this (.describeSchemasAsync describe-schemas-request))))

(defn describe-event-categories-async
  "Lists categories for all event source types, or, if specified, for a specified source type. You can see a list of
   the event categories and source types in Working with Events and
   Notifications in the AWS Database Migration Service User Guide.

  describe-event-categories-request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest describe-event-categories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventCategoriesAsync describe-event-categories-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest describe-event-categories-request]
    (-> this (.describeEventCategoriesAsync describe-event-categories-request))))

(defn describe-endpoint-types-async
  "Returns information about the type of endpoints available.

  describe-endpoint-types-request - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpointTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest describe-endpoint-types-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointTypesAsync describe-endpoint-types-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest describe-endpoint-types-request]
    (-> this (.describeEndpointTypesAsync describe-endpoint-types-request))))

(defn create-replication-task-async
  "Creates a replication task using the specified parameters.

  create-replication-task-request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReplicationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest create-replication-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReplicationTaskAsync create-replication-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest create-replication-task-request]
    (-> this (.createReplicationTaskAsync create-replication-task-request))))

(defn delete-event-subscription-async
  "Deletes an AWS DMS event subscription.

  delete-event-subscription-request - `com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest delete-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventSubscriptionAsync delete-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest delete-event-subscription-request]
    (-> this (.deleteEventSubscriptionAsync delete-event-subscription-request))))

(defn reboot-replication-instance-async
  "Reboots a replication instance. Rebooting results in a momentary outage, until the replication instance becomes
   available again.

  reboot-replication-instance-request - `com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootReplicationInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest reboot-replication-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootReplicationInstanceAsync reboot-replication-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest reboot-replication-instance-request]
    (-> this (.rebootReplicationInstanceAsync reboot-replication-instance-request))))

(defn create-endpoint-async
  "Creates an endpoint using the provided settings.

  create-endpoint-request - `com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest create-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEndpointAsync create-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest create-endpoint-request]
    (-> this (.createEndpointAsync create-endpoint-request))))

(defn describe-refresh-schemas-status-async
  "Returns the status of the RefreshSchemas operation.

  describe-refresh-schemas-status-request - `com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRefreshSchemasStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest describe-refresh-schemas-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRefreshSchemasStatusAsync describe-refresh-schemas-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest describe-refresh-schemas-status-request]
    (-> this (.describeRefreshSchemasStatusAsync describe-refresh-schemas-status-request))))

(defn modify-replication-subnet-group-async
  "Modifies the settings for the specified replication subnet group.

  modify-replication-subnet-group-request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReplicationSubnetGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest modify-replication-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReplicationSubnetGroupAsync modify-replication-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest modify-replication-subnet-group-request]
    (-> this (.modifyReplicationSubnetGroupAsync modify-replication-subnet-group-request))))

(defn describe-replication-subnet-groups-async
  "Returns information about the replication subnet groups.

  describe-replication-subnet-groups-request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationSubnetGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest describe-replication-subnet-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationSubnetGroupsAsync describe-replication-subnet-groups-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest describe-replication-subnet-groups-request]
    (-> this (.describeReplicationSubnetGroupsAsync describe-replication-subnet-groups-request))))

(defn delete-replication-subnet-group-async
  "Deletes a subnet group.

  delete-replication-subnet-group-request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReplicationSubnetGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest delete-replication-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReplicationSubnetGroupAsync delete-replication-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest delete-replication-subnet-group-request]
    (-> this (.deleteReplicationSubnetGroupAsync delete-replication-subnet-group-request))))

(defn delete-endpoint-async
  "Deletes the specified endpoint.



   All tasks associated with the endpoint must be deleted before you can delete the endpoint.

  delete-endpoint-request - `com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest delete-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointAsync delete-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest delete-endpoint-request]
    (-> this (.deleteEndpointAsync delete-endpoint-request))))

(defn describe-table-statistics-async
  "Returns table statistics on the database migration task, including table name, rows inserted, rows updated, and
   rows deleted.


   Note that the \"last updated\" column the DMS console only indicates the time that AWS DMS last updated the table
   statistics record for a table. It does not indicate the time of the last update to the table.

  describe-table-statistics-request - `com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTableStatistics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest describe-table-statistics-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTableStatisticsAsync describe-table-statistics-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest describe-table-statistics-request]
    (-> this (.describeTableStatisticsAsync describe-table-statistics-request))))

(defn import-certificate-async
  "Uploads the specified certificate.

  import-certificate-request - `com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest import-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importCertificateAsync import-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest import-certificate-request]
    (-> this (.importCertificateAsync import-certificate-request))))

(defn describe-endpoints-async
  "Returns information about the endpoints for your account in the current region.

  describe-endpoints-request - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest describe-endpoints-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointsAsync describe-endpoints-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest describe-endpoints-request]
    (-> this (.describeEndpointsAsync describe-endpoints-request))))

(defn modify-endpoint-async
  "Modifies the specified endpoint.

  modify-endpoint-request - `com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest modify-endpoint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEndpointAsync modify-endpoint-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest modify-endpoint-request]
    (-> this (.modifyEndpointAsync modify-endpoint-request))))

(defn describe-replication-tasks-async
  "Returns information about replication tasks for your account in the current region.

  describe-replication-tasks-request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest describe-replication-tasks-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationTasksAsync describe-replication-tasks-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest describe-replication-tasks-request]
    (-> this (.describeReplicationTasksAsync describe-replication-tasks-request))))

(defn create-event-subscription-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest create-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventSubscriptionAsync create-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest create-event-subscription-request]
    (-> this (.createEventSubscriptionAsync create-event-subscription-request))))

(defn describe-pending-maintenance-actions-async
  "For internal use only

  describe-pending-maintenance-actions-request - `com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest describe-pending-maintenance-actions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePendingMaintenanceActionsAsync describe-pending-maintenance-actions-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest describe-pending-maintenance-actions-request]
    (-> this (.describePendingMaintenanceActionsAsync describe-pending-maintenance-actions-request))))

(defn test-connection-async
  "Tests the connection between the replication instance and the endpoint.

  test-connection-request - `com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.TestConnectionResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest test-connection-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testConnectionAsync test-connection-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest test-connection-request]
    (-> this (.testConnectionAsync test-connection-request))))

(defn describe-orderable-replication-instances-async
  "Returns information about the replication instance types that can be created in the specified region.

  describe-orderable-replication-instances-request - `com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrderableReplicationInstances operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest describe-orderable-replication-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrderableReplicationInstancesAsync describe-orderable-replication-instances-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest describe-orderable-replication-instances-request]
    (-> this (.describeOrderableReplicationInstancesAsync describe-orderable-replication-instances-request))))

(defn refresh-schemas-async
  "Populates the schema for the specified endpoint. This is an asynchronous operation and can take several minutes.
   You can check the status of this operation by calling the DescribeRefreshSchemasStatus operation.

  refresh-schemas-request - `com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RefreshSchemas operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest refresh-schemas-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.refreshSchemasAsync refresh-schemas-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest refresh-schemas-request]
    (-> this (.refreshSchemasAsync refresh-schemas-request))))

(defn describe-replication-task-assessment-results-async
  "Returns the task assessment results from Amazon S3. This action always returns the latest results.

  describe-replication-task-assessment-results-request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationTaskAssessmentResults operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest describe-replication-task-assessment-results-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationTaskAssessmentResultsAsync describe-replication-task-assessment-results-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest describe-replication-task-assessment-results-request]
    (-> this (.describeReplicationTaskAssessmentResultsAsync describe-replication-task-assessment-results-request))))

(defn reload-tables-async
  "Reloads the target database table with the source data.

  reload-tables-request - `com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReloadTables operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest reload-tables-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reloadTablesAsync reload-tables-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest reload-tables-request]
    (-> this (.reloadTablesAsync reload-tables-request))))

(defn start-replication-task-assessment-async
  "Starts the replication task assessment for unsupported data types in the source database.

  start-replication-task-assessment-request - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartReplicationTaskAssessment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest start-replication-task-assessment-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startReplicationTaskAssessmentAsync start-replication-task-assessment-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest start-replication-task-assessment-request]
    (-> this (.startReplicationTaskAssessmentAsync start-replication-task-assessment-request))))

(defn delete-replication-task-async
  "Deletes the specified replication task.

  delete-replication-task-request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReplicationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest delete-replication-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReplicationTaskAsync delete-replication-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest delete-replication-task-request]
    (-> this (.deleteReplicationTaskAsync delete-replication-task-request))))

(defn create-replication-instance-async
  "Creates the replication instance using the specified parameters.

  create-replication-instance-request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReplicationInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest create-replication-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReplicationInstanceAsync create-replication-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest create-replication-instance-request]
    (-> this (.createReplicationInstanceAsync create-replication-instance-request))))

(defn modify-replication-task-async
  "Modifies the specified replication task.


   You can't modify the task endpoints. The task must be stopped before you can modify it.


   For more information about AWS DMS tasks, see Working with Migration Tasks in the
   AWS Database Migration Service User Guide.

  modify-replication-task-request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReplicationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest modify-replication-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReplicationTaskAsync modify-replication-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest modify-replication-task-request]
    (-> this (.modifyReplicationTaskAsync modify-replication-task-request))))

(defn delete-certificate-async
  "Deletes the specified certificate.

  delete-certificate-request - `com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest delete-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCertificateAsync delete-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest delete-certificate-request]
    (-> this (.deleteCertificateAsync delete-certificate-request))))

(defn stop-replication-task-async
  "Stops the replication task.

  stop-replication-task-request - `com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopReplicationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest stop-replication-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopReplicationTaskAsync stop-replication-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest stop-replication-task-request]
    (-> this (.stopReplicationTaskAsync stop-replication-task-request))))

(defn remove-tags-from-resource-async
  "Removes metadata tags from a DMS resource.

  remove-tags-from-resource-request - Removes one or more tags from an AWS DMS resource. - `com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request))))

(defn describe-event-subscriptions-async
  "Lists all the event subscriptions for a customer account. The description of a subscription includes
   SubscriptionName, SNSTopicARN, CustomerID, SourceType,
   SourceID, CreationTime, and Status.


   If you specify SubscriptionName, this action lists the description for that subscription.

  describe-event-subscriptions-request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest describe-event-subscriptions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSubscriptionsAsync describe-event-subscriptions-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest describe-event-subscriptions-request]
    (-> this (.describeEventSubscriptionsAsync describe-event-subscriptions-request))))

(defn describe-certificates-async
  "Provides a description of the certificate.

  describe-certificates-request - `com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest describe-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCertificatesAsync describe-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest describe-certificates-request]
    (-> this (.describeCertificatesAsync describe-certificates-request))))

(defn list-tags-for-resource-async
  "Lists all tags for an AWS DMS resource.

  list-tags-for-resource-request - `com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn describe-connections-async
  "Describes the status of the connections that have been made between the replication instance and an endpoint.
   Connections are created when you test an endpoint.

  describe-connections-request - `com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConnections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest describe-connections-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConnectionsAsync describe-connections-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest describe-connections-request]
    (-> this (.describeConnectionsAsync describe-connections-request))))

(defn describe-events-async
  "Lists events for a given source identifier and source type. You can also specify a start and end time. For more
   information on AWS DMS events, see Working with Events and
   Notifications in the AWS Database Migration User Guide.

  describe-events-request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest describe-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync describe-events-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEventsAsync describe-events-request))))

(defn delete-replication-instance-async
  "Deletes the specified replication instance.



   You must delete any migration tasks that are associated with the replication instance before you can delete it.

  delete-replication-instance-request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReplicationInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest delete-replication-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReplicationInstanceAsync delete-replication-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest delete-replication-instance-request]
    (-> this (.deleteReplicationInstanceAsync delete-replication-instance-request))))

(defn start-replication-task-async
  "Starts the replication task.


   For more information about AWS DMS tasks, see Working with Migration Tasks  in the
   AWS Database Migration Service User Guide.

  start-replication-task-request - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartReplicationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest start-replication-task-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startReplicationTaskAsync start-replication-task-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest start-replication-task-request]
    (-> this (.startReplicationTaskAsync start-replication-task-request))))

(defn add-tags-to-resource-async
  "Adds metadata tags to an AWS DMS resource, including replication instance, endpoint, security group, and
   migration task. These tags can also be used with cost allocation reporting to track cost associated with DMS
   resources, or used in a Condition statement in an IAM policy for DMS.

  add-tags-to-resource-request - Associates a set of tags with an AWS DMS resource. - `com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest add-tags-to-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request))))

(defn modify-event-subscription-async
  "Modifies an existing AWS DMS event notification subscription.

  modify-event-subscription-request - `com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest modify-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEventSubscriptionAsync modify-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest modify-event-subscription-request]
    (-> this (.modifyEventSubscriptionAsync modify-event-subscription-request))))

(defn describe-account-attributes-async
  "Lists all of the AWS DMS attributes for a customer account. These attributes include AWS DMS quotas for the
   account and a unique account identifier in a particular DMS region. DMS quotas include a list of resource quotas
   supported by the account, such as the number of replication instances allowed. The description for each resource
   quota, includes the quota name, current usage toward that quota, and the quota's maximum value. DMS uses the
   unique account identifier to name each artifact used by DMS in the given region.


   This command does not take any parameters.

  describe-account-attributes-request - `com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest describe-account-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest describe-account-attributes-request]
    (-> this (.describeAccountAttributesAsync describe-account-attributes-request))))

(defn apply-pending-maintenance-action-async
  "Applies a pending maintenance action to a resource (for example, to a replication instance).

  apply-pending-maintenance-action-request - `com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest apply-pending-maintenance-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applyPendingMaintenanceActionAsync apply-pending-maintenance-action-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest apply-pending-maintenance-action-request]
    (-> this (.applyPendingMaintenanceActionAsync apply-pending-maintenance-action-request))))

(defn describe-replication-instances-async
  "Returns information about replication instances for your account in the current region.

  describe-replication-instances-request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationInstances operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest describe-replication-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationInstancesAsync describe-replication-instances-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest describe-replication-instances-request]
    (-> this (.describeReplicationInstancesAsync describe-replication-instances-request))))

(defn create-replication-subnet-group-async
  "Creates a replication subnet group given a list of the subnet IDs in a VPC.

  create-replication-subnet-group-request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReplicationSubnetGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest create-replication-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReplicationSubnetGroupAsync create-replication-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest create-replication-subnet-group-request]
    (-> this (.createReplicationSubnetGroupAsync create-replication-subnet-group-request))))

(defn modify-replication-instance-async
  "Modifies the replication instance to apply new settings. You can change one or more parameters by specifying
   these parameters and the new values in the request.


   Some settings are applied during the maintenance window.

  modify-replication-instance-request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReplicationInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult>`"
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest modify-replication-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReplicationInstanceAsync modify-replication-instance-request async-handler)))
  (^java.util.concurrent.Future [^AWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest modify-replication-instance-request]
    (-> this (.modifyReplicationInstanceAsync modify-replication-instance-request))))

