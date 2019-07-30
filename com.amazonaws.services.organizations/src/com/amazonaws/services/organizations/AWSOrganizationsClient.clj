(ns com.amazonaws.services.organizations.AWSOrganizationsClient
  "Client for accessing Organizations. All service calls made using this client are blocking, and will not return until
  the service call completes.

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
  (:import [com.amazonaws.services.organizations AWSOrganizationsClient]))

(defn ->aws-organizations-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Organizations (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AWSOrganizationsClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AWSOrganizationsClient aws-credentials-provider client-configuration request-metric-collector))
  (^AWSOrganizationsClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSOrganizationsClient aws-credentials client-configuration))
  (^AWSOrganizationsClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AWSOrganizationsClient client-configuration))
  (^AWSOrganizationsClient []
    (new AWSOrganizationsClient )))

(defn *builder
  "returns: `com.amazonaws.services.organizations.AWSOrganizationsClientBuilder`"
  (^com.amazonaws.services.organizations.AWSOrganizationsClientBuilder []
    (AWSOrganizationsClient/builder )))

(defn list-tags-for-resource
  "Lists tags for the specified resource.


   Currently, you can list tags on an account in AWS Organizations.

  request - `com.amazonaws.services.organizations.model.ListTagsForResourceRequest`

  returns: Result of the ListTagsForResource operation returned by the service. - `com.amazonaws.services.organizations.model.ListTagsForResourceResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListTagsForResourceResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResource request))))

(defn disable-aws-service-access
  "Disables the integration of an AWS service (the service that is specified by ServicePrincipal) with
   AWS Organizations. When you disable integration, the specified service no longer can create a service-linked role in
   new accounts in your organization. This means the service can't perform operations on your behalf on any
   new accounts in your organization. The service can still perform operations in older accounts until the service
   completes its clean-up from AWS Organizations.




   We recommend that you disable integration between AWS Organizations and the specified AWS service by using the
   console or commands that are provided by the specified service. Doing so ensures that the other service is aware
   that it can clean up any resources that are required only for the integration. How the service cleans up its
   resources in the organization's accounts depends on that service. For more information, see the documentation for
   the other AWS service.



   After you perform the DisableAWSServiceAccess operation, the specified service can no longer perform
   operations in your organization's accounts unless the operations are explicitly permitted by the IAM policies
   that are attached to your roles.


   For more information about integrating other services with AWS Organizations, including the list of services that
   work with Organizations, see Integrating AWS
   Organizations with Other AWS Services in the AWS Organizations User Guide.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest`

  returns: Result of the DisableAWSServiceAccess operation returned by the service. - `com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DisableAWSServiceAccessResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DisableAWSServiceAccessRequest request]
    (-> this (.disableAWSServiceAccess request))))

(defn update-organizational-unit
  "Renames the specified organizational unit (OU). The ID and ARN don't change. The child OUs and accounts remain in
   place, and any attached policies of the OU remain attached.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest`

  returns: Result of the UpdateOrganizationalUnit operation returned by the service. - `com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.UpdateOrganizationalUnitResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.UpdateOrganizationalUnitRequest request]
    (-> this (.updateOrganizationalUnit request))))

(defn disable-policy-type
  "Disables an organizational control policy type in a root. A policy of a certain type can be attached to entities
   in a root only if that type is enabled in the root. After you perform this operation, you no longer can attach
   policies of the specified type to that root or to any organizational unit (OU) or account in that root. You can
   undo this by using the EnablePolicyType operation.


   This operation can be called only from the organization's master account.



   If you disable a policy type for a root, it still shows as enabled for the organization if all features are
   enabled in that organization. Use ListRoots to see the status of policy types for a specified root. Use
   DescribeOrganization to see the status of policy types in the organization.

  request - `com.amazonaws.services.organizations.model.DisablePolicyTypeRequest`

  returns: Result of the DisablePolicyType operation returned by the service. - `com.amazonaws.services.organizations.model.DisablePolicyTypeResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.DisablePolicyTypeResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DisablePolicyTypeRequest request]
    (-> this (.disablePolicyType request))))

(defn untag-resource
  "Removes a tag from the specified resource.


   Currently, you can tag and untag accounts in AWS Organizations.

  request - `com.amazonaws.services.organizations.model.UntagResourceRequest`

  returns: Result of the UntagResource operation returned by the service. - `com.amazonaws.services.organizations.model.UntagResourceResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.UntagResourceResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.UntagResourceRequest request]
    (-> this (.untagResource request))))

(defn list-handshakes-for-organization
  "Lists the handshakes that are associated with the organization that the requesting user is part of. The
   ListHandshakesForOrganization operation returns a list of handshake structures. Each structure
   contains details and status about a handshake.


   Handshakes that are ACCEPTED, DECLINED, or CANCELED appear in the results
   of this API for only 30 days after changing to that state. After that, they're deleted and no longer accessible.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest`

  returns: Result of the ListHandshakesForOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListHandshakesForOrganizationResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListHandshakesForOrganizationRequest request]
    (-> this (.listHandshakesForOrganization request))))

