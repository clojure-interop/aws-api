(ns com.amazonaws.services.neptune.AmazonNeptuneAsync
  "Interface for accessing Amazon Neptune asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonNeptuneAsync instead.


  Amazon Neptune

  Amazon Neptune is a fast, reliable, fully-managed graph database service that makes it easy to build and run
  applications that work with highly connected datasets. The core of Amazon Neptune is a purpose-built,
  high-performance graph database engine optimized for storing billions of relationships and querying the graph with
  milliseconds latency. Amazon Neptune supports popular graph models Property Graph and W3C's RDF, and their respective
  query languages Apache TinkerPop Gremlin and SPARQL, allowing you to easily build queries that efficiently navigate
  highly connected datasets. Neptune powers graph use cases such as recommendation engines, fraud detection, knowledge
  graphs, drug discovery, and network security.


  This interface reference for Amazon Neptune contains documentation for a programming or command line interface you
  can use to manage Amazon Neptune. Note that Amazon Neptune is asynchronous, which means that some interfaces might
  require techniques such as polling or callback functions to determine when a command has been applied. In this
  reference, the parameter descriptions indicate whether a command is applied immediately, on the next instance reboot,
  or during the maintenance window. The reference structure is as follows, and we list following some related topics
  from the user guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.neptune AmazonNeptuneAsync]))

(defn modify-db-cluster-snapshot-attribute-async
  "Adds an attribute and values to, or removes an attribute and values from, a manual DB cluster snapshot.


   To share a manual DB cluster snapshot with other AWS accounts, specify restore as the
   AttributeName and use the ValuesToAdd parameter to add a list of IDs of the AWS
   accounts that are authorized to restore the manual DB cluster snapshot. Use the value all to make
   the manual DB cluster snapshot public, which means that it can be copied or restored by all AWS accounts. Do not
   add the all value for any manual DB cluster snapshots that contain private information that you
   don't want available to all AWS accounts. If a manual DB cluster snapshot is encrypted, it can be shared, but
   only by specifying a list of authorized AWS account IDs for the ValuesToAdd parameter. You can't use
   all as a value for that parameter in this case.


   To view which AWS accounts have access to copy or restore a manual DB cluster snapshot, or whether a manual DB
   cluster snapshot public or private, use the DescribeDBClusterSnapshotAttributes API action.

  modify-db-cluster-snapshot-attribute-request - `com.amazonaws.services.neptune.model.ModifyDBClusterSnapshotAttributeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterSnapshotAttribute operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterSnapshotAttributeRequest modify-db-cluster-snapshot-attribute-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterSnapshotAttributeAsync modify-db-cluster-snapshot-attribute-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterSnapshotAttributeRequest modify-db-cluster-snapshot-attribute-request]
    (-> this (.modifyDBClusterSnapshotAttributeAsync modify-db-cluster-snapshot-attribute-request))))

(defn describe-db-parameter-groups-async
  "Returns a list of DBParameterGroup descriptions. If a DBParameterGroupName is
   specified, the list will contain only the description of the specified DB parameter group.

  describe-db-parameter-groups-request - `com.amazonaws.services.neptune.model.DescribeDBParameterGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBParameterGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBParameterGroupsRequest describe-db-parameter-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBParameterGroupsAsync describe-db-parameter-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBParameterGroupsRequest describe-db-parameter-groups-request]
    (-> this (.describeDBParameterGroupsAsync describe-db-parameter-groups-request))))

(defn delete-db-instance-async
  "The DeleteDBInstance action deletes a previously provisioned DB instance. When you delete a DB instance, all
   automated backups for that instance are deleted and can't be recovered. Manual DB snapshots of the DB instance to
   be deleted by DeleteDBInstance are not deleted.


   If you request a final DB snapshot the status of the Amazon Neptune DB instance is deleting until
   the DB snapshot is created. The API action DescribeDBInstance is used to monitor the status of this
   operation. The action can't be canceled or reverted once submitted.


   Note that when a DB instance is in a failure state and has a status of failed,
   incompatible-restore, or incompatible-network, you can only delete it when the
   SkipFinalSnapshot parameter is set to true.


   You can't delete a DB instance if it is the only instance in the DB cluster.

  delete-db-instance-request - `com.amazonaws.services.neptune.model.DeleteDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBInstanceRequest delete-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBInstanceAsync delete-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBInstanceRequest delete-db-instance-request]
    (-> this (.deleteDBInstanceAsync delete-db-instance-request))))

(defn describe-event-categories-async
  "Displays a list of categories for all event source types, or, if specified, for a specified source type.

  describe-event-categories-request - `com.amazonaws.services.neptune.model.DescribeEventCategoriesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventCategories operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeEventCategoriesResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventCategoriesRequest describe-event-categories-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventCategoriesAsync describe-event-categories-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventCategoriesRequest describe-event-categories-request]
    (-> this (.describeEventCategoriesAsync describe-event-categories-request))))

