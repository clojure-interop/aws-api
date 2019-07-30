(ns com.amazonaws.services.costandusagereport.AWSCostAndUsageReport
  "Interface for accessing AWS Cost and Usage Report Service.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSCostAndUsageReport instead.



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
  (:import [com.amazonaws.services.costandusagereport AWSCostAndUsageReport]))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"cur.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"cur.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSCostAndUsageReport this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSCostAndUsageReport this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn delete-report-definition
  "Deletes the specified report.

  delete-report-definition-request - Deletes the specified report. - `com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest`

  returns: Result of the DeleteReportDefinition operation returned by the service. - `com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult`

  throws: com.amazonaws.services.costandusagereport.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult [^AWSCostAndUsageReport this ^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest delete-report-definition-request]
    (-> this (.deleteReportDefinition delete-report-definition-request))))

(defn describe-report-definitions
  "Lists the AWS Cost and Usage reports available to this account.

  describe-report-definitions-request - Requests a list of AWS Cost and Usage reports owned by the account. - `com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest`

  returns: Result of the DescribeReportDefinitions operation returned by the service. - `com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult`

  throws: com.amazonaws.services.costandusagereport.model.InternalErrorException - An error on the server occurred during the processing of your request. Try again later."
  (^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult [^AWSCostAndUsageReport this ^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest describe-report-definitions-request]
    (-> this (.describeReportDefinitions describe-report-definitions-request))))

(defn put-report-definition
  "Creates a new report using the description that you provide.

  put-report-definition-request - Creates a Cost and Usage Report. - `com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest`

  returns: Result of the PutReportDefinition operation returned by the service. - `com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult`

  throws: com.amazonaws.services.costandusagereport.model.DuplicateReportNameException - A report with the specified name already exists in the account. Specify a different report name."
  (^com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult [^AWSCostAndUsageReport this ^com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest put-report-definition-request]
    (-> this (.putReportDefinition put-report-definition-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSCostAndUsageReport this]
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
  (^com.amazonaws.ResponseMetadata [^AWSCostAndUsageReport this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

