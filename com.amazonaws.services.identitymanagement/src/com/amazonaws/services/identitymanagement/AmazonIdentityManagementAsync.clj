(ns com.amazonaws.services.identitymanagement.AmazonIdentityManagementAsync
  "Interface for accessing IAM asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonIdentityManagementAsync instead.


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
  (:import [com.amazonaws.services.identitymanagement AmazonIdentityManagementAsync]))

(defn get-service-last-accessed-details-async
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

  get-service-last-accessed-details-request - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceLastAccessedDetails operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsRequest get-service-last-accessed-details-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceLastAccessedDetailsAsync get-service-last-accessed-details-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsRequest get-service-last-accessed-details-request]
    (-> this (.getServiceLastAccessedDetailsAsync get-service-last-accessed-details-request))))

(defn get-account-password-policy-async
  "Retrieves the password policy for the AWS account. For more information about using a password policy, go to Managing an IAM
   Password Policy.

  get-account-password-policy-request - `com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountPasswordPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest get-account-password-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountPasswordPolicyAsync get-account-password-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetAccountPasswordPolicyRequest get-account-password-policy-request]
    (-> this (.getAccountPasswordPolicyAsync get-account-password-policy-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.getAccountPasswordPolicyAsync))))

(defn get-user-policy-async
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

  get-user-policy-request - `com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUserPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetUserPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest get-user-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserPolicyAsync get-user-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetUserPolicyRequest get-user-policy-request]
    (-> this (.getUserPolicyAsync get-user-policy-request))))

(defn list-group-policies-async
  "Lists the names of the inline policies that are embedded in the specified IAM group.


   An IAM group can also have managed policies attached to it. To list the managed policies that are attached to a
   group, use ListAttachedGroupPolicies. For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. If there are no
   inline policies embedded with the specified group, the operation returns an empty list.

  list-group-policies-request - `com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListGroupPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest list-group-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupPoliciesAsync list-group-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListGroupPoliciesRequest list-group-policies-request]
    (-> this (.listGroupPoliciesAsync list-group-policies-request))))

(defn create-login-profile-async
  "Creates a password for the specified user, giving the user the ability to access AWS services through the AWS
   Management Console. For more information about managing passwords, see Managing Passwords in the
   IAM User Guide.

  create-login-profile-request - `com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateLoginProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateLoginProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest create-login-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createLoginProfileAsync create-login-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateLoginProfileRequest create-login-profile-request]
    (-> this (.createLoginProfileAsync create-login-profile-request))))

(defn delete-policy-async
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

  delete-policy-request - `com.amazonaws.services.identitymanagement.model.DeletePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeletePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeletePolicyRequest delete-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyAsync delete-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeletePolicyRequest delete-policy-request]
    (-> this (.deletePolicyAsync delete-policy-request))))

(defn list-access-keys-async
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

  list-access-keys-request - `com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccessKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListAccessKeysResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest list-access-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccessKeysAsync list-access-keys-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListAccessKeysRequest list-access-keys-request]
    (-> this (.listAccessKeysAsync list-access-keys-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listAccessKeysAsync))))

(defn attach-user-policy-async
  "Attaches the specified managed policy to the specified user.


   You use this API to attach a managed policy to a user. To embed an inline policy in a user, use
   PutUserPolicy.


   For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  attach-user-policy-request - `com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachUserPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AttachUserPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest attach-user-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachUserPolicyAsync attach-user-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AttachUserPolicyRequest attach-user-policy-request]
    (-> this (.attachUserPolicyAsync attach-user-policy-request))))

(defn delete-user-permissions-boundary-async
  "Deletes the permissions boundary for the specified IAM user.



   Deleting the permissions boundary for a user might increase its permissions by allowing the user to perform all
   the actions granted in its permissions policies.

  delete-user-permissions-boundary-request - `com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserPermissionsBoundary operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryRequest delete-user-permissions-boundary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserPermissionsBoundaryAsync delete-user-permissions-boundary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteUserPermissionsBoundaryRequest delete-user-permissions-boundary-request]
    (-> this (.deleteUserPermissionsBoundaryAsync delete-user-permissions-boundary-request))))

(defn untag-role-async
  "Removes the specified tags from the role. For more information about tagging, see Tagging IAM Identities in the IAM
   User Guide.

  untag-role-request - `com.amazonaws.services.identitymanagement.model.UntagRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UntagRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UntagRoleRequest untag-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagRoleAsync untag-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UntagRoleRequest untag-role-request]
    (-> this (.untagRoleAsync untag-role-request))))

(defn detach-role-policy-async
  "Removes the specified managed policy from the specified role.


   A role can also have inline policies embedded with it. To delete an inline policy, use the
   DeleteRolePolicy API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  detach-role-policy-request - `com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DetachRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest detach-role-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachRolePolicyAsync detach-role-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DetachRolePolicyRequest detach-role-policy-request]
    (-> this (.detachRolePolicyAsync detach-role-policy-request))))

(defn list-entities-for-policy-async
  "Lists all IAM users, groups, and roles that the specified managed policy is attached to.


   You can use the optional EntityFilter parameter to limit the results to a particular type of entity
   (users, groups, or roles). For example, to list only the roles that are attached to the specified policy, set
   EntityFilter to Role.


   You can paginate the results using the MaxItems and Marker parameters.

  list-entities-for-policy-request - `com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEntitiesForPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest list-entities-for-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEntitiesForPolicyAsync list-entities-for-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListEntitiesForPolicyRequest list-entities-for-policy-request]
    (-> this (.listEntitiesForPolicyAsync list-entities-for-policy-request))))

(defn create-group-async
  "Creates a new group.


   For information about the number of groups you can create, see Limitations on IAM
   Entities in the IAM User Guide.

  create-group-request - `com.amazonaws.services.identitymanagement.model.CreateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateGroupRequest create-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createGroupAsync create-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateGroupRequest create-group-request]
    (-> this (.createGroupAsync create-group-request))))

(defn delete-user-policy-async
  "Deletes the specified inline policy that is embedded in the specified IAM user.


   A user can also have managed policies attached to it. To detach a managed policy from a user, use
   DetachUserPolicy. For more information about policies, refer to Managed Policies and
   Inline Policies in the IAM User Guide.

  delete-user-policy-request - `com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUserPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteUserPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest delete-user-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserPolicyAsync delete-user-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteUserPolicyRequest delete-user-policy-request]
    (-> this (.deleteUserPolicyAsync delete-user-policy-request))))

(defn list-account-aliases-async
  "Lists the account alias associated with the AWS account (Note: you can have only one). For information about
   using an AWS account alias, see Using an Alias for Your AWS Account
   ID in the IAM User Guide.

  list-account-aliases-request - `com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAccountAliases operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListAccountAliasesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest list-account-aliases-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAccountAliasesAsync list-account-aliases-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListAccountAliasesRequest list-account-aliases-request]
    (-> this (.listAccountAliasesAsync list-account-aliases-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listAccountAliasesAsync))))

(defn put-role-permissions-boundary-async
  "Adds or updates the policy that is specified as the IAM role's permissions boundary. You can use an AWS managed
   policy or a customer managed policy to set the boundary for a role. Use the boundary to control the maximum
   permissions that the role can have. Setting a permissions boundary is an advanced feature that can affect the
   permissions for the role.


   You cannot set the boundary for a service-linked role.



   Policies used as permissions boundaries do not provide permissions. You must also attach a permissions policy to
   the role. To learn how the effective permissions for a role are evaluated, see IAM JSON Policy
   Evaluation Logic in the IAM User Guide.

  put-role-permissions-boundary-request - `com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRolePermissionsBoundary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryRequest put-role-permissions-boundary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRolePermissionsBoundaryAsync put-role-permissions-boundary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.PutRolePermissionsBoundaryRequest put-role-permissions-boundary-request]
    (-> this (.putRolePermissionsBoundaryAsync put-role-permissions-boundary-request))))

(defn update-service-specific-credential-async
  "Sets the status of a service-specific credential to Active or Inactive.
   Service-specific credentials that are inactive cannot be used for authentication to the service. This operation
   can be used to disable a user's service-specific credential as part of a credential rotation work flow.

  update-service-specific-credential-request - `com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServiceSpecificCredential operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest update-service-specific-credential-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServiceSpecificCredentialAsync update-service-specific-credential-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateServiceSpecificCredentialRequest update-service-specific-credential-request]
    (-> this (.updateServiceSpecificCredentialAsync update-service-specific-credential-request))))

(defn get-server-certificate-async
  "Retrieves information about the specified server certificate stored in IAM.


   For more information about working with server certificates, see Working with Server
   Certificates in the IAM User Guide. This topic includes a list of AWS services that can use the server
   certificates that you manage with IAM.

  get-server-certificate-request - `com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServerCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetServerCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest get-server-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServerCertificateAsync get-server-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetServerCertificateRequest get-server-certificate-request]
    (-> this (.getServerCertificateAsync get-server-certificate-request))))

(defn detach-user-policy-async
  "Removes the specified managed policy from the specified user.


   A user can also have inline policies embedded with it. To delete an inline policy, use the
   DeleteUserPolicy API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  detach-user-policy-request - `com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachUserPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DetachUserPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest detach-user-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachUserPolicyAsync detach-user-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DetachUserPolicyRequest detach-user-policy-request]
    (-> this (.detachUserPolicyAsync detach-user-policy-request))))

