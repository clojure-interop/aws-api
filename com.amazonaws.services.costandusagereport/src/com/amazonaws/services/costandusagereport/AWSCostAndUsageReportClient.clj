(ns com.amazonaws.services.costandusagereport.AWSCostAndUsageReportClient
  "Client for accessing AWS Cost and Usage Report Service. All service calls made using this client are blocking, and
  will not return until the service call completes.


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
  (:import [com.amazonaws.services.costandusagereport AWSCostAndUsageReportClient]))

(defn ->aws-cost-and-usage-report-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to AWS Cost and Usage Report Service (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSCostAndUsageReportClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSCostAndUsageReportClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSCostAndUsageReportClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCostAndUsageReportClient aws-credentials client-configuration))
  (^AWSCostAndUsageReportClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSCostAndUsageReportClient client-configuration))
  (^AWSCostAndUsageReportClient []
    (new AWSCostAndUsageReportClient )))

(defn *builder
  "returns: `com.amazonaws.services.costandusagereport.AWSCostAndUsageReportClientBuilder`"
  (^com.amazonaws.services.costandusagereport.AWSCostAndUsageReportClientBuilder []
    (AWSCostAndUsageReportClient/builder )))

(defn delete-report-definition
  "Deletes the specified report.

  request - `com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest`

  returns: Result of the DeleteReportDefinition operation returned by the service. - `com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult`

  throws: com.amazonaws.services.costandusagereport.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult [^AWSCostAndUsageReportClient this ^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest request]
    (-> this (.deleteReportDefinition request))))

(defn describe-report-definitions
  "Lists the AWS Cost and Usage reports available to this account.

  request - `com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest`

  returns: Result of the DescribeReportDefinitions operation returned by the service. - `com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult`

  throws: com.amazonaws.services.costandusagereport.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult [^AWSCostAndUsageReportClient this ^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest request]
    (-> this (.describeReportDefinitions request))))

(defn put-report-definition
  "Creates a new report using the description that you provide.

  request - `com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest`

  returns: Result of the PutReportDefinition operation returned by the service. - `com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult`

  throws: com.amazonaws.services.costandusagereport.model.DuplicateReportNameException - A report with the specified name already exists in the account. Specify a different report name."
  (^com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult [^AWSCostAndUsageReportClient this ^com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest request]
    (-> this (.putReportDefinition request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSCostAndUsageReportClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