(defn delete-organization
  "Deletes the organization. You can delete an organization only by using credentials from the master account. The
   organization must be empty of member accounts.

  request - `com.amazonaws.services.organizations.model.DeleteOrganizationRequest`

  returns: Result of the DeleteOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.DeleteOrganizationResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DeleteOrganizationResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DeleteOrganizationRequest request]
    (-> this (.deleteOrganization request))))

(defn enable-aws-service-access
  "Enables the integration of an AWS service (the service that is specified by ServicePrincipal) with
   AWS Organizations. When you enable integration, you allow the specified service to create a service-linked role in
   all the accounts in your organization. This allows the service to perform operations on your behalf in your
   organization and its accounts.



   We recommend that you enable integration between AWS Organizations and the specified AWS service by using the
   console or commands that are provided by the specified service. Doing so ensures that the service is aware that
   it can create the resources that are required for the integration. How the service creates those resources in the
   organization's accounts depends on that service. For more information, see the documentation for the other AWS
   service.



   For more information about enabling services to integrate with AWS Organizations, see Integrating AWS
   Organizations with Other AWS Services in the AWS Organizations User Guide.


   This operation can be called only from the organization's master account and only if the organization has enabled all
   features.

  request - `com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest`

  returns: Result of the EnableAWSServiceAccess operation returned by the service. - `com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.EnableAWSServiceAccessResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.EnableAWSServiceAccessRequest request]
    (-> this (.enableAWSServiceAccess request))))

(defn list-targets-for-policy
  "Lists all the roots, organizational units (OUs), and accounts that the specified policy is attached to.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest`

  returns: Result of the ListTargetsForPolicy operation returned by the service. - `com.amazonaws.services.organizations.model.ListTargetsForPolicyResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListTargetsForPolicyResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListTargetsForPolicyRequest request]
    (-> this (.listTargetsForPolicy request))))

(defn leave-organization
  "Removes a member account from its parent organization. This version of the operation is performed by the account
   that wants to leave. To remove a member account as a user in the master account, use
   RemoveAccountFromOrganization instead.


   This operation can be called only from a member account in the organization.





   The master account in an organization with all features enabled can set service control policies (SCPs) that can
   restrict what administrators of member accounts can do, including preventing them from successfully calling
   LeaveOrganization and leaving the organization.




   You can leave an organization as a member account only if the account is configured with the information required
   to operate as a standalone account. When you create an account in an organization using the AWS Organizations
   console, API, or CLI commands, the information required of standalone accounts is not automatically
   collected. For each account that you want to make standalone, you must accept the end user license agreement
   (EULA), choose a support plan, provide and verify the required contact information, and provide a current payment
   method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the
   account isn't attached to an organization. Follow the steps at  To leave an organization when all required account information has not yet been provided in the AWS
   Organizations User Guide.




   You can leave an organization only after you enable IAM user access to billing in your account. For more
   information, see Activating Access to the Billing and Cost Management Console in the AWS Billing and Cost Management User
   Guide.

  request - `com.amazonaws.services.organizations.model.LeaveOrganizationRequest`

  returns: Result of the LeaveOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.LeaveOrganizationResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.LeaveOrganizationResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.LeaveOrganizationRequest request]
    (-> this (.leaveOrganization request))))

(defn list-parents
  "Lists the root or organizational units (OUs) that serve as the immediate parent of the specified child OU or
   account. This operation, along with ListChildren enables you to traverse the tree structure that makes up
   this root.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.



   In the current release, a child can have only a single parent.

  request - `com.amazonaws.services.organizations.model.ListParentsRequest`

  returns: Result of the ListParents operation returned by the service. - `com.amazonaws.services.organizations.model.ListParentsResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListParentsResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListParentsRequest request]
    (-> this (.listParents request))))

(defn delete-policy
  "Deletes the specified policy from your organization. Before you perform this operation, you must first detach the
   policy from all organizational units (OUs), roots, and accounts.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.organizations.model.DeletePolicyResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DeletePolicyResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DeletePolicyRequest request]
    (-> this (.deletePolicy request))))