(defn list-signing-certificates-async
  "Returns information about the signing certificates associated with the specified IAM user. If none exists, the
   operation returns an empty list.


   Although each user is limited to a small number of signing certificates, you can still paginate the results using
   the MaxItems and Marker parameters.


   If the UserName field is not specified, the user name is determined implicitly based on the AWS
   access key ID used to sign the request for this API. This operation works for access keys under the AWS account.
   Consequently, you can use this operation to manage AWS account root user credentials even if the AWS account has
   no associated users.

  list-signing-certificates-request - `com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSigningCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListSigningCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest list-signing-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSigningCertificatesAsync list-signing-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListSigningCertificatesRequest list-signing-certificates-request]
    (-> this (.listSigningCertificatesAsync list-signing-certificates-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listSigningCertificatesAsync))))

(defn create-policy-async
  "Creates a new managed policy for your AWS account.


   This operation creates a policy version with a version identifier of v1 and sets v1 as the policy's
   default version. For more information about policy versions, see Versioning for Managed
   Policies in the IAM User Guide.


   For more information about managed policies in general, see Managed Policies and
   Inline Policies in the IAM User Guide.

  create-policy-request - `com.amazonaws.services.identitymanagement.model.CreatePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreatePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreatePolicyRequest create-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPolicyAsync create-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreatePolicyRequest create-policy-request]
    (-> this (.createPolicyAsync create-policy-request))))

(defn get-organizations-access-report-async
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

  get-organizations-access-report-request - `com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOrganizationsAccessReport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportRequest get-organizations-access-report-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOrganizationsAccessReportAsync get-organizations-access-report-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetOrganizationsAccessReportRequest get-organizations-access-report-request]
    (-> this (.getOrganizationsAccessReportAsync get-organizations-access-report-request))))

(defn list-attached-role-policies-async
  "Lists all managed policies that are attached to the specified IAM role.


   An IAM role can also have inline policies embedded with it. To list the inline policies for a role, use the
   ListRolePolicies API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. You can use the
   PathPrefix parameter to limit the list of policies to only those matching the specified path prefix.
   If there are no policies attached to the specified role (or none that match the specified path prefix), the
   operation returns an empty list.

  list-attached-role-policies-request - `com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttachedRolePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest list-attached-role-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttachedRolePoliciesAsync list-attached-role-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListAttachedRolePoliciesRequest list-attached-role-policies-request]
    (-> this (.listAttachedRolePoliciesAsync list-attached-role-policies-request))))

(defn update-login-profile-async
  "Changes the password for the specified IAM user.


   IAM users can change their own passwords by calling ChangePassword. For more information about modifying
   passwords, see Managing
   Passwords in the IAM User Guide.

  update-login-profile-request - `com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateLoginProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateLoginProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest update-login-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateLoginProfileAsync update-login-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateLoginProfileRequest update-login-profile-request]
    (-> this (.updateLoginProfileAsync update-login-profile-request))))

(defn delete-user-async
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

  delete-user-request - `com.amazonaws.services.identitymanagement.model.DeleteUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteUserRequest delete-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteUserAsync delete-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteUserRequest delete-user-request]
    (-> this (.deleteUserAsync delete-user-request))))

(defn delete-open-id-connect-provider-async
  "Deletes an OpenID Connect identity provider (IdP) resource object in IAM.


   Deleting an IAM OIDC provider resource does not update any roles that reference the provider as a principal in
   their trust policies. Any attempt to assume a role that references a deleted provider fails.


   This operation is idempotent; it does not fail or return an error if you call the operation for a provider that
   does not exist.

  delete-open-id-connect-provider-request - `com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteOpenIDConnectProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest delete-open-id-connect-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteOpenIDConnectProviderAsync delete-open-id-connect-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteOpenIDConnectProviderRequest delete-open-id-connect-provider-request]
    (-> this (.deleteOpenIDConnectProviderAsync delete-open-id-connect-provider-request))))

(defn put-user-policy-async
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

  put-user-policy-request - `com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutUserPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.PutUserPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest put-user-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putUserPolicyAsync put-user-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.PutUserPolicyRequest put-user-policy-request]
    (-> this (.putUserPolicyAsync put-user-policy-request))))

(defn delete-signing-certificate-async
  "Deletes a signing certificate associated with the specified IAM user.


   If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
   the request. This operation works for access keys under the AWS account. Consequently, you can use this operation
   to manage AWS account root user credentials even if the AWS account has no associated IAM users.

  delete-signing-certificate-request - `com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSigningCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest delete-signing-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSigningCertificateAsync delete-signing-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteSigningCertificateRequest delete-signing-certificate-request]
    (-> this (.deleteSigningCertificateAsync delete-signing-certificate-request))))

(defn update-ssh-public-key-async
  "Sets the status of an IAM user's SSH public key to active or inactive. SSH public keys that are inactive cannot
   be used for authentication. This operation can be used to disable a user's SSH public key as part of a key
   rotation work flow.


   The SSH public key affected by this operation is used only for authenticating the associated IAM user to an AWS
   CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
   see Set up AWS
   CodeCommit for SSH Connections in the AWS CodeCommit User Guide.

  update-ssh-public-key-request - `com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest update-ssh-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSSHPublicKeyAsync update-ssh-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateSSHPublicKeyRequest update-ssh-public-key-request]
    (-> this (.updateSSHPublicKeyAsync update-ssh-public-key-request))))

(defn simulate-custom-policy-async
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

  simulate-custom-policy-request - `com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SimulateCustomPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest simulate-custom-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.simulateCustomPolicyAsync simulate-custom-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.SimulateCustomPolicyRequest simulate-custom-policy-request]
    (-> this (.simulateCustomPolicyAsync simulate-custom-policy-request))))

(defn list-mfa-devices-async
  "Lists the MFA devices for an IAM user. If the request includes a IAM user name, then this operation lists all the
   MFA devices associated with the specified user. If you do not specify a user name, IAM determines the user name
   implicitly based on the AWS access key ID signing the request for this API.


   You can paginate the results using the MaxItems and Marker parameters.

  list-mfa-devices-request - `com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMFADevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListMFADevicesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest list-mfa-devices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMFADevicesAsync list-mfa-devices-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListMFADevicesRequest list-mfa-devices-request]
    (-> this (.listMFADevicesAsync list-mfa-devices-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listMFADevicesAsync))))

(defn get-account-authorization-details-async
  "Retrieves information about all IAM users, groups, roles, and policies in your AWS account, including their
   relationships to one another. Use this API to obtain a snapshot of the configuration of IAM permissions (users,
   groups, roles, and policies) in your account.



   Policies returned by this API are URL-encoded compliant with RFC
   3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
   use Java, you can use the decode method of the java.net.URLDecoder utility class in the
   Java SDK. Other languages and SDKs provide similar functionality.



   You can optionally filter the results using the Filter parameter. You can paginate the results using
   the MaxItems and Marker parameters.

  get-account-authorization-details-request - `com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountAuthorizationDetails operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest get-account-authorization-details-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountAuthorizationDetailsAsync get-account-authorization-details-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetAccountAuthorizationDetailsRequest get-account-authorization-details-request]
    (-> this (.getAccountAuthorizationDetailsAsync get-account-authorization-details-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.getAccountAuthorizationDetailsAsync))))

(defn delete-access-key-async
  "Deletes the access key pair associated with the specified IAM user.


   If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID signing
   the request. This operation works for access keys under the AWS account. Consequently, you can use this operation
   to manage AWS account root user credentials even if the AWS account has no associated users.

  delete-access-key-request - `com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccessKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteAccessKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest delete-access-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccessKeyAsync delete-access-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteAccessKeyRequest delete-access-key-request]
    (-> this (.deleteAccessKeyAsync delete-access-key-request))))

(defn generate-service-last-accessed-details-async
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

  generate-service-last-accessed-details-request - `com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateServiceLastAccessedDetails operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsRequest generate-service-last-accessed-details-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateServiceLastAccessedDetailsAsync generate-service-last-accessed-details-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GenerateServiceLastAccessedDetailsRequest generate-service-last-accessed-details-request]
    (-> this (.generateServiceLastAccessedDetailsAsync generate-service-last-accessed-details-request))))

(defn get-service-last-accessed-details-with-entities-async
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

  get-service-last-accessed-details-with-entities-request - `com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceLastAccessedDetailsWithEntities operation returned
           by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesRequest get-service-last-accessed-details-with-entities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceLastAccessedDetailsWithEntitiesAsync get-service-last-accessed-details-with-entities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetServiceLastAccessedDetailsWithEntitiesRequest get-service-last-accessed-details-with-entities-request]
    (-> this (.getServiceLastAccessedDetailsWithEntitiesAsync get-service-last-accessed-details-with-entities-request))))

