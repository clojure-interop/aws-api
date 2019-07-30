(ns com.amazonaws.services.databasemigrationservice.AbstractAWSDatabaseMigrationServiceAsync
  "Abstract implementation of AWSDatabaseMigrationServiceAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.databasemigrationservice AbstractAWSDatabaseMigrationServiceAsync]))

(defn describe-replication-instance-task-logs-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationInstanceTaskLogs operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationInstanceTaskLogsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstanceTaskLogsRequest request]
    (-> this (.describeReplicationInstanceTaskLogsAsync request))))

(defn describe-schemas-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSchemas operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeSchemasResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSchemasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeSchemasRequest request]
    (-> this (.describeSchemasAsync request))))

(defn describe-event-categories-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventCategoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategoriesAsync request))))

(defn describe-endpoint-types-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpointTypes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointTypesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointTypesRequest request]
    (-> this (.describeEndpointTypesAsync request))))

(defn create-replication-task-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReplicationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReplicationTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationTaskRequest request]
    (-> this (.createReplicationTaskAsync request))))

(defn delete-event-subscription-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteEventSubscriptionRequest request]
    (-> this (.deleteEventSubscriptionAsync request))))

(defn reboot-replication-instance-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootReplicationInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootReplicationInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RebootReplicationInstanceRequest request]
    (-> this (.rebootReplicationInstanceAsync request))))

(defn create-endpoint-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.CreateEndpointResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateEndpointRequest request]
    (-> this (.createEndpointAsync request))))

(defn describe-refresh-schemas-status-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeRefreshSchemasStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeRefreshSchemasStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeRefreshSchemasStatusRequest request]
    (-> this (.describeRefreshSchemasStatusAsync request))))

(defn modify-replication-subnet-group-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReplicationSubnetGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReplicationSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationSubnetGroupRequest request]
    (-> this (.modifyReplicationSubnetGroupAsync request))))

(defn describe-replication-subnet-groups-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationSubnetGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationSubnetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationSubnetGroupsRequest request]
    (-> this (.describeReplicationSubnetGroupsAsync request))))

(defn delete-replication-subnet-group-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReplicationSubnetGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReplicationSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationSubnetGroupRequest request]
    (-> this (.deleteReplicationSubnetGroupAsync request))))

(defn delete-endpoint-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteEndpointResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpointAsync request))))

(defn describe-table-statistics-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTableStatistics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTableStatisticsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeTableStatisticsRequest request]
    (-> this (.describeTableStatisticsAsync request))))

(defn import-certificate-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ImportCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ImportCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.importCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ImportCertificateRequest request]
    (-> this (.importCertificateAsync request))))

(defn describe-endpoints-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEndpoints operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEndpointsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEndpointsRequest request]
    (-> this (.describeEndpointsAsync request))))

(defn modify-endpoint-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ModifyEndpointResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyEndpointRequest request]
    (-> this (.modifyEndpointAsync request))))

(defn describe-replication-tasks-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTasksRequest request]
    (-> this (.describeReplicationTasksAsync request))))

(defn create-event-subscription-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateEventSubscriptionRequest request]
    (-> this (.createEventSubscriptionAsync request))))

(defn describe-pending-maintenance-actions-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePendingMaintenanceActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActionsAsync request))))

(defn test-connection-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestConnection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.TestConnectionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testConnectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.TestConnectionRequest request]
    (-> this (.testConnectionAsync request))))

(defn describe-orderable-replication-instances-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrderableReplicationInstances operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrderableReplicationInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeOrderableReplicationInstancesRequest request]
    (-> this (.describeOrderableReplicationInstancesAsync request))))

(defn refresh-schemas-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RefreshSchemas operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.RefreshSchemasResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.refreshSchemasAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RefreshSchemasRequest request]
    (-> this (.refreshSchemasAsync request))))

(defn describe-replication-task-assessment-results-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationTaskAssessmentResults operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationTaskAssessmentResultsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationTaskAssessmentResultsRequest request]
    (-> this (.describeReplicationTaskAssessmentResultsAsync request))))

(defn reload-tables-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReloadTables operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ReloadTablesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reloadTablesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ReloadTablesRequest request]
    (-> this (.reloadTablesAsync request))))

(defn start-replication-task-assessment-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartReplicationTaskAssessment operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startReplicationTaskAssessmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskAssessmentRequest request]
    (-> this (.startReplicationTaskAssessmentAsync request))))

(defn delete-replication-task-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReplicationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReplicationTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationTaskRequest request]
    (-> this (.deleteReplicationTaskAsync request))))

(defn create-replication-instance-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReplicationInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReplicationInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationInstanceRequest request]
    (-> this (.createReplicationInstanceAsync request))))

(defn modify-replication-task-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReplicationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReplicationTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationTaskRequest request]
    (-> this (.modifyReplicationTaskAsync request))))

(defn delete-certificate-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteCertificateResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteCertificateRequest request]
    (-> this (.deleteCertificateAsync request))))

(defn stop-replication-task-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopReplicationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopReplicationTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StopReplicationTaskRequest request]
    (-> this (.stopReplicationTaskAsync request))))

(defn remove-tags-from-resource-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - Removes one or more tags from an AWS DMS resource. - `com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResourceAsync request))))

(defn describe-event-subscriptions-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSubscriptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventSubscriptionsRequest request]
    (-> this (.describeEventSubscriptionsAsync request))))

(defn describe-certificates-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeCertificatesRequest request]
    (-> this (.describeCertificatesAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn describe-connections-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConnections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConnectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeConnectionsRequest request]
    (-> this (.describeConnectionsAsync request))))

(defn describe-events-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request))))

(defn delete-replication-instance-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReplicationInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReplicationInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DeleteReplicationInstanceRequest request]
    (-> this (.deleteReplicationInstanceAsync request))))

(defn start-replication-task-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartReplicationTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startReplicationTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.StartReplicationTaskRequest request]
    (-> this (.startReplicationTaskAsync request))))

(defn add-tags-to-resource-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - Associates a set of tags with an AWS DMS resource. - `com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResourceAsync request))))

(defn modify-event-subscription-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEventSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyEventSubscriptionRequest request]
    (-> this (.modifyEventSubscriptionAsync request))))

(defn describe-account-attributes-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccountAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeAccountAttributesRequest request]
    (-> this (.describeAccountAttributesAsync request))))

(defn apply-pending-maintenance-action-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applyPendingMaintenanceActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceActionAsync request))))

(defn describe-replication-instances-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReplicationInstances operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReplicationInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.DescribeReplicationInstancesRequest request]
    (-> this (.describeReplicationInstancesAsync request))))

(defn create-replication-subnet-group-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReplicationSubnetGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReplicationSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.CreateReplicationSubnetGroupRequest request]
    (-> this (.createReplicationSubnetGroupAsync request))))

(defn modify-replication-instance-async
  "Description copied from interface: AWSDatabaseMigrationServiceAsync

  request - `com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyReplicationInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceResult>`"
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyReplicationInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSDatabaseMigrationServiceAsync this ^com.amazonaws.services.databasemigrationservice.model.ModifyReplicationInstanceRequest request]
    (-> this (.modifyReplicationInstanceAsync request))))