(defn describe-db-subnet-groups-async
  "Returns a list of DBSubnetGroup descriptions. If a DBSubnetGroupName is specified, the list will contain only the
   descriptions of the specified DBSubnetGroup.


   For an overview of CIDR ranges, go to the Wikipedia Tutorial.

  describe-db-subnet-groups-request - `com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBSubnetGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsRequest describe-db-subnet-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBSubnetGroupsAsync describe-db-subnet-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBSubnetGroupsRequest describe-db-subnet-groups-request]
    (-> this (.describeDBSubnetGroupsAsync describe-db-subnet-groups-request))))

(defn describe-db-cluster-parameters-async
  "Returns the detailed parameter list for a particular DB cluster parameter group.

  describe-db-cluster-parameters-request - `com.amazonaws.services.neptune.model.DescribeDBClusterParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBClusterParametersResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterParametersRequest describe-db-cluster-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParametersAsync describe-db-cluster-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterParametersRequest describe-db-cluster-parameters-request]
    (-> this (.describeDBClusterParametersAsync describe-db-cluster-parameters-request))))

(defn copy-db-parameter-group-async
  "Copies the specified DB parameter group.

  copy-db-parameter-group-request - `com.amazonaws.services.neptune.model.CopyDBParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBParameterGroupRequest copy-db-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBParameterGroupAsync copy-db-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBParameterGroupRequest copy-db-parameter-group-request]
    (-> this (.copyDBParameterGroupAsync copy-db-parameter-group-request))))

(defn delete-event-subscription-async
  "Deletes an event notification subscription.

  delete-event-subscription-request - `com.amazonaws.services.neptune.model.DeleteEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteEventSubscriptionRequest delete-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEventSubscriptionAsync delete-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteEventSubscriptionRequest delete-event-subscription-request]
    (-> this (.deleteEventSubscriptionAsync delete-event-subscription-request))))

(defn delete-db-subnet-group-async
  "Deletes a DB subnet group.



   The specified database subnet group must not be associated with any DB instances.

  delete-db-subnet-group-request - `com.amazonaws.services.neptune.model.DeleteDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DeleteDBSubnetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBSubnetGroupRequest delete-db-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBSubnetGroupAsync delete-db-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBSubnetGroupRequest delete-db-subnet-group-request]
    (-> this (.deleteDBSubnetGroupAsync delete-db-subnet-group-request))))

(defn describe-db-cluster-parameter-groups-async
  "Returns a list of DBClusterParameterGroup descriptions. If a
   DBClusterParameterGroupName parameter is specified, the list will contain only the description of
   the specified DB cluster parameter group.

  describe-db-cluster-parameter-groups-request - `com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterParameterGroups operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsRequest describe-db-cluster-parameter-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterParameterGroupsAsync describe-db-cluster-parameter-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterParameterGroupsRequest describe-db-cluster-parameter-groups-request]
    (-> this (.describeDBClusterParameterGroupsAsync describe-db-cluster-parameter-groups-request))))

(defn copy-db-cluster-snapshot-async
  "Copies a snapshot of a DB cluster.


   To copy a DB cluster snapshot from a shared manual DB cluster snapshot,
   SourceDBClusterSnapshotIdentifier must be the Amazon Resource Name (ARN) of the shared DB cluster
   snapshot.


   You can't copy from one AWS Region to another.

  copy-db-cluster-snapshot-request - `com.amazonaws.services.neptune.model.CopyDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBClusterSnapshotRequest copy-db-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterSnapshotAsync copy-db-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBClusterSnapshotRequest copy-db-cluster-snapshot-request]
    (-> this (.copyDBClusterSnapshotAsync copy-db-cluster-snapshot-request))))

(defn remove-role-from-db-cluster-async
  "Disassociates an Identity and Access Management (IAM) role from a DB cluster.

  remove-role-from-db-cluster-request - `com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveRoleFromDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterRequest remove-role-from-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeRoleFromDBClusterAsync remove-role-from-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveRoleFromDBClusterRequest remove-role-from-db-cluster-request]
    (-> this (.removeRoleFromDBClusterAsync remove-role-from-db-cluster-request))))

(defn copy-db-cluster-parameter-group-async
  "Copies the specified DB cluster parameter group.

  copy-db-cluster-parameter-group-request - `com.amazonaws.services.neptune.model.CopyDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CopyDBClusterParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBClusterParameterGroupRequest copy-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.copyDBClusterParameterGroupAsync copy-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CopyDBClusterParameterGroupRequest copy-db-cluster-parameter-group-request]
    (-> this (.copyDBClusterParameterGroupAsync copy-db-cluster-parameter-group-request))))

(defn failover-db-cluster-async
  "Forces a failover for a DB cluster.


   A failover for a DB cluster promotes one of the Read Replicas (read-only instances) in the DB cluster to be the
   primary instance (the cluster writer).


   Amazon Neptune will automatically fail over to a Read Replica, if one exists, when the primary instance fails.
   You can force a failover when you want to simulate a failure of a primary instance for testing. Because each
   instance in a DB cluster has its own endpoint address, you will need to clean up and re-establish any existing
   connections that use those endpoint addresses when the failover is complete.

  failover-db-cluster-request - `com.amazonaws.services.neptune.model.FailoverDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the FailoverDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.FailoverDBClusterRequest failover-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.failoverDBClusterAsync failover-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.FailoverDBClusterRequest failover-db-cluster-request]
    (-> this (.failoverDBClusterAsync failover-db-cluster-request))))

