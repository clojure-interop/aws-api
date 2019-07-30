(ns com.amazonaws.services.rdsdata.AWSRDSDataAsync
  "Interface for accessing AWS RDS DataService asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSRDSDataAsync instead.


  Amazon RDS Data Service

  Amazon RDS provides an HTTP endpoint to run SQL statements on an Amazon Aurora Serverless DB cluster. To run these
  statements, you work with the Data Service API.


  For more information about the Data Service API, see Using the Data API for Aurora
  Serverless in the Amazon Aurora User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rdsdata AWSRDSDataAsync]))

(defn batch-execute-statement-async
  "Runs a batch SQL statement over an array of data.


   You can run bulk update and insert operations for multiple records using a DML statement with different parameter
   sets. Bulk operations can provide a significant performance improvement over individual insert and update
   operations.



   If a call isn't part of a transaction because it doesn't include the transactionID parameter,
   changes that result from the call are committed automatically.

  batch-execute-statement-request - The request parameters represent the input of a SQL statement over an array of data. - `com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchExecuteStatement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.BatchExecuteStatementResult>`"
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest batch-execute-statement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchExecuteStatementAsync batch-execute-statement-request async-handler)))
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest batch-execute-statement-request]
    (-> this (.batchExecuteStatementAsync batch-execute-statement-request))))

(defn begin-transaction-async
  "Starts a SQL transaction.




   A transaction can run for a maximum of 24 hours. A transaction is terminated and rolled back automatically after
   24 hours.


   A transaction times out if no calls use its transaction ID in three minutes. If a transaction times out before
   it's committed, it's rolled back automatically.


   DDL statements inside a transaction cause an implicit commit. We recommend that you run each DDL statement in a
   separate ExecuteStatement call with continueAfterTimeout enabled.

  begin-transaction-request - The request parameters represent the input of a request to start a SQL transaction. - `com.amazonaws.services.rdsdata.model.BeginTransactionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BeginTransaction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.BeginTransactionResult>`"
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.BeginTransactionRequest begin-transaction-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.beginTransactionAsync begin-transaction-request async-handler)))
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.BeginTransactionRequest begin-transaction-request]
    (-> this (.beginTransactionAsync begin-transaction-request))))

(defn commit-transaction-async
  "Ends a SQL transaction started with the BeginTransaction operation and commits the changes.

  commit-transaction-request - The request parameters represent the input of a commit transaction request. - `com.amazonaws.services.rdsdata.model.CommitTransactionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CommitTransaction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.CommitTransactionResult>`"
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.CommitTransactionRequest commit-transaction-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.commitTransactionAsync commit-transaction-request async-handler)))
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.CommitTransactionRequest commit-transaction-request]
    (-> this (.commitTransactionAsync commit-transaction-request))))

(defn execute-sql-async
  "Deprecated.

  execute-sql-request - The request parameters represent the input of a request to run one or more SQL statements. - `com.amazonaws.services.rdsdata.model.ExecuteSqlRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecuteSql operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.ExecuteSqlResult>`"
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.ExecuteSqlRequest execute-sql-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executeSqlAsync execute-sql-request async-handler)))
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.ExecuteSqlRequest execute-sql-request]
    (-> this (.executeSqlAsync execute-sql-request))))

(defn execute-statement-async
  "Runs a SQL statement against a database.



   If a call isn't part of a transaction because it doesn't include the transactionID parameter,
   changes that result from the call are committed automatically.



   The response size limit is 1 MB or 1,000 records. If the call returns more than 1 MB of response data or over
   1,000 records, the call is terminated.

  execute-statement-request - The request parameters represent the input of a request to run a SQL statement against a database. - `com.amazonaws.services.rdsdata.model.ExecuteStatementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecuteStatement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.ExecuteStatementResult>`"
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.ExecuteStatementRequest execute-statement-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executeStatementAsync execute-statement-request async-handler)))
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.ExecuteStatementRequest execute-statement-request]
    (-> this (.executeStatementAsync execute-statement-request))))

(defn rollback-transaction-async
  "Performs a rollback of a transaction. Rolling back a transaction cancels its changes.

  rollback-transaction-request - The request parameters represent the input of a request to perform a rollback of a transaction. - `com.amazonaws.services.rdsdata.model.RollbackTransactionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RollbackTransaction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.RollbackTransactionResult>`"
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.RollbackTransactionRequest rollback-transaction-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rollbackTransactionAsync rollback-transaction-request async-handler)))
  (^java.util.concurrent.Future [^AWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.RollbackTransactionRequest rollback-transaction-request]
    (-> this (.rollbackTransactionAsync rollback-transaction-request))))

