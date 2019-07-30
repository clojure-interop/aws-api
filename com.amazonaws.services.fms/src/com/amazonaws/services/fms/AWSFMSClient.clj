(ns com.amazonaws.services.fms.AWSFMSClient
  "Client for accessing FMS. All service calls made using this client are blocking, and will not return until the
  service call completes.

  AWS Firewall Manager

  This is the AWS Firewall Manager API Reference. This guide is for developers who need detailed information
  about the AWS Firewall Manager API actions, data types, and errors. For detailed information about AWS Firewall
  Manager features, see the AWS
  Firewall Manager Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fms AWSFMSClient]))

(defn *builder
  "returns: `com.amazonaws.services.fms.AWSFMSClientBuilder`"
  (^com.amazonaws.services.fms.AWSFMSClientBuilder []
    (AWSFMSClient/builder )))

(defn associate-admin-account
  "Sets the AWS Firewall Manager administrator account. AWS Firewall Manager must be associated with the master
   account your AWS organization or associated with a member account that has the appropriate permissions. If the
   account ID that you submit is not an AWS Organizations master account, AWS Firewall Manager will set the
   appropriate permissions for the given member account.


   The account that you associate with AWS Firewall Manager is called the AWS Firewall Manager administrator
   account.

  request - `com.amazonaws.services.fms.model.AssociateAdminAccountRequest`

  returns: Result of the AssociateAdminAccount operation returned by the service. - `com.amazonaws.services.fms.model.AssociateAdminAccountResult`

  throws: com.amazonaws.services.fms.model.InvalidOperationException - The operation failed because there was nothing to do. For example, you might have submitted an AssociateAdminAccount request, but the account ID that you submitted was already set as the AWS Firewall Manager administrator."
  (^com.amazonaws.services.fms.model.AssociateAdminAccountResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.AssociateAdminAccountRequest request]
    (-> this (.associateAdminAccount request))))

(defn put-notification-channel
  "Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to
   record SNS logs.

  request - `com.amazonaws.services.fms.model.PutNotificationChannelRequest`

  returns: Result of the PutNotificationChannel operation returned by the service. - `com.amazonaws.services.fms.model.PutNotificationChannelResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.PutNotificationChannelResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.PutNotificationChannelRequest request]
    (-> this (.putNotificationChannel request))))

(defn put-policy
  "Creates an AWS Firewall Manager policy.


   Firewall Manager provides two types of policies: A Shield Advanced policy, which applies Shield Advanced
   protection to specified accounts and resources, or a WAF policy, which contains a rule group and defines which
   resources are to be protected by that rule group. A policy is specific to either WAF or Shield Advanced. If you
   want to enforce both WAF rules and Shield Advanced protection across accounts, you can create multiple policies.
   You can create one or more policies for WAF rules, and one or more policies for Shield Advanced.


   You must be subscribed to Shield Advanced to create a Shield Advanced policy. For more information on subscribing
   to Shield Advanced, see CreateSubscription.

  request - `com.amazonaws.services.fms.model.PutPolicyRequest`

  returns: Result of the PutPolicy operation returned by the service. - `com.amazonaws.services.fms.model.PutPolicyResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.PutPolicyResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.PutPolicyRequest request]
    (-> this (.putPolicy request))))

(defn list-compliance-status
  "Returns an array of PolicyComplianceStatus objects in the response. Use
   PolicyComplianceStatus to get a summary of which member accounts are protected by the specified
   policy.

  request - `com.amazonaws.services.fms.model.ListComplianceStatusRequest`

  returns: Result of the ListComplianceStatus operation returned by the service. - `com.amazonaws.services.fms.model.ListComplianceStatusResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.ListComplianceStatusResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.ListComplianceStatusRequest request]
    (-> this (.listComplianceStatus request))))

(defn delete-policy
  "Permanently deletes an AWS Firewall Manager policy.

  request - `com.amazonaws.services.fms.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.fms.model.DeletePolicyResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.DeletePolicyResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.DeletePolicyRequest request]
    (-> this (.deletePolicy request))))

