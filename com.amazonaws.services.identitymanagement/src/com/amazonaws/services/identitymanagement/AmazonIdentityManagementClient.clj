(ns com.amazonaws.services.identitymanagement.AmazonIdentityManagementClient
  "Client for accessing IAM. All service calls made using this client are blocking, and will not return until the
  service call completes.

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
  (:import [com.amazonaws.services.identitymanagement AmazonIdentityManagementClient]))

(defn ->amazon-identity-management-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to IAM (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonIdentityManagementClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonIdentityManagementClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonIdentityManagementClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonIdentityManagementClient aws-credentials client-configuration))
  (^AmazonIdentityManagementClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonIdentityManagementClient client-configuration))
  (^AmazonIdentityManagementClient []
    (new AmazonIdentityManagementClient )))

(defn *builder
  "returns: `com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder`"
  (^com.amazonaws.services.identitymanagement.AmazonIdentityManagementClientBuilder []
    (AmazonIdentityManagementClient/builder )))

(defn list-attached-user-policies
  "Lists all managed policies that are attached to the specified IAM user.


   An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the
   ListUserPolicies API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. You can use the
   PathPrefix parameter to limit the list of policies to only those matching the specified path prefix.
   If there are no policies attached to the specified group (or none that match the specified path prefix), the
   operation returns an empty list.

  request - `com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest`

  returns: Result of the ListAttachedUserPolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest request]
    (-> this (.listAttachedUserPolicies request))))

(defn delete-group
  "Deletes the specified IAM group. The group must not contain any users or have any attached policies.

  request - `com.amazonaws.services.identitymanagement.model.DeleteGroupRequest`

  returns: Result of the DeleteGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteGroupResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteGroupResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteGroupRequest request]
    (-> this (.deleteGroup request))))

(defn generate-credential-report
  "Generates a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in
   the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest`

  returns: Result of the GenerateCredentialReport operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest request]
    (-> this (.generateCredentialReport request)))
  (^com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult [^AmazonIdentityManagementClient this]
    (-> this (.generateCredentialReport))))

(defn get-context-keys-for-custom-policy
  "Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of
   one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use
   GetContextKeysForPrincipalPolicy.


   Context keys are variables maintained by AWS and its services that provide details about the context of an API
   query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use
   GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call
   SimulateCustomPolicy. Note that all parameters are shown in unencoded form here for clarity but must be
   URL encoded to be included as a part of a real HTML request.

  request - `com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest`

  returns: Result of the GetContextKeysForCustomPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest request]
    (-> this (.getContextKeysForCustomPolicy request))))

(defn get-instance-profile
  "Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and
   role. For more information about instance profiles, see About Instance Profiles in
   the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest`

  returns: Result of the GetInstanceProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest request]
    (-> this (.getInstanceProfile request))))

(defn update-group
  "Updates the name and/or the path of the specified IAM group.



   You should understand the implications of changing a group's path or name. For more information, see Renaming Users and
   Groups in the IAM User Guide.



   The person making the request (the principal), must have permission to change the role group with the old name
   and the new name. For example, to change the group named Managers to MGRs, the
   principal must have a policy that allows them to update both groups. If the principal has permission to update
   the Managers group, but not the MGRs group, then the update fails. For more information
   about permissions, see Access
   Management.

  request - `com.amazonaws.services.identitymanagement.model.UpdateGroupRequest`

  returns: Result of the UpdateGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateGroupResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateGroupResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateGroupRequest request]
    (-> this (.updateGroup request))))

(defn delete-account-alias
  "Deletes the specified AWS account alias. For information about using an AWS account alias, see Using an Alias for Your AWS Account
   ID in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest`

  returns: Result of the DeleteAccountAlias operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest request]
    (-> this (.deleteAccountAlias request))))

(defn create-account-alias
  "Creates an alias for your AWS account. For information about using an AWS account alias, see Using an Alias for Your AWS Account
   ID in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest`

  returns: Result of the CreateAccountAlias operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult`

  throws: com.amazonaws.services.identitymanagement.model.EntityAlreadyExistsException - The request was rejected because it attempted to create a resource that already exists."
  (^com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest request]
    (-> this (.createAccountAlias request))))

(defn generate-organizations-access-report
  "Generates a report for service last accessed data for AWS Organizations. You can generate a report for any
   entities (organization root, organizational unit, or account) or policies in your organization.


   To call this operation, you must be signed in using your AWS Organizations master account credentials. You can
   use your long-term IAM user or root user credentials, or temporary credentials from assuming an IAM role. SCPs
   must be enabled for your organization root. You must have the required IAM and AWS Organizations permissions. For
   more information, see Refining Permissions
   Using Service Last Accessed Data in the IAM User Guide.


   You can generate a service last accessed data report for entities by specifying only the entity's path. This data
   includes a list of services that are allowed by any service control policies (SCPs) that apply to the entity.


   You can generate a service last accessed data report for a policy by specifying an entity's path and an optional
   AWS Organizations policy ID. This data includes a list of services that are allowed by the specified SCP.


   For each service in both report types, the data includes the most recent account activity that the policy allows
   to account principals in the entity or the entity's children. For important information about the data, reporting
   period, permissions required, troubleshooting, and supported Regions see Reducing Permissions
   Using Service Last Accessed Data in the IAM User Guide.



   The data includes all attempts to access AWS, not just the successful ones. This includes all attempts that were
   made using the AWS Management Console, the AWS API through any of the SDKs, or any of the command line tools. An
   unexpected entry in the service last accessed data does not mean that an account has been compromised, because
   the request might have been denied. Refer to your CloudTrail logs as the authoritative source for information
   about all API calls and whether they were successful or denied access. For more information, see Logging IAM Events with
   CloudTrail in the IAM User Guide.



   This operation returns a JobId. Use this parameter in the
    GetOrganizationsAccessReport  operation to check the status of the report generation. To
   check the status of this request, use the JobId parameter in the
    GetOrganizationsAccessReport  operation and test the JobStatus response
   parameter. When the job is complete, you can retrieve the report.


   To generate a service last accessed data report for entities, specify an entity path without specifying the
   optional AWS Organizations policy ID. The type of entity that you specify determines the data returned in the
   report.




   Root – When you specify the organizations root as the entity, the resulting report lists all of the
   services allowed by SCPs that are attached to your root. For each service, the report includes data for all
   accounts in your organization except the master account, because the master account is not limited by SCPs.




   OU – When you specify an organizational unit (OU) as the entity, the resulting report lists all of the
   services allowed by SCPs that are attached to the OU and its parents. For each service, the report includes data
   for all accounts in the OU or its children. This data excludes the master account, because the master account is
   not limited by SCPs.




   Master account – When you specify the master account, the resulting report lists all AWS services, because
   the master account is not limited by SCPs. For each service, the report includes data for only the master
   account.




   Account – When you specify another account as the entity, the resulting report lists all of the services
   allowed by SCPs that are attached to the account and its parents. For each service, the report includes data for
   only the specified account.




   To generate a service last accessed data report for policies, specify an entity path and the optional AWS
   Organizations policy ID. The type of entity that you specify determines the data returned for each service.




   Root – When you specify the root entity and a policy ID, the resulting report lists all of the services
   that are allowed by the specified SCP. For each service, the report includes data for all accounts in your
   organization to which the SCP applies. This data excludes the master account, because the master account is not
   limited by SCPs. If the SCP is not attached to any entities in the organization, then the report will return a
   list of services with no data.




   OU – When you specify an OU entity and a policy ID, the resulting report lists all of the services that
   are allowed by the specified SCP. For each service, the report includes data for all accounts in the OU or its
   children to which the SCP applies. This means that other accounts outside the OU that are affected by the SCP
   might not be included in the data. This data excludes the master account, because the master account is not
   limited by SCPs. If the SCP is not attached to the OU or one of its children, the report will return a list of
   services with no data.




   Master account – When you specify the master account, the resulting report lists all AWS services, because
   the master account is not limited by SCPs. If you specify a policy ID in the CLI or API, the policy is ignored.
   For each service, the report includes data for only the master account.




   Account – When you specify another account entity and a policy ID, the resulting report lists all of the
   services that are allowed by the specified SCP. For each service, the report includes data for only the specified
   account. This means that other accounts in the organization that are affected by the SCP might not be included in
   the data. If the SCP is not attached to the account, the report will return a list of services with no data.





   Service last accessed data does not use other policy types when determining whether a principal could access a
   service. These other policy types include identity-based policies, resource-based policies, access control lists,
   IAM permissions boundaries, and STS assume role policies. It only applies SCP logic. For more about the
   evaluation of policy types, see Evaluating Policies in the IAM User Guide.



   For more information about service last accessed data, see Reducing Policy Scope
   by Viewing User Activity in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportRequest`

  returns: Result of the GenerateOrganizationsAccessReport operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportResult`

  throws: com.amazonaws.services.identitymanagement.model.ReportGenerationLimitExceededException - The request failed because the maximum number of concurrent requests for this account are already running."
  (^com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportRequest request]
    (-> this (.generateOrganizationsAccessReport request))))

(defn add-role-to-instance-profile
  "Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and
   this limit cannot be increased. You can remove the existing role and then add a different role to an instance
   profile. You must then wait for the change to appear across all of AWS because of eventual consistency. To force the change, you must

   disassociate the instance profile and then associate the
   instance profile, or you can stop your instance and then restart it.



   The caller of this API must be granted the PassRole permission on the IAM role by a permissions
   policy.



   For more information about roles, go to Working with Roles. For more
   information about instance profiles, go to About Instance Profiles.

  request - `com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest`

  returns: Result of the AddRoleToInstanceProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest request]
    (-> this (.addRoleToInstanceProfile request))))

(defn update-role
  "Updates the description or maximum session duration setting of a role.

  request - `com.amazonaws.services.identitymanagement.model.UpdateRoleRequest`

  returns: Result of the UpdateRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateRoleResult`

  throws: com.amazonaws.services.identitymanagement.model.UnmodifiableEntityException - The request was rejected because only the service that depends on the service-linked role can modify or delete the role on your behalf. The error message includes the name of the service that depends on this service-linked role. You must request the change through that service."
  (^com.amazonaws.services.identitymanagement.model.UpdateRoleResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateRoleRequest request]
    (-> this (.updateRole request))))

