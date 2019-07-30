(ns com.amazonaws.services.organizations.AWSOrganizationsAsyncClient
  "Client for accessing Organizations asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  AWS Organizations API Reference

  AWS Organizations is a web service that enables you to consolidate your multiple AWS accounts into an
  organization and centrally manage your accounts and their resources.


  This guide provides descriptions of the Organizations API. For more information about using this service, see the AWS Organizations User
  Guide.


  API Version


  This version of the Organizations API Reference documents the Organizations API version 2016-11-28.



  As an alternative to using the API directly, you can use one of the AWS SDKs, which consist of libraries and sample
  code for various programming languages and platforms (Java, Ruby, .NET, iOS, Android, and more). The SDKs provide a
  convenient way to create programmatic access to AWS Organizations. For example, the SDKs take care of
  cryptographically signing requests, managing errors, and retrying requests automatically. For more information about
  the AWS SDKs, including how to download and install them, see Tools for Amazon
  Web Services.



  We recommend that you use the AWS SDKs to make programmatic API calls to Organizations. However, you also can use the
  Organizations Query API to make direct calls to the Organizations web service. To learn more about the Organizations
  Query API, see Making
  Query Requests in the AWS Organizations User Guide. Organizations supports GET and POST requests for all
  actions. That is, the API does not require you to use GET for some actions and POST for others. However, GET requests
  are subject to the limitation size of a URL. Therefore, for operations that require larger sizes, use a POST request.


  Signing Requests


  When you send HTTP requests to AWS, you must sign the requests so that AWS can identify who sent them. You sign
  requests with your AWS access key, which consists of an access key ID and a secret access key. We strongly recommend
  that you do not create an access key for your root account. Anyone who has the access key for your root account has
  unrestricted access to all the resources in your account. Instead, create an access key for an IAM user account that
  has administrative privileges. As another option, use AWS Security Token Service to generate temporary security
  credentials, and use those credentials to sign requests.


  To sign requests, we recommend that you use Signature Version 4. If you have an
  existing application that uses Signature Version 2, you do not have to update it to use Signature Version 4. However,
  some operations now require Signature Version 4. The documentation for operations that require version 4 indicate
  this requirement.


  When you use the AWS Command Line Interface (AWS CLI) or one of the AWS SDKs to make requests to AWS, these tools
  automatically sign the requests for you with the access key that you specify when you configure the tools.


  In this release, each organization can have only one root. In a future release, a single organization will support
  multiple roots.


  Support and Feedback for AWS Organizations


  We welcome your feedback. Send your comments to feedback-awsorganizations@amazon.com or post your feedback and
  questions in the AWS Organizations support forum.
  For more information about the AWS support forums, see Forums
  Help.


  Endpoint to Call When Using the CLI or the AWS API


  For the current release of Organizations, you must specify the us-east-1 region for all AWS API and CLI
  calls. You can do this in the CLI by using these parameters and commands:




  Use the following parameter with each command to specify both the endpoint and its region:


  --endpoint-url https://organizations.us-east-1.amazonaws.com




  Use the default endpoint, but configure your default region with this command:


  aws configure set default.region us-east-1




  Use the following parameter with each command to specify the endpoint:


  --region us-east-1




  For the various SDKs used to call the APIs, see the documentation for the SDK of interest to learn how to direct the
  requests to a specific endpoint. For more information, see Regions and Endpoints in the AWS
  General Reference.


  How examples are presented


  The JSON returned by the AWS Organizations service as response to your requests is returned as a single long string
  without line breaks or formatting whitespace. Both line breaks and whitespace are included in the examples in this
  guide to improve readability. When example input parameters also would result in long strings that would extend
  beyond the screen, we insert line breaks to enhance readability. You should always submit the input as a single JSON
  text string.


  Recording API Requests


  AWS Organizations supports AWS CloudTrail, a service that records AWS API calls for your AWS account and delivers log
  files to an Amazon S3 bucket. By using information collected by AWS CloudTrail, you can determine which requests were
  successfully made to Organizations, who made the request, when it was made, and so on. For more about AWS
  Organizations and its support for AWS CloudTrail, see Logging AWS Organizations Events with AWS CloudTrail in the AWS Organizations User Guide. To learn more
  about CloudTrail, including how to turn it on and find your log files, see the AWS CloudTrail
  User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.organizations AWSOrganizationsAsyncClient]))

