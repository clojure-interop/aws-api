(ns com.amazonaws.services.support.AbstractAWSSupportAsync
  "Abstract implementation of AWSSupportAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.support AbstractAWSSupportAsync]))

(defn refresh-trusted-advisor-check-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RefreshTrustedAdvisorCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.refreshTrustedAdvisorCheckAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest request]
    (-> this (.refreshTrustedAdvisorCheckAsync request))))

(defn describe-severity-levels-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeSeverityLevelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSeverityLevels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeSeverityLevelsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeSeverityLevelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSeverityLevelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeSeverityLevelsRequest request]
    (-> this (.describeSeverityLevelsAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this]
    (-> this (.describeSeverityLevelsAsync))))

(defn create-case-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.CreateCaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.CreateCaseResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.CreateCaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.CreateCaseRequest request]
    (-> this (.createCaseAsync request))))

(defn describe-services-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeServicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeServicesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeServicesRequest request]
    (-> this (.describeServicesAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this]
    (-> this (.describeServicesAsync))))

(defn describe-trusted-advisor-check-summaries-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrustedAdvisorCheckSummaries operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrustedAdvisorCheckSummariesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest request]
    (-> this (.describeTrustedAdvisorCheckSummariesAsync request))))

(defn add-attachments-to-set-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.AddAttachmentsToSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddAttachmentsToSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.AddAttachmentsToSetResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.AddAttachmentsToSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addAttachmentsToSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.AddAttachmentsToSetRequest request]
    (-> this (.addAttachmentsToSetAsync request))))

(defn describe-trusted-advisor-check-result-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrustedAdvisorCheckResult operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrustedAdvisorCheckResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest request]
    (-> this (.describeTrustedAdvisorCheckResultAsync request))))

(defn add-communication-to-case-async
  "Description copied from interface: AWSSupportAsync

  request - To be written. - `com.amazonaws.services.support.model.AddCommunicationToCaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddCommunicationToCase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.AddCommunicationToCaseResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.AddCommunicationToCaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addCommunicationToCaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.AddCommunicationToCaseRequest request]
    (-> this (.addCommunicationToCaseAsync request))))

(defn describe-attachment-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeAttachmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAttachment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeAttachmentResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeAttachmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAttachmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeAttachmentRequest request]
    (-> this (.describeAttachmentAsync request))))

(defn describe-trusted-advisor-checks-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrustedAdvisorChecks operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrustedAdvisorChecksAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest request]
    (-> this (.describeTrustedAdvisorChecksAsync request))))

(defn resolve-case-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.ResolveCaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResolveCase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.ResolveCaseResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.ResolveCaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resolveCaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.ResolveCaseRequest request]
    (-> this (.resolveCaseAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this]
    (-> this (.resolveCaseAsync))))

(defn describe-cases-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeCasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeCasesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeCasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeCasesRequest request]
    (-> this (.describeCasesAsync request)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this]
    (-> this (.describeCasesAsync))))

(defn describe-trusted-advisor-check-refresh-statuses-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrustedAdvisorCheckRefreshStatuses operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrustedAdvisorCheckRefreshStatusesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest request]
    (-> this (.describeTrustedAdvisorCheckRefreshStatusesAsync request))))

(defn describe-communications-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeCommunicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCommunications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeCommunicationsResult>`"
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeCommunicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCommunicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAWSSupportAsync this ^com.amazonaws.services.support.model.DescribeCommunicationsRequest request]
    (-> this (.describeCommunicationsAsync request))))

