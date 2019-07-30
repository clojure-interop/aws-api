(ns com.amazonaws.services.docdb.AmazonDocDBAsyncClient
  "Client for accessing Amazon DocDB asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Amazon DocumentDB API documentation"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.docdb AmazonDocDBAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.docdb.AmazonDocDBAsyncClientBuilder`"
  (^com.amazonaws.services.docdb.AmazonDocDBAsyncClientBuilder []
    (AmazonDocDBAsyncClient/asyncBuilder )))

(defn modify-db-cluster-snapshot-attribute-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to ModifyDBClusterSnapshotAttribute. - `com.amazonaws.services.docdb.model.ModifyDBClusterSnapshotAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterSnapshotAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ModifyDBClusterSnapshotAttributeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterSnapshotAttributeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ModifyDBClusterSnapshotAttributeRequest request]
    (-> this (.modifyDBClusterSnapshotAttributeAsync request))))

(defn delete-db-instance-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DeleteDBInstance. - `com.amazonaws.services.docdb.model.DeleteDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DeleteDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DeleteDBInstanceRequest request]
    (-> this (.deleteDBInstanceAsync request))))

(defn describe-event-categories-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeEventCategories. - `com.amazonaws.services.docdb.model.DescribeEventCategoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeEventCategoriesResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeEventCategoriesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventCategoriesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeEventCategoriesRequest request]
    (-> this (.describeEventCategoriesAsync request))))

(defn stop-db-cluster-async
  "Description copied from interface: AmazonDocDBAsync

  request - `com.amazonaws.services.docdb.model.StopDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.StopDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.StopDBClusterRequest request]
    (-> this (.stopDBClusterAsync request))))

(defn describe-db-subnet-groups-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeDBSubnetGroups. - `com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSubnetGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBSubnetGroupsRequest request]
    (-> this (.describeDBSubnetGroupsAsync request))))

(defn start-db-cluster-async
  "Description copied from interface: AmazonDocDBAsync

  request - `com.amazonaws.services.docdb.model.StartDBClusterRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.StartDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.StartDBClusterRequest request]
    (-> this (.startDBClusterAsync request))))

(defn describe-db-cluster-parameters-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeDBClusterParameters. - `com.amazonaws.services.docdb.model.DescribeDBClusterParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBClusterParametersResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBClusterParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBClusterParametersRequest request]
    (-> this (.describeDBClusterParametersAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonDocDBAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-db-subnet-group-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DeleteDBSubnetGroup. - `com.amazonaws.services.docdb.model.DeleteDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DeleteDBSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DeleteDBSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DeleteDBSubnetGroupRequest request]
    (-> this (.deleteDBSubnetGroupAsync request))))

(defn describe-db-cluster-parameter-groups-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeDBClusterParameterGroups. - `com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameterGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParameterGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBClusterParameterGroupsRequest request]
    (-> this (.describeDBClusterParameterGroupsAsync request))))

(defn copy-db-cluster-snapshot-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to CopyDBClusterSnapshot. - `com.amazonaws.services.docdb.model.CopyDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CopyDBClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CopyDBClusterSnapshotRequest request]
    (-> this (.copyDBClusterSnapshotAsync request))))

(defn copy-db-cluster-parameter-group-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to CopyDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.CopyDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CopyDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CopyDBClusterParameterGroupRequest request]
    (-> this (.copyDBClusterParameterGroupAsync request))))

(defn failover-db-cluster-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to FailoverDBCluster. - `com.amazonaws.services.docdb.model.FailoverDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FailoverDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.FailoverDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.failoverDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.FailoverDBClusterRequest request]
    (-> this (.failoverDBClusterAsync request))))

(defn create-db-cluster-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to CreateDBCluster. - `com.amazonaws.services.docdb.model.CreateDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CreateDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CreateDBClusterRequest request]
    (-> this (.createDBClusterAsync request))))

(defn modify-db-cluster-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to ModifyDBCluster. - `com.amazonaws.services.docdb.model.ModifyDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ModifyDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ModifyDBClusterRequest request]
    (-> this (.modifyDBClusterAsync request))))

(defn describe-orderable-db-instance-options-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeOrderableDBInstanceOptions. - `com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrderableDBInstanceOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrderableDBInstanceOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeOrderableDBInstanceOptionsRequest request]
    (-> this (.describeOrderableDBInstanceOptionsAsync request))))

(defn describe-db-engine-versions-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeDBEngineVersions. - `com.amazonaws.services.docdb.model.DescribeDBEngineVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBEngineVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBEngineVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBEngineVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBEngineVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBEngineVersionsRequest request]
    (-> this (.describeDBEngineVersionsAsync request))))

(defn restore-db-cluster-to-point-in-time-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to RestoreDBClusterToPointInTime. - `com.amazonaws.services.docdb.model.RestoreDBClusterToPointInTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterToPointInTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.RestoreDBClusterToPointInTimeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterToPointInTimeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.RestoreDBClusterToPointInTimeRequest request]
    (-> this (.restoreDBClusterToPointInTimeAsync request))))

(defn create-db-instance-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to CreateDBInstance. - `com.amazonaws.services.docdb.model.CreateDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CreateDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CreateDBInstanceRequest request]
    (-> this (.createDBInstanceAsync request))))

(defn reboot-db-instance-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to RebootDBInstance. - `com.amazonaws.services.docdb.model.RebootDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.RebootDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.RebootDBInstanceRequest request]
    (-> this (.rebootDBInstanceAsync request))))

(defn describe-pending-maintenance-actions-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribePendingMaintenanceActions. - `com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePendingMaintenanceActionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribePendingMaintenanceActionsRequest request]
    (-> this (.describePendingMaintenanceActionsAsync request))))