(defn attach-role-policy
  "Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the
   managed policy becomes part of the role's permission (access) policy.



   You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time
   as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy.



   Use this API to attach a managed policy to a role. To embed an inline policy in a role, use
   PutRolePolicy. For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest`

  returns: Result of the AttachRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest request]
    (-> this (.attachRolePolicy request))))

(defn get-ssh-public-key
  "Retrieves the specified SSH public key, including metadata about the key.


   The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS
   CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
   see Set up AWS
   CodeCommit for SSH Connections in the AWS CodeCommit User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest`

  returns: Result of the GetSSHPublicKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest request]
    (-> this (.getSSHPublicKey request))))

(defn put-role-policy
  "Adds or updates an inline policy document that is embedded in the specified IAM role.


   When you embed an inline policy in a role, the inline policy is used as part of the role's access (permissions)
   policy. The role's trust policy is created at the same time as the role, using CreateRole. You can update
   a role's trust policy using UpdateAssumeRolePolicy. For more information about IAM roles, go to Using Roles to Delegate Permissions
   and Federate Identities.


   A role can also have a managed policy attached to it. To attach a managed policy to a role, use
   AttachRolePolicy. To create a new managed policy, use CreatePolicy. For information about policies,
   see Managed Policies
   and Inline Policies in the IAM User Guide.


   For information about limits on the number of inline policies that you can embed with a role, see Limitations on IAM
   Entities in the IAM User Guide.



   Because policy documents can be large, you should use POST rather than GET when calling
   PutRolePolicy. For general information about using the Query API with IAM, go to Making Query Requests in the
   IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest`

  returns: Result of the PutRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.PutRolePolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.PutRolePolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest request]
    (-> this (.putRolePolicy request))))

(defn create-group
  "Creates a new group.


   For information about the number of groups you can create, see Limitations on IAM
   Entities in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.CreateGroupRequest`

  returns: Result of the CreateGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateGroupResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.CreateGroupResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateGroupRequest request]
    (-> this (.createGroup request))))

(defn waiters
  "returns: `com.amazonaws.services.identitymanagement.waiters.AmazonIdentityManagementWaiters`"
  (^com.amazonaws.services.identitymanagement.waiters.AmazonIdentityManagementWaiters [^AmazonIdentityManagementClient this]
    (-> this (.waiters))))

(defn list-service-specific-credentials
  "Returns information about the service-specific credentials associated with the specified IAM user. If none
   exists, the operation returns an empty list. The service-specific credentials returned by this operation are used
   only for authenticating the IAM user to a specific service. For more information about using service-specific
   credentials to authenticate to an AWS service, see Set Up service-specific
   credentials in the AWS CodeCommit User Guide.

  request - `com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest`

  returns: Result of the ListServiceSpecificCredentials operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest request]
    (-> this (.listServiceSpecificCredentials request))))

(defn simulate-custom-policy
  "Simulate how a set of IAM policies and optionally a resource-based policy works with a list of API operations and
   AWS resources to determine the policies' effective permissions. The policies are provided as strings.


   The simulation does not perform the API operations; it only checks the authorization to determine if the
   simulated policies allow or deny the operations.


   If you want to simulate existing policies attached to an IAM user, group, or role, use
   SimulatePrincipalPolicy instead.


   Context keys are variables maintained by AWS and its services that provide details about the context of an API
   query request. You can use the Condition element of an IAM policy to evaluate context keys. To get
   the list of context keys that the policies require for correct simulation, use
   GetContextKeysForCustomPolicy.


   If the output is long, you can use MaxItems and Marker parameters to paginate the
   results.

  request - `com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest`

  returns: Result of the SimulateCustomPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest request]
    (-> this (.simulateCustomPolicy request))))

(defn create-role
  "Creates a new role for your AWS account. For more information about roles, go to IAM Roles. For information
   about limitations on role names and the number of roles you can create, go to Limitations on IAM
   Entities in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.CreateRoleRequest`

  returns: Result of the CreateRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateRoleResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.CreateRoleResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateRoleRequest request]
    (-> this (.createRole request))))

(defn list-saml-providers
  "Lists the SAML provider resource objects defined in IAM in the account.



   This operation requires Signature Version 4.

  request - `com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest`

  returns: Result of the ListSAMLProviders operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest request]
    (-> this (.listSAMLProviders request)))
  (^com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult [^AmazonIdentityManagementClient this]
    (-> this (.listSAMLProviders))))

(defn tag-user
  "Adds one or more tags to an IAM user. If a tag with the same key name already exists, then that tag is
   overwritten with the new value.


   A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the
   following:




   Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For
   example, you could search for all resources with the key name Project and the value
   MyImportantProject. Or search for all resources with the key name Cost Center and the value
   41200.




   Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to
   restrict access to only an IAM requesting user or to a role that has a specified tag attached. You can also
   restrict access to only those resources that have a certain tag attached. For examples of policies that show how
   to use tags to control access, see Control Access Using IAM Tags in the
   IAM User Guide.




   Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.







   Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either
   case, the entire request fails and no tags are added to the role.




   AWS always interprets the tag Value as a single string. If you need to store an array, you can store
   comma-separated values in the string. However, you must interpret the value in your code.





   For more information about tagging, see Tagging IAM Identities in the IAM
   User Guide.

  request - `com.amazonaws.services.identitymanagement.model.TagUserRequest`

  returns: Result of the TagUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.TagUserResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.TagUserResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.TagUserRequest request]
    (-> this (.tagUser request))))

(defn delete-user-policy
  "Deletes the specified inline policy that is embedded in the specified IAM user.


   A user can also have managed policies attached to it. To detach a managed policy from a user, use
   DetachUserPolicy. For more information about policies, refer to Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest`

  returns: Result of the DeleteUserPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest request]
    (-> this (.deleteUserPolicy request))))

(defn update-signing-certificate
  "Changes the status of the specified user signing certificate from active to disabled, or vice versa. This
   operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow.


   If the UserName field is not specified, the user name is determined implicitly based on the AWS
   access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently,
   you can use this operation to manage AWS account root user credentials even if the AWS account has no associated
   users.

  request - `com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest`

  returns: Result of the UpdateSigningCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest request]
    (-> this (.updateSigningCertificate request))))

(defn get-role
  "Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy
   that grants permission to assume the role. For more information about roles, see Working with Roles.



   Policies returned by this API are URL-encoded compliant with RFC
   3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
   use Java, you can use the decode method of the java.net.URLDecoder utility class in the
   Java SDK. Other languages and SDKs provide similar functionality.

  request - `com.amazonaws.services.identitymanagement.model.GetRoleRequest`

  returns: Result of the GetRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetRoleResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetRoleResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetRoleRequest request]
    (-> this (.getRole request))))

(defn list-signing-certificates
  "Returns information about the signing certificates associated with the specified IAM user. If none exists, the
   operation returns an empty list.


   Although each user is limited to a small number of signing certificates, you can still paginate the results using
   the MaxItems and Marker parameters.


   If the UserName field is not specified, the user name is determined implicitly based on the AWS
   access key ID used to sign the request for this API. This operation works for access keys under the AWS account.
   Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has
   no associated users.

  request - `com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest`

  returns: Result of the ListSigningCertificates operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest request]
    (-> this (.listSigningCertificates request)))
  (^com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult [^AmazonIdentityManagementClient this]
    (-> this (.listSigningCertificates))))

(defn delete-role-permissions-boundary
  "Deletes the permissions boundary for the specified IAM role.



   Deleting the permissions boundary for a role might increase its permissions. For example, it might allow anyone
   who assumes the role to perform all the actions granted in its permissions policies.

  request - `com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryRequest`

  returns: Result of the DeleteRolePermissionsBoundary operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryRequest request]
    (-> this (.deleteRolePermissionsBoundary request))))

(defn update-user
  "Updates the name and/or the path of the specified IAM user.



   You should understand the implications of changing an IAM user's path or name. For more information, see Renaming an IAM
   User and Renaming an
   IAM Group in the IAM User Guide.



   To change a user name, the requester must have appropriate permissions on both the source object and the target
   object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and
   Robert, or must have permission on all (*). For more information about permissions, see Permissions and Policies.

  request - `com.amazonaws.services.identitymanagement.model.UpdateUserRequest`

  returns: Result of the UpdateUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateUserResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateUserResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateUserRequest request]
    (-> this (.updateUser request))))

(defn get-login-profile
  "Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned
   a password, the operation returns a 404 (NoSuchEntity) error.

  request - `com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest`

  returns: Result of the GetLoginProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetLoginProfileResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetLoginProfileResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest request]
    (-> this (.getLoginProfile request))))

(defn get-role-policy
  "Retrieves the specified inline policy document that is embedded with the specified IAM role.



   Policies returned by this API are URL-encoded compliant with RFC
   3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
   use Java, you can use the decode method of the java.net.URLDecoder utility class in the
   Java SDK. Other languages and SDKs provide similar functionality.



   An IAM role can also have managed policies attached to it. To retrieve a managed policy document that is attached
   to a role, use GetPolicy to determine the policy's default version, then use GetPolicyVersion to
   retrieve the policy document.


   For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   For more information about roles, see Using Roles to Delegate Permissions
   and Federate Identities.

  request - `com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest`

  returns: Result of the GetRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetRolePolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetRolePolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest request]
    (-> this (.getRolePolicy request))))

(defn remove-user-from-group
  "Removes the specified user from the specified group.

  request - `com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest`

  returns: Result of the RemoveUserFromGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest request]
    (-> this (.removeUserFromGroup request))))

(defn list-server-certificates
  "Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation
   returns an empty list.


   You can paginate the results using the MaxItems and Marker parameters.


   For more information about working with server certificates, see Working with Server
   Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the
   server certificates that you manage with IAM.

  request - `com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest`

  returns: Result of the ListServerCertificates operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest request]
    (-> this (.listServerCertificates request)))
  (^com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult [^AmazonIdentityManagementClient this]
    (-> this (.listServerCertificates))))