(defn enable-all-features
  "Enables all features in an organization. This enables the use of organization policies that can restrict the
   services and actions that can be called in each account. Until you enable all features, you have access only to
   consolidated billing, and you can't use any of the advanced account administration features that AWS
   Organizations supports. For more information, see Enabling All Features in Your Organization in the AWS Organizations User Guide.



   This operation is required only for organizations that were created explicitly with only the consolidated billing
   features enabled. Calling this operation sends a handshake to every invited account in the organization. The
   feature set change can be finalized and the additional features enabled only after all administrators in the
   invited accounts approve the change by accepting the handshake.



   After you enable all features, you can separately enable or disable individual policy types in a root using
   EnablePolicyType and DisablePolicyType. To see the status of policy types in a root, use
   ListRoots.


   After all invited member accounts accept the handshake, you finalize the feature set change by accepting the
   handshake that contains \"Action\": \"ENABLE_ALL_FEATURES\". This completes the change.


   After you enable all features in your organization, the master account in the organization can apply policies on
   all member accounts. These policies can restrict what users and even administrators in those accounts can do. The
   master account can apply policies that prevent accounts from leaving the organization. Ensure that your account
   administrators are aware of this.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.EnableAllFeaturesRequest`

  returns: Result of the EnableAllFeatures operation returned by the service. - `com.amazonaws.services.organizations.model.EnableAllFeaturesResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.EnableAllFeaturesResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.EnableAllFeaturesRequest request]
    (-> this (.enableAllFeatures request))))

(defn delete-organizational-unit
  "Deletes an organizational unit (OU) from a root or another OU. You must first remove all accounts and child OUs
   from the OU that you want to delete.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest`

  returns: Result of the DeleteOrganizationalUnit operation returned by the service. - `com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DeleteOrganizationalUnitResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DeleteOrganizationalUnitRequest request]
    (-> this (.deleteOrganizationalUnit request))))

(defn attach-policy
  "Attaches a policy to a root, an organizational unit (OU), or an individual account. How the policy affects
   accounts depends on the type of policy:




   Service control policy (SCP) - An SCP specifies what permissions can be delegated to users in affected
   member accounts. The scope of influence for a policy depends on what you attach the policy to:




   If you attach an SCP to a root, it affects all accounts in the organization




   If you attach an SCP to an OU, it affects all accounts in that OU and in any child OUs




   If you attach the policy directly to an account, it affects only that account




   SCPs are JSON policies that specify the maximum permissions for an organization or organizational unit (OU). When
   you attach one SCP to a higher level root or OU, and you also attach a different SCP to a child OU or to an
   account, the child policy can further restrict only the permissions that pass through the parent filter and are
   available to the child. An SCP that is attached to a child can't grant a permission that the paren't hasn't
   already granted. For example, imagine that the parent SCP allows permissions A, B, C, D, and E. The child SCP
   allows C, D, E, F, and G. The result is that the accounts affected by the child SCP are allowed to use only C, D,
   and E. They can't use A or B because the child OU filtered them out. They also can't use F and G because the
   parent OU filtered them out. They can't be granted back by the child SCP; child SCPs can only filter the
   permissions they receive from the parent SCP.


   AWS Organizations attaches a default SCP named \"FullAWSAccess to every root, OU, and account. This
   default SCP allows all services and actions, enabling any new child OU or account to inherit the permissions of
   the parent root or OU. If you detach the default policy, you must replace it with a policy that specifies the
   permissions that you want to allow in that OU or account.


   For more information about how AWS Organizations policies permissions work, see Using Service
   Control Policies in the AWS Organizations User Guide.




   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.AttachPolicyRequest`

  returns: Result of the AttachPolicy operation returned by the service. - `com.amazonaws.services.organizations.model.AttachPolicyResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.AttachPolicyResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.AttachPolicyRequest request]
    (-> this (.attachPolicy request))))

(defn move-account
  "Moves an account from its current source parent root or organizational unit (OU) to the specified destination
   parent root or OU.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.MoveAccountRequest`

  returns: Result of the MoveAccount operation returned by the service. - `com.amazonaws.services.organizations.model.MoveAccountResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.MoveAccountResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.MoveAccountRequest request]
    (-> this (.moveAccount request))))

(defn describe-organizational-unit
  "Retrieves information about an organizational unit (OU).


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest`

  returns: Result of the DescribeOrganizationalUnit operation returned by the service. - `com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DescribeOrganizationalUnitResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DescribeOrganizationalUnitRequest request]
    (-> this (.describeOrganizationalUnit request))))

(defn update-policy
  "Updates an existing policy with a new name, description, or content. If you don't supply any parameter, that
   value remains unchanged. You can't change a policy's type.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.UpdatePolicyRequest`

  returns: Result of the UpdatePolicy operation returned by the service. - `com.amazonaws.services.organizations.model.UpdatePolicyResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.UpdatePolicyResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.UpdatePolicyRequest request]
    (-> this (.updatePolicy request))))