(defn create-db-parameter-group-async
  "Creates a new DB parameter group.


   A DB parameter group is initially created with the default parameters for the database engine used by the DB
   instance. To provide custom values for any of the parameters, you must modify the group after creating it using
   ModifyDBParameterGroup. Once you've created a DB parameter group, you need to associate it with your DB
   instance using ModifyDBInstance. When you associate a new DB parameter group with a running DB instance,
   you need to reboot the DB instance without failover for the new DB parameter group and associated settings to
   take effect.



   After you create a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
   that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete
   the create action before the parameter group is used as the default for a new DB instance. This is especially
   important for parameters that are critical when creating the default database for a DB instance, such as the
   character set for the default database defined by the character_set_database parameter. You can use
   the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to
   verify that your DB parameter group has been created or modified.

  create-db-parameter-group-request - `com.amazonaws.services.neptune.model.CreateDBParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBParameterGroupRequest create-db-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBParameterGroupAsync create-db-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBParameterGroupRequest create-db-parameter-group-request]
    (-> this (.createDBParameterGroupAsync create-db-parameter-group-request))))

(defn promote-read-replica-db-cluster-async
  "Not supported.

  promote-read-replica-db-cluster-request - `com.amazonaws.services.neptune.model.PromoteReadReplicaDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PromoteReadReplicaDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.PromoteReadReplicaDBClusterRequest promote-read-replica-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.promoteReadReplicaDBClusterAsync promote-read-replica-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.PromoteReadReplicaDBClusterRequest promote-read-replica-db-cluster-request]
    (-> this (.promoteReadReplicaDBClusterAsync promote-read-replica-db-cluster-request))))

(defn create-db-cluster-async
  "Creates a new Amazon Neptune DB cluster.


   You can use the ReplicationSourceIdentifier parameter to create the DB cluster as a Read Replica of
   another DB cluster or Amazon Neptune DB instance.

  create-db-cluster-request - `com.amazonaws.services.neptune.model.CreateDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterRequest create-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterAsync create-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterRequest create-db-cluster-request]
    (-> this (.createDBClusterAsync create-db-cluster-request))))

(defn modify-db-cluster-async
  "Modify a setting for a DB cluster. You can change one or more database configuration parameters by specifying
   these parameters and the new values in the request.

  modify-db-cluster-request - `com.amazonaws.services.neptune.model.ModifyDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterRequest modify-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterAsync modify-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterRequest modify-db-cluster-request]
    (-> this (.modifyDBClusterAsync modify-db-cluster-request))))

(defn describe-orderable-db-instance-options-async
  "Returns a list of orderable DB instance options for the specified engine.

  describe-orderable-db-instance-options-request - `com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrderableDBInstanceOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsRequest describe-orderable-db-instance-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrderableDBInstanceOptionsAsync describe-orderable-db-instance-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeOrderableDBInstanceOptionsRequest describe-orderable-db-instance-options-request]
    (-> this (.describeOrderableDBInstanceOptionsAsync describe-orderable-db-instance-options-request))))

(defn describe-db-engine-versions-async
  "Returns a list of the available DB engines.

  describe-db-engine-versions-request - `com.amazonaws.services.neptune.model.DescribeDBEngineVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBEngineVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBEngineVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBEngineVersionsRequest describe-db-engine-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBEngineVersionsAsync describe-db-engine-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBEngineVersionsRequest describe-db-engine-versions-request]
    (-> this (.describeDBEngineVersionsAsync describe-db-engine-versions-request))))

(defn restore-db-cluster-to-point-in-time-async
  "Restores a DB cluster to an arbitrary point in time. Users can restore to any point in time before
   LatestRestorableTime for up to BackupRetentionPeriod days. The target DB cluster is
   created from the source DB cluster with the same configuration as the original DB cluster, except that the new DB
   cluster is created with the default DB security group.



   This action only restores the DB cluster, not the DB instances for that DB cluster. You must invoke the
   CreateDBInstance action to create DB instances for the restored DB cluster, specifying the identifier of
   the restored DB cluster in DBClusterIdentifier. You can create DB instances only after the
   RestoreDBClusterToPointInTime action has completed and the DB cluster is available.

  restore-db-cluster-to-point-in-time-request - `com.amazonaws.services.neptune.model.RestoreDBClusterToPointInTimeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterToPointInTime operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RestoreDBClusterToPointInTimeRequest restore-db-cluster-to-point-in-time-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterToPointInTimeAsync restore-db-cluster-to-point-in-time-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RestoreDBClusterToPointInTimeRequest restore-db-cluster-to-point-in-time-request]
    (-> this (.restoreDBClusterToPointInTimeAsync restore-db-cluster-to-point-in-time-request))))

(defn describe-db-parameters-async
  "Returns the detailed parameter list for a particular DB parameter group.

  describe-db-parameters-request - `com.amazonaws.services.neptune.model.DescribeDBParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBParameters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBParametersResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBParametersRequest describe-db-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBParametersAsync describe-db-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBParametersRequest describe-db-parameters-request]
    (-> this (.describeDBParametersAsync describe-db-parameters-request))))