(defn ->aws-organizations-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSOrganizationsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSOrganizationsAsyncClient aws-credentials client-configuration executor-service))
  (^AWSOrganizationsAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSOrganizationsAsyncClient aws-credentials executor-service))
  (^AWSOrganizationsAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSOrganizationsAsyncClient client-configuration))
  (^AWSOrganizationsAsyncClient []
    (new AWSOrganizationsAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.organizations.AWSOrganizationsAsyncClientBuilder`"
  (^com.amazonaws.services.organizations.AWSOrganizationsAsyncClientBuilder []
    (AWSOrganizationsAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn cancel-handshake-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CancelHandshakeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CancelHandshake operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CancelHandshakeResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CancelHandshakeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cancelHandshakeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CancelHandshakeRequest request]
    (-> this (.cancelHandshakeAsync request))))

(defn disable-policy-type-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DisablePolicyTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisablePolicyType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DisablePolicyTypeResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DisablePolicyTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disablePolicyTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DisablePolicyTypeRequest request]
    (-> this (.disablePolicyTypeAsync request))))

(defn delete-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DeletePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DeletePolicyResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DeletePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DeletePolicyRequest request]
    (-> this (.deletePolicyAsync request))))

(defn list-parents-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListParentsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListParents operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListParentsResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListParentsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listParentsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListParentsRequest request]
    (-> this (.listParentsAsync request))))

(defn list-policies-for-target-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPoliciesForTarget operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListPoliciesForTargetResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesForTargetAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest request]
    (-> this (.listPoliciesForTargetAsync request))))

(defn list-accounts-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListAccountsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListAccountsResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListAccountsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccountsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListAccountsRequest request]
    (-> this (.listAccountsAsync request))))

(defn invite-account-to-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the InviteAccountToOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.inviteAccountToOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest request]
    (-> this (.inviteAccountToOrganizationAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSOrganizationsAsyncClient this]
    (-> this (.getExecutorService))))

(defn update-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.UpdatePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdatePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.UpdatePolicyResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.UpdatePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updatePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.UpdatePolicyRequest request]
    (-> this (.updatePolicyAsync request))))

(defn list-aws-service-access-for-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAWSServiceAccessForOrganization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAWSServiceAccessForOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest request]
    (-> this (.listAWSServiceAccessForOrganizationAsync request))))

(defn attach-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.AttachPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.AttachPolicyResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.AttachPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.AttachPolicyRequest request]
    (-> this (.attachPolicyAsync request))))

(defn create-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CreatePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CreatePolicyResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CreatePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CreatePolicyRequest request]
    (-> this (.createPolicyAsync request))))

(defn describe-account-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribeAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribeAccountResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribeAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribeAccountRequest request]
    (-> this (.describeAccountAsync request))))

(defn list-handshakes-for-account-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHandshakesForAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListHandshakesForAccountResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHandshakesForAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest request]
    (-> this (.listHandshakesForAccountAsync request))))

(defn enable-aws-service-access-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableAWSServiceAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableAWSServiceAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest request]
    (-> this (.enableAWSServiceAccessAsync request))))

(defn accept-handshake-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.AcceptHandshakeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AcceptHandshake operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.AcceptHandshakeResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.AcceptHandshakeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.acceptHandshakeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.AcceptHandshakeRequest request]
    (-> this (.acceptHandshakeAsync request))))

(defn describe-handshake-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribeHandshakeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeHandshake operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribeHandshakeResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribeHandshakeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeHandshakeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribeHandshakeRequest request]
    (-> this (.describeHandshakeAsync request))))

(defn detach-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DetachPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DetachPolicyResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DetachPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DetachPolicyRequest request]
    (-> this (.detachPolicyAsync request))))

(defn delete-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DeleteOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DeleteOrganizationResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DeleteOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DeleteOrganizationRequest request]
    (-> this (.deleteOrganizationAsync request))))

(defn describe-create-account-status-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCreateAccountStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCreateAccountStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest request]
    (-> this (.describeCreateAccountStatusAsync request))))

(defn list-children-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListChildrenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListChildren operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListChildrenResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListChildrenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listChildrenAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListChildrenRequest request]
    (-> this (.listChildrenAsync request))))

(defn describe-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribePolicyResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribePolicyRequest request]
    (-> this (.describePolicyAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSOrganizationsAsyncClient this]
    (-> this (.shutdown))))

(defn list-handshakes-for-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListHandshakesForOrganization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listHandshakesForOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest request]
    (-> this (.listHandshakesForOrganizationAsync request))))

(defn leave-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.LeaveOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the LeaveOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.LeaveOrganizationResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.LeaveOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.leaveOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.LeaveOrganizationRequest request]
    (-> this (.leaveOrganizationAsync request))))

(defn list-create-account-status-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCreateAccountStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListCreateAccountStatusResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCreateAccountStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest request]
    (-> this (.listCreateAccountStatusAsync request))))

(defn list-roots-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListRootsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoots operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListRootsResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListRootsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRootsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListRootsRequest request]
    (-> this (.listRootsAsync request))))

(defn list-targets-for-policy-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTargetsForPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListTargetsForPolicyResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTargetsForPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest request]
    (-> this (.listTargetsForPolicyAsync request))))

(defn enable-policy-type-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.EnablePolicyTypeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnablePolicyType operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.EnablePolicyTypeResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.EnablePolicyTypeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enablePolicyTypeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.EnablePolicyTypeRequest request]
    (-> this (.enablePolicyTypeAsync request))))

(defn list-policies-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListPoliciesResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListPoliciesRequest request]
    (-> this (.listPoliciesAsync request))))

(defn list-accounts-for-parent-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListAccountsForParentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccountsForParent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListAccountsForParentResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListAccountsForParentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccountsForParentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListAccountsForParentRequest request]
    (-> this (.listAccountsForParentAsync request))))

(defn create-gov-cloud-account-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CreateGovCloudAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGovCloudAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CreateGovCloudAccountResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CreateGovCloudAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGovCloudAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CreateGovCloudAccountRequest request]
    (-> this (.createGovCloudAccountAsync request))))

(defn describe-organizational-unit-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrganizationalUnit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrganizationalUnitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest request]
    (-> this (.describeOrganizationalUnitAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn list-organizational-units-for-parent-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOrganizationalUnitsForParent operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOrganizationalUnitsForParentAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest request]
    (-> this (.listOrganizationalUnitsForParentAsync request))))

(defn create-account-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CreateAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CreateAccountResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CreateAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CreateAccountRequest request]
    (-> this (.createAccountAsync request))))

(defn enable-all-features-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.EnableAllFeaturesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableAllFeatures operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.EnableAllFeaturesResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.EnableAllFeaturesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableAllFeaturesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.EnableAllFeaturesRequest request]
    (-> this (.enableAllFeaturesAsync request))))

(defn decline-handshake-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DeclineHandshakeRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeclineHandshake operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DeclineHandshakeResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DeclineHandshakeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.declineHandshakeAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DeclineHandshakeRequest request]
    (-> this (.declineHandshakeAsync request))))

(defn update-organizational-unit-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateOrganizationalUnit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateOrganizationalUnitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest request]
    (-> this (.updateOrganizationalUnitAsync request))))

(defn create-organizational-unit-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOrganizationalUnit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOrganizationalUnitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest request]
    (-> this (.createOrganizationalUnitAsync request))))

(defn move-account-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.MoveAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the MoveAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.MoveAccountResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.MoveAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.moveAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.MoveAccountRequest request]
    (-> this (.moveAccountAsync request))))

(defn describe-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DescribeOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DescribeOrganizationResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribeOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DescribeOrganizationRequest request]
    (-> this (.describeOrganizationAsync request))))

(defn disable-aws-service-access-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableAWSServiceAccess operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableAWSServiceAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest request]
    (-> this (.disableAWSServiceAccessAsync request))))

(defn tag-resource-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn delete-organizational-unit-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOrganizationalUnit operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOrganizationalUnitAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest request]
    (-> this (.deleteOrganizationalUnitAsync request))))

(defn create-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.CreateOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOrganization operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.CreateOrganizationResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CreateOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.CreateOrganizationRequest request]
    (-> this (.createOrganizationAsync request))))

(defn remove-account-from-organization-async
  "Description copied from interface: AWSOrganizationsAsync

  request - `com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveAccountFromOrganization operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult>`"
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeAccountFromOrganizationAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSOrganizationsAsyncClient this ^com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest request]
    (-> this (.removeAccountFromOrganizationAsync request))))

