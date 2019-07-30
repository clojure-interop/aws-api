(ns com.amazonaws.services.rdsdata.AbstractAWSRDSDataAsync
  "Abstract implementation of AWSRDSDataAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rdsdata AbstractAWSRDSDataAsync]))

(defn batch-execute-statement-async
  "Description copied from interface: AWSRDSDataAsync

  request - The request parameters represent the input of a SQL statement over an array of data. - `com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BatchExecuteStatement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.BatchExecuteStatementResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.batchExecuteStatementAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest request]
    (-> this (.batchExecuteStatementAsync request))))

(defn begin-transaction-async
  "Description copied from interface: AWSRDSDataAsync

  request - The request parameters represent the input of a request to start a SQL transaction. - `com.amazonaws.services.rdsdata.model.BeginTransactionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the BeginTransaction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.BeginTransactionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.BeginTransactionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.beginTransactionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.BeginTransactionRequest request]
    (-> this (.beginTransactionAsync request))))

(defn commit-transaction-async
  "Description copied from interface: AWSRDSDataAsync

  request - The request parameters represent the input of a commit transaction request. - `com.amazonaws.services.rdsdata.model.CommitTransactionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CommitTransaction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.CommitTransactionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.CommitTransactionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.commitTransactionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.CommitTransactionRequest request]
    (-> this (.commitTransactionAsync request))))

(defn execute-sql-async
  "Deprecated.

  request - The request parameters represent the input of a request to run one or more SQL statements. - `com.amazonaws.services.rdsdata.model.ExecuteSqlRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecuteSql operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.ExecuteSqlResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.ExecuteSqlRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executeSqlAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.ExecuteSqlRequest request]
    (-> this (.executeSqlAsync request))))

(defn execute-statement-async
  "Description copied from interface: AWSRDSDataAsync

  request - The request parameters represent the input of a request to run a SQL statement against a database. - `com.amazonaws.services.rdsdata.model.ExecuteStatementRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ExecuteStatement operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.ExecuteStatementResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.ExecuteStatementRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.executeStatementAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.ExecuteStatementRequest request]
    (-> this (.executeStatementAsync request))))

(defn rollback-transaction-async
  "Description copied from interface: AWSRDSDataAsync

  request - The request parameters represent the input of a request to perform a rollback of a transaction. - `com.amazonaws.services.rdsdata.model.RollbackTransactionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RollbackTransaction operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rdsdata.model.RollbackTransactionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.RollbackTransactionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.rollbackTransactionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSRDSDataAsync this ^com.amazonaws.services.rdsdata.model.RollbackTransactionRequest request]
    (-> this (.rollbackTransactionAsync request))))