(defn create-db-instance-async
  "Creates a new DB instance.

  create-db-instance-request - `com.amazonaws.services.neptune.model.CreateDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBInstanceRequest create-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBInstanceAsync create-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBInstanceRequest create-db-instance-request]
    (-> this (.createDBInstanceAsync create-db-instance-request))))

(defn create-event-subscription-async
  "Creates an event notification subscription. This action requires a topic ARN (Amazon Resource Name) created by
   either the Neptune console, the SNS console, or the SNS API. To obtain an ARN with SNS, you must create a topic
   in Amazon SNS and subscribe to the topic. The ARN is displayed in the SNS console.


   You can specify the type of source (SourceType) you want to be notified of, provide a list of Neptune sources
   (SourceIds) that triggers the events, and provide a list of event categories (EventCategories) for events you
   want to be notified of. For example, you can specify SourceType = db-instance, SourceIds = mydbinstance1,
   mydbinstance2 and EventCategories = Availability, Backup.


   If you specify both the SourceType and SourceIds, such as SourceType = db-instance and SourceIdentifier =
   myDBInstance1, you are notified of all the db-instance events for the specified source. If you specify a
   SourceType but do not specify a SourceIdentifier, you receive notice of the events for that source type for all
   your Neptune sources. If you do not specify either the SourceType nor the SourceIdentifier, you are notified of
   events generated from all Neptune sources belonging to your customer account.

  create-event-subscription-request - `com.amazonaws.services.neptune.model.CreateEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateEventSubscriptionRequest create-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createEventSubscriptionAsync create-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateEventSubscriptionRequest create-event-subscription-request]
    (-> this (.createEventSubscriptionAsync create-event-subscription-request))))

(defn reboot-db-instance-async
  "You might need to reboot your DB instance, usually for maintenance reasons. For example, if you make certain
   modifications, or if you change the DB parameter group associated with the DB instance, you must reboot the
   instance for the changes to take effect.


   Rebooting a DB instance restarts the database engine service. Rebooting a DB instance results in a momentary
   outage, during which the DB instance status is set to rebooting.

  reboot-db-instance-request - `com.amazonaws.services.neptune.model.RebootDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RebootDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RebootDBInstanceRequest reboot-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rebootDBInstanceAsync reboot-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RebootDBInstanceRequest reboot-db-instance-request]
    (-> this (.rebootDBInstanceAsync reboot-db-instance-request))))

(defn describe-pending-maintenance-actions-async
  "Returns a list of resources (for example, DB instances) that have at least one pending maintenance action.

  describe-pending-maintenance-actions-request - `com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePendingMaintenanceActions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsRequest describe-pending-maintenance-actions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePendingMaintenanceActionsAsync describe-pending-maintenance-actions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribePendingMaintenanceActionsRequest describe-pending-maintenance-actions-request]
    (-> this (.describePendingMaintenanceActionsAsync describe-pending-maintenance-actions-request))))

(defn add-role-to-db-cluster-async
  "Associates an Identity and Access Management (IAM) role from an Neptune DB cluster.

  add-role-to-db-cluster-request - `com.amazonaws.services.neptune.model.AddRoleToDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddRoleToDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.AddRoleToDBClusterResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddRoleToDBClusterRequest add-role-to-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addRoleToDBClusterAsync add-role-to-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddRoleToDBClusterRequest add-role-to-db-cluster-request]
    (-> this (.addRoleToDBClusterAsync add-role-to-db-cluster-request))))

(defn create-db-subnet-group-async
  "Creates a new DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in the AWS
   Region.

  create-db-subnet-group-request - `com.amazonaws.services.neptune.model.CreateDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBSubnetGroupRequest create-db-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBSubnetGroupAsync create-db-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBSubnetGroupRequest create-db-subnet-group-request]
    (-> this (.createDBSubnetGroupAsync create-db-subnet-group-request))))