(defn disassociate-admin-account
  "Disassociates the account that has been set as the AWS Firewall Manager administrator account. To set a different
   account as the administrator account, you must submit an AssociateAdminAccount request .

  request - `com.amazonaws.services.fms.model.DisassociateAdminAccountRequest`

  returns: Result of the DisassociateAdminAccount operation returned by the service. - `com.amazonaws.services.fms.model.DisassociateAdminAccountResult`

  throws: com.amazonaws.services.fms.model.InvalidOperationException - The operation failed because there was nothing to do. For example, you might have submitted an AssociateAdminAccount request, but the account ID that you submitted was already set as the AWS Firewall Manager administrator."
  (^com.amazonaws.services.fms.model.DisassociateAdminAccountResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.DisassociateAdminAccountRequest request]
    (-> this (.disassociateAdminAccount request))))

(defn delete-notification-channel
  "Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS)
   topic that is used to record AWS Firewall Manager SNS logs.

  request - `com.amazonaws.services.fms.model.DeleteNotificationChannelRequest`

  returns: Result of the DeleteNotificationChannel operation returned by the service. - `com.amazonaws.services.fms.model.DeleteNotificationChannelResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.DeleteNotificationChannelResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.DeleteNotificationChannelRequest request]
    (-> this (.deleteNotificationChannel request))))

(defn list-member-accounts
  "Returns a MemberAccounts object that lists the member accounts in the administrator's AWS
   organization.


   The ListMemberAccounts must be submitted by the account that is set as the AWS Firewall Manager
   administrator.

  request - `com.amazonaws.services.fms.model.ListMemberAccountsRequest`

  returns: Result of the ListMemberAccounts operation returned by the service. - `com.amazonaws.services.fms.model.ListMemberAccountsResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.ListMemberAccountsResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.ListMemberAccountsRequest request]
    (-> this (.listMemberAccounts request))))

(defn get-compliance-detail
  "Returns detailed compliance information about the specified member account. Details include resources that are in
   and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy
   has not been applied to them.

  request - `com.amazonaws.services.fms.model.GetComplianceDetailRequest`

  returns: Result of the GetComplianceDetail operation returned by the service. - `com.amazonaws.services.fms.model.GetComplianceDetailResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.GetComplianceDetailResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.GetComplianceDetailRequest request]
    (-> this (.getComplianceDetail request))))

(defn get-policy
  "Returns information about the specified AWS Firewall Manager policy.

  request - `com.amazonaws.services.fms.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.fms.model.GetPolicyResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.GetPolicyResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.GetPolicyRequest request]
    (-> this (.getPolicy request))))

(defn get-notification-channel
  "Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall
   Manager SNS logs.

  request - `com.amazonaws.services.fms.model.GetNotificationChannelRequest`

  returns: Result of the GetNotificationChannel operation returned by the service. - `com.amazonaws.services.fms.model.GetNotificationChannelResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.GetNotificationChannelResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.GetNotificationChannelRequest request]
    (-> this (.getNotificationChannel request))))

(defn get-admin-account
  "Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall
   Manager administrator.

  request - `com.amazonaws.services.fms.model.GetAdminAccountRequest`

  returns: Result of the GetAdminAccount operation returned by the service. - `com.amazonaws.services.fms.model.GetAdminAccountResult`

  throws: com.amazonaws.services.fms.model.InvalidOperationException - The operation failed because there was nothing to do. For example, you might have submitted an AssociateAdminAccount request, but the account ID that you submitted was already set as the AWS Firewall Manager administrator."
  (^com.amazonaws.services.fms.model.GetAdminAccountResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.GetAdminAccountRequest request]
    (-> this (.getAdminAccount request))))

(defn list-policies
  "Returns an array of PolicySummary objects in the response.

  request - `com.amazonaws.services.fms.model.ListPoliciesRequest`

  returns: Result of the ListPolicies operation returned by the service. - `com.amazonaws.services.fms.model.ListPoliciesResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.ListPoliciesResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.ListPoliciesRequest request]
    (-> this (.listPolicies request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSFMSClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-protection-status
  "If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a
   potential DDoS attack.

  request - `com.amazonaws.services.fms.model.GetProtectionStatusRequest`

  returns: Result of the GetProtectionStatus operation returned by the service. - `com.amazonaws.services.fms.model.GetProtectionStatusResult`

  throws: com.amazonaws.services.fms.model.InvalidInputException - The parameters of the request were invalid."
  (^com.amazonaws.services.fms.model.GetProtectionStatusResult [^AWSFMSClient this ^com.amazonaws.services.fms.model.GetProtectionStatusRequest request]
    (-> this (.getProtectionStatus request))))