(defn list-policies-granting-service-access
  "Retrieves a list of policies that the IAM identity (user, group, or role) can use to access each specified
   service.



   This operation does not use other policy types when determining whether a resource could access a service. These
   other policy types include resource-based policies, access control lists, AWS Organizations policies, IAM
   permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic. For more
   about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.



   The list of policies returned by the operation depends on the ARN of the identity that you provide.




   User – The list of policies includes the managed and inline policies that are attached to the user
   directly. The list also includes any additional managed and inline policies that are attached to the group to
   which the user belongs.




   Group – The list of policies includes only the managed and inline policies that are attached to the group
   directly. Policies that are attached to the group’s user are not included.




   Role – The list of policies includes only the managed and inline policies that are attached to the role.




   For each managed policy, this operation returns the ARN and policy name. For each inline policy, it returns the
   policy name and the entity to which it is attached. Inline policies do not have an ARN. For more information
   about these policy types, see Managed Policies
   and Inline Policies in the IAM User Guide.


   Policies that are attached to users and roles as permissions boundaries are not returned. To view which managed
   policy is currently used to set the permissions boundary for a user or role, use the GetUser or
   GetRole operations.

  request - `com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessRequest`

  returns: Result of the ListPoliciesGrantingServiceAccess operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessRequest request]
    (-> this (.listPoliciesGrantingServiceAccess request))))

(defn remove-client-id-from-open-id-connect-provider
  "Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified
   IAM OpenID Connect (OIDC) provider resource object.


   This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not
   exist.

  request - `com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest`

  returns: Result of the RemoveClientIDFromOpenIDConnectProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest request]
    (-> this (.removeClientIDFromOpenIDConnectProvider request))))

(defn set-default-policy-version
  "Sets the specified version of the specified policy as the policy's default (operative) version.


   This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups,
   and roles that the policy is attached to, use the ListEntitiesForPolicy API.


   For information about managed policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest`

  returns: Result of the SetDefaultPolicyVersion operation returned by the service. - `com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest request]
    (-> this (.setDefaultPolicyVersion request))))

(defn detach-group-policy
  "Removes the specified managed policy from the specified IAM group.


   A group can also have inline policies embedded with it. To delete an inline policy, use the
   DeleteGroupPolicy API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest`

  returns: Result of the DetachGroupPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest request]
    (-> this (.detachGroupPolicy request))))

(defn list-role-policies
  "Lists the names of the inline policies that are embedded in the specified IAM role.


   An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a
   role, use ListAttachedRolePolicies. For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. If there are no
   inline policies embedded with the specified role, the operation returns an empty list.

  request - `com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest`

  returns: Result of the ListRolePolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest request]
    (-> this (.listRolePolicies request))))

(defn delete-service-linked-role
  "Submits a service-linked role deletion request and returns a DeletionTaskId, which you can use to
   check the status of the deletion. Before you call this operation, confirm that the role has no active sessions
   and that any resources used by the role in the linked service are deleted. If you call this operation more than
   once for the same service-linked role and an earlier deletion task is not complete, then the
   DeletionTaskId of the earlier request is returned.


   If you submit a deletion request for a service-linked role whose linked service is still accessing a resource,
   then the deletion task fails. If it fails, the GetServiceLinkedRoleDeletionStatus API operation returns
   the reason for the failure, usually including the resources that must be deleted. To delete the service-linked
   role, you must first remove those resources from the linked service and then submit the deletion request again.
   Resources are specific to the service that is linked to the role. For more information about removing resources
   from a service, see the AWS documentation for your service.


   For more information about service-linked roles, see Roles Terms and Concepts: AWS Service-Linked Role in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest`

  returns: Result of the DeleteServiceLinkedRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest request]
    (-> this (.deleteServiceLinkedRole request))))

(defn list-attached-group-policies
  "Lists all managed policies that are attached to the specified IAM group.


   An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the
   ListGroupPolicies API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. You can use the
   PathPrefix parameter to limit the list of policies to only those matching the specified path prefix.
   If there are no policies attached to the specified group (or none that match the specified path prefix), the
   operation returns an empty list.

  request - `com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest`

  returns: Result of the ListAttachedGroupPolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest request]
    (-> this (.listAttachedGroupPolicies request))))

(defn update-service-specific-credential
  "Sets the status of a service-specific credential to Active or Inactive.
   Service-specific credentials that are inactive cannot be used for authentication to the service. This operation
   can be used to disable a user's service-specific credential as part of a credential rotation work flow.

  request - `com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest`

  returns: Result of the UpdateServiceSpecificCredential operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest request]
    (-> this (.updateServiceSpecificCredential request))))

(defn simulate-principal-policy
  "Simulate how a set of IAM policies attached to an IAM entity works with a list of API operations and AWS
   resources to determine the policies' effective permissions. The entity can be an IAM user, group, or role. If you
   specify a user, then the simulation also includes all of the policies that are attached to groups that the user
   belongs to.


   You can optionally include a list of one or more additional policies specified as strings to include in the
   simulation. If you want to simulate only policies specified as strings, use SimulateCustomPolicy instead.


   You can also optionally include one resource-based policy to be evaluated with each of the resources included in
   the simulation.


   The simulation does not perform the API operations; it only checks the authorization to determine if the
   simulated policies allow or deny the operations.


   Note: This API discloses information about the permissions granted to other users. If you do not want
   users to see other user's permissions, then consider allowing them to use SimulateCustomPolicy instead.


   Context keys are variables maintained by AWS and its services that provide details about the context of an API
   query request. You can use the Condition element of an IAM policy to evaluate context keys. To get
   the list of context keys that the policies require for correct simulation, use
   GetContextKeysForPrincipalPolicy.


   If the output is long, you can use the MaxItems and Marker parameters to paginate the
   results.

  request - `com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest`

  returns: Result of the SimulatePrincipalPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest request]
    (-> this (.simulatePrincipalPolicy request))))

(defn update-server-certificate
  "Updates the name and/or the path of the specified server certificate stored in IAM.


   For more information about working with server certificates, see Working with Server
   Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the
   server certificates that you manage with IAM.



   You should understand the implications of changing a server certificate's path or name. For more information, see
   Renaming a Server Certificate in the IAM User Guide.



   The person making the request (the principal), must have permission to change the server certificate with the old
   name and the new name. For example, to change the certificate named ProductionCert to
   ProdCert, the principal must have a policy that allows them to update both certificates. If the
   principal has permission to update the ProductionCert group, but not the ProdCert
   certificate, then the update fails. For more information about permissions, see Access Management in the IAM User
   Guide.

  request - `com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest`

  returns: Result of the UpdateServerCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest request]
    (-> this (.updateServerCertificate request))))

(defn delete-server-certificate
  "Deletes the specified server certificate.


   For more information about working with server certificates, see Working with Server
   Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the
   server certificates that you manage with IAM.



   If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have
   implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates,
   it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We
   recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command
   to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference.

  request - `com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest`

  returns: Result of the DeleteServerCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest request]
    (-> this (.deleteServerCertificate request))))

(defn delete-group-policy
  "Deletes the specified inline policy that is embedded in the specified IAM group.


   A group can also have managed policies attached to it. To detach a managed policy from a group, use
   DetachGroupPolicy. For more information about policies, refer to Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest`

  returns: Result of the DeleteGroupPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest request]
    (-> this (.deleteGroupPolicy request))))

(defn create-saml-provider
  "Creates an IAM resource that describes an identity provider (IdP) that supports SAML 2.0.


   The SAML provider resource that you create with this operation can be used as a principal in an IAM role's trust
   policy. Such a policy can enable federated users who sign in using the SAML IdP to assume the role. You can
   create an IAM role that supports Web-based single sign-on (SSO) to the AWS Management Console or one that
   supports API access to AWS.


   When you create the SAML provider resource, you upload a SAML metadata document that you get from your IdP. That
   document includes the issuer's name, expiration information, and keys that can be used to validate the SAML
   authentication response (assertions) that the IdP sends. You must generate the metadata document using the
   identity management software that is used as your organization's IdP.



   This operation requires Signature Version 4.



   For more information, see Enabling SAML
   2.0 Federated Users to Access the AWS Management Console and About SAML 2.0-based
   Federation in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest`

  returns: Result of the CreateSAMLProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest request]
    (-> this (.createSAMLProvider request))))

(defn list-instance-profiles
  "Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an
   empty list. For more information about instance profiles, go to About Instance Profiles.


   You can paginate the results using the MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest`

  returns: Result of the ListInstanceProfiles operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest request]
    (-> this (.listInstanceProfiles request)))
  (^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult [^AmazonIdentityManagementClient this]
    (-> this (.listInstanceProfiles))))

(defn attach-group-policy
  "Attaches the specified managed policy to the specified IAM group.


   You use this API to attach a managed policy to a group. To embed an inline policy in a group, use
   PutGroupPolicy.


   For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest`

  returns: Result of the AttachGroupPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest request]
    (-> this (.attachGroupPolicy request))))

(defn tag-role
  "Adds one or more tags to an IAM role. The role can be a regular role or a service-linked role. If a tag with the
   same key name already exists, then that tag is overwritten with the new value.


   A tag consists of a key name and an associated value. By assigning tags to your resources, you can do the
   following:




   Administrative grouping and discovery - Attach tags to resources to aid in organization and search. For
   example, you could search for all resources with the key name Project and the value
   MyImportantProject. Or search for all resources with the key name Cost Center and the value
   41200.




   Access control - Reference tags in IAM user-based and resource-based policies. You can use tags to
   restrict access to only an IAM user or role that has a specified tag attached. You can also restrict access to
   only those resources that have a certain tag attached. For examples of policies that show how to use tags to
   control access, see Control Access
   Using IAM Tags in the IAM User Guide.




   Cost allocation - Use tags to help track which individuals and teams are using which AWS resources.







   Make sure that you have no invalid tags and that you do not exceed the allowed number of tags per role. In either
   case, the entire request fails and no tags are added to the role.




   AWS always interprets the tag Value as a single string. If you need to store an array, you can store
   comma-separated values in the string. However, you must interpret the value in your code.





   For more information about tagging, see Tagging IAM Identities in the IAM
   User Guide.

  request - `com.amazonaws.services.identitymanagement.model.TagRoleRequest`

  returns: Result of the TagRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.TagRoleResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.TagRoleResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.TagRoleRequest request]
    (-> this (.tagRole request))))

