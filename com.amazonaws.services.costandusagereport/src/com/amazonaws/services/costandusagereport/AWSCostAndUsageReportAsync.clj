(ns com.amazonaws.services.costandusagereport.AWSCostAndUsageReportAsync
  "Interface for accessing AWS Cost and Usage Report Service asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCostAndUsageReportAsync instead.



  The AWS Cost and Usage Report API enables you to programmatically create, query, and delete AWS Cost and Usage report
  definitions.


  AWS Cost and Usage reports track the monthly AWS costs and usage associated with your AWS account. The report
  contains line items for each unique combination of AWS product, usage type, and operation that your AWS account uses.
  You can configure the AWS Cost and Usage report to show only the data that you want, using the AWS Cost and Usage
  API.


  Service Endpoint


  The AWS Cost and Usage Report API provides the following endpoint:




  cur.us-east-1.amazonaws.com"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.costandusagereport AWSCostAndUsageReportAsync]))

(defn delete-report-definition-async
  "Deletes the specified report.

  delete-report-definition-request - Deletes the specified report. - `com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReportDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest delete-report-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReportDefinitionAsync delete-report-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest delete-report-definition-request]
    (-> this (.deleteReportDefinitionAsync delete-report-definition-request))))

(defn describe-report-definitions-async
  "Lists the AWS Cost and Usage reports available to this account.

  describe-report-definitions-request - Requests a list of AWS Cost and Usage reports owned by the account. - `com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReportDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest describe-report-definitions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReportDefinitionsAsync describe-report-definitions-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest describe-report-definitions-request]
    (-> this (.describeReportDefinitionsAsync describe-report-definitions-request))))

(defn put-report-definition-async
  "Creates a new report using the description that you provide.

  put-report-definition-request - Creates a Cost and Usage Report. - `com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutReportDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest put-report-definition-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putReportDefinitionAsync put-report-definition-request async-handler)))
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsync this ^com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest put-report-definition-request]
    (-> this (.putReportDefinitionAsync put-report-definition-request))))