(defn put-user-permissions-boundary-async
  "Adds or updates the policy that is specified as the IAM user's permissions boundary. You can use an AWS managed
   policy or a customer managed policy to set the boundary for a user. Use the boundary to control the maximum
   permissions that the user can have. Setting a permissions boundary is an advanced feature that can affect the
   permissions for the user.



   Policies that are used as permissions boundaries do not provide permissions. You must also attach a permissions
   policy to the user. To learn how the effective permissions for a user are evaluated, see IAM JSON Policy
   Evaluation Logic in the IAM User Guide.

  put-user-permissions-boundary-request - `com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutUserPermissionsBoundary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryRequest put-user-permissions-boundary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putUserPermissionsBoundaryAsync put-user-permissions-boundary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.PutUserPermissionsBoundaryRequest put-user-permissions-boundary-request]
    (-> this (.putUserPermissionsBoundaryAsync put-user-permissions-boundary-request))))

(defn delete-policy-version-async
  "Deletes the specified version from the specified managed policy.


   You cannot delete the default version from a policy using this API. To delete the default version from a policy,
   use DeletePolicy. To find out which version of a policy is marked as the default version, use
   ListPolicyVersions.


   For information about versions for managed policies, see Versioning for Managed
   Policies in the IAM User Guide.

  delete-policy-version-request - `com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeletePolicyVersionResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest delete-policy-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyVersionAsync delete-policy-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeletePolicyVersionRequest delete-policy-version-request]
    (-> this (.deletePolicyVersionAsync delete-policy-version-request))))

(defn upload-ssh-public-key-async
  "Uploads an SSH public key and associates it with the specified IAM user.


   The SSH public key uploaded by this operation can be used only for authenticating the associated IAM user to an
   AWS CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit
   repository, see Set up AWS
   CodeCommit for SSH Connections in the AWS CodeCommit User Guide.

  upload-ssh-public-key-request - `com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest upload-ssh-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadSSHPublicKeyAsync upload-ssh-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UploadSSHPublicKeyRequest upload-ssh-public-key-request]
    (-> this (.uploadSSHPublicKeyAsync upload-ssh-public-key-request))))

(defn get-role-policy-async
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

  get-role-policy-request - `com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest get-role-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRolePolicyAsync get-role-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetRolePolicyRequest get-role-policy-request]
    (-> this (.getRolePolicyAsync get-role-policy-request))))

(defn create-service-linked-role-async
  "Creates an IAM role that is linked to a specific AWS service. The service controls the attached policies and when
   the role can be deleted. This helps ensure that the service is not broken by an unexpectedly changed or deleted
   role, which could put your AWS resources into an unknown state. Allowing the service to control the role helps
   improve service stability and proper cleanup when a service and its role are no longer needed. For more
   information, see Using
   Service-Linked Roles in the IAM User Guide.


   To attach a policy to this service-linked role, you must make the request using the AWS service that depends on
   this role.

  create-service-linked-role-request - `com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServiceLinkedRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest create-service-linked-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServiceLinkedRoleAsync create-service-linked-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateServiceLinkedRoleRequest create-service-linked-role-request]
    (-> this (.createServiceLinkedRoleAsync create-service-linked-role-request))))

(defn get-open-id-connect-provider-async
  "Returns information about the specified OpenID Connect (OIDC) provider resource object in IAM.

  get-open-id-connect-provider-request - `com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOpenIDConnectProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest get-open-id-connect-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOpenIDConnectProviderAsync get-open-id-connect-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetOpenIDConnectProviderRequest get-open-id-connect-provider-request]
    (-> this (.getOpenIDConnectProviderAsync get-open-id-connect-provider-request))))

(defn get-group-policy-async
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

  get-group-policy-request - `com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetGroupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest get-group-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupPolicyAsync get-group-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetGroupPolicyRequest get-group-policy-request]
    (-> this (.getGroupPolicyAsync get-group-policy-request))))

(defn add-client-id-to-open-id-connect-provider-async
  "Adds a new client ID (also known as audience) to the list of client IDs already registered for the specified IAM
   OpenID Connect (OIDC) provider resource.


   This operation is idempotent; it does not fail or return an error if you add an existing client ID to the
   provider.

  add-client-id-to-open-id-connect-provider-request - `com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddClientIDToOpenIDConnectProvider operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest add-client-id-to-open-id-connect-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addClientIDToOpenIDConnectProviderAsync add-client-id-to-open-id-connect-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AddClientIDToOpenIDConnectProviderRequest add-client-id-to-open-id-connect-provider-request]
    (-> this (.addClientIDToOpenIDConnectProviderAsync add-client-id-to-open-id-connect-provider-request))))

(defn add-role-to-instance-profile-async
  "Adds the specified IAM role to the specified instance profile. An instance profile can contain only one role, and
   this limit cannot be increased. You can remove the existing role and then add a different role to an instance
   profile. You must then wait for the change to appear across all of AWS because of eventual consistency. To force the change, you must

   disassociate the instance profile and then associate the
   instance profile, or you can stop your instance and then restart it.



   The caller of this API must be granted the PassRole permission on the IAM role by a permissions
   policy.



   For more information about roles, go to Working with Roles. For more
   information about instance profiles, go to About Instance Profiles.

  add-role-to-instance-profile-request - `com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddRoleToInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest add-role-to-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addRoleToInstanceProfileAsync add-role-to-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AddRoleToInstanceProfileRequest add-role-to-instance-profile-request]
    (-> this (.addRoleToInstanceProfileAsync add-role-to-instance-profile-request))))

(defn remove-client-id-from-open-id-connect-provider-async
  "Removes the specified client ID (also known as audience) from the list of client IDs registered for the specified
   IAM OpenID Connect (OIDC) provider resource object.


   This operation is idempotent; it does not fail or return an error if you try to remove a client ID that does not
   exist.

  remove-client-id-from-open-id-connect-provider-request - `com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveClientIDFromOpenIDConnectProvider operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest remove-client-id-from-open-id-connect-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeClientIDFromOpenIDConnectProviderAsync remove-client-id-from-open-id-connect-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.RemoveClientIDFromOpenIDConnectProviderRequest remove-client-id-from-open-id-connect-provider-request]
    (-> this (.removeClientIDFromOpenIDConnectProviderAsync remove-client-id-from-open-id-connect-provider-request))))

(defn update-signing-certificate-async
  "Changes the status of the specified user signing certificate from active to disabled, or vice versa. This
   operation can be used to disable an IAM user's signing certificate as part of a certificate rotation work flow.


   If the UserName field is not specified, the user name is determined implicitly based on the AWS
   access key ID used to sign the request. This operation works for access keys under the AWS account. Consequently,
   you can use this operation to manage AWS account root user credentials even if the AWS account has no associated
   users.

  update-signing-certificate-request - `com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSigningCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest update-signing-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSigningCertificateAsync update-signing-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateSigningCertificateRequest update-signing-certificate-request]
    (-> this (.updateSigningCertificateAsync update-signing-certificate-request))))

(defn update-saml-provider-async
  "Updates the metadata document for an existing SAML provider resource object.



   This operation requires Signature Version 4.

  update-saml-provider-request - `com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateSAMLProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest update-saml-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateSAMLProviderAsync update-saml-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateSAMLProviderRequest update-saml-provider-request]
    (-> this (.updateSAMLProviderAsync update-saml-provider-request))))

(defn upload-signing-certificate-async
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

  upload-signing-certificate-request - `com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadSigningCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UploadSigningCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest upload-signing-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadSigningCertificateAsync upload-signing-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UploadSigningCertificateRequest upload-signing-certificate-request]
    (-> this (.uploadSigningCertificateAsync upload-signing-certificate-request))))

(defn upload-server-certificate-async
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

  upload-server-certificate-request - `com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UploadServerCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UploadServerCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest upload-server-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.uploadServerCertificateAsync upload-server-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UploadServerCertificateRequest upload-server-certificate-request]
    (-> this (.uploadServerCertificateAsync upload-server-certificate-request))))

(defn list-instance-profiles-for-role-async
  "Lists the instance profiles that have the specified associated IAM role. If there are none, the operation returns
   an empty list. For more information about instance profiles, go to About Instance Profiles.


   You can paginate the results using the MaxItems and Marker parameters.

  list-instance-profiles-for-role-request - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstanceProfilesForRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest list-instance-profiles-for-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstanceProfilesForRoleAsync list-instance-profiles-for-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesForRoleRequest list-instance-profiles-for-role-request]
    (-> this (.listInstanceProfilesForRoleAsync list-instance-profiles-for-role-request))))

(defn delete-group-policy-async
  "Deletes the specified inline policy that is embedded in the specified IAM group.


   A group can also have managed policies attached to it. To detach a managed policy from a group, use
   DetachGroupPolicy. For more information about policies, refer to Managed Policies and
   Inline Policies in the IAM User Guide.

  delete-group-policy-request - `com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest delete-group-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupPolicyAsync delete-group-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteGroupPolicyRequest delete-group-policy-request]
    (-> this (.deleteGroupPolicyAsync delete-group-policy-request))))

(defn delete-role-permissions-boundary-async
  "Deletes the permissions boundary for the specified IAM role.



   Deleting the permissions boundary for a role might increase its permissions. For example, it might allow anyone
   who assumes the role to perform all the actions granted in its permissions policies.

  delete-role-permissions-boundary-request - `com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRolePermissionsBoundary operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryRequest delete-role-permissions-boundary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRolePermissionsBoundaryAsync delete-role-permissions-boundary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteRolePermissionsBoundaryRequest delete-role-permissions-boundary-request]
    (-> this (.deleteRolePermissionsBoundaryAsync delete-role-permissions-boundary-request))))