(defn delete-db-cluster-parameter-group-async
  "Deletes a specified DB cluster parameter group. The DB cluster parameter group to be deleted can't be associated
   with any DB clusters.

  delete-db-cluster-parameter-group-request - `com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupRequest delete-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterParameterGroupAsync delete-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterParameterGroupRequest delete-db-cluster-parameter-group-request]
    (-> this (.deleteDBClusterParameterGroupAsync delete-db-cluster-parameter-group-request))))

(defn describe-db-cluster-snapshot-attributes-async
  "Returns a list of DB cluster snapshot attribute names and values for a manual DB cluster snapshot.


   When sharing snapshots with other AWS accounts, DescribeDBClusterSnapshotAttributes returns the
   restore attribute and a list of IDs for the AWS accounts that are authorized to copy or restore the
   manual DB cluster snapshot. If all is included in the list of values for the restore
   attribute, then the manual DB cluster snapshot is public and can be copied or restored by all AWS accounts.


   To add or remove access for an AWS account to copy or restore a manual DB cluster snapshot, or to make the manual
   DB cluster snapshot public or private, use the ModifyDBClusterSnapshotAttribute API action.

  describe-db-cluster-snapshot-attributes-request - `com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshotAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterSnapshotAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotAttributesRequest describe-db-cluster-snapshot-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotAttributesAsync describe-db-cluster-snapshot-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotAttributesRequest describe-db-cluster-snapshot-attributes-request]
    (-> this (.describeDBClusterSnapshotAttributesAsync describe-db-cluster-snapshot-attributes-request))))

(defn create-db-cluster-snapshot-async
  "Creates a snapshot of a DB cluster.

  create-db-cluster-snapshot-request - `com.amazonaws.services.neptune.model.CreateDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterSnapshotRequest create-db-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterSnapshotAsync create-db-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterSnapshotRequest create-db-cluster-snapshot-request]
    (-> this (.createDBClusterSnapshotAsync create-db-cluster-snapshot-request))))

(defn modify-db-cluster-parameter-group-async
  "Modifies the parameters of a DB cluster parameter group. To modify more than one parameter, submit a list of the
   following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20
   parameters can be modified in a single request.



   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
   failover to the DB cluster associated with the parameter group before the change can take effect.



   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
   cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to
   fully complete the create action before the parameter group is used as the default for a new DB cluster. This is
   especially important for parameters that are critical when creating the default database for a DB cluster, such
   as the character set for the default database defined by the character_set_database parameter. You
   can use the Parameter Groups option of the Amazon Neptune console or the
   DescribeDBClusterParameters command to verify that your DB cluster parameter group has been created or
   modified.

  modify-db-cluster-parameter-group-request - `com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupRequest modify-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBClusterParameterGroupAsync modify-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBClusterParameterGroupRequest modify-db-cluster-parameter-group-request]
    (-> this (.modifyDBClusterParameterGroupAsync modify-db-cluster-parameter-group-request))))

(defn modify-db-instance-async
  "Modifies settings for a DB instance. You can change one or more database configuration parameters by specifying
   these parameters and the new values in the request. To learn what modifications you can make to your DB instance,
   call DescribeValidDBInstanceModifications before you call ModifyDBInstance.

  modify-db-instance-request - `com.amazonaws.services.neptune.model.ModifyDBInstanceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBInstance operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBInstance>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBInstanceRequest modify-db-instance-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBInstanceAsync modify-db-instance-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBInstanceRequest modify-db-instance-request]
    (-> this (.modifyDBInstanceAsync modify-db-instance-request))))

(defn restore-db-cluster-from-snapshot-async
  "Creates a new DB cluster from a DB snapshot or DB cluster snapshot.


   If a DB snapshot is specified, the target DB cluster is created from the source DB snapshot with a default
   configuration and default security group.


   If a DB cluster snapshot is specified, the target DB cluster is created from the source DB cluster restore point
   with the same configuration as the original source DB cluster, except that the new DB cluster is created with the
   default security group.

  restore-db-cluster-from-snapshot-request - `com.amazonaws.services.neptune.model.RestoreDBClusterFromSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RestoreDBClusterFromSnapshot operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RestoreDBClusterFromSnapshotRequest restore-db-cluster-from-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.restoreDBClusterFromSnapshotAsync restore-db-cluster-from-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RestoreDBClusterFromSnapshotRequest restore-db-cluster-from-snapshot-request]
    (-> this (.restoreDBClusterFromSnapshotAsync restore-db-cluster-from-snapshot-request))))

(defn remove-tags-from-resource-async
  "Removes metadata tags from an Amazon Neptune resource.

  remove-tags-from-resource-request - `com.amazonaws.services.neptune.model.RemoveTagsFromResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveTagsFromResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.RemoveTagsFromResourceResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveTagsFromResourceRequest remove-tags-from-resource-request]
    (-> this (.removeTagsFromResourceAsync remove-tags-from-resource-request))))

(defn describe-event-subscriptions-async
  "Lists all the subscription descriptions for a customer account. The description for a subscription includes
   SubscriptionName, SNSTopicARN, CustomerID, SourceType, SourceID, CreationTime, and Status.


   If you specify a SubscriptionName, lists the description for that subscription.

  describe-event-subscriptions-request - `com.amazonaws.services.neptune.model.DescribeEventSubscriptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEventSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeEventSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventSubscriptionsRequest describe-event-subscriptions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventSubscriptionsAsync describe-event-subscriptions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventSubscriptionsRequest describe-event-subscriptions-request]
    (-> this (.describeEventSubscriptionsAsync describe-event-subscriptions-request))))

