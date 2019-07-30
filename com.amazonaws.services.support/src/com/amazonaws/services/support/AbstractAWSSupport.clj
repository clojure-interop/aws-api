(ns com.amazonaws.services.support.AbstractAWSSupport
  "Abstract implementation of AWSSupport. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.support AbstractAWSSupport]))

(defn refresh-trusted-advisor-check
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest`

  returns: Result of the RefreshTrustedAdvisorCheck operation returned by the service. - `com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult`"
  (^com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest request]
    (-> this (.refreshTrustedAdvisorCheck request))))

(defn describe-services
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.DescribeServicesRequest`

  returns: Result of the DescribeServices operation returned by the service. - `com.amazonaws.services.support.model.DescribeServicesResult`"
  (^com.amazonaws.services.support.model.DescribeServicesResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.DescribeServicesRequest request]
    (-> this (.describeServices request)))
  (^com.amazonaws.services.support.model.DescribeServicesResult [^AbstractAWSSupport this]
    (-> this (.describeServices))))

(defn describe-trusted-advisor-checks
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest`

  returns: Result of the DescribeTrustedAdvisorChecks operation returned by the service. - `com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult`"
  (^com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest request]
    (-> this (.describeTrustedAdvisorChecks request))))

(defn set-region
  "Description copied from interface: AWSSupport

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAWSSupport this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn describe-communications
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.DescribeCommunicationsRequest`

  returns: Result of the DescribeCommunications operation returned by the service. - `com.amazonaws.services.support.model.DescribeCommunicationsResult`"
  (^com.amazonaws.services.support.model.DescribeCommunicationsResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.DescribeCommunicationsRequest request]
    (-> this (.describeCommunications request))))

(defn describe-trusted-advisor-check-refresh-statuses
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest`

  returns: Result of the DescribeTrustedAdvisorCheckRefreshStatuses operation returned by the service. - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult`"
  (^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest request]
    (-> this (.describeTrustedAdvisorCheckRefreshStatuses request))))

(defn describe-cases
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.DescribeCasesRequest`

  returns: Result of the DescribeCases operation returned by the service. - `com.amazonaws.services.support.model.DescribeCasesResult`"
  (^com.amazonaws.services.support.model.DescribeCasesResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.DescribeCasesRequest request]
    (-> this (.describeCases request)))
  (^com.amazonaws.services.support.model.DescribeCasesResult [^AbstractAWSSupport this]
    (-> this (.describeCases))))

(defn describe-attachment
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.DescribeAttachmentRequest`

  returns: Result of the DescribeAttachment operation returned by the service. - `com.amazonaws.services.support.model.DescribeAttachmentResult`"
  (^com.amazonaws.services.support.model.DescribeAttachmentResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.DescribeAttachmentRequest request]
    (-> this (.describeAttachment request))))

(defn resolve-case
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.ResolveCaseRequest`

  returns: Result of the ResolveCase operation returned by the service. - `com.amazonaws.services.support.model.ResolveCaseResult`"
  (^com.amazonaws.services.support.model.ResolveCaseResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.ResolveCaseRequest request]
    (-> this (.resolveCase request)))
  (^com.amazonaws.services.support.model.ResolveCaseResult [^AbstractAWSSupport this]
    (-> this (.resolveCase))))

(defn create-case
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.CreateCaseRequest`

  returns: Result of the CreateCase operation returned by the service. - `com.amazonaws.services.support.model.CreateCaseResult`"
  (^com.amazonaws.services.support.model.CreateCaseResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.CreateCaseRequest request]
    (-> this (.createCase request))))

(defn describe-trusted-advisor-check-summaries
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest`

  returns: Result of the DescribeTrustedAdvisorCheckSummaries operation returned by the service. - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult`"
  (^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest request]
    (-> this (.describeTrustedAdvisorCheckSummaries request))))

(defn describe-severity-levels
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.DescribeSeverityLevelsRequest`

  returns: Result of the DescribeSeverityLevels operation returned by the service. - `com.amazonaws.services.support.model.DescribeSeverityLevelsResult`"
  (^com.amazonaws.services.support.model.DescribeSeverityLevelsResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.DescribeSeverityLevelsRequest request]
    (-> this (.describeSeverityLevels request)))
  (^com.amazonaws.services.support.model.DescribeSeverityLevelsResult [^AbstractAWSSupport this]
    (-> this (.describeSeverityLevels))))

(defn describe-trusted-advisor-check-result
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest`

  returns: Result of the DescribeTrustedAdvisorCheckResult operation returned by the service. - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult`"
  (^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest request]
    (-> this (.describeTrustedAdvisorCheckResult request))))

(defn shutdown
  "Description copied from interface: AWSSupport"
  ([^AbstractAWSSupport this]
    (-> this (.shutdown))))

(defn set-endpoint
  "Description copied from interface: AWSSupport

  endpoint - The endpoint (ex: \"support.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://support.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAWSSupport this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn add-attachments-to-set
  "Description copied from interface: AWSSupport

  request - `com.amazonaws.services.support.model.AddAttachmentsToSetRequest`

  returns: Result of the AddAttachmentsToSet operation returned by the service. - `com.amazonaws.services.support.model.AddAttachmentsToSetResult`"
  (^com.amazonaws.services.support.model.AddAttachmentsToSetResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.AddAttachmentsToSetRequest request]
    (-> this (.addAttachmentsToSet request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSSupport

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSSupport this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn add-communication-to-case
  "Description copied from interface: AWSSupport

  request - To be written. - `com.amazonaws.services.support.model.AddCommunicationToCaseRequest`

  returns: Result of the AddCommunicationToCase operation returned by the service. - `com.amazonaws.services.support.model.AddCommunicationToCaseResult`"
  (^com.amazonaws.services.support.model.AddCommunicationToCaseResult [^AbstractAWSSupport this ^com.amazonaws.services.support.model.AddCommunicationToCaseRequest request]
    (-> this (.addCommunicationToCase request))))