(defn enable-mfa-device-async
  "Enables the specified MFA device and associates it with the specified IAM user. When enabled, the MFA device is
   required for every subsequent login by the IAM user associated with the device.

  enable-mfa-device-request - `com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableMFADevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.EnableMFADeviceResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest enable-mfa-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableMFADeviceAsync enable-mfa-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.EnableMFADeviceRequest enable-mfa-device-request]
    (-> this (.enableMFADeviceAsync enable-mfa-device-request))))

(defn update-role-description-async
  "Use UpdateRole instead.


   Modifies only the description of a role. This operation performs the same function as the
   Description parameter in the UpdateRole operation.

  update-role-description-request - `com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRoleDescription operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest update-role-description-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRoleDescriptionAsync update-role-description-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateRoleDescriptionRequest update-role-description-request]
    (-> this (.updateRoleDescriptionAsync update-role-description-request))))

(defn reset-service-specific-credential-async
  "Resets the password for a service-specific credential. The new password is AWS generated and cryptographically
   strong. It cannot be configured by the user. Resetting the password immediately invalidates the previous password
   associated with this user.

  reset-service-specific-credential-request - `com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResetServiceSpecificCredential operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest reset-service-specific-credential-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resetServiceSpecificCredentialAsync reset-service-specific-credential-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ResetServiceSpecificCredentialRequest reset-service-specific-credential-request]
    (-> this (.resetServiceSpecificCredentialAsync reset-service-specific-credential-request))))

(defn update-open-id-connect-provider-thumbprint-async
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

  update-open-id-connect-provider-thumbprint-request - `com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateOpenIDConnectProviderThumbprint operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest update-open-id-connect-provider-thumbprint-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateOpenIDConnectProviderThumbprintAsync update-open-id-connect-provider-thumbprint-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateOpenIDConnectProviderThumbprintRequest update-open-id-connect-provider-thumbprint-request]
    (-> this (.updateOpenIDConnectProviderThumbprintAsync update-open-id-connect-provider-thumbprint-request))))

(defn remove-role-from-instance-profile-async
  "Removes the specified IAM role from the specified EC2 instance profile.



   Make sure that you do not have any Amazon EC2 instances running with the role you are about to remove from the
   instance profile. Removing a role from an instance profile that is associated with a running instance might break
   any applications running on the instance.



   For more information about IAM roles, go to Working with Roles. For more
   information about instance profiles, go to About Instance Profiles.

  remove-role-from-instance-profile-request - `com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveRoleFromInstanceProfile operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest remove-role-from-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeRoleFromInstanceProfileAsync remove-role-from-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.RemoveRoleFromInstanceProfileRequest remove-role-from-instance-profile-request]
    (-> this (.removeRoleFromInstanceProfileAsync remove-role-from-instance-profile-request))))

(defn get-ssh-public-key-async
  "Retrieves the specified SSH public key, including metadata about the key.


   The SSH public key retrieved by this operation is used only for authenticating the associated IAM user to an AWS
   CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
   see Set up AWS
   CodeCommit for SSH Connections in the AWS CodeCommit User Guide.

  get-ssh-public-key-request - `com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest get-ssh-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSSHPublicKeyAsync get-ssh-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetSSHPublicKeyRequest get-ssh-public-key-request]
    (-> this (.getSSHPublicKeyAsync get-ssh-public-key-request))))

(defn update-role-async
  "Updates the description or maximum session duration setting of a role.

  update-role-request - `com.amazonaws.services.identitymanagement.model.UpdateRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateRoleRequest update-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateRoleAsync update-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateRoleRequest update-role-request]
    (-> this (.updateRoleAsync update-role-request))))

(defn delete-account-alias-async
  "Deletes the specified AWS account alias. For information about using an AWS account alias, see Using an Alias for Your AWS Account
   ID in the IAM User Guide.

  delete-account-alias-request - `com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccountAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteAccountAliasResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest delete-account-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccountAliasAsync delete-account-alias-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteAccountAliasRequest delete-account-alias-request]
    (-> this (.deleteAccountAliasAsync delete-account-alias-request))))

(defn create-user-async
  "Creates a new IAM user for your AWS account.


   For information about limitations on the number of IAM users you can create, see Limitations on IAM
   Entities in the IAM User Guide.

  create-user-request - `com.amazonaws.services.identitymanagement.model.CreateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateUserRequest create-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createUserAsync create-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateUserRequest create-user-request]
    (-> this (.createUserAsync create-user-request))))

(defn update-group-async
  "Updates the name and/or the path of the specified IAM group.



   You should understand the implications of changing a group's path or name. For more information, see Renaming Users and
   Groups in the IAM User Guide.



   The person making the request (the principal), must have permission to change the role group with the old name
   and the new name. For example, to change the group named Managers to MGRs, the
   principal must have a policy that allows them to update both groups. If the principal has permission to update
   the Managers group, but not the MGRs group, then the update fails. For more information
   about permissions, see Access
   Management.

  update-group-request - `com.amazonaws.services.identitymanagement.model.UpdateGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateGroupRequest update-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateGroupAsync update-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateGroupRequest update-group-request]
    (-> this (.updateGroupAsync update-group-request))))

(defn attach-role-policy-async
  "Attaches the specified managed policy to the specified IAM role. When you attach a managed policy to a role, the
   managed policy becomes part of the role's permission (access) policy.



   You cannot use a managed policy as the role's trust policy. The role's trust policy is created at the same time
   as the role, using CreateRole. You can update a role's trust policy using UpdateAssumeRolePolicy.



   Use this API to attach a managed policy to a role. To embed an inline policy in a role, use
   PutRolePolicy. For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  attach-role-policy-request - `com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AttachRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest attach-role-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachRolePolicyAsync attach-role-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AttachRolePolicyRequest attach-role-policy-request]
    (-> this (.attachRolePolicyAsync attach-role-policy-request))))

(defn delete-ssh-public-key-async
  "Deletes the specified SSH public key.


   The SSH public key deleted by this operation is used only for authenticating the associated IAM user to an AWS
   CodeCommit repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository,
   see Set up AWS
   CodeCommit for SSH Connections in the AWS CodeCommit User Guide.

  delete-ssh-public-key-request - `com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSSHPublicKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest delete-ssh-public-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSSHPublicKeyAsync delete-ssh-public-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteSSHPublicKeyRequest delete-ssh-public-key-request]
    (-> this (.deleteSSHPublicKeyAsync delete-ssh-public-key-request))))

(defn list-service-specific-credentials-async
  "Returns information about the service-specific credentials associated with the specified IAM user. If none
   exists, the operation returns an empty list. The service-specific credentials returned by this operation are used
   only for authenticating the IAM user to a specific service. For more information about using service-specific
   credentials to authenticate to an AWS service, see Set Up service-specific
   credentials in the AWS CodeCommit User Guide.

  list-service-specific-credentials-request - `com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServiceSpecificCredentials operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest list-service-specific-credentials-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServiceSpecificCredentialsAsync list-service-specific-credentials-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListServiceSpecificCredentialsRequest list-service-specific-credentials-request]
    (-> this (.listServiceSpecificCredentialsAsync list-service-specific-credentials-request))))

(defn get-role-async
  "Retrieves information about the specified role, including the role's path, GUID, ARN, and the role's trust policy
   that grants permission to assume the role. For more information about roles, see Working with Roles.



   Policies returned by this API are URL-encoded compliant with RFC
   3986. You can use a URL decoding method to convert the policy back to plain JSON text. For example, if you
   use Java, you can use the decode method of the java.net.URLDecoder utility class in the
   Java SDK. Other languages and SDKs provide similar functionality.

  get-role-request - `com.amazonaws.services.identitymanagement.model.GetRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetRoleRequest get-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getRoleAsync get-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetRoleRequest get-role-request]
    (-> this (.getRoleAsync get-role-request))))

(defn get-user-async
  "Retrieves information about the specified IAM user, including the user's creation date, path, unique ID, and ARN.


   If you do not specify a user name, IAM determines the user name implicitly based on the AWS access key ID used to
   sign the request to this API.

  get-user-request - `com.amazonaws.services.identitymanagement.model.GetUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetUserRequest get-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getUserAsync get-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetUserRequest get-user-request]
    (-> this (.getUserAsync get-user-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.getUserAsync))))

(defn put-group-policy-async
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

  put-group-policy-request - `com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutGroupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.PutGroupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest put-group-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putGroupPolicyAsync put-group-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.PutGroupPolicyRequest put-group-policy-request]
    (-> this (.putGroupPolicyAsync put-group-policy-request))))

