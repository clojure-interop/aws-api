(ns com.amazonaws.services.rdsdata.AWSRDSDataClient
  "Client for accessing AWS RDS DataService. All service calls made using this client are blocking, and will not return
  until the service call completes.

  Amazon RDS Data Service

  Amazon RDS provides an HTTP endpoint to run SQL statements on an Amazon Aurora Serverless DB cluster. To run these
  statements, you work with the Data Service API.


  For more information about the Data Service API, see Using the Data API for Aurora
  Serverless in the Amazon Aurora User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rdsdata AWSRDSDataClient]))

(defn *builder
  "returns: `com.amazonaws.services.rdsdata.AWSRDSDataClientBuilder`"
  (^com.amazonaws.services.rdsdata.AWSRDSDataClientBuilder []
    (AWSRDSDataClient/builder )))

(defn batch-execute-statement
  "Runs a batch SQL statement over an array of data.


   You can run bulk update and insert operations for multiple records using a DML statement with different parameter
   sets. Bulk operations can provide a significant performance improvement over individual insert and update
   operations.



   If a call isn't part of a transaction because it doesn't include the transactionID parameter,
   changes that result from the call are committed automatically.

  request - `com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest`

  returns: Result of the BatchExecuteStatement operation returned by the service. - `com.amazonaws.services.rdsdata.model.BatchExecuteStatementResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.BatchExecuteStatementResult [^AWSRDSDataClient this ^com.amazonaws.services.rdsdata.model.BatchExecuteStatementRequest request]
    (-> this (.batchExecuteStatement request))))

(defn begin-transaction
  "Starts a SQL transaction.




   A transaction can run for a maximum of 24 hours. A transaction is terminated and rolled back automatically after
   24 hours.


   A transaction times out if no calls use its transaction ID in three minutes. If a transaction times out before
   it's committed, it's rolled back automatically.


   DDL statements inside a transaction cause an implicit commit. We recommend that you run each DDL statement in a
   separate ExecuteStatement call with continueAfterTimeout enabled.

  request - `com.amazonaws.services.rdsdata.model.BeginTransactionRequest`

  returns: Result of the BeginTransaction operation returned by the service. - `com.amazonaws.services.rdsdata.model.BeginTransactionResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.BeginTransactionResult [^AWSRDSDataClient this ^com.amazonaws.services.rdsdata.model.BeginTransactionRequest request]
    (-> this (.beginTransaction request))))

(defn commit-transaction
  "Ends a SQL transaction started with the BeginTransaction operation and commits the changes.

  request - `com.amazonaws.services.rdsdata.model.CommitTransactionRequest`

  returns: Result of the CommitTransaction operation returned by the service. - `com.amazonaws.services.rdsdata.model.CommitTransactionResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.CommitTransactionResult [^AWSRDSDataClient this ^com.amazonaws.services.rdsdata.model.CommitTransactionRequest request]
    (-> this (.commitTransaction request))))

(defn execute-sql
  "Deprecated.

  request - `com.amazonaws.services.rdsdata.model.ExecuteSqlRequest`

  returns: Result of the ExecuteSql operation returned by the service. - `com.amazonaws.services.rdsdata.model.ExecuteSqlResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.ExecuteSqlResult [^AWSRDSDataClient this ^com.amazonaws.services.rdsdata.model.ExecuteSqlRequest request]
    (-> this (.executeSql request))))

(defn execute-statement
  "Runs a SQL statement against a database.



   If a call isn't part of a transaction because it doesn't include the transactionID parameter,
   changes that result from the call are committed automatically.



   The response size limit is 1 MB or 1,000 records. If the call returns more than 1 MB of response data or over
   1,000 records, the call is terminated.

  request - `com.amazonaws.services.rdsdata.model.ExecuteStatementRequest`

  returns: Result of the ExecuteStatement operation returned by the service. - `com.amazonaws.services.rdsdata.model.ExecuteStatementResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.ExecuteStatementResult [^AWSRDSDataClient this ^com.amazonaws.services.rdsdata.model.ExecuteStatementRequest request]
    (-> this (.executeStatement request))))

(defn rollback-transaction
  "Performs a rollback of a transaction. Rolling back a transaction cancels its changes.

  request - `com.amazonaws.services.rdsdata.model.RollbackTransactionRequest`

  returns: Result of the RollbackTransaction operation returned by the service. - `com.amazonaws.services.rdsdata.model.RollbackTransactionResult`

  throws: com.amazonaws.services.rdsdata.model.BadRequestException - There is an error in the call or in a SQL statement."
  (^com.amazonaws.services.rdsdata.model.RollbackTransactionResult [^AWSRDSDataClient this ^com.amazonaws.services.rdsdata.model.RollbackTransactionRequest request]
    (-> this (.rollbackTransaction request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSRDSDataClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