(defn list-users
  "Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns
   all users in the AWS account. If there are none, the operation returns an empty list.


   You can paginate the results using the MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.ListUsersRequest`

  returns: Result of the ListUsers operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListUsersResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.ListUsersResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListUsersRequest request]
    (-> this (.listUsers request)))
  (^com.amazonaws.services.identitymanagement.model.ListUsersResult [^AmazonIdentityManagementClient this]
    (-> this (.listUsers))))

(defn get-account-password-policy
  "Retrieves the password policy for the AWS account. For more information about using a password policy, go to Managing an IAM
   Password Policy.

  request - `com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest`

  returns: Result of the GetAccountPasswordPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest request]
    (-> this (.getAccountPasswordPolicy request)))
  (^com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult [^AmazonIdentityManagementClient this]
    (-> this (.getAccountPasswordPolicy))))

(defn detach-role-policy
  "Removes the specified managed policy from the specified role.


   A role can also have inline policies embedded with it. To delete an inline policy, use the
   DeleteRolePolicy API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest`

  returns: Result of the DetachRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest request]
    (-> this (.detachRolePolicy request))))

(defn create-virtual-mfa-device
  "Creates a new virtual MFA device for the AWS account. After creating the virtual MFA, use EnableMFADevice
   to attach the MFA device to an IAM user. For more information about creating and working with virtual MFA
   devices, go to Using a Virtual
   MFA Device in the IAM User Guide.


   For information about limits on the number of MFA devices you can create, see Limitations on Entities in
   the IAM User Guide.



   The seed information contained in the QR code and the Base32 string should be treated like any other secret
   access information. In other words, protect the seed information as you would your AWS access keys or your
   passwords. After you provision your virtual device, you should ensure that the information is destroyed following
   secure procedures.

  request - `com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest`

  returns: Result of the CreateVirtualMFADevice operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest request]
    (-> this (.createVirtualMFADevice request))))

(defn upload-signing-certificate
  "Uploads an X.509 signing certificate and associates it with the specified IAM user. Some AWS services use X.509
   signing certificates to validate requests that are signed with a corresponding private key. When you upload the
   certificate, its default status is Active.


   If the UserName is not specified, the IAM user name is determined implicitly based on the AWS access
   key ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you
   can use this operation to manage AWS account root user credentials even if the AWS account has no associated
   users.



   Because the body of an X.509 certificate can be large, you should use POST rather than GET when calling
   UploadSigningCertificate. For information about setting up signatures and authorization through the
   API, go to Signing AWS API
   Requests in the AWS General Reference. For general information about using the Query API with IAM, go
   to Making Query Requests in
   the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest`

  returns: Result of the UploadSigningCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest request]
    (-> this (.uploadSigningCertificate request))))

(defn update-account-password-policy
  "Updates the password policy settings for the AWS account.





   This operation does not support partial updates. No parameters are required, but if you do not specify a
   parameter, that parameter's value reverts to its default value. See the Request Parameters section for
   each parameter's default value. Also note that some parameters do not allow the default parameter to be
   explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the
   operation.





   For more information about using a password policy, see Managing an IAM
   Password Policy in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest`

  returns: Result of the UpdateAccountPasswordPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest request]
    (-> this (.updateAccountPasswordPolicy request))))

(defn create-login-profile
  "Creates a password for the specified user, giving the user the ability to access AWS services through the AWS
   Management Console. For more information about managing passwords, see Managing Passwords in the
   IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest`

  returns: Result of the CreateLoginProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult`

  throws: com.amazonaws.services.identitymanagement.model.EntityAlreadyExistsException - The request was rejected because it attempted to create a resource that already exists."
  (^com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest request]
    (-> this (.createLoginProfile request))))

(defn create-user
  "Creates a new IAM user for your AWS account.


   For information about limitations on the number of IAM users you can create, see Limitations on IAM
   Entities in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.CreateUserRequest`

  returns: Result of the CreateUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateUserResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.CreateUserResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateUserRequest request]
    (-> this (.createUser request))))

(defn create-service-specific-credential
  "Generates a set of credentials consisting of a user name and password that can be used to access the service
   specified in the request. These credentials are generated by IAM, and can be used only for the specified service.


   You can have a maximum of two sets of service-specific credentials for each supported service per user.


   The only supported service at this time is AWS CodeCommit.


   You can reset the password to a new service-generated value by calling ResetServiceSpecificCredential.


   For more information about service-specific credentials, see Using IAM with AWS
   CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest`

  returns: Result of the CreateServiceSpecificCredential operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest request]
    (-> this (.createServiceSpecificCredential request))))

(defn delete-user
  "Deletes the specified IAM user. Unlike the AWS Management Console, when you delete a user programmatically, you
   must delete the items attached to the user manually, or the deletion fails. For more information, see Deleting an
   IAM User. Before attempting to delete a user, remove the following items:




   Password (DeleteLoginProfile)




   Access keys (DeleteAccessKey)




   Signing certificate (DeleteSigningCertificate)




   SSH public key (DeleteSSHPublicKey)




   Git credentials (DeleteServiceSpecificCredential)




   Multi-factor authentication (MFA) device (DeactivateMFADevice, DeleteVirtualMFADevice)




   Inline policies (DeleteUserPolicy)




   Attached managed policies (DetachUserPolicy)




   Group memberships (RemoveUserFromGroup)

  request - `com.amazonaws.services.identitymanagement.model.DeleteUserRequest`

  returns: Result of the DeleteUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteUserResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.DeleteUserResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteUserRequest request]
    (-> this (.deleteUser request))))

(defn list-user-policies
  "Lists the names of the inline policies embedded in the specified IAM user.


   An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a
   user, use ListAttachedUserPolicies. For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. If there are no
   inline policies embedded with the specified user, the operation returns an empty list.

  request - `com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest`

  returns: Result of the ListUserPolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest request]
    (-> this (.listUserPolicies request))))

(defn delete-role-policy
  "Deletes the specified inline policy that is embedded in the specified IAM role.


   A role can also have managed policies attached to it. To detach a managed policy from a role, use
   DetachRolePolicy. For more information about policies, refer to Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest`

  returns: Result of the DeleteRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest request]
    (-> this (.deleteRolePolicy request))))

(defn generate-service-last-accessed-details
  "Generates a report that includes details about when an IAM resource (user, group, role, or policy) was last used
   in an attempt to access AWS services. Recent activity usually appears within four hours. IAM reports activity for
   the last 365 days, or less if your Region began supporting this feature within the last year. For more
   information, see Regions Where Data Is Tracked.



   The service last accessed data includes all attempts to access an AWS API, not just the successful ones. This
   includes all attempts that were made using the AWS Management Console, the AWS API through any of the SDKs, or
   any of the command line tools. An unexpected entry in the service last accessed data does not mean that your
   account has been compromised, because the request might have been denied. Refer to your CloudTrail logs as the
   authoritative source for information about all API calls and whether they were successful or denied access. For
   more information, see Logging IAM Events with
   CloudTrail in the IAM User Guide.



   The GenerateServiceLastAccessedDetails operation returns a JobId. Use this parameter in
   the following operations to retrieve the following details from your report:




   GetServiceLastAccessedDetails – Use this operation for users, groups, roles, or policies to list every AWS
   service that the resource could access using permissions policies. For each service, the response includes
   information about the most recent access attempt.




   GetServiceLastAccessedDetailsWithEntities – Use this operation for groups and policies to list information
   about the associated entities (users or roles) that attempted to access a specific AWS service.




   To check the status of the GenerateServiceLastAccessedDetails request, use the JobId
   parameter in the same operations and test the JobStatus response parameter.


   For additional information about the permissions policies that allow an identity (user, group, or role) to access
   specific services, use the ListPoliciesGrantingServiceAccess operation.



   Service last accessed data does not use other policy types when determining whether a resource could access a
   service. These other policy types include resource-based policies, access control lists, AWS Organizations
   policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic.
   For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.



   For more information about service last accessed data, see Reducing Policy Scope
   by Viewing User Activity in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsRequest`

  returns: Result of the GenerateServiceLastAccessedDetails operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsRequest request]
    (-> this (.generateServiceLastAccessedDetails request))))

(defn list-open-id-connect-providers
  "Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.

  request - `com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest`

  returns: Result of the ListOpenIDConnectProviders operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest request]
    (-> this (.listOpenIDConnectProviders request)))
  (^com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult [^AmazonIdentityManagementClient this]
    (-> this (.listOpenIDConnectProviders))))

(defn delete-login-profile
  "Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services
   through the AWS Management Console.



   Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the
   API. To prevent all user access, you must also either make any access keys inactive or delete them. For more
   information about making keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.

  request - `com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest`

  returns: Result of the DeleteLoginProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult`

  throws: com.amazonaws.services.identitymanagement.model.EntityTemporarilyUnmodifiableException - The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user name that was deleted and then recreated. The error indicates that the request is likely to succeed if you try again after waiting several minutes. The error message describes the entity."
  (^com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest request]
    (-> this (.deleteLoginProfile request))))

(defn upload-server-certificate
  "Uploads a server certificate entity for the AWS account. The server certificate entity includes a public key
   certificate, a private key, and an optional certificate chain, which should all be PEM-encoded.


   We recommend that you use AWS Certificate Manager to provision,
   manage, and deploy your server certificates. With ACM you can request a certificate, deploy it to AWS resources,
   and let ACM handle certificate renewals for you. Certificates provided by ACM are free. For more information
   about using ACM, see the AWS Certificate Manager User
   Guide.


   For more information about working with server certificates, see Working with Server
   Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server
   certificates that you manage with IAM.


   For information about the number of server certificates you can upload, see Limitations on IAM Entities and
   Objects in the IAM User Guide.



   Because the body of the public key certificate, private key, and the certificate chain can be large, you should
   use POST rather than GET when calling UploadServerCertificate. For information about setting up
   signatures and authorization through the API, go to Signing AWS API Requests
   in the AWS General Reference. For general information about using the Query API with IAM, go to Calling the API by Making HTTP Query
   Requests in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest`

  returns: Result of the UploadServerCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest request]
    (-> this (.uploadServerCertificate request))))

