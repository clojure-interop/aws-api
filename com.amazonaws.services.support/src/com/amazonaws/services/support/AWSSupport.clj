(ns com.amazonaws.services.support.AWSSupport
  "Interface for accessing AWS Support.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSSupport instead.


  AWS Support

  The AWS Support API reference is intended for programmers who need detailed information about the AWS Support
  operations and data types. This service enables you to manage your AWS Support cases programmatically. It uses HTTP
  methods that return results in JSON format.


  The AWS Support service also exposes a set of Trusted
  Advisor features. You can retrieve a list of checks and their descriptions, get check results, specify checks to
  refresh, and get the refresh status of checks.


  The following list describes the AWS Support case management operations:




  Service names, issue categories, and available severity levels. The DescribeServices and
  DescribeSeverityLevels operations return AWS service names, service codes, service categories, and problem
  severity levels. You use these values when you call the CreateCase operation.




  Case creation, case details, and case resolution. The CreateCase, DescribeCases,
  DescribeAttachment, and ResolveCase operations create AWS Support cases, retrieve information about
  cases, and resolve cases.




  Case communication. The DescribeCommunications, AddCommunicationToCase, and
  AddAttachmentsToSet operations retrieve and add communications and attachments to AWS Support cases.




  The following list describes the operations available from the AWS Support service for Trusted Advisor:




  DescribeTrustedAdvisorChecks returns the list of checks that run against your AWS resources.




  Using the checkId for a specific check returned by DescribeTrustedAdvisorChecks, you can call
  DescribeTrustedAdvisorCheckResult to obtain the results for the check you specified.




  DescribeTrustedAdvisorCheckSummaries returns summarized results for one or more Trusted Advisor checks.




  RefreshTrustedAdvisorCheck requests that Trusted Advisor rerun a specified check.




  DescribeTrustedAdvisorCheckRefreshStatuses reports the refresh status of one or more checks.




  For authentication of requests, AWS Support uses Signature Version 4 Signing Process.


  See About the AWS Support API in the
  AWS Support User Guide for information about how to use this service to create and manage your support cases,
  and how to call Trusted Advisor for results of checks on your resources."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.support AWSSupport]))

(defn refresh-trusted-advisor-check
  "Requests a refresh of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by
   calling DescribeTrustedAdvisorChecks.



   Some checks are refreshed automatically, and they cannot be refreshed by using this operation. Use of the
   RefreshTrustedAdvisorCheck operation for these checks causes an InvalidParameterValue
   error.



   The response contains a TrustedAdvisorCheckRefreshStatus object, which contains these fields:




   status. The refresh status of the check: \"none\", \"enqueued\", \"processing\", \"success\", or \"abandoned\".




   millisUntilNextRefreshable. The amount of time, in milliseconds, until the check is eligible for refresh.




   checkId. The unique identifier for the check.

  refresh-trusted-advisor-check-request - `com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest`

  returns: Result of the RefreshTrustedAdvisorCheck operation returned by the service. - `com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult [^AWSSupport this ^com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest refresh-trusted-advisor-check-request]
    (-> this (.refreshTrustedAdvisorCheck refresh-trusted-advisor-check-request))))

(defn describe-services
  "Returns the current list of AWS services and a list of service categories that applies to each one. You then use
   service names and categories in your CreateCase requests. Each AWS service has its own set of categories.


   The service codes and category codes correspond to the values that are displayed in the Service and
   Category drop-down lists on the AWS Support Center Create Case page. The values in those fields,
   however, do not necessarily match the service codes and categories returned by the DescribeServices
   request. Always use the service codes and categories obtained programmatically. This practice ensures that you
   always have the most recent set of service and category codes.

  describe-services-request - `com.amazonaws.services.support.model.DescribeServicesRequest`

  returns: Result of the DescribeServices operation returned by the service. - `com.amazonaws.services.support.model.DescribeServicesResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.DescribeServicesResult [^AWSSupport this ^com.amazonaws.services.support.model.DescribeServicesRequest describe-services-request]
    (-> this (.describeServices describe-services-request)))
  (^com.amazonaws.services.support.model.DescribeServicesResult [^AWSSupport this]
    (-> this (.describeServices))))