(defn list-policies-granting-service-access-async
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

  list-policies-granting-service-access-request - `com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPoliciesGrantingServiceAccess operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessRequest list-policies-granting-service-access-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesGrantingServiceAccessAsync list-policies-granting-service-access-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListPoliciesGrantingServiceAccessRequest list-policies-granting-service-access-request]
    (-> this (.listPoliciesGrantingServiceAccessAsync list-policies-granting-service-access-request))))

(defn create-instance-profile-async
  "Creates a new instance profile. For information about instance profiles, go to About Instance Profiles.


   For information about the number of instance profiles you can create, see Limitations on IAM
   Entities in the IAM User Guide.

  create-instance-profile-request - `com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest create-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createInstanceProfileAsync create-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateInstanceProfileRequest create-instance-profile-request]
    (-> this (.createInstanceProfileAsync create-instance-profile-request))))

(defn get-saml-provider-async
  "Returns the SAML provider metadocument that was uploaded when the IAM SAML provider resource object was created
   or updated.



   This operation requires Signature Version 4.

  get-saml-provider-request - `com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSAMLProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetSAMLProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest get-saml-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSAMLProviderAsync get-saml-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetSAMLProviderRequest get-saml-provider-request]
    (-> this (.getSAMLProviderAsync get-saml-provider-request))))

(defn create-open-id-connect-provider-async
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

  create-open-id-connect-provider-request - `com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateOpenIDConnectProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest create-open-id-connect-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createOpenIDConnectProviderAsync create-open-id-connect-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateOpenIDConnectProviderRequest create-open-id-connect-provider-request]
    (-> this (.createOpenIDConnectProviderAsync create-open-id-connect-provider-request))))

(defn set-default-policy-version-async
  "Sets the specified version of the specified policy as the policy's default (operative) version.


   This operation affects all users, groups, and roles that the policy is attached to. To list the users, groups,
   and roles that the policy is attached to, use the ListEntitiesForPolicy API.


   For information about managed policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  set-default-policy-version-request - `com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetDefaultPolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest set-default-policy-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setDefaultPolicyVersionAsync set-default-policy-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.SetDefaultPolicyVersionRequest set-default-policy-version-request]
    (-> this (.setDefaultPolicyVersionAsync set-default-policy-version-request))))

(defn create-role-async
  "Creates a new role for your AWS account. For more information about roles, go to IAM Roles. For information
   about limitations on role names and the number of roles you can create, go to Limitations on IAM
   Entities in the IAM User Guide.

  create-role-request - `com.amazonaws.services.identitymanagement.model.CreateRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateRoleRequest create-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createRoleAsync create-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateRoleRequest create-role-request]
    (-> this (.createRoleAsync create-role-request))))

(defn remove-user-from-group-async
  "Removes the specified user from the specified group.

  remove-user-from-group-request - `com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RemoveUserFromGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest remove-user-from-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removeUserFromGroupAsync remove-user-from-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.RemoveUserFromGroupRequest remove-user-from-group-request]
    (-> this (.removeUserFromGroupAsync remove-user-from-group-request))))

(defn list-user-tags-async
  "Lists the tags that are attached to the specified user. The returned list of tags is sorted by tag key. For more
   information about tagging, see Tagging
   IAM Identities in the IAM User Guide.

  list-user-tags-request - `com.amazonaws.services.identitymanagement.model.ListUserTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListUserTagsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListUserTagsRequest list-user-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserTagsAsync list-user-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListUserTagsRequest list-user-tags-request]
    (-> this (.listUserTagsAsync list-user-tags-request))))

(defn detach-group-policy-async
  "Removes the specified managed policy from the specified IAM group.


   A group can also have inline policies embedded with it. To delete an inline policy, use the
   DeleteGroupPolicy API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  detach-group-policy-request - `com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetachGroupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DetachGroupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest detach-group-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detachGroupPolicyAsync detach-group-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DetachGroupPolicyRequest detach-group-policy-request]
    (-> this (.detachGroupPolicyAsync detach-group-policy-request))))

(defn get-credential-report-async
  "Retrieves a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in
   the IAM User Guide.

  get-credential-report-request - `com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCredentialReport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetCredentialReportResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest get-credential-report-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCredentialReportAsync get-credential-report-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetCredentialReportRequest get-credential-report-request]
    (-> this (.getCredentialReportAsync get-credential-report-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.getCredentialReportAsync))))

(defn untag-user-async
  "Removes the specified tags from the user. For more information about tagging, see Tagging IAM Identities in the IAM
   User Guide.

  untag-user-request - `com.amazonaws.services.identitymanagement.model.UntagUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UntagUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UntagUserRequest untag-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagUserAsync untag-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UntagUserRequest untag-user-request]
    (-> this (.untagUserAsync untag-user-request))))

(defn get-policy-version-async
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

  get-policy-version-request - `com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetPolicyVersionResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest get-policy-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyVersionAsync get-policy-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetPolicyVersionRequest get-policy-version-request]
    (-> this (.getPolicyVersionAsync get-policy-version-request))))

(defn list-policies-async
  "Lists all the managed policies that are available in your AWS account, including your own customer-defined
   managed policies and all AWS managed policies.


   You can filter the list of policies that is returned using the optional OnlyAttached,
   Scope, and PathPrefix parameters. For example, to list only the customer managed
   policies in your AWS account, set Scope to Local. To list only AWS managed policies,
   set Scope to AWS.


   You can paginate the results using the MaxItems and Marker parameters.


   For more information about managed policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  list-policies-request - `com.amazonaws.services.identitymanagement.model.ListPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListPoliciesRequest list-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesAsync list-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListPoliciesRequest list-policies-request]
    (-> this (.listPoliciesAsync list-policies-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listPoliciesAsync))))

(defn list-role-policies-async
  "Lists the names of the inline policies that are embedded in the specified IAM role.


   An IAM role can also have managed policies attached to it. To list the managed policies that are attached to a
   role, use ListAttachedRolePolicies. For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. If there are no
   inline policies embedded with the specified role, the operation returns an empty list.

  list-role-policies-request - `com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRolePolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListRolePoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest list-role-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRolePoliciesAsync list-role-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListRolePoliciesRequest list-role-policies-request]
    (-> this (.listRolePoliciesAsync list-role-policies-request))))

(defn delete-saml-provider-async
  "Deletes a SAML provider resource in IAM.


   Deleting the provider resource from IAM does not update any roles that reference the SAML provider resource's ARN
   as a principal in their trust policies. Any attempt to assume a role that references a non-existent provider
   resource ARN fails.



   This operation requires Signature Version 4.

  delete-saml-provider-request - `com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteSAMLProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest delete-saml-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteSAMLProviderAsync delete-saml-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteSAMLProviderRequest delete-saml-provider-request]
    (-> this (.deleteSAMLProviderAsync delete-saml-provider-request))))

(defn list-attached-user-policies-async
  "Lists all managed policies that are attached to the specified IAM user.


   An IAM user can also have inline policies embedded with it. To list the inline policies for a user, use the
   ListUserPolicies API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. You can use the
   PathPrefix parameter to limit the list of policies to only those matching the specified path prefix.
   If there are no policies attached to the specified group (or none that match the specified path prefix), the
   operation returns an empty list.

  list-attached-user-policies-request - `com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttachedUserPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest list-attached-user-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttachedUserPoliciesAsync list-attached-user-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListAttachedUserPoliciesRequest list-attached-user-policies-request]
    (-> this (.listAttachedUserPoliciesAsync list-attached-user-policies-request))))

(defn update-server-certificate-async
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

  update-server-certificate-request - `com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateServerCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateServerCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest update-server-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateServerCertificateAsync update-server-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateServerCertificateRequest update-server-certificate-request]
    (-> this (.updateServerCertificateAsync update-server-certificate-request))))

(defn list-ssh-public-keys-async
  "Returns information about the SSH public keys associated with the specified IAM user. If none exists, the
   operation returns an empty list.


   The SSH public keys returned by this operation are used only for authenticating the IAM user to an AWS CodeCommit
   repository. For more information about using SSH keys to authenticate to an AWS CodeCommit repository, see Set up AWS
   CodeCommit for SSH Connections in the AWS CodeCommit User Guide.


   Although each user is limited to a small number of keys, you can still paginate the results using the
   MaxItems and Marker parameters.

  list-ssh-public-keys-request - `com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSSHPublicKeys operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest list-ssh-public-keys-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSSHPublicKeysAsync list-ssh-public-keys-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListSSHPublicKeysRequest list-ssh-public-keys-request]
    (-> this (.listSSHPublicKeysAsync list-ssh-public-keys-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listSSHPublicKeysAsync))))

(defn create-saml-provider-async
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

  create-saml-provider-request - `com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateSAMLProvider operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateSAMLProviderResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest create-saml-provider-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createSAMLProviderAsync create-saml-provider-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateSAMLProviderRequest create-saml-provider-request]
    (-> this (.createSAMLProviderAsync create-saml-provider-request))))

(defn create-policy-version-async
  "Creates a new version of the specified managed policy. To update a managed policy, you create a new policy
   version. A managed policy can have up to five versions. If the policy has five versions, you must delete an
   existing version using DeletePolicyVersion before you create a new version.


   Optionally, you can set the new version as the policy's default version. The default version is the version that
   is in effect for the IAM users, groups, and roles to which the policy is attached.


   For more information about managed policy versions, see Versioning for Managed
   Policies in the IAM User Guide.

  create-policy-version-request - `com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePolicyVersion operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreatePolicyVersionResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest create-policy-version-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPolicyVersionAsync create-policy-version-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreatePolicyVersionRequest create-policy-version-request]
    (-> this (.createPolicyVersionAsync create-policy-version-request))))

