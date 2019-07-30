(ns com.amazonaws.services.identitymanagement.AmazonIdentityManagementAsyncClient
  "Client for accessing IAM asynchronously. Each asynchronous method will return a Java Future object representing the
  asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when an
  asynchronous operation completes.

  AWS Identity and Access Management

  AWS Identity and Access Management (IAM) is a web service that you can use to manage users and user permissions under
  your AWS account. This guide provides descriptions of IAM actions that you can call programmatically. For general
  information about IAM, see AWS Identity and Access Management (IAM). For the
  user guide for IAM, see Using IAM.



  AWS provides SDKs that consist of libraries and sample code for various programming languages and platforms (Java,
  Ruby, .NET, iOS, Android, etc.). The SDKs provide a convenient way to create programmatic access to IAM and AWS. For
  example, the SDKs take care of tasks such as cryptographically signing requests (see below), managing errors, and
  retrying requests automatically. For information about the AWS SDKs, including how to download and install them, see
  the Tools for Amazon Web Services page.



  We recommend that you use the AWS SDKs to make programmatic API calls to IAM. However, you can also use the IAM Query
  API to make direct calls to the IAM web service. To learn more about the IAM Query API, see Making Query Requests in the
  Using IAM guide. IAM supports GET and POST requests for all actions. That is, the API does not require you to
  use GET for some actions and POST for others. However, GET requests are subject to the limitation size of a URL.
  Therefore, for operations that require larger sizes, use a POST request.


  Signing Requests


  Requests must be signed using an access key ID and a secret access key. We strongly recommend that you do not use
  your AWS account access key ID and secret access key for everyday work with IAM. You can use the access key ID and
  secret access key for an IAM user or you can use the AWS Security Token Service to generate temporary security
  credentials and use those to sign requests.


  To sign requests, we recommend that you use Signature Version 4. If you have an
  existing application that uses Signature Version 2, you do not have to update it to use Signature Version 4. However,
  some operations now require Signature Version 4. The documentation for operations that require version 4 indicate
  this requirement.


  Additional Resources


  For more information, see the following:




  AWS Security Credentials.
  This topic provides general information about the types of credentials used for accessing AWS.




  IAM Best Practices. This topic
  presents a list of suggestions for using the IAM service to help secure your AWS resources.




  Signing AWS API Requests.
  This set of topics walk you through the process of signing a request using an access key ID and secret access key."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.identitymanagement AmazonIdentityManagementAsyncClient]))

(defn ->amazon-identity-management-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonIdentityManagementAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonIdentityManagementAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonIdentityManagementAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonIdentityManagementAsyncClient aws-credentials executor-service))
  (^AmazonIdentityManagementAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonIdentityManagementAsyncClient client-configuration))
  (^AmazonIdentityManagementAsyncClient []
    (new AmazonIdentityManagementAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.identitymanagement.AmazonIdentityManagementAsyncClientBuilder`"
  (^com.amazonaws.services.identitymanagement.AmazonIdentityManagementAsyncClientBuilder []
    (AmazonIdentityManagementAsyncClient/asyncBuilder )))

(defn get-service-last-accessed-details-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceLastAccessedDetails operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceLastAccessedDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsRequest request]
    (-> this (.getServiceLastAccessedDetailsAsync request))))

(defn get-account-password-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountPasswordPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountPasswordPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest request]
    (-> this (.getAccountPasswordPolicyAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.getAccountPasswordPolicyAsync))))

(defn get-user-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetUserPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest request]
    (-> this (.getUserPolicyAsync request))))

(defn list-group-policies-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest request]
    (-> this (.listGroupPoliciesAsync request))))

(defn create-login-profile-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoginProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoginProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest request]
    (-> this (.createLoginProfileAsync request))))

(defn delete-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeletePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeletePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeletePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeletePolicyRequest request]
    (-> this (.deletePolicyAsync request))))

(defn list-access-keys-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccessKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListAccessKeysResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccessKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest request]
    (-> this (.listAccessKeysAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listAccessKeysAsync))))

(defn attach-user-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachUserPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachUserPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest request]
    (-> this (.attachUserPolicyAsync request))))

(defn delete-user-permissions-boundary-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserPermissionsBoundary operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserPermissionsBoundaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryRequest request]
    (-> this (.deleteUserPermissionsBoundaryAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonIdentityManagementAsyncClient this]
    (-> this (.getExecutorService))))

(defn untag-role-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UntagRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UntagRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UntagRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UntagRoleRequest request]
    (-> this (.untagRoleAsync request))))

(defn detach-role-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachRolePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest request]
    (-> this (.detachRolePolicyAsync request))))

(defn list-entities-for-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEntitiesForPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEntitiesForPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest request]
    (-> this (.listEntitiesForPolicyAsync request))))

(defn create-group-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateGroupRequest request]
    (-> this (.createGroupAsync request))))

(defn delete-user-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest request]
    (-> this (.deleteUserPolicyAsync request))))

(defn list-account-aliases-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccountAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccountAliasesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest request]
    (-> this (.listAccountAliasesAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listAccountAliasesAsync))))

(defn put-role-permissions-boundary-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRolePermissionsBoundary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRolePermissionsBoundaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryRequest request]
    (-> this (.putRolePermissionsBoundaryAsync request))))

(defn update-service-specific-credential-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceSpecificCredential operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceSpecificCredentialAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest request]
    (-> this (.updateServiceSpecificCredentialAsync request))))

(defn get-server-certificate-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServerCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetServerCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServerCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest request]
    (-> this (.getServerCertificateAsync request))))

(defn detach-user-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachUserPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachUserPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest request]
    (-> this (.detachUserPolicyAsync request))))

(defn list-signing-certificates-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest request]
    (-> this (.listSigningCertificatesAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listSigningCertificatesAsync))))

(defn create-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreatePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreatePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreatePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreatePolicyRequest request]
    (-> this (.createPolicyAsync request))))

(defn get-organizations-access-report-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOrganizationsAccessReport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOrganizationsAccessReportAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportRequest request]
    (-> this (.getOrganizationsAccessReportAsync request))))

(defn list-attached-role-policies-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttachedRolePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttachedRolePoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest request]
    (-> this (.listAttachedRolePoliciesAsync request))))

(defn update-login-profile-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLoginProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLoginProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest request]
    (-> this (.updateLoginProfileAsync request))))

(defn delete-user-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteUserRequest request]
    (-> this (.deleteUserAsync request))))

(defn delete-open-id-connect-provider-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOpenIDConnectProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOpenIDConnectProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest request]
    (-> this (.deleteOpenIDConnectProviderAsync request))))

(defn put-user-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutUserPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.PutUserPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putUserPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest request]
    (-> this (.putUserPolicyAsync request))))

(defn delete-signing-certificate-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSigningCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSigningCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest request]
    (-> this (.deleteSigningCertificateAsync request))))

(defn update-ssh-public-key-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSSHPublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest request]
    (-> this (.updateSSHPublicKeyAsync request))))

(defn simulate-custom-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SimulateCustomPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.simulateCustomPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest request]
    (-> this (.simulateCustomPolicyAsync request))))

(defn list-mfa-devices-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMFADevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListMFADevicesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMFADevicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest request]
    (-> this (.listMFADevicesAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listMFADevicesAsync))))

(defn get-account-authorization-details-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountAuthorizationDetails operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountAuthorizationDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest request]
    (-> this (.getAccountAuthorizationDetailsAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.getAccountAuthorizationDetailsAsync))))

(defn delete-access-key-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccessKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccessKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest request]
    (-> this (.deleteAccessKeyAsync request))))

(defn generate-service-last-accessed-details-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateServiceLastAccessedDetails operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateServiceLastAccessedDetailsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsRequest request]
    (-> this (.generateServiceLastAccessedDetailsAsync request))))

(defn get-service-last-accessed-details-with-entities-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceLastAccessedDetailsWithEntities operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceLastAccessedDetailsWithEntitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesRequest request]
    (-> this (.getServiceLastAccessedDetailsWithEntitiesAsync request))))

(defn put-user-permissions-boundary-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutUserPermissionsBoundary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putUserPermissionsBoundaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryRequest request]
    (-> this (.putUserPermissionsBoundaryAsync request))))

(defn delete-policy-version-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest request]
    (-> this (.deletePolicyVersionAsync request))))

(defn upload-ssh-public-key-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadSSHPublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest request]
    (-> this (.uploadSSHPublicKeyAsync request))))

(defn get-role-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRolePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest request]
    (-> this (.getRolePolicyAsync request))))

(defn create-service-linked-role-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServiceLinkedRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServiceLinkedRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest request]
    (-> this (.createServiceLinkedRoleAsync request))))

(defn get-open-id-connect-provider-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpenIDConnectProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpenIDConnectProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest request]
    (-> this (.getOpenIDConnectProviderAsync request))))

(defn get-group-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest request]
    (-> this (.getGroupPolicyAsync request))))

(defn add-client-id-to-open-id-connect-provider-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddClientIDToOpenIDConnectProvider operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addClientIDToOpenIDConnectProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest request]
    (-> this (.addClientIDToOpenIDConnectProviderAsync request))))

(defn add-role-to-instance-profile-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddRoleToInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addRoleToInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest request]
    (-> this (.addRoleToInstanceProfileAsync request))))

(defn remove-client-id-from-open-id-connect-provider-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveClientIDFromOpenIDConnectProvider operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeClientIDFromOpenIDConnectProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest request]
    (-> this (.removeClientIDFromOpenIDConnectProviderAsync request))))

(defn update-signing-certificate-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSigningCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSigningCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest request]
    (-> this (.updateSigningCertificateAsync request))))

(defn update-saml-provider-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSAMLProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSAMLProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest request]
    (-> this (.updateSAMLProviderAsync request))))

(defn upload-signing-certificate-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadSigningCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadSigningCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest request]
    (-> this (.uploadSigningCertificateAsync request))))

(defn upload-server-certificate-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadServerCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadServerCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest request]
    (-> this (.uploadServerCertificateAsync request))))

(defn list-instance-profiles-for-role-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstanceProfilesForRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstanceProfilesForRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest request]
    (-> this (.listInstanceProfilesForRoleAsync request))))

(defn delete-group-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest request]
    (-> this (.deleteGroupPolicyAsync request))))

(defn delete-role-permissions-boundary-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRolePermissionsBoundary operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRolePermissionsBoundaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryRequest request]
    (-> this (.deleteRolePermissionsBoundaryAsync request))))

(defn enable-mfa-device-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableMFADevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableMFADeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest request]
    (-> this (.enableMFADeviceAsync request))))

(defn update-role-description-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRoleDescription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRoleDescriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest request]
    (-> this (.updateRoleDescriptionAsync request))))

(defn reset-service-specific-credential-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetServiceSpecificCredential operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetServiceSpecificCredentialAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest request]
    (-> this (.resetServiceSpecificCredentialAsync request))))

(defn update-open-id-connect-provider-thumbprint-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateOpenIDConnectProviderThumbprint operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateOpenIDConnectProviderThumbprintAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest request]
    (-> this (.updateOpenIDConnectProviderThumbprintAsync request))))

(defn remove-role-from-instance-profile-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveRoleFromInstanceProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeRoleFromInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest request]
    (-> this (.removeRoleFromInstanceProfileAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonIdentityManagementAsyncClient this]
    (-> this (.shutdown))))

(defn get-ssh-public-key-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSSHPublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest request]
    (-> this (.getSSHPublicKeyAsync request))))

(defn update-role-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateRoleRequest request]
    (-> this (.updateRoleAsync request))))

(defn delete-account-alias-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccountAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccountAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest request]
    (-> this (.deleteAccountAliasAsync request))))

(defn create-user-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateUserRequest request]
    (-> this (.createUserAsync request))))

(defn update-group-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateGroupRequest request]
    (-> this (.updateGroupAsync request))))

(defn attach-role-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachRolePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest request]
    (-> this (.attachRolePolicyAsync request))))

(defn delete-ssh-public-key-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSSHPublicKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest request]
    (-> this (.deleteSSHPublicKeyAsync request))))

(defn list-service-specific-credentials-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServiceSpecificCredentials operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServiceSpecificCredentialsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest request]
    (-> this (.listServiceSpecificCredentialsAsync request))))

(defn get-role-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetRoleRequest request]
    (-> this (.getRoleAsync request))))

(defn get-user-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetUserRequest request]
    (-> this (.getUserAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.getUserAsync))))

(defn put-group-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutGroupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putGroupPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest request]
    (-> this (.putGroupPolicyAsync request))))

(defn list-policies-granting-service-access-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPoliciesGrantingServiceAccess operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesGrantingServiceAccessAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessRequest request]
    (-> this (.listPoliciesGrantingServiceAccessAsync request))))

(defn create-instance-profile-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest request]
    (-> this (.createInstanceProfileAsync request))))

(defn get-saml-provider-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSAMLProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSAMLProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest request]
    (-> this (.getSAMLProviderAsync request))))

(defn create-open-id-connect-provider-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOpenIDConnectProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOpenIDConnectProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest request]
    (-> this (.createOpenIDConnectProviderAsync request))))

(defn set-default-policy-version-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetDefaultPolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setDefaultPolicyVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest request]
    (-> this (.setDefaultPolicyVersionAsync request))))

(defn create-role-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateRoleRequest request]
    (-> this (.createRoleAsync request))))

(defn remove-user-from-group-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveUserFromGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeUserFromGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest request]
    (-> this (.removeUserFromGroupAsync request))))

(defn list-user-tags-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListUserTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListUserTagsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListUserTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListUserTagsRequest request]
    (-> this (.listUserTagsAsync request))))

(defn detach-group-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachGroupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachGroupPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest request]
    (-> this (.detachGroupPolicyAsync request))))

(defn get-credential-report-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCredentialReport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetCredentialReportResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCredentialReportAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest request]
    (-> this (.getCredentialReportAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.getCredentialReportAsync))))

(defn untag-user-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UntagUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UntagUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UntagUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UntagUserRequest request]
    (-> this (.untagUserAsync request))))

(defn get-policy-version-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest request]
    (-> this (.getPolicyVersionAsync request))))

(defn list-policies-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListPoliciesRequest request]
    (-> this (.listPoliciesAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listPoliciesAsync))))

(defn list-role-policies-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRolePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRolePoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest request]
    (-> this (.listRolePoliciesAsync request))))

(defn delete-saml-provider-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSAMLProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSAMLProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest request]
    (-> this (.deleteSAMLProviderAsync request))))

(defn list-attached-user-policies-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttachedUserPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttachedUserPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest request]
    (-> this (.listAttachedUserPoliciesAsync request))))

(defn update-server-certificate-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServerCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServerCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest request]
    (-> this (.updateServerCertificateAsync request))))

(defn list-ssh-public-keys-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSSHPublicKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSSHPublicKeysAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest request]
    (-> this (.listSSHPublicKeysAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listSSHPublicKeysAsync))))

(defn create-saml-provider-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSAMLProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSAMLProviderAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest request]
    (-> this (.createSAMLProviderAsync request))))

(defn create-policy-version-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPolicyVersionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest request]
    (-> this (.createPolicyVersionAsync request))))

(defn generate-credential-report-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateCredentialReport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateCredentialReportAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest request]
    (-> this (.generateCredentialReportAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.generateCredentialReportAsync))))

(defn list-role-tags-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListRoleTagsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoleTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListRoleTagsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListRoleTagsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRoleTagsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListRoleTagsRequest request]
    (-> this (.listRoleTagsAsync request))))

(defn resync-mfa-device-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResyncMFADevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resyncMFADeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest request]
    (-> this (.resyncMFADeviceAsync request))))

(defn create-service-specific-credential-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServiceSpecificCredential operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServiceSpecificCredentialAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest request]
    (-> this (.createServiceSpecificCredentialAsync request))))

(defn list-user-policies-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest request]
    (-> this (.listUserPoliciesAsync request))))

(defn generate-organizations-access-report-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateOrganizationsAccessReport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateOrganizationsAccessReportAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportRequest request]
    (-> this (.generateOrganizationsAccessReportAsync request))))

(defn delete-role-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteRoleRequest request]
    (-> this (.deleteRoleAsync request))))

(defn get-account-summary-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountSummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountSummaryAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest request]
    (-> this (.getAccountSummaryAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.getAccountSummaryAsync))))

(defn list-saml-providers-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSAMLProviders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSAMLProvidersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest request]
    (-> this (.listSAMLProvidersAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listSAMLProvidersAsync))))

(defn delete-account-password-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccountPasswordPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccountPasswordPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest request]
    (-> this (.deleteAccountPasswordPolicyAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.deleteAccountPasswordPolicyAsync))))

(defn list-roles-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListRolesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListRolesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListRolesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRolesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListRolesRequest request]
    (-> this (.listRolesAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listRolesAsync))))

(defn get-group-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetGroupRequest request]
    (-> this (.getGroupAsync request))))

(defn tag-user-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.TagUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.TagUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.TagUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.TagUserRequest request]
    (-> this (.tagUserAsync request))))

(defn get-context-keys-for-principal-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContextKeysForPrincipalPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContextKeysForPrincipalPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest request]
    (-> this (.getContextKeysForPrincipalPolicyAsync request))))

(defn get-login-profile-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoginProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetLoginProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoginProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest request]
    (-> this (.getLoginProfileAsync request))))

(defn delete-virtual-mfa-device-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVirtualMFADevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVirtualMFADeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest request]
    (-> this (.deleteVirtualMFADeviceAsync request))))

(defn get-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetPolicyRequest request]
    (-> this (.getPolicyAsync request))))

(defn delete-role-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRolePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest request]
    (-> this (.deleteRolePolicyAsync request))))

(defn update-assume-role-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAssumeRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAssumeRolePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest request]
    (-> this (.updateAssumeRolePolicyAsync request))))

(defn list-groups-for-user-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupsForUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsForUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest request]
    (-> this (.listGroupsForUserAsync request))))

(defn list-instance-profiles-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstanceProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstanceProfilesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest request]
    (-> this (.listInstanceProfilesAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listInstanceProfilesAsync))))

(defn create-account-alias-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccountAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAccountAliasAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest request]
    (-> this (.createAccountAliasAsync request))))

(defn set-security-token-service-preferences-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetSecurityTokenServicePreferences operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSecurityTokenServicePreferencesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesRequest request]
    (-> this (.setSecurityTokenServicePreferencesAsync request))))

(defn tag-role-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.TagRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.TagRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.TagRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.TagRoleRequest request]
    (-> this (.tagRoleAsync request))))

(defn attach-group-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachGroupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachGroupPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest request]
    (-> this (.attachGroupPolicyAsync request))))

(defn delete-server-certificate-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServerCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServerCertificateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest request]
    (-> this (.deleteServerCertificateAsync request))))

(defn get-context-keys-for-custom-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContextKeysForCustomPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContextKeysForCustomPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest request]
    (-> this (.getContextKeysForCustomPolicyAsync request))))

(defn list-attached-group-policies-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttachedGroupPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttachedGroupPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest request]
    (-> this (.listAttachedGroupPoliciesAsync request))))

(defn list-server-certificates-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServerCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServerCertificatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest request]
    (-> this (.listServerCertificatesAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listServerCertificatesAsync))))

(defn delete-login-profile-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoginProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoginProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest request]
    (-> this (.deleteLoginProfileAsync request))))

(defn get-access-key-last-used-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccessKeyLastUsed operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccessKeyLastUsedAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest request]
    (-> this (.getAccessKeyLastUsedAsync request))))

(defn list-virtual-mfa-devices-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVirtualMFADevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVirtualMFADevicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest request]
    (-> this (.listVirtualMFADevicesAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listVirtualMFADevicesAsync))))

(defn add-user-to-group-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddUserToGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AddUserToGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addUserToGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest request]
    (-> this (.addUserToGroupAsync request))))

(defn put-role-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.PutRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRolePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest request]
    (-> this (.putRolePolicyAsync request))))

(defn update-access-key-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccessKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccessKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest request]
    (-> this (.updateAccessKeyAsync request))))

(defn create-virtual-mfa-device-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVirtualMFADevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVirtualMFADeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest request]
    (-> this (.createVirtualMFADeviceAsync request))))

(defn change-password-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ChangePasswordRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ChangePassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ChangePasswordResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ChangePasswordRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changePasswordAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ChangePasswordRequest request]
    (-> this (.changePasswordAsync request))))

(defn deactivate-mfa-device-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeactivateMFADevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deactivateMFADeviceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest request]
    (-> this (.deactivateMFADeviceAsync request))))

(defn list-policy-versions-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicyVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPolicyVersionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest request]
    (-> this (.listPolicyVersionsAsync request))))

(defn list-users-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListUsersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListUsersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListUsersRequest request]
    (-> this (.listUsersAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listUsersAsync))))

(defn delete-instance-profile-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest request]
    (-> this (.deleteInstanceProfileAsync request))))

(defn list-groups-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListGroupsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListGroupsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListGroupsRequest request]
    (-> this (.listGroupsAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listGroupsAsync))))

(defn update-account-password-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccountPasswordPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountPasswordPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest request]
    (-> this (.updateAccountPasswordPolicyAsync request))))

(defn delete-group-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteGroupRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteGroupRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteGroupRequest request]
    (-> this (.deleteGroupAsync request))))

(defn get-service-linked-role-deletion-status-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceLinkedRoleDeletionStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceLinkedRoleDeletionStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest request]
    (-> this (.getServiceLinkedRoleDeletionStatusAsync request))))

(defn create-access-key-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccessKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAccessKeyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest request]
    (-> this (.createAccessKeyAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.createAccessKeyAsync))))

(defn list-open-id-connect-providers-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOpenIDConnectProviders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOpenIDConnectProvidersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest request]
    (-> this (.listOpenIDConnectProvidersAsync request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this]
    (-> this (.listOpenIDConnectProvidersAsync))))

(defn get-instance-profile-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceProfileAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest request]
    (-> this (.getInstanceProfileAsync request))))

(defn delete-service-linked-role-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServiceLinkedRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceLinkedRoleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest request]
    (-> this (.deleteServiceLinkedRoleAsync request))))

(defn update-user-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.UpdateUserRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateUserRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.UpdateUserRequest request]
    (-> this (.updateUserAsync request))))

(defn simulate-principal-policy-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SimulatePrincipalPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.simulatePrincipalPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest request]
    (-> this (.simulatePrincipalPolicyAsync request))))

(defn delete-service-specific-credential-async
  "Description copied from interface: AmazonIdentityManagementAsync

  request - `com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServiceSpecificCredential operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceSpecificCredentialAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsyncClient this ^com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest request]
    (-> this (.deleteServiceSpecificCredentialAsync request))))