(defn describe-trusted-advisor-checks
  "Returns information about all available Trusted Advisor checks, including name, ID, category, description, and
   metadata. You must specify a language code; English (\"en\") and Japanese (\"ja\") are currently supported. The
   response contains a TrustedAdvisorCheckDescription for each check.

  describe-trusted-advisor-checks-request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest`

  returns: Result of the DescribeTrustedAdvisorChecks operation returned by the service. - `com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult [^AWSSupport this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest describe-trusted-advisor-checks-request]
    (-> this (.describeTrustedAdvisorChecks describe-trusted-advisor-checks-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AWSSupport this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-communications
  "Returns communications (and attachments) for one or more support cases. You can use the afterTime
   and beforeTime parameters to filter by date. You can use the caseId parameter to
   restrict the results to a particular case.


   Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for
   data might cause an error.


   You can use the maxResults and nextToken parameters to control the pagination of the
   result set. Set maxResults to the number of cases you want displayed on each page, and use
   nextToken to specify the resumption of pagination.

  describe-communications-request - `com.amazonaws.services.support.model.DescribeCommunicationsRequest`

  returns: Result of the DescribeCommunications operation returned by the service. - `com.amazonaws.services.support.model.DescribeCommunicationsResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.DescribeCommunicationsResult [^AWSSupport this ^com.amazonaws.services.support.model.DescribeCommunicationsRequest describe-communications-request]
    (-> this (.describeCommunications describe-communications-request))))

(defn describe-trusted-advisor-check-refresh-statuses
  "Returns the refresh status of the Trusted Advisor checks that have the specified check IDs. Check IDs can be
   obtained by calling DescribeTrustedAdvisorChecks.



   Some checks are refreshed automatically, and their refresh statuses cannot be retrieved by using this operation.
   Use of the DescribeTrustedAdvisorCheckRefreshStatuses operation for these checks causes an
   InvalidParameterValue error.

  describe-trusted-advisor-check-refresh-statuses-request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest`

  returns: Result of the DescribeTrustedAdvisorCheckRefreshStatuses operation returned by the service. - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult [^AWSSupport this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest describe-trusted-advisor-check-refresh-statuses-request]
    (-> this (.describeTrustedAdvisorCheckRefreshStatuses describe-trusted-advisor-check-refresh-statuses-request))))

(defn describe-cases
  "Returns a list of cases that you specify by passing one or more case IDs. In addition, you can filter the cases
   by date by setting values for the afterTime and beforeTime request parameters. You can
   set values for the includeResolvedCases and includeCommunications request parameters to
   control how much information is returned.


   Case data is available for 12 months after creation. If a case was created more than 12 months ago, a request for
   data might cause an error.


   The response returns the following in JSON format:




   One or more CaseDetails data types.




   One or more nextToken values, which specify where to paginate the returned records represented by
   the CaseDetails objects.

  describe-cases-request - `com.amazonaws.services.support.model.DescribeCasesRequest`

  returns: Result of the DescribeCases operation returned by the service. - `com.amazonaws.services.support.model.DescribeCasesResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.DescribeCasesResult [^AWSSupport this ^com.amazonaws.services.support.model.DescribeCasesRequest describe-cases-request]
    (-> this (.describeCases describe-cases-request)))
  (^com.amazonaws.services.support.model.DescribeCasesResult [^AWSSupport this]
    (-> this (.describeCases))))

(defn describe-attachment
  "Returns the attachment that has the specified ID. Attachment IDs are generated by the case management system when
   you add an attachment to a case or case communication. Attachment IDs are returned in the
   AttachmentDetails objects that are returned by the DescribeCommunications operation.

  describe-attachment-request - `com.amazonaws.services.support.model.DescribeAttachmentRequest`

  returns: Result of the DescribeAttachment operation returned by the service. - `com.amazonaws.services.support.model.DescribeAttachmentResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.DescribeAttachmentResult [^AWSSupport this ^com.amazonaws.services.support.model.DescribeAttachmentRequest describe-attachment-request]
    (-> this (.describeAttachment describe-attachment-request))))

(defn resolve-case
  "Takes a caseId and returns the initial state of the case along with the state of the case after the
   call to ResolveCase completed.

  resolve-case-request - `com.amazonaws.services.support.model.ResolveCaseRequest`

  returns: Result of the ResolveCase operation returned by the service. - `com.amazonaws.services.support.model.ResolveCaseResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.ResolveCaseResult [^AWSSupport this ^com.amazonaws.services.support.model.ResolveCaseRequest resolve-case-request]
    (-> this (.resolveCase resolve-case-request)))
  (^com.amazonaws.services.support.model.ResolveCaseResult [^AWSSupport this]
    (-> this (.resolveCase))))

(defn create-case
  "Creates a new case in the AWS Support Center. This operation is modeled on the behavior of the AWS Support Center
   Create Case page. Its parameters require
   you to specify the following information:




   issueType. The type of issue for the case. You can specify either \"customer-service\" or \"technical.\" If
   you do not indicate a value, the default is \"technical.\"




   serviceCode. The code for an AWS service. You obtain the serviceCode by calling
   DescribeServices.




   categoryCode. The category for the service defined for the serviceCode value. You also obtain
   the category code for a service by calling DescribeServices. Each AWS service defines its own set of
   category codes.




   severityCode. A value that indicates the urgency of the case, which in turn determines the response time
   according to your service level agreement with AWS Support. You obtain the SeverityCode by calling
   DescribeSeverityLevels.




   subject. The Subject field on the AWS Support Center Create Case page.




   communicationBody. The Description field on the AWS Support Center Create Case page.




   attachmentSetId. The ID of a set of attachments that has been created by using AddAttachmentsToSet.




   language. The human language in which AWS Support handles the case. English and Japanese are currently
   supported.




   ccEmailAddresses. The AWS Support Center CC field on the Create Case page. You can list email
   addresses to be copied on any correspondence about the case. The account that opens the case is already
   identified by passing the AWS Credentials in the HTTP POST method or in a method or function call from one of the
   programming languages supported by an AWS SDK.





   To add additional communication or attachments to an existing case, use AddCommunicationToCase.



   A successful CreateCase request returns an AWS Support case number. Case numbers are used by the
   DescribeCases operation to retrieve existing AWS Support cases.

  create-case-request - `com.amazonaws.services.support.model.CreateCaseRequest`

  returns: Result of the CreateCase operation returned by the service. - `com.amazonaws.services.support.model.CreateCaseResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.CreateCaseResult [^AWSSupport this ^com.amazonaws.services.support.model.CreateCaseRequest create-case-request]
    (-> this (.createCase create-case-request))))

