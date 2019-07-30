(ns com.amazonaws.services.costandusagereport.AWSCostAndUsageReportAsyncClient
  "Client for accessing AWS Cost and Usage Report Service asynchronously. Each asynchronous method will return a Java
  Future object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to
  receive notification when an asynchronous operation completes.


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
  (:import [com.amazonaws.services.costandusagereport AWSCostAndUsageReportAsyncClient]))

(defn ->aws-cost-and-usage-report-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSCostAndUsageReportAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCostAndUsageReportAsyncClient aws-credentials client-configuration executor-service))
  (^AWSCostAndUsageReportAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSCostAndUsageReportAsyncClient aws-credentials executor-service))
  (^AWSCostAndUsageReportAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCostAndUsageReportAsyncClient client-configuration))
  (^AWSCostAndUsageReportAsyncClient []
    (new AWSCostAndUsageReportAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.costandusagereport.AWSCostAndUsageReportAsyncClientBuilder`"
  (^com.amazonaws.services.costandusagereport.AWSCostAndUsageReportAsyncClientBuilder []
    (AWSCostAndUsageReportAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSCostAndUsageReportAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-report-definition-async
  "Description copied from interface: AWSCostAndUsageReportAsync

  request - Deletes the specified report. - `com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReportDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsyncClient this ^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReportDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsyncClient this ^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest request]
    (-> this (.deleteReportDefinitionAsync request))))

(defn describe-report-definitions-async
  "Description copied from interface: AWSCostAndUsageReportAsync

  request - Requests a list of AWS Cost and Usage reports owned by the account. - `com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReportDefinitions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult>`"
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsyncClient this ^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReportDefinitionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsyncClient this ^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest request]
    (-> this (.describeReportDefinitionsAsync request))))

(defn put-report-definition-async
  "Description copied from interface: AWSCostAndUsageReportAsync

  request - Creates a Cost and Usage Report. - `com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutReportDefinition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult>`"
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsyncClient this ^com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putReportDefinitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSCostAndUsageReportAsyncClient this ^com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest request]
    (-> this (.putReportDefinitionAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSCostAndUsageReportAsyncClient this]
    (-> this (.shutdown))))

