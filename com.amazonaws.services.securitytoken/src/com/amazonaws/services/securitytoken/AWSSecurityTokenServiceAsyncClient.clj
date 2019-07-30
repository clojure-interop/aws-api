(ns com.amazonaws.services.securitytoken.AWSSecurityTokenServiceAsyncClient
  "Client for accessing AWS STS asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  AWS Security Token Service

  The AWS Security Token Service (STS) is a web service that enables you to request temporary, limited-privilege
  credentials for AWS Identity and Access Management (IAM) users or for users that you authenticate (federated users).
  This guide provides descriptions of the STS API. For more detailed information about using this service, go to Temporary Security Credentials.


  For information about setting up signatures and authorization through the API, go to Signing AWS API Requests in
  the AWS General Reference. For general information about the Query API, go to Making Query Requests in Using
  IAM. For information about using security tokens with other AWS products, go to AWS Services
  That Work with IAM in the IAM User Guide.


  If you're new to AWS and need additional technical information about a specific AWS product, you can find the
  product's technical documentation at http://aws.amazon.com/documentation/.


  Endpoints


  By default, AWS Security Token Service (STS) is available as a global service, and all AWS STS requests go to a
  single endpoint at https://sts.amazonaws.com. Global requests map to the US East (N. Virginia) region.
  AWS recommends using Regional AWS STS endpoints instead of the global endpoint to reduce latency, build in
  redundancy, and increase session token validity. For more information, see Managing AWS STS in
  an AWS Region in the IAM User Guide.


  Most AWS Regions are enabled for operations in all AWS services by default. Those Regions are automatically activated
  for use with AWS STS. Some Regions, such as Asia Pacific (Hong Kong), must be manually enabled. To learn more about
  enabling and disabling AWS Regions, see Managing AWS Regions in the AWS General
  Reference. When you enable these AWS Regions, they are automatically activated for use with AWS STS. You cannot
  activate the STS endpoint for a Region that is disabled. Tokens that are valid in all AWS Regions are longer than
  tokens that are valid in Regions that are enabled by default. Changing this setting might affect existing systems
  where you temporarily store tokens. For more information, see Managing Global Endpoint Session Tokens in the IAM User Guide.


  After you activate a Region for use with AWS STS, you can direct AWS STS API calls to that Region. AWS STS recommends
  that you provide both the Region and endpoint when you make calls to a Regional endpoint. You can provide the Region
  alone for manually enabled Regions, such as Asia Pacific (Hong Kong). In this case, the calls are directed to the STS
  Regional endpoint. However, if you provide the Region alone for Regions enabled by default, the calls are directed to
  the global endpoint of https://sts.amazonaws.com.


  To view the list of AWS STS endpoints and whether they are active by default, see Writing Code to Use AWS STS Regions in the IAM User Guide.


  Recording API requests


  STS supports AWS CloudTrail, which is a service that records AWS calls for your AWS account and delivers log files to
  an Amazon S3 bucket. By using information collected by CloudTrail, you can determine what requests were successfully
  made to STS, who made the request, when it was made, and so on.


  If you activate AWS STS endpoints in Regions other than the default global endpoint, then you must also turn on
  CloudTrail logging in those Regions. This is necessary to record any AWS STS API calls that are made in those
  Regions. For more information, see Turning On
  CloudTrail in Additional Regions in the AWS CloudTrail User Guide.


  AWS Security Token Service (STS) is a global service with a single endpoint at https://sts.amazonaws.com
  . Calls to this endpoint are logged as calls to a global service. However, because this endpoint is physically
  located in the US East (N. Virginia) Region, your logs list us-east-1 as the event Region. CloudTrail
  does not write these logs to the US East (Ohio) Region unless you choose to include global service logs in that
  Region. CloudTrail writes calls to all Regional endpoints to their respective Regions. For example, calls to
  sts.us-east-2.amazonaws.com are published to the US East (Ohio) Region and calls to sts.eu-central-1.amazonaws.com
  are published to the EU (Frankfurt) Region.


  To learn more about CloudTrail, including how to turn it on and find your log files, see the AWS CloudTrail
  User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.securitytoken AWSSecurityTokenServiceAsyncClient]))

(defn ->aws-security-token-service-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AWSSecurityTokenServiceAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AWSSecurityTokenServiceAsyncClient aws-credentials client-configuration executor-service))
  (^AWSSecurityTokenServiceAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AWSSecurityTokenServiceAsyncClient aws-credentials executor-service))
  (^AWSSecurityTokenServiceAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSSecurityTokenServiceAsyncClient client-configuration))
  (^AWSSecurityTokenServiceAsyncClient []
    (new AWSSecurityTokenServiceAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.securitytoken.AWSSecurityTokenServiceAsyncClientBuilder`"
  (^com.amazonaws.services.securitytoken.AWSSecurityTokenServiceAsyncClientBuilder []
    (AWSSecurityTokenServiceAsyncClient/asyncBuilder )))

(defn get-federation-token-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.GetFederationTokenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFederationToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.GetFederationTokenResult>`"
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.GetFederationTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFederationTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.GetFederationTokenRequest request]
    (-> this (.getFederationTokenAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSSecurityTokenServiceAsyncClient this]
    (-> this (.getExecutorService))))

(defn get-session-token-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.GetSessionTokenRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSessionToken operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.GetSessionTokenResult>`"
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.GetSessionTokenRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSessionTokenAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.GetSessionTokenRequest request]
    (-> this (.getSessionTokenAsync request)))
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this]
    (-> this (.getSessionTokenAsync))))

(defn decode-authorization-message-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DecodeAuthorizationMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageResult>`"
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.decodeAuthorizationMessageAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.DecodeAuthorizationMessageRequest request]
    (-> this (.decodeAuthorizationMessageAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSSecurityTokenServiceAsyncClient this]
    (-> this (.shutdown))))

(defn assume-role-with-saml-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssumeRoleWithSAML operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLResult>`"
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assumeRoleWithSAMLAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.AssumeRoleWithSAMLRequest request]
    (-> this (.assumeRoleWithSAMLAsync request))))

(defn get-caller-identity-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCallerIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.GetCallerIdentityResult>`"
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCallerIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.GetCallerIdentityRequest request]
    (-> this (.getCallerIdentityAsync request))))

(defn assume-role-with-web-identity-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssumeRoleWithWebIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityResult>`"
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assumeRoleWithWebIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.AssumeRoleWithWebIdentityRequest request]
    (-> this (.assumeRoleWithWebIdentityAsync request))))

(defn assume-role-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.AssumeRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssumeRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.AssumeRoleResult>`"
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.AssumeRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.assumeRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.AssumeRoleRequest request]
    (-> this (.assumeRoleAsync request))))

(defn get-access-key-info-async
  "Description copied from interface: AWSSecurityTokenServiceAsync

  request - `com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccessKeyInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.securitytoken.model.GetAccessKeyInfoResult>`"
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccessKeyInfoAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSSecurityTokenServiceAsyncClient this ^com.amazonaws.services.securitytoken.model.GetAccessKeyInfoRequest request]
    (-> this (.getAccessKeyInfoAsync request))))