(defn delete-account-password-policy
  "Deletes the password policy for the AWS account. There are no parameters.

  request - `com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest`

  returns: Result of the DeleteAccountPasswordPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest request]
    (-> this (.deleteAccountPasswordPolicy request)))
  (^com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult [^AmazonIdentityManagementClient this]
    (-> this (.deleteAccountPasswordPolicy))))

(defn create-open-id-connect-provider
  "Creates an IAM entity to describe an identity provider (IdP) that supports OpenID Connect (OIDC).


   The OIDC provider that you create with this operation can be used as a principal in a role's trust policy. Such a
   policy establishes a trust relationship between AWS and the OIDC provider.


   When you create the IAM OIDC provider, you specify the following:




   The URL of the OIDC identity provider (IdP) to trust




   A list of client IDs (also known as audiences) that identify the application or applications that are allowed to
   authenticate using the OIDC provider




   A list of thumbprints of the server certificate(s) that the IdP uses




   You get all of this information from the OIDC IdP that you want to use to access AWS.



   The trust for the OIDC provider is derived from the IAM provider that this operation creates. Therefore, it is
   best to limit access to the CreateOpenIDConnectProvider operation to highly privileged users.

  request - `com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest`

  returns: Result of the CreateOpenIDConnectProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest request]
    (-> this (.createOpenIDConnectProvider request))))

(defn create-policy-version
  "Creates a new version of the specified managed policy. To update a managed policy, you create a new policy
   version. A managed policy can have up to five versions. If the policy has five versions, you must delete an
   existing version using DeletePolicyVersion before you create a new version.


   Optionally, you can set the new version as the policy's default version. The default version is the version that
   is in effect for the IAM users, groups, and roles to which the policy is attached.


   For more information about managed policy versions, see Versioning for Managed
   Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest`

  returns: Result of the CreatePolicyVersion operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest request]
    (-> this (.createPolicyVersion request))))

(defn deactivate-mfa-device
  "Deactivates the specified MFA device and removes it from association with the user name for which it was
   originally enabled.


   For more information about creating and working with virtual MFA devices, go to Enabling a Virtual Multi-factor
   Authentication (MFA) Device in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest`

  returns: Result of the DeactivateMFADevice operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult`

  throws: com.amazonaws.services.identitymanagement.model.EntityTemporarilyUnmodifiableException - The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user name that was deleted and then recreated. The error indicates that the request is likely to succeed if you try again after waiting several minutes. The error message describes the entity."
  (^com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest request]
    (-> this (.deactivateMFADevice request))))

(defn resync-mfa-device
  "Synchronizes the specified MFA device with its IAM resource object on the AWS servers.


   For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in
   the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest`

  returns: Result of the ResyncMFADevice operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidAuthenticationCodeException - The request was rejected because the authentication code was not recognized. The error message describes the specific error."
  (^com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest request]
    (-> this (.resyncMFADevice request))))

(defn update-role-description
  "Use UpdateRole instead.


   Modifies only the description of a role. This operation performs the same function as the
   Description parameter in the UpdateRole operation.

  request - `com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest`

  returns: Result of the UpdateRoleDescription operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest request]
    (-> this (.updateRoleDescription request))))

(defn list-groups-for-user
  "Lists the IAM groups that the specified IAM user belongs to.


   You can paginate the results using the MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest`

  returns: Result of the ListGroupsForUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest request]
    (-> this (.listGroupsForUser request))))

(defn set-security-token-service-preferences
  "Sets the specified version of the global endpoint token as the token version used for the AWS account.


   By default, AWS Security Token Service (STS) is available as a global service, and all STS requests go to a
   single endpoint at https://sts.amazonaws.com. AWS recommends using Regional STS endpoints to reduce
   latency, build in redundancy, and increase session token availability. For information about Regional endpoints
   for STS, see AWS Regions and
   Endpoints in the AWS General Reference.


   If you make an STS call to the global endpoint, the resulting session tokens might be valid in some Regions but
   not others. It depends on the version that is set in this operation. Version 1 tokens are valid only in AWS
   Regions that are available by default. These tokens do not work in manually enabled Regions, such as Asia Pacific
   (Hong Kong). Version 2 tokens are valid in all Regions. However, version 2 tokens are longer and might affect
   systems where you temporarily store tokens. For information, see Activating and
   Deactivating STS in an AWS Region in the IAM User Guide.


   To view the current session token version, see the GlobalEndpointTokenVersion entry in the response
   of the GetAccountSummary operation.

  request - `com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesRequest`

  returns: Result of the SetSecurityTokenServicePreferences operation returned by the service. - `com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesRequest request]
    (-> this (.setSecurityTokenServicePreferences request))))

(defn untag-role
  "Removes the specified tags from the role. For more information about tagging, see Tagging IAM Identities in the IAM
   User Guide.

  request - `com.amazonaws.services.identitymanagement.model.UntagRoleRequest`

  returns: Result of the UntagRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UntagRoleResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UntagRoleResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UntagRoleRequest request]
    (-> this (.untagRole request))))

(defn list-access-keys
  "Returns information about the access key IDs associated with the specified IAM user. If there is none, the
   operation returns an empty list.


   Although each user is limited to a small number of keys, you can still paginate the results using the
   MaxItems and Marker parameters.


   If the UserName field is not specified, the user name is determined implicitly based on the AWS
   access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently,
   you can use this operation to manage AWS account root user credentials even if the AWS account has no associated
   users.



   To ensure the security of your AWS account, the secret access key is accessible only during key and user
   creation.

  request - `com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest`

  returns: Result of the ListAccessKeys operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListAccessKeysResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListAccessKeysResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest request]
    (-> this (.listAccessKeys request)))
  (^com.amazonaws.services.identitymanagement.model.ListAccessKeysResult [^AmazonIdentityManagementClient this]
    (-> this (.listAccessKeys))))

(defn delete-policy-version
  "Deletes the specified version from the specified managed policy.


   You cannot delete the default version from a policy using this API. To delete the default version from a policy,
   use DeletePolicy. To find out which version of a policy is marked as the default version, use
   ListPolicyVersions.


   For information about versions for managed policies, see Versioning for Managed
   Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest`

  returns: Result of the DeletePolicyVersion operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest request]
    (-> this (.deletePolicyVersion request))))

(defn delete-policy
  "Deletes the specified managed policy.


   Before you can delete a managed policy, you must first detach the policy from all users, groups, and roles that
   it is attached to. In addition, you must delete all the policy's versions. The following steps describe the
   process for deleting a managed policy:




   Detach the policy from all users, groups, and roles that the policy is attached to, using the
   DetachUserPolicy, DetachGroupPolicy, or DetachRolePolicy API operations. To list all the
   users, groups, and roles that a policy is attached to, use ListEntitiesForPolicy.




   Delete all versions of the policy using DeletePolicyVersion. To list the policy's versions, use
   ListPolicyVersions. You cannot use DeletePolicyVersion to delete the version that is marked as the
   default version. You delete the policy's default version in the next step of the process.




   Delete the policy (this automatically deletes the policy's default version) using this API.




   For information about managed policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeletePolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeletePolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeletePolicyRequest request]
    (-> this (.deletePolicy request))))

(defn change-password
  "Changes the password of the IAM user who is calling this operation. The AWS account root user password is not
   affected by this operation.


   To change the password for a different user, see UpdateLoginProfile. For more information about modifying
   passwords, see Managing
   Passwords in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.ChangePasswordRequest`

  returns: Result of the ChangePassword operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ChangePasswordResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ChangePasswordResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ChangePasswordRequest request]
    (-> this (.changePassword request))))

(defn list-role-tags
  "Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more
   information about tagging, see Tagging
   IAM Identities in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.ListRoleTagsRequest`

  returns: Result of the ListRoleTags operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListRoleTagsResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListRoleTagsResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListRoleTagsRequest request]
    (-> this (.listRoleTags request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonIdentityManagementClient this]
    (-> this (.shutdown))))

(defn get-account-authorization-details
  "Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their
   relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users,
   groups, roles, and policies) in your account.



   Policies returned by this API are URL-encoded compliant with RFC
   3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
   use Java, you can use the decode method of the java.net.URLDecoder utility class in the
   Java SDK. Other languages and SDKs provide similar functionality.



   You can optionally filter the results using the Filter parameter. You can paginate the results using
   the MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest`

  returns: Result of the GetAccountAuthorizationDetails operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest request]
    (-> this (.getAccountAuthorizationDetails request)))
  (^com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult [^AmazonIdentityManagementClient this]
    (-> this (.getAccountAuthorizationDetails))))

(defn get-user
  "Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN.


   If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to
   sign the request to this API.

  request - `com.amazonaws.services.identitymanagement.model.GetUserRequest`

  returns: Result of the GetUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetUserResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetUserResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetUserRequest request]
    (-> this (.getUser request)))
  (^com.amazonaws.services.identitymanagement.model.GetUserResult [^AmazonIdentityManagementClient this]
    (-> this (.getUser))))

(defn delete-service-specific-credential
  "Deletes the specified service-specific credential.

  request - `com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest`

  returns: Result of the DeleteServiceSpecificCredential operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest request]
    (-> this (.deleteServiceSpecificCredential request))))

