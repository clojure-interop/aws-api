(ns com.amazonaws.services.costandusagereport.AbstractAWSCostAndUsageReport
  "Abstract implementation of AWSCostAndUsageReport. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.costandusagereport AbstractAWSCostAndUsageReport]))

(defn set-endpoint
  "Description copied from interface: AWSCostAndUsageReport

  endpoint - The endpoint (ex: \"cur.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"cur.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSCostAndUsageReport this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn set-region
  "Description copied from interface: AWSCostAndUsageReport

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSCostAndUsageReport this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn delete-report-definition
  "Description copied from interface: AWSCostAndUsageReport

  request - Deletes the specified report. - `com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest`

  returns: Result of the DeleteReportDefinition operation returned by the service. - `com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult`"
  (^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionResult [^AbstractAWSCostAndUsageReport this ^com.amazonaws.services.costandusagereport.model.DeleteReportDefinitionRequest request]
    (-> this (.deleteReportDefinition request))))

(defn describe-report-definitions
  "Description copied from interface: AWSCostAndUsageReport

  request - Requests a list of AWS Cost and Usage reports owned by the account. - `com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest`

  returns: Result of the DescribeReportDefinitions operation returned by the service. - `com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult`"
  (^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsResult [^AbstractAWSCostAndUsageReport this ^com.amazonaws.services.costandusagereport.model.DescribeReportDefinitionsRequest request]
    (-> this (.describeReportDefinitions request))))

(defn put-report-definition
  "Description copied from interface: AWSCostAndUsageReport

  request - Creates a Cost and Usage Report. - `com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest`

  returns: Result of the PutReportDefinition operation returned by the service. - `com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult`"
  (^com.amazonaws.services.costandusagereport.model.PutReportDefinitionResult [^AbstractAWSCostAndUsageReport this ^com.amazonaws.services.costandusagereport.model.PutReportDefinitionRequest request]
    (-> this (.putReportDefinition request))))

(defn shutdown
  "Description copied from interface: AWSCostAndUsageReport"
  ([^AbstractAWSCostAndUsageReport this]
    (-> this (.shutdown))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSCostAndUsageReport

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSCostAndUsageReport this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

