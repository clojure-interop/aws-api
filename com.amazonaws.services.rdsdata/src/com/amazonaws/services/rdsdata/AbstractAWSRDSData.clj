(ns com.amazonaws.services.rdsdata.AbstractAWSRDSData
  "Abstract implementation of AWSRDSData. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rdsdata AbstractAWSRDSData]))

(defn batch-execute-statement
  "Description copied from interface: AWSRDSData

  request - The request parameters represent the input of a SQL statement over an array of data. - `com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest`

  returns: Result of the BatchExecuteStatement operation returned by the service. - `com.amazonaws.services.rdsdata.model.BatchExecuteStatementResult`"
  (^com.amazonaws.services.rdsdata.model.BatchExecuteStatementResult [^AbstractAWSRDSData this ^com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest request]
    (-> this (.batchExecuteStatement request))))

(defn begin-transaction
  "Description copied from interface: AWSRDSData

  request - The request parameters represent the input of a request to start a SQL transaction. - `com.amazonaws.services.rdsdata.model.BeginTransactionRequest`

  returns: Result of the BeginTransaction operation returned by the service. - `com.amazonaws.services.rdsdata.model.BeginTransactionResult`"
  (^com.amazonaws.services.rdsdata.model.BeginTransactionResult [^AbstractAWSRDSData this ^com.amazonaws.services.rdsdata.model.BeginTransactionRequest request]
    (-> this (.beginTransaction request))))

(defn commit-transaction
  "Description copied from interface: AWSRDSData

  request - The request parameters represent the input of a commit transaction request. - `com.amazonaws.services.rdsdata.model.CommitTransactionRequest`

  returns: Result of the CommitTransaction operation returned by the service. - `com.amazonaws.services.rdsdata.model.CommitTransactionResult`"
  (^com.amazonaws.services.rdsdata.model.CommitTransactionResult [^AbstractAWSRDSData this ^com.amazonaws.services.rdsdata.model.CommitTransactionRequest request]
    (-> this (.commitTransaction request))))

(defn execute-sql
  "Deprecated.

  request - The request parameters represent the input of a request to run one or more SQL statements. - `com.amazonaws.services.rdsdata.model.ExecuteSqlRequest`

  returns: Result of the ExecuteSql operation returned by the service. - `com.amazonaws.services.rdsdata.model.ExecuteSqlResult`"
  (^com.amazonaws.services.rdsdata.model.ExecuteSqlResult [^AbstractAWSRDSData this ^com.amazonaws.services.rdsdata.model.ExecuteSqlRequest request]
    (-> this (.executeSql request))))

(defn execute-statement
  "Description copied from interface: AWSRDSData

  request - The request parameters represent the input of a request to run a SQL statement against a database. - `com.amazonaws.services.rdsdata.model.ExecuteStatementRequest`

  returns: Result of the ExecuteStatement operation returned by the service. - `com.amazonaws.services.rdsdata.model.ExecuteStatementResult`"
  (^com.amazonaws.services.rdsdata.model.ExecuteStatementResult [^AbstractAWSRDSData this ^com.amazonaws.services.rdsdata.model.ExecuteStatementRequest request]
    (-> this (.executeStatement request))))

(defn rollback-transaction
  "Description copied from interface: AWSRDSData

  request - The request parameters represent the input of a request to perform a rollback of a transaction. - `com.amazonaws.services.rdsdata.model.RollbackTransactionRequest`

  returns: Result of the RollbackTransaction operation returned by the service. - `com.amazonaws.services.rdsdata.model.RollbackTransactionResult`"
  (^com.amazonaws.services.rdsdata.model.RollbackTransactionResult [^AbstractAWSRDSData this ^com.amazonaws.services.rdsdata.model.RollbackTransactionRequest request]
    (-> this (.rollbackTransaction request))))

(defn shutdown
  "Description copied from interface: AWSRDSData"
  ([^AbstractAWSRDSData this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSRDSData

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSRDSData this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