(defn describe-trusted-advisor-check-summaries
  "Returns the summaries of the results of the Trusted Advisor checks that have the specified check IDs. Check IDs
   can be obtained by calling DescribeTrustedAdvisorChecks.


   The response contains an array of TrustedAdvisorCheckSummary objects.

  describe-trusted-advisor-check-summaries-request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest`

  returns: Result of the DescribeTrustedAdvisorCheckSummaries operation returned by the service. - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult [^AWSSupport this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest describe-trusted-advisor-check-summaries-request]
    (-> this (.describeTrustedAdvisorCheckSummaries describe-trusted-advisor-check-summaries-request))))

(defn describe-severity-levels
  "Returns the list of severity levels that you can assign to an AWS Support case. The severity level for a case is
   also a field in the CaseDetails data type included in any CreateCase request.

  describe-severity-levels-request - `com.amazonaws.services.support.model.DescribeSeverityLevelsRequest`

  returns: Result of the DescribeSeverityLevels operation returned by the service. - `com.amazonaws.services.support.model.DescribeSeverityLevelsResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.DescribeSeverityLevelsResult [^AWSSupport this ^com.amazonaws.services.support.model.DescribeSeverityLevelsRequest describe-severity-levels-request]
    (-> this (.describeSeverityLevels describe-severity-levels-request)))
  (^com.amazonaws.services.support.model.DescribeSeverityLevelsResult [^AWSSupport this]
    (-> this (.describeSeverityLevels))))

(defn describe-trusted-advisor-check-result
  "Returns the results of the Trusted Advisor check that has the specified check ID. Check IDs can be obtained by
   calling DescribeTrustedAdvisorChecks.


   The response contains a TrustedAdvisorCheckResult object, which contains these three objects:




   TrustedAdvisorCategorySpecificSummary




   TrustedAdvisorResourceDetail




   TrustedAdvisorResourcesSummary




   In addition, the response contains these fields:




   status. The alert status of the check: \"ok\" (green), \"warning\" (yellow), \"error\" (red), or
   \"not_available\".




   timestamp. The time of the last refresh of the check.




   checkId. The unique identifier for the check.

  describe-trusted-advisor-check-result-request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest`

  returns: Result of the DescribeTrustedAdvisorCheckResult operation returned by the service. - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult [^AWSSupport this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest describe-trusted-advisor-check-result-request]
    (-> this (.describeTrustedAdvisorCheckResult describe-trusted-advisor-check-result-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSSupport this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"support.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://support.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AWSSupport this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn add-attachments-to-set
  "Adds one or more attachments to an attachment set. If an attachmentSetId is not specified, a new
   attachment set is created, and the ID of the set is returned in the response. If an attachmentSetId
   is specified, the attachments are added to the specified set, if it exists.


   An attachment set is a temporary container for attachments that are to be added to a case or case communication.
   The set is available for one hour after it is created; the expiryTime returned in the response
   indicates when the set expires. The maximum number of attachments in a set is 3, and the maximum size of any
   attachment in the set is 5 MB.

  add-attachments-to-set-request - `com.amazonaws.services.support.model.AddAttachmentsToSetRequest`

  returns: Result of the AddAttachmentsToSet operation returned by the service. - `com.amazonaws.services.support.model.AddAttachmentsToSetResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.AddAttachmentsToSetResult [^AWSSupport this ^com.amazonaws.services.support.model.AddAttachmentsToSetRequest add-attachments-to-set-request]
    (-> this (.addAttachmentsToSet add-attachments-to-set-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSSupport this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn add-communication-to-case
  "Adds additional customer communication to an AWS Support case. You use the caseId value to identify
   the case to add communication to. You can list a set of email addresses to copy on the communication using the
   ccEmailAddresses value. The communicationBody value contains the text of the
   communication.


   The response indicates the success or failure of the request.


   This operation implements a subset of the features of the AWS Support Center.

  add-communication-to-case-request - To be written. - `com.amazonaws.services.support.model.AddCommunicationToCaseRequest`

  returns: Result of the AddCommunicationToCase operation returned by the service. - `com.amazonaws.services.support.model.AddCommunicationToCaseResult`

  throws: com.amazonaws.services.support.model.InternalServerErrorException - An internal server error occurred."
  (^com.amazonaws.services.support.model.AddCommunicationToCaseResult [^AWSSupport this ^com.amazonaws.services.support.model.AddCommunicationToCaseRequest add-communication-to-case-request]
    (-> this (.addCommunicationToCase add-communication-to-case-request))))