(defn modify-db-parameter-group-async
  "Modifies the parameters of a DB parameter group. To modify more than one parameter, submit a list of the
   following: ParameterName, ParameterValue, and ApplyMethod. A maximum of 20
   parameters can be modified in a single request.



   Changes to dynamic parameters are applied immediately. Changes to static parameters require a reboot without
   failover to the DB instance associated with the parameter group before the change can take effect.



   After you modify a DB parameter group, you should wait at least 5 minutes before creating your first DB instance
   that uses that DB parameter group as the default parameter group. This allows Amazon Neptune to fully complete
   the modify action before the parameter group is used as the default for a new DB instance. This is especially
   important for parameters that are critical when creating the default database for a DB instance, such as the
   character set for the default database defined by the character_set_database parameter. You can use
   the Parameter Groups option of the Amazon Neptune console or the DescribeDBParameters command to
   verify that your DB parameter group has been created or modified.

  modify-db-parameter-group-request - `com.amazonaws.services.neptune.model.ModifyDBParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ModifyDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBParameterGroupRequest modify-db-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBParameterGroupAsync modify-db-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBParameterGroupRequest modify-db-parameter-group-request]
    (-> this (.modifyDBParameterGroupAsync modify-db-parameter-group-request))))

(defn list-tags-for-resource-async
  "Lists all tags on an Amazon Neptune resource.

  list-tags-for-resource-request - `com.amazonaws.services.neptune.model.ListTagsForResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ListTagsForResourceRequest list-tags-for-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ListTagsForResourceRequest list-tags-for-resource-request]
    (-> this (.listTagsForResourceAsync list-tags-for-resource-request))))

(defn create-db-cluster-parameter-group-async
  "Creates a new DB cluster parameter group.


   Parameters in a DB cluster parameter group apply to all of the instances in a DB cluster.


   A DB cluster parameter group is initially created with the default parameters for the database engine used by
   instances in the DB cluster. To provide custom values for any of the parameters, you must modify the group after
   creating it using ModifyDBClusterParameterGroup. Once you've created a DB cluster parameter group, you
   need to associate it with your DB cluster using ModifyDBCluster. When you associate a new DB cluster
   parameter group with a running DB cluster, you need to reboot the DB instances in the DB cluster without failover
   for the new DB cluster parameter group and associated settings to take effect.



   After you create a DB cluster parameter group, you should wait at least 5 minutes before creating your first DB
   cluster that uses that DB cluster parameter group as the default parameter group. This allows Amazon Neptune to
   fully complete the create action before the DB cluster parameter group is used as the default for a new DB
   cluster. This is especially important for parameters that are critical when creating the default database for a
   DB cluster, such as the character set for the default database defined by the character_set_database
   parameter. You can use the Parameter Groups option of the Amazon Neptune console or the DescribeDBClusterParameters
   command to verify that your DB cluster parameter group has been created or modified.

  create-db-cluster-parameter-group-request - `com.amazonaws.services.neptune.model.CreateDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterParameterGroup>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterParameterGroupRequest create-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createDBClusterParameterGroupAsync create-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.CreateDBClusterParameterGroupRequest create-db-cluster-parameter-group-request]
    (-> this (.createDBClusterParameterGroupAsync create-db-cluster-parameter-group-request))))

(defn delete-db-cluster-snapshot-async
  "Deletes a DB cluster snapshot. If the snapshot is being copied, the copy operation is terminated.



   The DB cluster snapshot must be in the available state to be deleted.

  delete-db-cluster-snapshot-request - `com.amazonaws.services.neptune.model.DeleteDBClusterSnapshotRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBClusterSnapshot operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBClusterSnapshot>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterSnapshotRequest delete-db-cluster-snapshot-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterSnapshotAsync delete-db-cluster-snapshot-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterSnapshotRequest delete-db-cluster-snapshot-request]
    (-> this (.deleteDBClusterSnapshotAsync delete-db-cluster-snapshot-request))))

(defn describe-engine-default-parameters-async
  "Returns the default engine and system parameter information for the specified database engine.

  describe-engine-default-parameters-request - `com.amazonaws.services.neptune.model.DescribeEngineDefaultParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultParameters operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultParametersRequest describe-engine-default-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultParametersAsync describe-engine-default-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultParametersRequest describe-engine-default-parameters-request]
    (-> this (.describeEngineDefaultParametersAsync describe-engine-default-parameters-request))))

(defn delete-db-parameter-group-async
  "Deletes a specified DBParameterGroup. The DBParameterGroup to be deleted can't be associated with any DB
   instances.

  delete-db-parameter-group-request - `com.amazonaws.services.neptune.model.DeleteDBParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DeleteDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBParameterGroupRequest delete-db-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBParameterGroupAsync delete-db-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBParameterGroupRequest delete-db-parameter-group-request]
    (-> this (.deleteDBParameterGroupAsync delete-db-parameter-group-request))))