(defn list-handshakes-for-account
  "Lists the current handshakes that are associated with the account of the requesting user.


   Handshakes that are ACCEPTED, DECLINED, or CANCELED appear in the results
   of this API for only 30 days after changing to that state. After that, they're deleted and no longer accessible.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called from any account in the organization.

  request - `com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest`

  returns: Result of the ListHandshakesForAccount operation returned by the service. - `com.amazonaws.services.organizations.model.ListHandshakesForAccountResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListHandshakesForAccountResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListHandshakesForAccountRequest request]
    (-> this (.listHandshakesForAccount request))))

(defn describe-account
  "Retrieves AWS Organizations-related information about the specified account.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.DescribeAccountRequest`

  returns: Result of the DescribeAccount operation returned by the service. - `com.amazonaws.services.organizations.model.DescribeAccountResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DescribeAccountResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DescribeAccountRequest request]
    (-> this (.describeAccount request))))

(defn remove-account-from-organization
  "Removes the specified account from the organization.


   The removed account becomes a standalone account that isn't a member of any organization. It's no longer subject
   to any policies and is responsible for its own bill payments. The organization's master account is no longer
   charged for any expenses accrued by the member account after it's removed from the organization.


   This operation can be called only from the organization's master account. Member accounts can remove themselves
   with LeaveOrganization instead.



   You can remove an account from your organization only if the account is configured with the information required
   to operate as a standalone account. When you create an account in an organization using the AWS Organizations
   console, API, or CLI commands, the information required of standalone accounts is not automatically
   collected. For an account that you want to make standalone, you must accept the end user license agreement
   (EULA), choose a support plan, provide and verify the required contact information, and provide a current payment
   method. AWS uses the payment method to charge for any billable (not free tier) AWS activity that occurs while the
   account isn't attached to an organization. To remove an account that doesn't yet have this information, you must
   sign in as the member account and follow the steps at  To leave an organization when all required account information has not yet been provided in the AWS
   Organizations User Guide.

  request - `com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest`

  returns: Result of the RemoveAccountFromOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.RemoveAccountFromOrganizationRequest request]
    (-> this (.removeAccountFromOrganization request))))

(defn detach-policy
  "Detaches a policy from a target root, organizational unit (OU), or account. If the policy being detached is a
   service control policy (SCP), the changes to permissions for IAM users and roles in affected accounts are
   immediate.


   Note: Every root, OU, and account must have at least one SCP attached. If you want to replace the default
   FullAWSAccess policy with one that limits the permissions that can be delegated, you must attach the
   replacement policy before you can remove the default one. This is the authorization strategy of whitelisting. If you instead attach a second SCP and leave the FullAWSAccess SCP still
   attached, and specify \"Effect\": \"Deny\" in the second SCP to override the
   \"Effect\": \"Allow\" in the FullAWSAccess policy (or any other attached SCP), you're using
   the authorization strategy of blacklisting.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.DetachPolicyRequest`

  returns: Result of the DetachPolicy operation returned by the service. - `com.amazonaws.services.organizations.model.DetachPolicyResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.DetachPolicyResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DetachPolicyRequest request]
    (-> this (.detachPolicy request))))

(defn describe-organization
  "Retrieves information about the organization that the user's account belongs to.


   This operation can be called from any account in the organization.



   Even if a policy type is shown as available in the organization, you can disable it separately at the root level
   with DisablePolicyType. Use ListRoots to see the status of policy types for a specified root.

  request - `com.amazonaws.services.organizations.model.DescribeOrganizationRequest`

  returns: Result of the DescribeOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.DescribeOrganizationResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DescribeOrganizationResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DescribeOrganizationRequest request]
    (-> this (.describeOrganization request))))

(defn accept-handshake
  "Sends a response to the originator of a handshake agreeing to the action proposed by the handshake request.


   This operation can be called only by the following principals when they also have the relevant IAM permissions:




   Invitation to join or Approve all features request handshakes: only a principal from the member
   account.


   The user who calls the API for an invitation to join must have the organizations:AcceptHandshake
   permission. If you enabled all features in the organization, the user must also have the
   iam:CreateServiceLinkedRole permission so that AWS Organizations can create the required
   service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide.




   Enable all features final confirmation handshake: only a principal from the master account.


   For more information about invitations, see Inviting an
   AWS Account to Join Your Organization in the AWS Organizations User Guide. For more information about
   requests to enable all features in the organization, see Enabling All Features in Your Organization in the AWS Organizations User Guide.




   After you accept a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
   that, it's deleted.

  request - `com.amazonaws.services.organizations.model.AcceptHandshakeRequest`

  returns: Result of the AcceptHandshake operation returned by the service. - `com.amazonaws.services.organizations.model.AcceptHandshakeResult`

  throws: com.amazonaws.services.organizations.model.HandshakeAlreadyInStateException - The specified handshake is already in the requested state. For example, you can't accept a handshake that was already accepted."
  (^com.amazonaws.services.organizations.model.AcceptHandshakeResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.AcceptHandshakeRequest request]
    (-> this (.acceptHandshake request))))

(defn list-policies-for-target
  "Lists the policies that are directly attached to the specified target root, organizational unit (OU), or account.
   You must specify the policy type that you want included in the returned list.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest`

  returns: Result of the ListPoliciesForTarget operation returned by the service. - `com.amazonaws.services.organizations.model.ListPoliciesForTargetResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListPoliciesForTargetResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListPoliciesForTargetRequest request]
    (-> this (.listPoliciesForTarget request))))

(defn list-accounts
  "Lists all the accounts in the organization. To request only the accounts in a specified root or organizational
   unit (OU), use the ListAccountsForParent operation instead.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.ListAccountsRequest`

  returns: Result of the ListAccounts operation returned by the service. - `com.amazonaws.services.organizations.model.ListAccountsResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListAccountsResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListAccountsRequest request]
    (-> this (.listAccounts request))))

(defn list-create-account-status
  "Lists the account creation requests that match the specified status that is currently being tracked for the
   organization.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest`

  returns: Result of the ListCreateAccountStatus operation returned by the service. - `com.amazonaws.services.organizations.model.ListCreateAccountStatusResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListCreateAccountStatusResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListCreateAccountStatusRequest request]
    (-> this (.listCreateAccountStatus request))))

(defn enable-policy-type
  "Enables a policy type in a root. After you enable a policy type in a root, you can attach policies of that type
   to the root, any organizational unit (OU), or account in that root. You can undo this by using the
   DisablePolicyType operation.


   This operation can be called only from the organization's master account.


   You can enable a policy type in a root only if that policy type is available in the organization. Use
   DescribeOrganization to view the status of available policy types in the organization.


   To view the status of policy type in a root, use ListRoots.

  request - `com.amazonaws.services.organizations.model.EnablePolicyTypeRequest`

  returns: Result of the EnablePolicyType operation returned by the service. - `com.amazonaws.services.organizations.model.EnablePolicyTypeResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.EnablePolicyTypeResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.EnablePolicyTypeRequest request]
    (-> this (.enablePolicyType request))))