(defn generate-credential-report-async
  "Generates a credential report for the AWS account. For more information about the credential report, see Getting Credential Reports in
   the IAM User Guide.

  generate-credential-report-request - `com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateCredentialReport operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GenerateCredentialReportResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest generate-credential-report-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateCredentialReportAsync generate-credential-report-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GenerateCredentialReportRequest generate-credential-report-request]
    (-> this (.generateCredentialReportAsync generate-credential-report-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.generateCredentialReportAsync))))

(defn list-role-tags-async
  "Lists the tags that are attached to the specified role. The returned list of tags is sorted by tag key. For more
   information about tagging, see Tagging
   IAM Identities in the IAM User Guide.

  list-role-tags-request - `com.amazonaws.services.identitymanagement.model.ListRoleTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoleTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListRoleTagsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListRoleTagsRequest list-role-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRoleTagsAsync list-role-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListRoleTagsRequest list-role-tags-request]
    (-> this (.listRoleTagsAsync list-role-tags-request))))

(defn resync-mfa-device-async
  "Synchronizes the specified MFA device with its IAM resource object on the AWS servers.


   For more information about creating and working with virtual MFA devices, go to Using a Virtual MFA Device in
   the IAM User Guide.

  resync-mfa-device-request - `com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResyncMFADevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ResyncMFADeviceResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest resync-mfa-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resyncMFADeviceAsync resync-mfa-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ResyncMFADeviceRequest resync-mfa-device-request]
    (-> this (.resyncMFADeviceAsync resync-mfa-device-request))))

(defn create-service-specific-credential-async
  "Generates a set of credentials consisting of a user name and password that can be used to access the service
   specified in the request. These credentials are generated by IAM, and can be used only for the specified service.


   You can have a maximum of two sets of service-specific credentials for each supported service per user.


   The only supported service at this time is AWS CodeCommit.


   You can reset the password to a new service-generated value by calling ResetServiceSpecificCredential.


   For more information about service-specific credentials, see Using IAM with AWS
   CodeCommit: Git Credentials, SSH Keys, and AWS Access Keys in the IAM User Guide.

  create-service-specific-credential-request - `com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateServiceSpecificCredential operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest create-service-specific-credential-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createServiceSpecificCredentialAsync create-service-specific-credential-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateServiceSpecificCredentialRequest create-service-specific-credential-request]
    (-> this (.createServiceSpecificCredentialAsync create-service-specific-credential-request))))

(defn list-user-policies-async
  "Lists the names of the inline policies embedded in the specified IAM user.


   An IAM user can also have managed policies attached to it. To list the managed policies that are attached to a
   user, use ListAttachedUserPolicies. For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. If there are no
   inline policies embedded with the specified user, the operation returns an empty list.

  list-user-policies-request - `com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUserPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListUserPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest list-user-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUserPoliciesAsync list-user-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListUserPoliciesRequest list-user-policies-request]
    (-> this (.listUserPoliciesAsync list-user-policies-request))))

(defn generate-organizations-access-report-async
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

  generate-organizations-access-report-request - `com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GenerateOrganizationsAccessReport operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportRequest generate-organizations-access-report-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.generateOrganizationsAccessReportAsync generate-organizations-access-report-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GenerateOrganizationsAccessReportRequest generate-organizations-access-report-request]
    (-> this (.generateOrganizationsAccessReportAsync generate-organizations-access-report-request))))

(defn delete-role-async
  "Deletes the specified role. The role must not have any policies attached. For more information about roles, go to
   Working with Roles.



   Make sure that you do not have any Amazon EC2 instances running with the role you are about to delete. Deleting a
   role or instance profile that is associated with a running instance will break any applications running on the
   instance.

  delete-role-request - `com.amazonaws.services.identitymanagement.model.DeleteRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteRoleRequest delete-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRoleAsync delete-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteRoleRequest delete-role-request]
    (-> this (.deleteRoleAsync delete-role-request))))

(defn get-account-summary-async
  "Retrieves information about IAM entity usage and IAM quotas in the AWS account.


   For information about limitations on IAM entities, see Limitations on IAM
   Entities in the IAM User Guide.

  get-account-summary-request - `com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountSummary operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetAccountSummaryResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest get-account-summary-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountSummaryAsync get-account-summary-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetAccountSummaryRequest get-account-summary-request]
    (-> this (.getAccountSummaryAsync get-account-summary-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.getAccountSummaryAsync))))

(defn list-saml-providers-async
  "Lists the SAML provider resource objects defined in IAM in the account.



   This operation requires Signature Version 4.

  list-saml-providers-request - `com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSAMLProviders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListSAMLProvidersResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest list-saml-providers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSAMLProvidersAsync list-saml-providers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListSAMLProvidersRequest list-saml-providers-request]
    (-> this (.listSAMLProvidersAsync list-saml-providers-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listSAMLProvidersAsync))))

(defn delete-account-password-policy-async
  "Deletes the password policy for the AWS account. There are no parameters.

  delete-account-password-policy-request - `com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteAccountPasswordPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest delete-account-password-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteAccountPasswordPolicyAsync delete-account-password-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteAccountPasswordPolicyRequest delete-account-password-policy-request]
    (-> this (.deleteAccountPasswordPolicyAsync delete-account-password-policy-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.deleteAccountPasswordPolicyAsync))))

(defn list-roles-async
  "Lists the IAM roles that have the specified path prefix. If there are none, the operation returns an empty list.
   For more information about roles, go to Working with Roles.


   You can paginate the results using the MaxItems and Marker parameters.

  list-roles-request - `com.amazonaws.services.identitymanagement.model.ListRolesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListRoles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListRolesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListRolesRequest list-roles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listRolesAsync list-roles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListRolesRequest list-roles-request]
    (-> this (.listRolesAsync list-roles-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listRolesAsync))))

(defn get-group-async
  "Returns a list of IAM users that are in the specified IAM group. You can paginate the results using the
   MaxItems and Marker parameters.

  get-group-request - `com.amazonaws.services.identitymanagement.model.GetGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetGroupRequest get-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getGroupAsync get-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetGroupRequest get-group-request]
    (-> this (.getGroupAsync get-group-request))))

(defn tag-user-async
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

  tag-user-request - `com.amazonaws.services.identitymanagement.model.TagUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.TagUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.TagUserRequest tag-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagUserAsync tag-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.TagUserRequest tag-user-request]
    (-> this (.tagUserAsync tag-user-request))))

(defn get-context-keys-for-principal-policy-async
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

  get-context-keys-for-principal-policy-request - `com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContextKeysForPrincipalPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest get-context-keys-for-principal-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContextKeysForPrincipalPolicyAsync get-context-keys-for-principal-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForPrincipalPolicyRequest get-context-keys-for-principal-policy-request]
    (-> this (.getContextKeysForPrincipalPolicyAsync get-context-keys-for-principal-policy-request))))

(defn get-login-profile-async
  "Retrieves the user name and password-creation date for the specified IAM user. If the user has not been assigned
   a password, the operation returns a 404 (NoSuchEntity) error.

  get-login-profile-request - `com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLoginProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetLoginProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest get-login-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLoginProfileAsync get-login-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetLoginProfileRequest get-login-profile-request]
    (-> this (.getLoginProfileAsync get-login-profile-request))))

(defn delete-virtual-mfa-device-async
  "Deletes a virtual MFA device.



   You must deactivate a user's virtual MFA device before you can delete it. For information about deactivating MFA
   devices, see DeactivateMFADevice.

  delete-virtual-mfa-device-request - `com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVirtualMFADevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest delete-virtual-mfa-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVirtualMFADeviceAsync delete-virtual-mfa-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteVirtualMFADeviceRequest delete-virtual-mfa-device-request]
    (-> this (.deleteVirtualMFADeviceAsync delete-virtual-mfa-device-request))))

(defn get-policy-async
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

  get-policy-request - `com.amazonaws.services.identitymanagement.model.GetPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetPolicyRequest get-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyAsync get-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetPolicyRequest get-policy-request]
    (-> this (.getPolicyAsync get-policy-request))))

(defn delete-role-policy-async
  "Deletes the specified inline policy that is embedded in the specified IAM role.


   A role can also have managed policies attached to it. To detach a managed policy from a role, use
   DetachRolePolicy. For more information about policies, refer to Managed Policies and
   Inline Policies in the IAM User Guide.

  delete-role-policy-request - `com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest delete-role-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteRolePolicyAsync delete-role-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteRolePolicyRequest delete-role-policy-request]
    (-> this (.deleteRolePolicyAsync delete-role-policy-request))))