(defn get-service-last-accessed-details
  "Retrieves a service last accessed report that was created using the
   GenerateServiceLastAccessedDetails operation. You can use the JobId parameter in
   GetServiceLastAccessedDetails to retrieve the status of your report job. When the report is
   complete, you can retrieve the generated report. The report includes a list of AWS services that the resource
   (user, group, role, or managed policy) can access.



   Service last accessed data does not use other policy types when determining whether a resource could access a
   service. These other policy types include resource-based policies, access control lists, AWS Organizations
   policies, IAM permissions boundaries, and AWS STS assume role policies. It only applies permissions policy logic.
   For more about the evaluation of policy types, see Evaluating Policies in the IAM User Guide.



   For each service that the resource could access using permissions policies, the operation returns details about
   the most recent access attempt. If there was no attempt, the service is listed without details about the most
   recent attempt to access the service. If the operation fails, the GetServiceLastAccessedDetails
   operation returns the reason that it failed.


   The GetServiceLastAccessedDetails operation returns a list of services. This list includes the
   number of entities that have attempted to access the service and the date and time of the last attempt. It also
   returns the ARN of the following entity, depending on the resource ARN that you used to generate the report:




   User – Returns the user ARN that you used to generate the report




   Group – Returns the ARN of the group member (user) that last attempted to access the service




   Role – Returns the role ARN that you used to generate the report




   Policy – Returns the ARN of the user or role that last used the policy to attempt to access the service




   By default, the list is sorted by service namespace.

  request - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsRequest`

  returns: Result of the GetServiceLastAccessedDetails operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsRequest request]
    (-> this (.getServiceLastAccessedDetails request))))

(defn list-virtual-mfa-devices
  "Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an
   assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be
   Assigned, Unassigned, or Any.


   You can paginate the results using the MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest`

  returns: Result of the ListVirtualMFADevices operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult`"
  (^com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest request]
    (-> this (.listVirtualMFADevices request)))
  (^com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult [^AmazonIdentityManagementClient this]
    (-> this (.listVirtualMFADevices))))

(defn delete-user-permissions-boundary
  "Deletes the permissions boundary for the specified IAM user.



   Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all
   the actions granted in its permissions policies.

  request - `com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryRequest`

  returns: Result of the DeleteUserPermissionsBoundary operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryRequest request]
    (-> this (.deleteUserPermissionsBoundary request))))

(defn get-policy
  "Retrieves information about the specified managed policy, including the policy's default version and the total
   number of IAM users, groups, and roles to which the policy is attached. To retrieve the list of the specific
   users, groups, and roles that the policy is attached to, use the ListEntitiesForPolicy API. This API
   returns metadata about the policy. To retrieve the actual policy document for a specific version of the policy,
   use GetPolicyVersion.


   This API retrieves information about managed policies. To retrieve information about an inline policy that is
   embedded with an IAM user, group, or role, use the GetUserPolicy, GetGroupPolicy, or
   GetRolePolicy API.


   For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetPolicyRequest request]
    (-> this (.getPolicy request))))

(defn remove-role-from-instance-profile
  "Removes the specified IAM role from the specified EC2 instance profile.



   Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the
   instance profile. Removing a role from an instance profile that is associated with a running instance might break
   any applications running on the instance.



   For more information about IAM roles, go to Working with Roles. For more
   information about instance profiles, go to About Instance Profiles.

  request - `com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest`

  returns: Result of the RemoveRoleFromInstanceProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest request]
    (-> this (.removeRoleFromInstanceProfile request))))

(defn list-policy-versions
  "Lists information about the versions of the specified managed policy, including the version that is currently set
   as the policy's default version.


   For more information about managed policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest`

  returns: Result of the ListPolicyVersions operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest request]
    (-> this (.listPolicyVersions request))))

(defn upload-ssh-public-key
  "Uploads an SSH public key and associates it with the specified IAM user.


   The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an
   AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit
   repository, see Set up AWS
   CodeCommit for SSH Connections in the AWS CodeCommit User Guide.

  request - `com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest`

  returns: Result of the UploadSSHPublicKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest request]
    (-> this (.uploadSSHPublicKey request))))

(defn delete-access-key
  "Deletes the access key pair associated with the specified IAM user.


   If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
   the request. This operation works for access keys under the AWS account. Consequently, you can use this operation
   to manage AWS account root user credentials even if the AWS account has no associated users.

  request - `com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest`

  returns: Result of the DeleteAccessKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest request]
    (-> this (.deleteAccessKey request))))

(defn get-service-linked-role-deletion-status
  "Retrieves the status of your service-linked role deletion. After you use the DeleteServiceLinkedRole API
   operation to submit a service-linked role for deletion, you can use the DeletionTaskId parameter in
   GetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the deletion fails, this
   operation returns the reason that it failed, if that information is returned by the service.

  request - `com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest`

  returns: Result of the GetServiceLinkedRoleDeletionStatus operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest request]
    (-> this (.getServiceLinkedRoleDeletionStatus request))))

(defn delete-ssh-public-key
  "Deletes the specified SSH public key.


   The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS
   CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
   see Set up AWS
   CodeCommit for SSH Connections in the AWS CodeCommit User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest`

  returns: Result of the DeleteSSHPublicKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest request]
    (-> this (.deleteSSHPublicKey request))))

(defn list-account-aliases
  "Lists the account alias associated with the AWS account (Note: you can have only one). For information about
   using an AWS account alias, see Using an Alias for Your AWS Account
   ID in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest`

  returns: Result of the ListAccountAliases operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest request]
    (-> this (.listAccountAliases request)))
  (^com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult [^AmazonIdentityManagementClient this]
    (-> this (.listAccountAliases))))

(defn list-entities-for-policy
  "Lists all IAM users, groups, and roles that the specified managed policy is attached to.


   You can use the optional EntityFilter parameter to limit the results to a particular type of entity
   (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set
   EntityFilter to Role.


   You can paginate the results using the MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest`

  returns: Result of the ListEntitiesForPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest request]
    (-> this (.listEntitiesForPolicy request))))

(defn update-access-key
  "Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used
   to disable a user's key as part of a key rotation workflow.


   If the UserName is not specified, the user name is determined implicitly based on the AWS access key
   ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can
   use this operation to manage AWS account root user credentials even if the AWS account has no associated users.


   For information about rotating keys, see Managing Keys and
   Certificates in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest`

  returns: Result of the UpdateAccessKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest request]
    (-> this (.updateAccessKey request))))

(defn put-user-policy
  "Adds or updates an inline policy document that is embedded in the specified IAM user.


   An IAM user can also have a managed policy attached to it. To attach a managed policy to a user, use
   AttachUserPolicy. To create a new managed policy, use CreatePolicy. For information about policies,
   see Managed Policies
   and Inline Policies in the IAM User Guide.


   For information about limits on the number of inline policies that you can embed in a user, see Limitations on IAM
   Entities in the IAM User Guide.



   Because policy documents can be large, you should use POST rather than GET when calling
   PutUserPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the
   IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest`

  returns: Result of the PutUserPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.PutUserPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.PutUserPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest request]
    (-> this (.putUserPolicy request))))

(defn update-open-id-connect-provider-thumbprint
  "Replaces the existing list of server certificate thumbprints associated with an OpenID Connect (OIDC) provider
   resource object with a new list of thumbprints.


   The list that you pass with this operation completely replaces the existing list of thumbprints. (The lists are
   not merged.)


   Typically, you need to update a thumbprint only when the identity provider's certificate changes, which occurs
   rarely. However, if the provider's certificate does change, any attempt to assume an IAM role that
   specifies the OIDC provider as a principal fails until the certificate thumbprint is updated.



   Trust for the OIDC provider is derived from the provider's certificate and is validated by the thumbprint.
   Therefore, it is best to limit access to the UpdateOpenIDConnectProviderThumbprint operation to
   highly privileged users.

  request - `com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest`

  returns: Result of the UpdateOpenIDConnectProviderThumbprint operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest request]
    (-> this (.updateOpenIDConnectProviderThumbprint request))))

(defn delete-open-id-connect-provider
  "Deletes an OpenID Connect identity provider (IdP) resource object in IAM.


   Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in
   their trust policies. Any attempt to assume a role that references a deleted provider fails.


   This operation is idempotent; it does not fail or return an error if you call the operation for a provider that
   does not exist.

  request - `com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest`

  returns: Result of the DeleteOpenIDConnectProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest request]
    (-> this (.deleteOpenIDConnectProvider request))))

(defn get-context-keys-for-principal-policy
  "Gets a list of all of the context keys referenced in all the IAM policies that are attached to the specified IAM
   entity. The entity can be an IAM user, group, or role. If you specify a user, then the request also includes all
   of the policies attached to groups that the user is a member of.


   You can optionally include a list of one or more additional policies, specified as strings. If you want to
   include only a list of policies by string, use GetContextKeysForCustomPolicy instead.


   Note: This API discloses information about the permissions granted to other users. If you do not want
   users to see other user's permissions, then consider allowing them to use GetContextKeysForCustomPolicy
   instead.


   Context keys are variables maintained by AWS and its services that provide details about the context of an API
   query request. Context keys can be evaluated by testing against a value in an IAM policy. Use
   GetContextKeysForPrincipalPolicy to understand what key names and values you must supply when you call
   SimulatePrincipalPolicy.

  request - `com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest`

  returns: Result of the GetContextKeysForPrincipalPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest request]
    (-> this (.getContextKeysForPrincipalPolicy request))))

(defn detach-user-policy
  "Removes the specified managed policy from the specified user.


   A user can also have inline policies embedded with it. To delete an inline policy, use the
   DeleteUserPolicy API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest`

  returns: Result of the DetachUserPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest request]
    (-> this (.detachUserPolicy request))))