(defn list-accounts-for-parent
  "Lists the accounts in an organization that are contained by the specified target root or organizational unit
   (OU). If you specify the root, you get a list of all the accounts that aren't in any OU. If you specify an OU,
   you get a list of all the accounts in only that OU and not in any child OUs. To get a list of all accounts in the
   organization, use the ListAccounts operation.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.ListAccountsForParentRequest`

  returns: Result of the ListAccountsForParent operation returned by the service. - `com.amazonaws.services.organizations.model.ListAccountsForParentResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListAccountsForParentResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListAccountsForParentRequest request]
    (-> this (.listAccountsForParent request))))

(defn cancel-handshake
  "Cancels a handshake. Canceling a handshake sets the handshake state to CANCELED.


   This operation can be called only from the account that originated the handshake. The recipient of the handshake
   can't cancel it, but can use DeclineHandshake instead. After a handshake is canceled, the recipient can no
   longer respond to that handshake.


   After you cancel a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
   that, it's deleted.

  request - `com.amazonaws.services.organizations.model.CancelHandshakeRequest`

  returns: Result of the CancelHandshake operation returned by the service. - `com.amazonaws.services.organizations.model.CancelHandshakeResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.CancelHandshakeResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.CancelHandshakeRequest request]
    (-> this (.cancelHandshake request))))

(defn create-policy
  "Creates a policy of a specified type that you can attach to a root, an organizational unit (OU), or an individual
   AWS account.


   For more information about policies and their use, see Managing Organization
   Policies.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.CreatePolicyRequest`

  returns: Result of the CreatePolicy operation returned by the service. - `com.amazonaws.services.organizations.model.CreatePolicyResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.CreatePolicyResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.CreatePolicyRequest request]
    (-> this (.createPolicy request))))

(defn list-policies
  "Retrieves the list of all policies in an organization of a specified type.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.ListPoliciesRequest`

  returns: Result of the ListPolicies operation returned by the service. - `com.amazonaws.services.organizations.model.ListPoliciesResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListPoliciesResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListPoliciesRequest request]
    (-> this (.listPolicies request))))

(defn list-children
  "Lists all of the organizational units (OUs) or accounts that are contained in the specified parent OU or root.
   This operation, along with ListParents enables you to traverse the tree structure that makes up this root.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.ListChildrenRequest`

  returns: Result of the ListChildren operation returned by the service. - `com.amazonaws.services.organizations.model.ListChildrenResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListChildrenResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListChildrenRequest request]
    (-> this (.listChildren request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSOrganizationsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn create-organizational-unit
  "Creates an organizational unit (OU) within a root or parent OU. An OU is a container for accounts that enables
   you to organize your accounts to apply policies according to your business requirements. The number of levels
   deep that you can nest OUs is dependent upon the policy types enabled for that root. For service control
   policies, the limit is five.


   For more information about OUs, see Managing Organizational
   Units in the AWS Organizations User Guide.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest`

  returns: Result of the CreateOrganizationalUnit operation returned by the service. - `com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.CreateOrganizationalUnitResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.CreateOrganizationalUnitRequest request]
    (-> this (.createOrganizationalUnit request))))

(defn create-gov-cloud-account
  "This action is available if all of the following are true:




   You're authorized to create accounts in the AWS GovCloud (US) Region. For more information on the AWS GovCloud
   (US) Region, see the  AWS
   GovCloud User Guide.




   You already have an account in the AWS GovCloud (US) Region that is associated with your master account in the
   commercial Region.




   You call this action from the master account of your organization in the commercial Region.




   You have the organizations:CreateGovCloudAccount permission. AWS Organizations creates the required
   service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide.




   AWS automatically enables AWS CloudTrail for AWS GovCloud (US) accounts, but you should also do the following:




   Verify that AWS CloudTrail is enabled to store logs.




   Create an S3 bucket for AWS CloudTrail log storage.


   For more information, see Verifying AWS CloudTrail
   Is Enabled in the AWS GovCloud User Guide.




   You call this action from the master account of your organization in the commercial Region to create a standalone
   AWS account in the AWS GovCloud (US) Region. After the account is created, the master account of an organization
   in the AWS GovCloud (US) Region can invite it to that organization. For more information on inviting standalone
   accounts in the AWS GovCloud (US) to join an organization, see AWS Organizations
   in the AWS GovCloud User Guide.


   Calling CreateGovCloudAccount is an asynchronous request that AWS performs in the background.
   Because CreateGovCloudAccount operates asynchronously, it can return a successful completion message
   even though account initialization might still be in progress. You might need to wait a few minutes before you
   can successfully access the account. To check the status of the request, do one of the following:




   Use the OperationId response element from this operation to provide as a parameter to the
   DescribeCreateAccountStatus operation.




   Check the AWS CloudTrail log for the CreateAccountResult event. For information on using AWS
   CloudTrail with Organizations, see Monitoring the Activity in
   Your Organization in the AWS Organizations User Guide.





   When you call the CreateGovCloudAccount action, you create two accounts: a standalone account in the
   AWS GovCloud (US) Region and an associated account in the commercial Region for billing and support purposes. The
   account in the commercial Region is automatically a member of the organization whose credentials made the
   request. Both accounts are associated with the same email address.


   A role is created in the new account in the commercial Region that allows the master account in the organization
   in the commercial Region to assume it. An AWS GovCloud (US) account is then created and associated with the
   commercial account that you just created. A role is created in the new AWS GovCloud (US) account that can be
   assumed by the AWS GovCloud (US) account that is associated with the master account of the commercial
   organization. For more information and to view a diagram that explains how account access works, see AWS Organizations
   in the AWS GovCloud User Guide.


   For more information about creating accounts, see Creating an
   AWS Account in Your Organization in the AWS Organizations User Guide.





   When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the
   information required for the account to operate as a standalone account, such as a payment method and signing the
   end user license agreement (EULA) is not automatically collected. If you must remove an account from your
   organization later, you can do so only after you provide the missing information. Follow the steps at  To leave an organization as a member account in the AWS Organizations User Guide.




   If you get an exception that indicates that you exceeded your account limits for the organization, contact AWS Support.




   If you get an exception that indicates that the operation failed because your organization is still initializing,
   wait one hour and then try again. If the error persists, contact AWS Support.




   Using CreateGovCloudAccount to create multiple temporary accounts isn't recommended. You can only
   close an account from the AWS Billing and Cost Management console, and you must be signed in as the root user.
   For information on the requirements and process for closing an account, see Closing an AWS
   Account in the AWS Organizations User Guide.





   When you create a member account with this operation, you can choose whether to create the account with the
   IAM User and Role Access to Billing Information switch enabled. If you enable it, IAM users and roles that
   have appropriate permissions can view billing information for the account. If you disable it, only the account
   root user can access billing information. For information about how to disable this switch for an account, see Granting Access to Your
   Billing Information and Tools.

  request - `com.amazonaws.services.organizations.model.CreateGovCloudAccountRequest`

  returns: Result of the CreateGovCloudAccount operation returned by the service. - `com.amazonaws.services.organizations.model.CreateGovCloudAccountResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.CreateGovCloudAccountResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.CreateGovCloudAccountRequest request]
    (-> this (.createGovCloudAccount request))))