(defn describe-events-async
  "Returns events related to DB instances, DB security groups, DB snapshots, and DB parameter groups for the past 14
   days. Events specific to a particular DB instance, DB security group, database snapshot, or DB parameter group
   can be obtained by providing the name as a parameter. By default, the past hour of events are returned.

  describe-events-request - `com.amazonaws.services.neptune.model.DescribeEventsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEvents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeEventsResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventsRequest describe-events-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEventsAsync describe-events-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEventsRequest describe-events-request]
    (-> this (.describeEventsAsync describe-events-request))))

(defn reset-db-parameter-group-async
  "Modifies the parameters of a DB parameter group to the engine/system default value. To reset specific parameters,
   provide a list of the following: ParameterName and ApplyMethod. To reset the entire DB
   parameter group, specify the DBParameterGroup name and ResetAllParameters parameters.
   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
   pending-reboot to take effect on the next DB instance restart or RebootDBInstance
   request.

  reset-db-parameter-group-request - `com.amazonaws.services.neptune.model.ResetDBParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDBParameterGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ResetDBParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ResetDBParameterGroupRequest reset-db-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDBParameterGroupAsync reset-db-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ResetDBParameterGroupRequest reset-db-parameter-group-request]
    (-> this (.resetDBParameterGroupAsync reset-db-parameter-group-request))))

(defn delete-db-cluster-async
  "The DeleteDBCluster action deletes a previously provisioned DB cluster. When you delete a DB cluster, all
   automated backups for that DB cluster are deleted and can't be recovered. Manual DB cluster snapshots of the
   specified DB cluster are not deleted.

  delete-db-cluster-request - `com.amazonaws.services.neptune.model.DeleteDBClusterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteDBCluster operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBCluster>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterRequest delete-db-cluster-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteDBClusterAsync delete-db-cluster-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DeleteDBClusterRequest delete-db-cluster-request]
    (-> this (.deleteDBClusterAsync delete-db-cluster-request))))

(defn reset-db-cluster-parameter-group-async
  "Modifies the parameters of a DB cluster parameter group to the default value. To reset specific parameters submit
   a list of the following: ParameterName and ApplyMethod. To reset the entire DB cluster
   parameter group, specify the DBClusterParameterGroupName and ResetAllParameters
   parameters.


   When resetting the entire group, dynamic parameters are updated immediately and static parameters are set to
   pending-reboot to take effect on the next DB instance restart or RebootDBInstance request.
   You must call RebootDBInstance for every DB instance in your DB cluster that you want the updated static
   parameter to apply to.

  reset-db-cluster-parameter-group-request - `com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetDBClusterParameterGroup operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupRequest reset-db-cluster-parameter-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetDBClusterParameterGroupAsync reset-db-cluster-parameter-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ResetDBClusterParameterGroupRequest reset-db-cluster-parameter-group-request]
    (-> this (.resetDBClusterParameterGroupAsync reset-db-cluster-parameter-group-request))))

(defn modify-db-subnet-group-async
  "Modifies an existing DB subnet group. DB subnet groups must contain at least one subnet in at least two AZs in
   the AWS Region.

  modify-db-subnet-group-request - `com.amazonaws.services.neptune.model.ModifyDBSubnetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyDBSubnetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DBSubnetGroup>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBSubnetGroupRequest modify-db-subnet-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyDBSubnetGroupAsync modify-db-subnet-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyDBSubnetGroupRequest modify-db-subnet-group-request]
    (-> this (.modifyDBSubnetGroupAsync modify-db-subnet-group-request))))

(defn remove-source-identifier-from-subscription-async
  "Removes a source identifier from an existing event notification subscription.

  remove-source-identifier-from-subscription-request - `com.amazonaws.services.neptune.model.RemoveSourceIdentifierFromSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveSourceIdentifierFromSubscription operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveSourceIdentifierFromSubscriptionRequest remove-source-identifier-from-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeSourceIdentifierFromSubscriptionAsync remove-source-identifier-from-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.RemoveSourceIdentifierFromSubscriptionRequest remove-source-identifier-from-subscription-request]
    (-> this (.removeSourceIdentifierFromSubscriptionAsync remove-source-identifier-from-subscription-request))))

(defn describe-db-instances-async
  "Returns information about provisioned instances. This API supports pagination.

  describe-db-instances-request - `com.amazonaws.services.neptune.model.DescribeDBInstancesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBInstances operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBInstancesResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBInstancesRequest describe-db-instances-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBInstancesAsync describe-db-instances-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBInstancesRequest describe-db-instances-request]
    (-> this (.describeDBInstancesAsync describe-db-instances-request))))

(defn add-tags-to-resource-async
  "Adds metadata tags to an Amazon Neptune resource. These tags can also be used with cost allocation reporting to
   track cost associated with Amazon Neptune resources, or used in a Condition statement in an IAM policy for Amazon
   Neptune.

  add-tags-to-resource-request - `com.amazonaws.services.neptune.model.AddTagsToResourceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddTagsToResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.AddTagsToResourceResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddTagsToResourceRequest add-tags-to-resource-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddTagsToResourceRequest add-tags-to-resource-request]
    (-> this (.addTagsToResourceAsync add-tags-to-resource-request))))

