(ns com.amazonaws.services.rdsdata.AWSRDSData
  "Interface for accessing AWS RDS DataService.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSRDSData instead.


  Amazon RDS Data Service

  Amazon RDS provides an HTTP endpoint to run SQL statements on an Amazon Aurora Serverless DB cluster. To run these
  statements, you work with the Data Service API.


  For more information about the Data Service API, see Using the Data API for Aurora
  Serverless in the Amazon Aurora User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rdsdata AWSRDSData]))

(defn batch-execute-statement
  "Runs a batch SQL statement over an array of data.


   You can run bulk update and insert operations for multiple records using a DML statement with different parameter
   sets. Bulk operations can provide a significant performance improvement over individual insert and update
   operations.



   If a call isn't part of a transaction because it doesn't include the transactionID parameter,
   changes that result from the call are committed automatically.

  batch-execute-statement-request - The request parameters represent the input of a SQL statement over an array of data. - `com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest`

  returns: Result of the BatchExecuteStatement operation returned by the service. - `com.amazonaws.services.rdsdata.model.BatchExecuteStatementResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.BatchExecuteStatementResult [^AWSRDSData this ^com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest batch-execute-statement-request]
    (-> this (.batchExecuteStatement batch-execute-statement-request))))

(defn begin-transaction
  "Starts a SQL transaction.




   A transaction can run for a maximum of 24 hours. A transaction is terminated and rolled back automatically after
   24 hours.


   A transaction times out if no calls use its transaction ID in three minutes. If a transaction times out before
   it's committed, it's rolled back automatically.


   DDL statements inside a transaction cause an implicit commit. We recommend that you run each DDL statement in a
   separate ExecuteStatement call with continueAfterTimeout enabled.

  begin-transaction-request - The request parameters represent the input of a request to start a SQL transaction. - `com.amazonaws.services.rdsdata.model.BeginTransactionRequest`

  returns: Result of the BeginTransaction operation returned by the service. - `com.amazonaws.services.rdsdata.model.BeginTransactionResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.BeginTransactionResult [^AWSRDSData this ^com.amazonaws.services.rdsdata.model.BeginTransactionRequest begin-transaction-request]
    (-> this (.beginTransaction begin-transaction-request))))

(defn commit-transaction
  "Ends a SQL transaction started with the BeginTransaction operation and commits the changes.

  commit-transaction-request - The request parameters represent the input of a commit transaction request. - `com.amazonaws.services.rdsdata.model.CommitTransactionRequest`

  returns: Result of the CommitTransaction operation returned by the service. - `com.amazonaws.services.rdsdata.model.CommitTransactionResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.CommitTransactionResult [^AWSRDSData this ^com.amazonaws.services.rdsdata.model.CommitTransactionRequest commit-transaction-request]
    (-> this (.commitTransaction commit-transaction-request))))

(defn execute-sql
  "Deprecated.

  execute-sql-request - The request parameters represent the input of a request to run one or more SQL statements. - `com.amazonaws.services.rdsdata.model.ExecuteSqlRequest`

  returns: Result of the ExecuteSql operation returned by the service. - `com.amazonaws.services.rdsdata.model.ExecuteSqlResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.ExecuteSqlResult [^AWSRDSData this ^com.amazonaws.services.rdsdata.model.ExecuteSqlRequest execute-sql-request]
    (-> this (.executeSql execute-sql-request))))

(defn execute-statement
  "Runs a SQL statement against a database.



   If a call isn't part of a transaction because it doesn't include the transactionID parameter,
   changes that result from the call are committed automatically.



   The response size limit is 1 MB or 1,000 records. If the call returns more than 1 MB of response data or over
   1,000 records, the call is terminated.

  execute-statement-request - The request parameters represent the input of a request to run a SQL statement against a database. - `com.amazonaws.services.rdsdata.model.ExecuteStatementRequest`

  returns: Result of the ExecuteStatement operation returned by the service. - `com.amazonaws.services.rdsdata.model.ExecuteStatementResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.ExecuteStatementResult [^AWSRDSData this ^com.amazonaws.services.rdsdata.model.ExecuteStatementRequest execute-statement-request]
    (-> this (.executeStatement execute-statement-request))))

(defn rollback-transaction
  "Performs a rollback of a transaction. Rolling back a transaction cancels its changes.

  rollback-transaction-request - The request parameters represent the input of a request to perform a rollback of a transaction. - `com.amazonaws.services.rdsdata.model.RollbackTransactionRequest`

  returns: Result of the RollbackTransaction operation returned by the service. - `com.amazonaws.services.rdsdata.model.RollbackTransactionResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.RollbackTransactionResult [^AWSRDSData this ^com.amazonaws.services.rdsdata.model.RollbackTransactionRequest rollback-transaction-request]
    (-> this (.rollbackTransaction rollback-transaction-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSRDSData this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSRDSData this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