(defn update-assume-role-policy-async
  "Updates the policy that grants an IAM entity permission to assume a role. This is typically referred to as the
   \"role trust policy\". For more information about roles, go to Using Roles to Delegate Permissions
   and Federate Identities.

  update-assume-role-policy-request - `com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAssumeRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest update-assume-role-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAssumeRolePolicyAsync update-assume-role-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateAssumeRolePolicyRequest update-assume-role-policy-request]
    (-> this (.updateAssumeRolePolicyAsync update-assume-role-policy-request))))

(defn list-groups-for-user-async
  "Lists the IAM groups that the specified IAM user belongs to.


   You can paginate the results using the MaxItems and Marker parameters.

  list-groups-for-user-request - `com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroupsForUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListGroupsForUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest list-groups-for-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsForUserAsync list-groups-for-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListGroupsForUserRequest list-groups-for-user-request]
    (-> this (.listGroupsForUserAsync list-groups-for-user-request))))

(defn list-instance-profiles-async
  "Lists the instance profiles that have the specified path prefix. If there are none, the operation returns an
   empty list. For more information about instance profiles, go to About Instance Profiles.


   You can paginate the results using the MaxItems and Marker parameters.

  list-instance-profiles-request - `com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListInstanceProfiles operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListInstanceProfilesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest list-instance-profiles-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listInstanceProfilesAsync list-instance-profiles-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListInstanceProfilesRequest list-instance-profiles-request]
    (-> this (.listInstanceProfilesAsync list-instance-profiles-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listInstanceProfilesAsync))))

(defn create-account-alias-async
  "Creates an alias for your AWS account. For information about using an AWS account alias, see Using an Alias for Your AWS Account
   ID in the IAM User Guide.

  create-account-alias-request - `com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccountAlias operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateAccountAliasResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest create-account-alias-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAccountAliasAsync create-account-alias-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateAccountAliasRequest create-account-alias-request]
    (-> this (.createAccountAliasAsync create-account-alias-request))))

(defn set-security-token-service-preferences-async
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

  set-security-token-service-preferences-request - `com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetSecurityTokenServicePreferences operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesRequest set-security-token-service-preferences-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSecurityTokenServicePreferencesAsync set-security-token-service-preferences-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.SetSecurityTokenServicePreferencesRequest set-security-token-service-preferences-request]
    (-> this (.setSecurityTokenServicePreferencesAsync set-security-token-service-preferences-request))))

(defn tag-role-async
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

  tag-role-request - `com.amazonaws.services.identitymanagement.model.TagRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.TagRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.TagRoleRequest tag-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagRoleAsync tag-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.TagRoleRequest tag-role-request]
    (-> this (.tagRoleAsync tag-role-request))))

(defn attach-group-policy-async
  "Attaches the specified managed policy to the specified IAM group.


   You use this API to attach a managed policy to a group. To embed an inline policy in a group, use
   PutGroupPolicy.


   For more information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  attach-group-policy-request - `com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AttachGroupPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AttachGroupPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest attach-group-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.attachGroupPolicyAsync attach-group-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AttachGroupPolicyRequest attach-group-policy-request]
    (-> this (.attachGroupPolicyAsync attach-group-policy-request))))

(defn delete-server-certificate-async
  "Deletes the specified server certificate.


   For more information about working with server certificates, see Working with Server
   Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the
   server certificates that you manage with IAM.



   If you are using a server certificate with Elastic Load Balancing, deleting the certificate could have
   implications for your application. If Elastic Load Balancing doesn't detect the deletion of bound certificates,
   it may continue to use the certificates. This could cause Elastic Load Balancing to stop accepting traffic. We
   recommend that you remove the reference to the certificate from Elastic Load Balancing before using this command
   to delete the certificate. For more information, go to DeleteLoadBalancerListeners in the Elastic Load Balancing API Reference.

  delete-server-certificate-request - `com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServerCertificate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteServerCertificateResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest delete-server-certificate-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServerCertificateAsync delete-server-certificate-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteServerCertificateRequest delete-server-certificate-request]
    (-> this (.deleteServerCertificateAsync delete-server-certificate-request))))

(defn get-context-keys-for-custom-policy-async
  "Gets a list of all of the context keys referenced in the input policies. The policies are supplied as a list of
   one or more strings. To get the context keys from policies associated with an IAM user, group, or role, use
   GetContextKeysForPrincipalPolicy.


   Context keys are variables maintained by AWS and its services that provide details about the context of an API
   query request. Context keys can be evaluated by testing against a value specified in an IAM policy. Use
   GetContextKeysForCustomPolicy to understand what key names and values you must supply when you call
   SimulateCustomPolicy. Note that all parameters are shown in unencoded form here for clarity but must be
   URL encoded to be included as a part of a real HTML request.

  get-context-keys-for-custom-policy-request - `com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContextKeysForCustomPolicy operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest get-context-keys-for-custom-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContextKeysForCustomPolicyAsync get-context-keys-for-custom-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetContextKeysForCustomPolicyRequest get-context-keys-for-custom-policy-request]
    (-> this (.getContextKeysForCustomPolicyAsync get-context-keys-for-custom-policy-request))))

(defn list-attached-group-policies-async
  "Lists all managed policies that are attached to the specified IAM group.


   An IAM group can also have inline policies embedded with it. To list the inline policies for a group, use the
   ListGroupPolicies API. For information about policies, see Managed Policies and
   Inline Policies in the IAM User Guide.


   You can paginate the results using the MaxItems and Marker parameters. You can use the
   PathPrefix parameter to limit the list of policies to only those matching the specified path prefix.
   If there are no policies attached to the specified group (or none that match the specified path prefix), the
   operation returns an empty list.

  list-attached-group-policies-request - `com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListAttachedGroupPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest list-attached-group-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listAttachedGroupPoliciesAsync list-attached-group-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListAttachedGroupPoliciesRequest list-attached-group-policies-request]
    (-> this (.listAttachedGroupPoliciesAsync list-attached-group-policies-request))))

(defn list-server-certificates-async
  "Lists the server certificates stored in IAM that have the specified path prefix. If none exist, the operation
   returns an empty list.


   You can paginate the results using the MaxItems and Marker parameters.


   For more information about working with server certificates, see Working with Server
   Certificates in the IAM User Guide. This topic also includes a list of AWS services that can use the
   server certificates that you manage with IAM.

  list-server-certificates-request - `com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListServerCertificates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListServerCertificatesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest list-server-certificates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listServerCertificatesAsync list-server-certificates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListServerCertificatesRequest list-server-certificates-request]
    (-> this (.listServerCertificatesAsync list-server-certificates-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listServerCertificatesAsync))))

(defn delete-login-profile-async
  "Deletes the password for the specified IAM user, which terminates the user's ability to access AWS services
   through the AWS Management Console.



   Deleting a user's password does not prevent a user from accessing AWS through the command line interface or the
   API. To prevent all user access, you must also either make any access keys inactive or delete them. For more
   information about making keys inactive or deleting them, see UpdateAccessKey and DeleteAccessKey.

  delete-login-profile-request - `com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLoginProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteLoginProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest delete-login-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLoginProfileAsync delete-login-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteLoginProfileRequest delete-login-profile-request]
    (-> this (.deleteLoginProfileAsync delete-login-profile-request))))

(defn get-access-key-last-used-async
  "Retrieves information about when the specified access key was last used. The information includes the date and
   time of last use, along with the AWS service and Region that were specified in the last request made with that
   key.

  get-access-key-last-used-request - `com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccessKeyLastUsed operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest get-access-key-last-used-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccessKeyLastUsedAsync get-access-key-last-used-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetAccessKeyLastUsedRequest get-access-key-last-used-request]
    (-> this (.getAccessKeyLastUsedAsync get-access-key-last-used-request))))

(defn list-virtual-mfa-devices-async
  "Lists the virtual MFA devices defined in the AWS account by assignment status. If you do not specify an
   assignment status, the operation returns a list of all virtual MFA devices. Assignment status can be
   Assigned, Unassigned, or Any.


   You can paginate the results using the MaxItems and Marker parameters.

  list-virtual-mfa-devices-request - `com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVirtualMFADevices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest list-virtual-mfa-devices-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVirtualMFADevicesAsync list-virtual-mfa-devices-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListVirtualMFADevicesRequest list-virtual-mfa-devices-request]
    (-> this (.listVirtualMFADevicesAsync list-virtual-mfa-devices-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listVirtualMFADevicesAsync))))

(defn add-user-to-group-async
  "Adds the specified user to the specified group.

  add-user-to-group-request - `com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AddUserToGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.AddUserToGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest add-user-to-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addUserToGroupAsync add-user-to-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.AddUserToGroupRequest add-user-to-group-request]
    (-> this (.addUserToGroupAsync add-user-to-group-request))))

(defn put-role-policy-async
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

  put-role-policy-request - `com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutRolePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.PutRolePolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest put-role-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putRolePolicyAsync put-role-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.PutRolePolicyRequest put-role-policy-request]
    (-> this (.putRolePolicyAsync put-role-policy-request))))