(defn list-aws-service-access-for-organization
  "Returns a list of the AWS services that you enabled to integrate with your organization. After a service on this
   list creates the resources that it requires for the integration, it can perform operations on your organization
   and its accounts.


   For more information about integrating other services with AWS Organizations, including the list of services that
   currently work with Organizations, see Integrating AWS
   Organizations with Other AWS Services in the AWS Organizations User Guide.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest`

  returns: Result of the ListAWSServiceAccessForOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListAWSServiceAccessForOrganizationRequest request]
    (-> this (.listAWSServiceAccessForOrganization request))))

(defn create-organization
  "Creates an AWS organization. The account whose user is calling the CreateOrganization operation
   automatically becomes the master
   account of the new organization.


   This operation must be called using credentials from the account that is to become the new organization's master
   account. The principal must also have the relevant IAM permissions.


   By default (or if you set the FeatureSet parameter to ALL), the new organization is
   created with all features enabled and service control policies automatically enabled in the root. If you instead
   choose to create the organization supporting only the consolidated billing features by setting the
   FeatureSet parameter to CONSOLIDATED_BILLING\", no policy types are enabled by default,
   and you can't use organization policies.

  request - `com.amazonaws.services.organizations.model.CreateOrganizationRequest`

  returns: Result of the CreateOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.CreateOrganizationResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.CreateOrganizationResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.CreateOrganizationRequest request]
    (-> this (.createOrganization request))))

(defn describe-handshake
  "Retrieves information about a previously requested handshake. The handshake ID comes from the response to the
   original InviteAccountToOrganization operation that generated the handshake.


   You can access handshakes that are ACCEPTED, DECLINED, or CANCELED for
   only 30 days after they change to that state. They're then deleted and no longer accessible.


   This operation can be called from any account in the organization.

  request - `com.amazonaws.services.organizations.model.DescribeHandshakeRequest`

  returns: Result of the DescribeHandshake operation returned by the service. - `com.amazonaws.services.organizations.model.DescribeHandshakeResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DescribeHandshakeResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DescribeHandshakeRequest request]
    (-> this (.describeHandshake request))))