(defn describe-db-clusters-async
  "Returns information about provisioned DB clusters. This API supports pagination.

  describe-db-clusters-request - `com.amazonaws.services.neptune.model.DescribeDBClustersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBClustersResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClustersRequest describe-db-clusters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClustersAsync describe-db-clusters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClustersRequest describe-db-clusters-request]
    (-> this (.describeDBClustersAsync describe-db-clusters-request))))

(defn modify-event-subscription-async
  "Modifies an existing event notification subscription. Note that you can't modify the source identifiers using
   this call; to change source identifiers for a subscription, use the AddSourceIdentifierToSubscription and
   RemoveSourceIdentifierFromSubscription calls.


   You can see a list of the event categories for a given SourceType by using the DescribeEventCategories
   action.

  modify-event-subscription-request - `com.amazonaws.services.neptune.model.ModifyEventSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ModifyEventSubscription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyEventSubscriptionRequest modify-event-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.modifyEventSubscriptionAsync modify-event-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ModifyEventSubscriptionRequest modify-event-subscription-request]
    (-> this (.modifyEventSubscriptionAsync modify-event-subscription-request))))

(defn apply-pending-maintenance-action-async
  "Applies a pending maintenance action to a resource (for example, to a DB instance).

  apply-pending-maintenance-action-request - `com.amazonaws.services.neptune.model.ApplyPendingMaintenanceActionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ApplyPendingMaintenanceAction operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ResourcePendingMaintenanceActions>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ApplyPendingMaintenanceActionRequest apply-pending-maintenance-action-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.applyPendingMaintenanceActionAsync apply-pending-maintenance-action-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.ApplyPendingMaintenanceActionRequest apply-pending-maintenance-action-request]
    (-> this (.applyPendingMaintenanceActionAsync apply-pending-maintenance-action-request))))

(defn describe-db-cluster-snapshots-async
  "Returns information about DB cluster snapshots. This API action supports pagination.

  describe-db-cluster-snapshots-request - `com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeDBClusterSnapshots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsResult>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsRequest describe-db-cluster-snapshots-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeDBClusterSnapshotsAsync describe-db-cluster-snapshots-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeDBClusterSnapshotsRequest describe-db-cluster-snapshots-request]
    (-> this (.describeDBClusterSnapshotsAsync describe-db-cluster-snapshots-request))))

(defn add-source-identifier-to-subscription-async
  "Adds a source identifier to an existing event notification subscription.

  add-source-identifier-to-subscription-request - `com.amazonaws.services.neptune.model.AddSourceIdentifierToSubscriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddSourceIdentifierToSubscription operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EventSubscription>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddSourceIdentifierToSubscriptionRequest add-source-identifier-to-subscription-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addSourceIdentifierToSubscriptionAsync add-source-identifier-to-subscription-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.AddSourceIdentifierToSubscriptionRequest add-source-identifier-to-subscription-request]
    (-> this (.addSourceIdentifierToSubscriptionAsync add-source-identifier-to-subscription-request))))

(defn describe-valid-db-instance-modifications-async
  "You can call DescribeValidDBInstanceModifications to learn what modifications you can make to your DB
   instance. You can use this information when you call ModifyDBInstance.

  describe-valid-db-instance-modifications-request - `com.amazonaws.services.neptune.model.DescribeValidDBInstanceModificationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeValidDBInstanceModifications operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.ValidDBInstanceModificationsMessage>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeValidDBInstanceModificationsRequest describe-valid-db-instance-modifications-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeValidDBInstanceModificationsAsync describe-valid-db-instance-modifications-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeValidDBInstanceModificationsRequest describe-valid-db-instance-modifications-request]
    (-> this (.describeValidDBInstanceModificationsAsync describe-valid-db-instance-modifications-request))))

(defn describe-engine-default-cluster-parameters-async
  "Returns the default engine and system parameter information for the cluster database engine.

  describe-engine-default-cluster-parameters-request - `com.amazonaws.services.neptune.model.DescribeEngineDefaultClusterParametersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeEngineDefaultClusterParameters operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.neptune.model.EngineDefaults>`"
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultClusterParametersRequest describe-engine-default-cluster-parameters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeEngineDefaultClusterParametersAsync describe-engine-default-cluster-parameters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonNeptuneAsync this ^com.amazonaws.services.neptune.model.DescribeEngineDefaultClusterParametersRequest describe-engine-default-cluster-parameters-request]
    (-> this (.describeEngineDefaultClusterParametersAsync describe-engine-default-cluster-parameters-request))))