(defn create-db-subnet-group-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to CreateDBSubnetGroup. - `com.amazonaws.services.docdb.model.CreateDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CreateDBSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CreateDBSubnetGroupRequest request]
    (-> this (.createDBSubnetGroupAsync request))))

(defn delete-db-cluster-parameter-group-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DeleteDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DeleteDBClusterParameterGroupRequest request]
    (-> this (.deleteDBClusterParameterGroupAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonDocDBAsyncClient this]
    (-> this (.shutdown))))

(defn describe-db-cluster-snapshot-attributes-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeDBClusterSnapshotAttributes. - `com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshotAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotAttributesRequest request]
    (-> this (.describeDBClusterSnapshotAttributesAsync request))))

(defn create-db-cluster-snapshot-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input of CreateDBClusterSnapshot. - `com.amazonaws.services.docdb.model.CreateDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CreateDBClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CreateDBClusterSnapshotRequest request]
    (-> this (.createDBClusterSnapshotAsync request))))

(defn modify-db-cluster-parameter-group-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to ModifyDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ModifyDBClusterParameterGroupRequest request]
    (-> this (.modifyDBClusterParameterGroupAsync request))))

(defn modify-db-instance-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to ModifyDBInstance. - `com.amazonaws.services.docdb.model.ModifyDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ModifyDBInstanceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBInstanceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ModifyDBInstanceRequest request]
    (-> this (.modifyDBInstanceAsync request))))

(defn restore-db-cluster-from-snapshot-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to RestoreDBClusterFromSnapshot. - `com.amazonaws.services.docdb.model.RestoreDBClusterFromSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterFromSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.RestoreDBClusterFromSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterFromSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.RestoreDBClusterFromSnapshotRequest request]
    (-> this (.restoreDBClusterFromSnapshotAsync request))))

(defn remove-tags-from-resource-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to RemoveTagsFromResource. - `com.amazonaws.services.docdb.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.RemoveTagsFromResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.RemoveTagsFromResourceRequest request]
    (-> this (.removeTagsFromResourceAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to ListTagsForResource. - `com.amazonaws.services.docdb.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn create-db-cluster-parameter-group-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input of CreateDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.CreateDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CreateDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.CreateDBClusterParameterGroupRequest request]
    (-> this (.createDBClusterParameterGroupAsync request))))

(defn delete-db-cluster-snapshot-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DeleteDBClusterSnapshot. - `com.amazonaws.services.docdb.model.DeleteDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DeleteDBClusterSnapshotRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterSnapshotAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DeleteDBClusterSnapshotRequest request]
    (-> this (.deleteDBClusterSnapshotAsync request))))

(defn describe-events-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeEvents. - `com.amazonaws.services.docdb.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeEventsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeEventsRequest request]
    (-> this (.describeEventsAsync request))))

(defn delete-db-cluster-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DeleteDBCluster. - `com.amazonaws.services.docdb.model.DeleteDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DeleteDBClusterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DeleteDBClusterRequest request]
    (-> this (.deleteDBClusterAsync request))))

(defn reset-db-cluster-parameter-group-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to ResetDBClusterParameterGroup. - `com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDBClusterParameterGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ResetDBClusterParameterGroupRequest request]
    (-> this (.resetDBClusterParameterGroupAsync request))))

(defn modify-db-subnet-group-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to ModifyDBSubnetGroup. - `com.amazonaws.services.docdb.model.ModifyDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ModifyDBSubnetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBSubnetGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ModifyDBSubnetGroupRequest request]
    (-> this (.modifyDBSubnetGroupAsync request))))

(defn describe-db-instances-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeDBInstances. - `com.amazonaws.services.docdb.model.DescribeDBInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBInstancesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBInstancesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBInstancesRequest request]
    (-> this (.describeDBInstancesAsync request))))

(defn add-tags-to-resource-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to AddTagsToResource. - `com.amazonaws.services.docdb.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.AddTagsToResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.AddTagsToResourceRequest request]
    (-> this (.addTagsToResourceAsync request))))

(defn describe-db-clusters-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeDBClusters. - `com.amazonaws.services.docdb.model.DescribeDBClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBClustersResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBClustersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClustersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBClustersRequest request]
    (-> this (.describeDBClustersAsync request))))

(defn apply-pending-maintenance-action-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to ApplyPendingMaintenanceAction. - `com.amazonaws.services.docdb.model.ApplyPendingMaintenanceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.ResourcePendingMaintenanceActions>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ApplyPendingMaintenanceActionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applyPendingMaintenanceActionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.ApplyPendingMaintenanceActionRequest request]
    (-> this (.applyPendingMaintenanceActionAsync request))))

(defn describe-db-cluster-snapshots-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeDBClusterSnapshots. - `com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeDBClusterSnapshotsRequest request]
    (-> this (.describeDBClusterSnapshotsAsync request))))

(defn describe-engine-default-cluster-parameters-async
  "Description copied from interface: AmazonDocDBAsync

  request - Represents the input to DescribeEngineDefaultClusterParameters. - `com.amazonaws.services.docdb.model.DescribeEngineDefaultClusterParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultClusterParameters operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.docdb.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeEngineDefaultClusterParametersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultClusterParametersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonDocDBAsyncClient this ^com.amazonaws.services.docdb.model.DescribeEngineDefaultClusterParametersRequest request]
    (-> this (.describeEngineDefaultClusterParametersAsync request))))