(defn tag-resource
  "Adds one or more tags to the specified resource.


   Currently, you can tag and untag accounts in AWS Organizations.

  request - `com.amazonaws.services.organizations.model.TagResourceRequest`

  returns: Result of the TagResource operation returned by the service. - `com.amazonaws.services.organizations.model.TagResourceResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.TagResourceResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.TagResourceRequest request]
    (-> this (.tagResource request))))

(defn decline-handshake
  "Declines a handshake request. This sets the handshake state to DECLINED and effectively deactivates
   the request.


   This operation can be called only from the account that received the handshake. The originator of the handshake
   can use CancelHandshake instead. The originator can't reactivate a declined request, but can reinitiate
   the process with a new handshake request.


   After you decline a handshake, it continues to appear in the results of relevant APIs for only 30 days. After
   that, it's deleted.

  request - `com.amazonaws.services.organizations.model.DeclineHandshakeRequest`

  returns: Result of the DeclineHandshake operation returned by the service. - `com.amazonaws.services.organizations.model.DeclineHandshakeResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DeclineHandshakeResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DeclineHandshakeRequest request]
    (-> this (.declineHandshake request))))

(defn list-organizational-units-for-parent
  "Lists the organizational units (OUs) in a parent organizational unit or root.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest`

  returns: Result of the ListOrganizationalUnitsForParent operation returned by the service. - `com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListOrganizationalUnitsForParentRequest request]
    (-> this (.listOrganizationalUnitsForParent request))))

(defn describe-create-account-status
  "Retrieves the current status of an asynchronous request to create an account.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest`

  returns: Result of the DescribeCreateAccountStatus operation returned by the service. - `com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DescribeCreateAccountStatusResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DescribeCreateAccountStatusRequest request]
    (-> this (.describeCreateAccountStatus request))))

(defn describe-policy
  "Retrieves information about a policy.


   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.DescribePolicyRequest`

  returns: Result of the DescribePolicy operation returned by the service. - `com.amazonaws.services.organizations.model.DescribePolicyResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.DescribePolicyResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.DescribePolicyRequest request]
    (-> this (.describePolicy request))))

(defn create-account
  "Creates an AWS account that is automatically a member of the organization whose credentials made the request.
   This is an asynchronous request that AWS performs in the background. Because CreateAccount operates
   asynchronously, it can return a successful completion message even though account initialization might still be
   in progress. You might need to wait a few minutes before you can successfully access the account. To check the
   status of the request, do one of the following:




   Use the OperationId response element from this operation to provide as a parameter to the
   DescribeCreateAccountStatus operation.




   Check the AWS CloudTrail log for the CreateAccountResult event. For information on using AWS
   CloudTrail with AWS Organizations, see Monitoring the Activity in
   Your Organization in the AWS Organizations User Guide.





   The user who calls the API to create an account must have the organizations:CreateAccount
   permission. If you enabled all features in the organization, AWS Organizations will create the required
   service-linked role named AWSServiceRoleForOrganizations. For more information, see AWS Organizations and Service-Linked Roles in the AWS Organizations User Guide.


   AWS Organizations preconfigures the new member account with a role (named
   OrganizationAccountAccessRole by default) that grants users in the master account administrator
   permissions in the new member account. Principals in the master account can assume the role. AWS Organizations
   clones the company name and address information for the new account from the organization's master account.


   This operation can be called only from the organization's master account.


   For more information about creating accounts, see Creating an
   AWS Account in Your Organization in the AWS Organizations User Guide.





   When you create an account in an organization using the AWS Organizations console, API, or CLI commands, the
   information required for the account to operate as a standalone account, such as a payment method and signing the
   end user license agreement (EULA) is not automatically collected. If you must remove an account from your
   organization later, you can do so only after you provide the missing information. Follow the steps at  To leave an organization as a member account in the AWS Organizations User Guide.




   If you get an exception that indicates that you exceeded your account limits for the organization, contact AWS Support.




   If you get an exception that indicates that the operation failed because your organization is still initializing,
   wait one hour and then try again. If the error persists, contact AWS Support.




   Using CreateAccount to create multiple temporary accounts isn't recommended. You can only close an
   account from the Billing and Cost Management Console, and you must be signed in as the root user. For information
   on the requirements and process for closing an account, see Closing an AWS
   Account in the AWS Organizations User Guide.





   When you create a member account with this operation, you can choose whether to create the account with the
   IAM User and Role Access to Billing Information switch enabled. If you enable it, IAM users and roles that
   have appropriate permissions can view billing information for the account. If you disable it, only the account
   root user can access billing information. For information about how to disable this switch for an account, see Granting Access to Your
   Billing Information and Tools.

  request - `com.amazonaws.services.organizations.model.CreateAccountRequest`

  returns: Result of the CreateAccount operation returned by the service. - `com.amazonaws.services.organizations.model.CreateAccountResult`

  throws: com.amazonaws.services.organizations.model.TooManyRequestsException - You have sent too many requests in too short a period of time. The limit helps protect against denial-of-service attacks. Try again later. For information on limits that affect AWS Organizations, see Limits of AWS Organizations in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.CreateAccountResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.CreateAccountRequest request]
    (-> this (.createAccount request))))

(defn invite-account-to-organization
  "Sends an invitation to another account to join your organization as a member account. AWS Organizations sends
   email on your behalf to the email address that is associated with the other account's owner. The invitation is
   implemented as a Handshake whose details are in the response.





   You can invite AWS accounts only from the same seller as the master account. For example, if your organization's
   master account was created by Amazon Internet Services Pvt. Ltd (AISPL), an AWS seller in India, you can invite
   only other AISPL accounts to your organization. You can't combine accounts from AISPL and AWS or from any other
   AWS seller. For more information, see Consolidated Billing in India.




   If you receive an exception that indicates that you exceeded your account limits for the organization or that the
   operation failed because your organization is still initializing, wait one hour and then try again. If the error
   persists after an hour, contact AWS Support.





   This operation can be called only from the organization's master account.

  request - `com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest`

  returns: Result of the InviteAccountToOrganization operation returned by the service. - `com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult`

  throws: com.amazonaws.services.organizations.model.AccountOwnerNotVerifiedException - You can't invite an existing account to your organization until you verify that you own the email address associated with the master account. For more information, see Email Address Verification in the AWS Organizations User Guide."
  (^com.amazonaws.services.organizations.model.InviteAccountToOrganizationResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.InviteAccountToOrganizationRequest request]
    (-> this (.inviteAccountToOrganization request))))

(defn list-roots
  "Lists the roots that are defined in the current organization.



   Always check the NextToken response parameter for a null value when calling a
   List* operation. These operations can occasionally return an empty set of results even when there
   are more results available. The NextToken response parameter value is null only
   when there are no more results to display.



   This operation can be called only from the organization's master account.



   Policy types can be enabled and disabled in roots. This is distinct from whether they're available in the
   organization. When you enable all features, you make policy types available for use in that organization.
   Individual policy types can then be enabled and disabled in a root. To see the availability of a policy type in
   an organization, use DescribeOrganization.

  request - `com.amazonaws.services.organizations.model.ListRootsRequest`

  returns: Result of the ListRoots operation returned by the service. - `com.amazonaws.services.organizations.model.ListRootsResult`

  throws: com.amazonaws.services.organizations.model.AccessDeniedException - You don't have permissions to perform the requested operation. The user or role that is making the request must have at least one IAM permissions policy attached that grants the required permissions. For more information, see Access Management in the IAM User Guide."
  (^com.amazonaws.services.organizations.model.ListRootsResult [^AWSOrganizationsClient this ^com.amazonaws.services.organizations.model.ListRootsRequest request]
    (-> this (.listRoots request))))