(defn update-access-key-async
  "Changes the status of the specified access key from Active to Inactive, or vice versa. This operation can be used
   to disable a user's key as part of a key rotation workflow.


   If the UserName is not specified, the user name is determined implicitly based on the AWS access key
   ID used to sign the request. This operation works for access keys under the AWS account. Consequently, you can
   use this operation to manage AWS account root user credentials even if the AWS account has no associated users.


   For information about rotating keys, see Managing Keys and
   Certificates in the IAM User Guide.

  update-access-key-request - `com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccessKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateAccessKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest update-access-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccessKeyAsync update-access-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateAccessKeyRequest update-access-key-request]
    (-> this (.updateAccessKeyAsync update-access-key-request))))

(defn create-virtual-mfa-device-async
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

  create-virtual-mfa-device-request - `com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateVirtualMFADevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest create-virtual-mfa-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createVirtualMFADeviceAsync create-virtual-mfa-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateVirtualMFADeviceRequest create-virtual-mfa-device-request]
    (-> this (.createVirtualMFADeviceAsync create-virtual-mfa-device-request))))

(defn change-password-async
  "Changes the password of the IAM user who is calling this operation. The AWS account root user password is not
   affected by this operation.


   To change the password for a different user, see UpdateLoginProfile. For more information about modifying
   passwords, see Managing
   Passwords in the IAM User Guide.

  change-password-request - `com.amazonaws.services.identitymanagement.model.ChangePasswordRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ChangePassword operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ChangePasswordResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ChangePasswordRequest change-password-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changePasswordAsync change-password-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ChangePasswordRequest change-password-request]
    (-> this (.changePasswordAsync change-password-request))))

(defn deactivate-mfa-device-async
  "Deactivates the specified MFA device and removes it from association with the user name for which it was
   originally enabled.


   For more information about creating and working with virtual MFA devices, go to Enabling a Virtual Multi-factor
   Authentication (MFA) Device in the IAM User Guide.

  deactivate-mfa-device-request - `com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeactivateMFADevice operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest deactivate-mfa-device-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deactivateMFADeviceAsync deactivate-mfa-device-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeactivateMFADeviceRequest deactivate-mfa-device-request]
    (-> this (.deactivateMFADeviceAsync deactivate-mfa-device-request))))

(defn list-policy-versions-async
  "Lists information about the versions of the specified managed policy, including the version that is currently set
   as the policy's default version.


   For more information about managed policies, see Managed Policies and
   Inline Policies in the IAM User Guide.

  list-policy-versions-request - `com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicyVersions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListPolicyVersionsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest list-policy-versions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPolicyVersionsAsync list-policy-versions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListPolicyVersionsRequest list-policy-versions-request]
    (-> this (.listPolicyVersionsAsync list-policy-versions-request))))

(defn list-users-async
  "Lists the IAM users that have the specified path prefix. If no path prefix is specified, the operation returns
   all users in the AWS account. If there are none, the operation returns an empty list.


   You can paginate the results using the MaxItems and Marker parameters.

  list-users-request - `com.amazonaws.services.identitymanagement.model.ListUsersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListUsers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListUsersResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListUsersRequest list-users-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listUsersAsync list-users-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListUsersRequest list-users-request]
    (-> this (.listUsersAsync list-users-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listUsersAsync))))

(defn delete-instance-profile-async
  "Deletes the specified instance profile. The instance profile must not have an associated role.



   Make sure that you do not have any Amazon EC2 instances running with the instance profile you are about to
   delete. Deleting a role or instance profile that is associated with a running instance will break any
   applications running on the instance.



   For more information about instance profiles, go to About Instance Profiles.

  delete-instance-profile-request - `com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest delete-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteInstanceProfileAsync delete-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteInstanceProfileRequest delete-instance-profile-request]
    (-> this (.deleteInstanceProfileAsync delete-instance-profile-request))))

(defn list-groups-async
  "Lists the IAM groups that have the specified path prefix.


   You can paginate the results using the MaxItems and Marker parameters.

  list-groups-request - `com.amazonaws.services.identitymanagement.model.ListGroupsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListGroups operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListGroupsResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListGroupsRequest list-groups-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listGroupsAsync list-groups-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListGroupsRequest list-groups-request]
    (-> this (.listGroupsAsync list-groups-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listGroupsAsync))))

(defn update-account-password-policy-async
  "Updates the password policy settings for the AWS account.





   This operation does not support partial updates. No parameters are required, but if you do not specify a
   parameter, that parameter's value reverts to its default value. See the Request Parameters section for
   each parameter's default value. Also note that some parameters do not allow the default parameter to be
   explicitly set. Instead, to invoke the default value, do not include that parameter when you invoke the
   operation.





   For more information about using a password policy, see Managing an IAM
   Password Policy in the IAM User Guide.

  update-account-password-policy-request - `com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccountPasswordPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest update-account-password-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountPasswordPolicyAsync update-account-password-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateAccountPasswordPolicyRequest update-account-password-policy-request]
    (-> this (.updateAccountPasswordPolicyAsync update-account-password-policy-request))))

(defn delete-group-async
  "Deletes the specified IAM group. The group must not contain any users or have any attached policies.

  delete-group-request - `com.amazonaws.services.identitymanagement.model.DeleteGroupRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteGroup operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteGroupResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteGroupRequest delete-group-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteGroupAsync delete-group-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteGroupRequest delete-group-request]
    (-> this (.deleteGroupAsync delete-group-request))))

(defn get-service-linked-role-deletion-status-async
  "Retrieves the status of your service-linked role deletion. After you use the DeleteServiceLinkedRole API
   operation to submit a service-linked role for deletion, you can use the DeletionTaskId parameter in
   GetServiceLinkedRoleDeletionStatus to check the status of the deletion. If the deletion fails, this
   operation returns the reason that it failed, if that information is returned by the service.

  get-service-linked-role-deletion-status-request - `com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetServiceLinkedRoleDeletionStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest get-service-linked-role-deletion-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getServiceLinkedRoleDeletionStatusAsync get-service-linked-role-deletion-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetServiceLinkedRoleDeletionStatusRequest get-service-linked-role-deletion-status-request]
    (-> this (.getServiceLinkedRoleDeletionStatusAsync get-service-linked-role-deletion-status-request))))

(defn create-access-key-async
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

  create-access-key-request - `com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateAccessKey operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.CreateAccessKeyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest create-access-key-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createAccessKeyAsync create-access-key-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.CreateAccessKeyRequest create-access-key-request]
    (-> this (.createAccessKeyAsync create-access-key-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.createAccessKeyAsync))))

(defn list-open-id-connect-providers-async
  "Lists information about the IAM OpenID Connect (OIDC) provider resource objects defined in the AWS account.

  list-open-id-connect-providers-request - `com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOpenIDConnectProviders operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest list-open-id-connect-providers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOpenIDConnectProvidersAsync list-open-id-connect-providers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.ListOpenIDConnectProvidersRequest list-open-id-connect-providers-request]
    (-> this (.listOpenIDConnectProvidersAsync list-open-id-connect-providers-request)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this]
    (-> this (.listOpenIDConnectProvidersAsync))))

(defn get-instance-profile-async
  "Retrieves information about the specified instance profile, including the instance profile's path, GUID, ARN, and
   role. For more information about instance profiles, see About Instance Profiles in
   the IAM User Guide.

  get-instance-profile-request - `com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetInstanceProfile operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.GetInstanceProfileResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest get-instance-profile-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getInstanceProfileAsync get-instance-profile-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.GetInstanceProfileRequest get-instance-profile-request]
    (-> this (.getInstanceProfileAsync get-instance-profile-request))))

(defn delete-service-linked-role-async
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

  delete-service-linked-role-request - `com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServiceLinkedRole operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest delete-service-linked-role-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceLinkedRoleAsync delete-service-linked-role-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteServiceLinkedRoleRequest delete-service-linked-role-request]
    (-> this (.deleteServiceLinkedRoleAsync delete-service-linked-role-request))))

(defn update-user-async
  "Updates the name and/or the path of the specified IAM user.



   You should understand the implications of changing an IAM user's path or name. For more information, see Renaming an IAM
   User and Renaming an
   IAM Group in the IAM User Guide.



   To change a user name, the requester must have appropriate permissions on both the source object and the target
   object. For example, to change Bob to Robert, the entity making the request must have permission on Bob and
   Robert, or must have permission on all (*). For more information about permissions, see Permissions and Policies.

  update-user-request - `com.amazonaws.services.identitymanagement.model.UpdateUserRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateUser operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.UpdateUserResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateUserRequest update-user-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateUserAsync update-user-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.UpdateUserRequest update-user-request]
    (-> this (.updateUserAsync update-user-request))))

(defn simulate-principal-policy-async
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

  simulate-principal-policy-request - `com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SimulatePrincipalPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest simulate-principal-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.simulatePrincipalPolicyAsync simulate-principal-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.SimulatePrincipalPolicyRequest simulate-principal-policy-request]
    (-> this (.simulatePrincipalPolicyAsync simulate-principal-policy-request))))

(defn delete-service-specific-credential-async
  "Deletes the specified service-specific credential.

  delete-service-specific-credential-request - `com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteServiceSpecificCredential operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialResult>`"
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest delete-service-specific-credential-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteServiceSpecificCredentialAsync delete-service-specific-credential-request async-handler)))
  (^java.util.concurrent.Future [^AmazonIdentityManagementAsync this ^com.amazonaws.services.identitymanagement.model.DeleteServiceSpecificCredentialRequest delete-service-specific-credential-request]
    (-> this (.deleteServiceSpecificCredentialAsync delete-service-specific-credential-request))))

