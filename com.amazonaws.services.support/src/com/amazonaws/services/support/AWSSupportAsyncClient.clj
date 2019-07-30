(ns com.amazonaws.services.support.AWSSupportAsyncClient
  "Client for accessing AWS Support asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

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
  (:import [com.amazonaws.services.support AWSSupportAsyncClient]))

(defn ->aws-support-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSSupportAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSSupportAsyncClient aws-credentials client-configuration executor-service))
  (^AWSSupportAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSSupportAsyncClient aws-credentials executor-service))
  (^AWSSupportAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSSupportAsyncClient client-configuration))
  (^AWSSupportAsyncClient []
    (new AWSSupportAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.support.AWSSupportAsyncClientBuilder`"
  (^com.amazonaws.services.support.AWSSupportAsyncClientBuilder []
    (AWSSupportAsyncClient/asyncBuilder )))

(defn refresh-trusted-advisor-check-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RefreshTrustedAdvisorCheck operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.refreshTrustedAdvisorCheckAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.RefreshTrustedAdvisorCheckRequest request]
    (-> this (.refreshTrustedAdvisorCheckAsync request))))

(defn describe-severity-levels-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeSeverityLevelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeSeverityLevels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeSeverityLevelsResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeSeverityLevelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeSeverityLevelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeSeverityLevelsRequest request]
    (-> this (.describeSeverityLevelsAsync request)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this]
    (-> this (.describeSeverityLevelsAsync))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSSupportAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-case-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.CreateCaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.CreateCaseResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.CreateCaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.CreateCaseRequest request]
    (-> this (.createCaseAsync request))))

(defn describe-services-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeServicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeServices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeServicesResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeServicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeServicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeServicesRequest request]
    (-> this (.describeServicesAsync request)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this]
    (-> this (.describeServicesAsync))))

(defn describe-trusted-advisor-check-summaries-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrustedAdvisorCheckSummaries operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrustedAdvisorCheckSummariesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckSummariesRequest request]
    (-> this (.describeTrustedAdvisorCheckSummariesAsync request))))

(defn add-attachments-to-set-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.AddAttachmentsToSetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddAttachmentsToSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.AddAttachmentsToSetResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.AddAttachmentsToSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addAttachmentsToSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.AddAttachmentsToSetRequest request]
    (-> this (.addAttachmentsToSetAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSSupportAsyncClient this]
    (-> this (.shutdown))))

(defn describe-trusted-advisor-check-result-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrustedAdvisorCheckResult operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrustedAdvisorCheckResultAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckResultRequest request]
    (-> this (.describeTrustedAdvisorCheckResultAsync request))))

(defn add-communication-to-case-async
  "Description copied from interface: AWSSupportAsync

  request - To be written. - `com.amazonaws.services.support.model.AddCommunicationToCaseRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddCommunicationToCase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.AddCommunicationToCaseResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.AddCommunicationToCaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addCommunicationToCaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.AddCommunicationToCaseRequest request]
    (-> this (.addCommunicationToCaseAsync request))))

(defn describe-attachment-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeAttachmentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAttachment operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeAttachmentResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeAttachmentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAttachmentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeAttachmentRequest request]
    (-> this (.describeAttachmentAsync request))))

(defn describe-trusted-advisor-checks-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrustedAdvisorChecks operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrustedAdvisorChecksAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorChecksRequest request]
    (-> this (.describeTrustedAdvisorChecksAsync request))))

(defn resolve-case-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.ResolveCaseRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResolveCase operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.ResolveCaseResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.ResolveCaseRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resolveCaseAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.ResolveCaseRequest request]
    (-> this (.resolveCaseAsync request)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this]
    (-> this (.resolveCaseAsync))))

(defn describe-cases-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeCasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeCasesResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeCasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeCasesRequest request]
    (-> this (.describeCasesAsync request)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this]
    (-> this (.describeCasesAsync))))

(defn describe-trusted-advisor-check-refresh-statuses-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeTrustedAdvisorCheckRefreshStatuses operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeTrustedAdvisorCheckRefreshStatusesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeTrustedAdvisorCheckRefreshStatusesRequest request]
    (-> this (.describeTrustedAdvisorCheckRefreshStatusesAsync request))))

(defn describe-communications-async
  "Description copied from interface: AWSSupportAsync

  request - `com.amazonaws.services.support.model.DescribeCommunicationsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCommunications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.support.model.DescribeCommunicationsResult>`"
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeCommunicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCommunicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSupportAsyncClient this ^com.amazonaws.services.support.model.DescribeCommunicationsRequest request]
    (-> this (.describeCommunicationsAsync request))))