(defn attach-user-policy
  "Attaches the specified managed policy to the specified user.


   You use this API to attach a managed policy to a user. To embed an inline policy in a user, use
   PutUserPolicy.


   For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest`

  returns: Result of the AttachUserPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest request]
    (-> this (.attachUserPolicy request))))

(defn put-group-policy
  "Adds or updates an inline policy document that is embedded in the specified IAM group.


   A user can also have managed policies attached to it. To attach a managed policy to a group, use
   AttachGroupPolicy. To create a new managed policy, use CreatePolicy. For information about
   policies, see Managed
   Policies and Inline Policies in the IAM User Guide.


   For information about limits on the number of inline policies that you can embed in a group, see Limitations on IAM
   Entities in the IAM User Guide.



   Because policy documents can be large, you should use POST rather than GET when calling
   PutGroupPolicy. For general information about using the Query API with IAM, go to Making Query Requests in the
   IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest`

  returns: Result of the PutGroupPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.LimitExceededException - The request was rejected because it attempted to create resources beyond the current AWS account limits. The error message describes the limit exceeded."
  (^com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest request]
    (-> this (.putGroupPolicy request))))

(defn list-mfa-devices
  "Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the
   MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name
   implicitly based on the AWS access key ID signing the request for this API.


   You can paginate the results using the MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest`

  returns: Result of the ListMFADevices operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListMFADevicesResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListMFADevicesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest request]
    (-> this (.listMFADevices request)))
  (^com.amazonaws.services.identitymanagement.model.ListMFADevicesResult [^AmazonIdentityManagementClient this]
    (-> this (.listMFADevices))))

(defn get-access-key-last-used
  "Retrieves information about when the specified access key was last used. The information includes the date and
   time of last use, along with the AWS service and Region that were specified in the last request made with that
   key.

  request - `com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest`

  returns: Result of the GetAccessKeyLastUsed operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult`"
  (^com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest request]
    (-> this (.getAccessKeyLastUsed request))))

(defn delete-instance-profile
  "Deletes the specified instance profile. The instance profile must not have an associated role.



   Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to
   delete. Deleting a role or instance profile that is associated with a running instance will break any
   applications running on the instance.



   For more information about instance profiles, go to About Instance Profiles.

  request - `com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest`

  returns: Result of the DeleteInstanceProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest request]
    (-> this (.deleteInstanceProfile request))))

(defn get-organizations-access-report
  "Retrieves the service last accessed data report for AWS Organizations that was previously generated using the
    GenerateOrganizationsAccessReport  operation. This operation retrieves the status of your
   report job and the report contents.


   Depending on the parameters that you passed when you generated the report, the data returned could include
   different information. For details, see GenerateOrganizationsAccessReport.


   To call this operation, you must be signed in to the master account in your organization. SCPs must be enabled
   for your organization root. You must have permissions to perform this operation. For more information, see Refining Permissions
   Using Service Last Accessed Data in the IAM User Guide.


   For each service that principals in an account (root users, IAM users, or IAM roles) could access using SCPs, the
   operation returns details about the most recent access attempt. If there was no attempt, the service is listed
   without details about the most recent attempt to access the service. If the operation fails, it returns the
   reason that it failed.


   By default, the list is sorted by service namespace.

  request - `com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportRequest`

  returns: Result of the GetOrganizationsAccessReport operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportRequest request]
    (-> this (.getOrganizationsAccessReport request))))

(defn put-user-permissions-boundary
  "Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed
   policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum
   permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the
   permissions for the user.



   Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions
   policy to the user. To learn how the effective permissions for a user are evaluated, see IAM JSON Policy
   Evaluation Logic in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryRequest`

  returns: Result of the PutUserPermissionsBoundary operation returned by the service. - `com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryRequest request]
    (-> this (.putUserPermissionsBoundary request))))

(defn list-groups
  "Lists the IAM groups that have the specified path prefix.


   You can paginate the results using the MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.ListGroupsRequest`

  returns: Result of the ListGroups operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListGroupsResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.ListGroupsResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListGroupsRequest request]
    (-> this (.listGroups request)))
  (^com.amazonaws.services.identitymanagement.model.ListGroupsResult [^AmazonIdentityManagementClient this]
    (-> this (.listGroups))))

(defn create-policy
  "Creates a new managed policy for your AWS account.


   This operation creates a policy version with a version identifier of v1 and sets v1 as the policy's
   default version. For more information about policy versions, see Versioning for Managed
   Policies in the IAM User Guide.


   For more information about managed policies in general, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.CreatePolicyRequest`

  returns: Result of the CreatePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreatePolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.CreatePolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreatePolicyRequest request]
    (-> this (.createPolicy request))))

(defn list-instance-profiles-for-role
  "Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns
   an empty list. For more information about instance profiles, go to About Instance Profiles.


   You can paginate the results using the MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest`

  returns: Result of the ListInstanceProfilesForRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest request]
    (-> this (.listInstanceProfilesForRole request))))

(defn enable-mfa-device
  "Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is
   required for every subsequent login by the IAM user associated with the device.

  request - `com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest`

  returns: Result of the EnableMFADevice operation returned by the service. - `com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult`

  throws: com.amazonaws.services.identitymanagement.model.EntityAlreadyExistsException - The request was rejected because it attempted to create a resource that already exists."
  (^com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest request]
    (-> this (.enableMFADevice request))))

(defn create-service-linked-role
  "Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when
   the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted
   role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps
   improve service stability and proper cleanup when a service and its role are no longer needed. For more
   information, see Using
   Service-Linked Roles in the IAM User Guide.


   To attach a policy to this service-linked role, you must make the request using the AWS service that depends on
   this role.

  request - `com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest`

  returns: Result of the CreateServiceLinkedRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest request]
    (-> this (.createServiceLinkedRole request))))

(defn get-credential-report
  "Retrieves a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in
   the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest`

  returns: Result of the GetCredentialReport operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetCredentialReportResult`

  throws: com.amazonaws.services.identitymanagement.model.CredentialReportNotPresentException - The request was rejected because the credential report does not exist. To generate a credential report, use GenerateCredentialReport."
  (^com.amazonaws.services.identitymanagement.model.GetCredentialReportResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest request]
    (-> this (.getCredentialReport request)))
  (^com.amazonaws.services.identitymanagement.model.GetCredentialReportResult [^AmazonIdentityManagementClient this]
    (-> this (.getCredentialReport))))

(defn reset-service-specific-credential
  "Resets the password for a service-specific credential. The new password is AWS generated and cryptographically
   strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password
   associated with this user.

  request - `com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest`

  returns: Result of the ResetServiceSpecificCredential operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest request]
    (-> this (.resetServiceSpecificCredential request))))

(defn list-policies
  "Lists all the managed policies that are available in your AWS account, including your own customer-defined
   managed policies and all AWS managed policies.


   You can filter the list of policies that is returned using the optional OnlyAttached,
   Scope, and PathPrefix parameters. For example, to list only the customer managed
   policies in your AWS account, set Scope to Local. To list only AWS managed policies,
   set Scope to AWS.


   You can paginate the results using the MaxItems and Marker parameters.


   For more information about managed policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.ListPoliciesRequest`

  returns: Result of the ListPolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListPoliciesResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.ListPoliciesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListPoliciesRequest request]
    (-> this (.listPolicies request)))
  (^com.amazonaws.services.identitymanagement.model.ListPoliciesResult [^AmazonIdentityManagementClient this]
    (-> this (.listPolicies))))

(defn delete-saml-provider
  "Deletes a SAML provider resource in IAM.


   Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN
   as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider
   resource ARN fails.



   This operation requires Signature Version 4.

  request - `com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest`

  returns: Result of the DeleteSAMLProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest request]
    (-> this (.deleteSAMLProvider request))))

(defn put-role-permissions-boundary
  "Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed
   policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum
   permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the
   permissions for the role.


   You cannot set the boundary for a service-linked role.



   Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to
   the role. To learn how the effective permissions for a role are evaluated, see IAM JSON Policy
   Evaluation Logic in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryRequest`

  returns: Result of the PutRolePermissionsBoundary operation returned by the service. - `com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryRequest request]
    (-> this (.putRolePermissionsBoundary request))))

(defn get-server-certificate
  "Retrieves information about the specified server certificate stored in IAM.


   For more information about working with server certificates, see Working with Server
   Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server
   certificates that you manage with IAM.

  request - `com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest`

  returns: Result of the GetServerCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetServerCertificateResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetServerCertificateResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest request]
    (-> this (.getServerCertificate request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonIdentityManagementClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-saml-provider
  "Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created
   or updated.



   This operation requires Signature Version 4.

  request - `com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest`

  returns: Result of the GetSAMLProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest request]
    (-> this (.getSAMLProvider request))))

(defn get-policy-version
  "Retrieves information about the specified version of the specified managed policy, including the policy document.



   Policies returned by this API are URL-encoded compliant with RFC
   3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
   use Java, you can use the decode method of the java.net.URLDecoder utility class in the
   Java SDK. Other languages and SDKs provide similar functionality.



   To list the available versions for a policy, use ListPolicyVersions.


   This API retrieves information about managed policies. To retrieve information about an inline policy that is
   embedded in a user, group, or role, use the GetUserPolicy, GetGroupPolicy, or GetRolePolicy
   API.


   For more information about the types of policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   For more information about managed policy versions, see Versioning for Managed
   Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest`

  returns: Result of the GetPolicyVersion operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest request]
    (-> this (.getPolicyVersion request))))

(defn get-user-policy
  "Retrieves the specified inline policy document that is embedded in the specified IAM user.



   Policies returned by this API are URL-encoded compliant with RFC
   3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
   use Java, you can use the decode method of the java.net.URLDecoder utility class in the
   Java SDK. Other languages and SDKs provide similar functionality.



   An IAM user can also have managed policies attached to it. To retrieve a managed policy document that is attached
   to a user, use GetPolicy to determine the policy's default version. Then use GetPolicyVersion to
   retrieve the policy document.


   For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest`

  returns: Result of the GetUserPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetUserPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetUserPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest request]
    (-> this (.getUserPolicy request))))

(defn add-user-to-group
  "Adds the specified user to the specified group.

  request - `com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest`

  returns: Result of the AddUserToGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AddUserToGroupResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.AddUserToGroupResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest request]
    (-> this (.addUserToGroup request))))

