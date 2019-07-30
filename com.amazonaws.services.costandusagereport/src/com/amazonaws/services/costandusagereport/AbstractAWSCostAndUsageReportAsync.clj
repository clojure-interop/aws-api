(ns com.amazonaws.services.costandusagereport.AbstractAWSCostAndUsageReportAsync
  "Abstract implementation of AWSCostAndUsageReportAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.costandusagereport AbstractAWSCostAndUsageReportAsync]))

(defn delete-report-definition-async
  "Description copied from interface: AWSCostAndUsageReportAsync

  request - Deletes the specified report. - `com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReportDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReportDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest request]
    (-> this (.deleteReportDefinitionAsync request))))

(defn describe-report-definitions-async
  "Description copied from interface: AWSCostAndUsageReportAsync

  request - Requests a list of AWS Cost and Usage reports owned by the account. - `com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReportDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReportDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest request]
    (-> this (.describeReportDefinitionsAsync request))))

(defn put-report-definition-async
  "Description copied from interface: AWSCostAndUsageReportAsync

  request - Creates a Cost and Usage Report. - `com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutReportDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult>`"
  (^java.util.concurrent.Future [^AbstractAWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putReportDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest request]
    (-> this (.putReportDefinitionAsync request))))