(defn untag-user
  "Removes the specified tags from the user. For more information about tagging, see Tagging IAM Identities in the IAM
   User Guide.

  request - `com.amazonaws.services.identitymanagement.model.UntagUserRequest`

  returns: Result of the UntagUser operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UntagUserResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UntagUserResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UntagUserRequest request]
    (-> this (.untagUser request))))

(defn update-login-profile
  "Changes the password for the specified IAM user.


   IAM users can change their own passwords by calling ChangePassword. For more information about modifying
   passwords, see Managing
   Passwords in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest`

  returns: Result of the UpdateLoginProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult`

  throws: com.amazonaws.services.identitymanagement.model.EntityTemporarilyUnmodifiableException - The request was rejected because it referenced an entity that is temporarily unmodifiable, such as a user name that was deleted and then recreated. The error indicates that the request is likely to succeed if you try again after waiting several minutes. The error message describes the entity."
  (^com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest request]
    (-> this (.updateLoginProfile request))))

(defn list-attached-role-policies
  "Lists all managed policies that are attached to the specified IAM role.


   An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the
   ListRolePolicies API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. You can use the
   PathPrefix parameter to limit the list of policies to only those matching the specified path prefix.
   If there are no policies attached to the specified role (or none that match the specified path prefix), the
   operation returns an empty list.

  request - `com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest`

  returns: Result of the ListAttachedRolePolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest request]
    (-> this (.listAttachedRolePolicies request))))

(defn update-saml-provider
  "Updates the metadata document for an existing SAML provider resource object.



   This operation requires Signature Version 4.

  request - `com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest`

  returns: Result of the UpdateSAMLProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest request]
    (-> this (.updateSAMLProvider request))))

(defn list-ssh-public-keys
  "Returns information about the SSH public keys associated with the specified IAM user. If none exists, the
   operation returns an empty list.


   The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit
   repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS
   CodeCommit for SSH Connections in the AWS CodeCommit User Guide.


   Although each user is limited to a small number of keys, you can still paginate the results using the
   MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest`

  returns: Result of the ListSSHPublicKeys operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest request]
    (-> this (.listSSHPublicKeys request)))
  (^com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult [^AmazonIdentityManagementClient this]
    (-> this (.listSSHPublicKeys))))

(defn list-user-tags
  "Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more
   information about tagging, see Tagging
   IAM Identities in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.ListUserTagsRequest`

  returns: Result of the ListUserTags operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListUserTagsResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListUserTagsResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListUserTagsRequest request]
    (-> this (.listUserTags request))))

(defn get-service-last-accessed-details-with-entities
  "After you generate a group or policy report using the GenerateServiceLastAccessedDetails operation,
   you can use the JobId parameter in GetServiceLastAccessedDetailsWithEntities. This
   operation retrieves the status of your report job and a list of entities that could have used group or policy
   permissions to access the specified service.




   Group – For a group report, this operation returns a list of users in the group that could have used the
   group’s policies in an attempt to access the service.




   Policy – For a policy report, this operation returns a list of entities (users or roles) that could have
   used the policy in an attempt to access the service.




   You can also use this operation for user or role reports to retrieve details about those entities.


   If the operation fails, the GetServiceLastAccessedDetailsWithEntities operation returns the reason
   that it failed.


   By default, the list of associated entities is sorted by date, with the most recent access listed first.

  request - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesRequest`

  returns: Result of the GetServiceLastAccessedDetailsWithEntities operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesRequest request]
    (-> this (.getServiceLastAccessedDetailsWithEntities request))))

(defn get-account-summary
  "Retrieves information about IAM entity usage and IAM quotas in the AWS account.


   For information about limitations on IAM entities, see Limitations on IAM
   Entities in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest`

  returns: Result of the GetAccountSummary operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest request]
    (-> this (.getAccountSummary request)))
  (^com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult [^AmazonIdentityManagementClient this]
    (-> this (.getAccountSummary))))

(defn update-assume-role-policy
  "Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the
   \"role trust policy\". For more information about roles, go to Using Roles to Delegate Permissions
   and Federate Identities.

  request - `com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest`

  returns: Result of the UpdateAssumeRolePolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest request]
    (-> this (.updateAssumeRolePolicy request))))

(defn add-client-id-to-open-id-connect-provider
  "Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM
   OpenID Connect (OIDC) provider resource.


   This operation is idempotent; it does not fail or return an error if you add an existing client ID to the
   provider.

  request - `com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest`

  returns: Result of the AddClientIDToOpenIDConnectProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest request]
    (-> this (.addClientIDToOpenIDConnectProvider request))))

(defn update-ssh-public-key
  "Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot
   be used for authentication. This operation can be used to disable a user's SSH public key as part of a key
   rotation work flow.


   The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS
   CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
   see Set up AWS
   CodeCommit for SSH Connections in the AWS CodeCommit User Guide.

  request - `com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest`

  returns: Result of the UpdateSSHPublicKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest request]
    (-> this (.updateSSHPublicKey request))))

(defn list-group-policies
  "Lists the names of the inline policies that are embedded in the specified IAM group.


   An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a
   group, use ListAttachedGroupPolicies. For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. If there are no
   inline policies embedded with the specified group, the operation returns an empty list.

  request - `com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest`

  returns: Result of the ListGroupPolicies operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest request]
    (-> this (.listGroupPolicies request))))

(defn get-open-id-connect-provider
  "Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.

  request - `com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest`

  returns: Result of the GetOpenIDConnectProvider operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult`

  throws: com.amazonaws.services.identitymanagement.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest request]
    (-> this (.getOpenIDConnectProvider request))))

(defn create-access-key
  "Creates a new AWS secret access key and corresponding AWS access key ID for the specified user. The default
   status for new keys is Active.


   If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
   the request. This operation works for access keys under the AWS account. Consequently, you can use this operation
   to manage AWS account root user credentials. This is true even if the AWS account has no associated users.


   For information about limits on the number of keys you can create, see Limitations on IAM
   Entities in the IAM User Guide.



   To ensure the security of your AWS account, the secret access key is accessible only during key and user
   creation. You must save the key (for example, in a text file) if you want to be able to access it again. If a
   secret key is lost, you can delete the access keys for the associated user and then create new keys.

  request - `com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest`

  returns: Result of the CreateAccessKey operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest request]
    (-> this (.createAccessKey request)))
  (^com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult [^AmazonIdentityManagementClient this]
    (-> this (.createAccessKey))))

(defn get-group-policy
  "Retrieves the specified inline policy document that is embedded in the specified IAM group.



   Policies returned by this API are URL-encoded compliant with RFC
   3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
   use Java, you can use the decode method of the java.net.URLDecoder utility class in the
   Java SDK. Other languages and SDKs provide similar functionality.



   An IAM group can also have managed policies attached to it. To retrieve a managed policy document that is
   attached to a group, use GetPolicy to determine the policy's default version, then use
   GetPolicyVersion to retrieve the policy document.


   For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest`

  returns: Result of the GetGroupPolicy operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest request]
    (-> this (.getGroupPolicy request))))

(defn create-instance-profile
  "Creates a new instance profile. For information about instance profiles, go to About Instance Profiles.


   For information about the number of instance profiles you can create, see Limitations on IAM
   Entities in the IAM User Guide.

  request - `com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest`

  returns: Result of the CreateInstanceProfile operation returned by the service. - `com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult`

  throws: com.amazonaws.services.identitymanagement.model.EntityAlreadyExistsException - The request was rejected because it attempted to create a resource that already exists."
  (^com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest request]
    (-> this (.createInstanceProfile request))))

(defn delete-signing-certificate
  "Deletes a signing certificate associated with the specified IAM user.


   If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
   the request. This operation works for access keys under the AWS account. Consequently, you can use this operation
   to manage AWS account root user credentials even if the AWS account has no associated IAM users.

  request - `com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest`

  returns: Result of the DeleteSigningCertificate operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest request]
    (-> this (.deleteSigningCertificate request))))

(defn delete-virtual-mfa-device
  "Deletes a virtual MFA device.



   You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA
   devices, see DeactivateMFADevice.

  request - `com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest`

  returns: Result of the DeleteVirtualMFADevice operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest request]
    (-> this (.deleteVirtualMFADevice request))))

(defn get-group
  "Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the
   MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.GetGroupRequest`

  returns: Result of the GetGroup operation returned by the service. - `com.amazonaws.services.identitymanagement.model.GetGroupResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.GetGroupResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.GetGroupRequest request]
    (-> this (.getGroup request))))

(defn delete-role
  "Deletes the specified role. The role must not have any policies attached. For more information about roles, go to
   Working with Roles.



   Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a
   role or instance profile that is associated with a running instance will break any applications running on the
   instance.

  request - `com.amazonaws.services.identitymanagement.model.DeleteRoleRequest`

  returns: Result of the DeleteRole operation returned by the service. - `com.amazonaws.services.identitymanagement.model.DeleteRoleResult`

  throws: com.amazonaws.services.identitymanagement.model.NoSuchEntityException - The request was rejected because it referenced a resource entity that does not exist. The error message describes the resource."
  (^com.amazonaws.services.identitymanagement.model.DeleteRoleResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.DeleteRoleRequest request]
    (-> this (.deleteRole request))))

(defn list-roles
  "Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list.
   For more information about roles, go to Working with Roles.


   You can paginate the results using the MaxItems and Marker parameters.

  request - `com.amazonaws.services.identitymanagement.model.ListRolesRequest`

  returns: Result of the ListRoles operation returned by the service. - `com.amazonaws.services.identitymanagement.model.ListRolesResult`

  throws: com.amazonaws.services.identitymanagement.model.ServiceFailureException - The request processing has failed because of an unknown error, exception or failure."
  (^com.amazonaws.services.identitymanagement.model.ListRolesResult [^AmazonIdentityManagementClient this ^com.amazonaws.services.identitymanagement.model.ListRolesRequest request]
    (-> this (.listRoles request)))
  (^com.amazonaws.services.identitymanagement.model.ListRolesResult [^AmazonIdentityManagementClient this]
    (-> this (.listRoles))))

