(ns com.amazonaws.services.fms.AWSFMS
  "Interface for accessing FMS.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSFMS instead.


  AWS Firewall Manager

  This is the AWS Firewall Manager API Reference. This guide is for developers who need detailed information
  about the AWS Firewall Manager API actions, data types, and errors. For detailed information about AWS Firewall
  Manager features, see the AWS
  Firewall Manager Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fms AWSFMS]))

(defn associate-admin-account
  "Sets the AWS Firewall Manager administrator account. AWS Firewall Manager must be associated with the master
   account your AWS organization or associated with a member account that has the appropriate permissions. If the
   account ID that you submit is not an AWS Organizations master account, AWS Firewall Manager will set the
   appropriate permissions for the given member account.


   The account that you associate with AWS Firewall Manager is called the AWS Firewall Manager administrator
   account.

  associate-admin-account-request - `com.amazonaws.services.fms.model.AssociateAdminAccountRequest`

  returns: Result of the AssociateAdminAccount operation returned by the service. - `com.amazonaws.services.fms.model.AssociateAdminAccountResult`

  throws: com.amazonaws.services.fms.model.InvalidOperationException - The operation failed because there was nothing to do. For example, you might have submitted an AssociateAdminAccount request, but the account ID that you submitted was already set as the AWS Firewall Manager administrator."
  (^com.amazonaws.services.fms.model.AssociateAdminAccountResult [^AWSFMS this ^com.amazonaws.services.fms.model.AssociateAdminAccountRequest associate-admin-account-request]
    (-> this (.associateAdminAccount associate-admin-account-request))))

(defn put-notification-channel
  "Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to
   record SNS logs.

  put-notification-channel-request - `com.amazonaws.services.fms.model.PutNotificationChannelRequest`

  returns: Result of the PutNotificationChannel operation returned by the service. - `com.amazonaws.services.fms.model.PutNotificationChannelResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.PutNotificationChannelResult [^AWSFMS this ^com.amazonaws.services.fms.model.PutNotificationChannelRequest put-notification-channel-request]
    (-> this (.putNotificationChannel put-notification-channel-request))))

(defn put-policy
  "Creates an AWS Firewall Manager policy.


   Firewall Manager provides two types of policies: A Shield Advanced policy, which applies Shield Advanced
   protection to specified accounts and resources, or a WAF policy, which contains a rule group and defines which
   resources are to be protected by that rule group. A policy is specific to either WAF or Shield Advanced. If you
   want to enforce both WAF rules and Shield Advanced protection across accounts, you can create multiple policies.
   You can create one or more policies for WAF rules, and one or more policies for Shield Advanced.


   You must be subscribed to Shield Advanced to create a Shield Advanced policy. For more information on subscribing
   to Shield Advanced, see CreateSubscription.

  put-policy-request - `com.amazonaws.services.fms.model.PutPolicyRequest`

  returns: Result of the PutPolicy operation returned by the service. - `com.amazonaws.services.fms.model.PutPolicyResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.PutPolicyResult [^AWSFMS this ^com.amazonaws.services.fms.model.PutPolicyRequest put-policy-request]
    (-> this (.putPolicy put-policy-request))))

(defn list-compliance-status
  "Returns an array of PolicyComplianceStatus objects in the response. Use
   PolicyComplianceStatus to get a summary of which member accounts are protected by the specified
   policy.

  list-compliance-status-request - `com.amazonaws.services.fms.model.ListComplianceStatusRequest`

  returns: Result of the ListComplianceStatus operation returned by the service. - `com.amazonaws.services.fms.model.ListComplianceStatusResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.ListComplianceStatusResult [^AWSFMS this ^com.amazonaws.services.fms.model.ListComplianceStatusRequest list-compliance-status-request]
    (-> this (.listComplianceStatus list-compliance-status-request))))

(defn delete-policy
  "Permanently deletes an AWS Firewall Manager policy.

  delete-policy-request - `com.amazonaws.services.fms.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.fms.model.DeletePolicyResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.DeletePolicyResult [^AWSFMS this ^com.amazonaws.services.fms.model.DeletePolicyRequest delete-policy-request]
    (-> this (.deletePolicy delete-policy-request))))

(defn disassociate-admin-account
  "Disassociates the account that has been set as the AWS Firewall Manager administrator account. To set a different
   account as the administrator account, you must submit an AssociateAdminAccount request .

  disassociate-admin-account-request - `com.amazonaws.services.fms.model.DisassociateAdminAccountRequest`

  returns: Result of the DisassociateAdminAccount operation returned by the service. - `com.amazonaws.services.fms.model.DisassociateAdminAccountResult`

  throws: com.amazonaws.services.fms.model.InvalidOperationException - The operation failed because there was nothing to do. For example, you might have submitted an AssociateAdminAccount request, but the account ID that you submitted was already set as the AWS Firewall Manager administrator."
  (^com.amazonaws.services.fms.model.DisassociateAdminAccountResult [^AWSFMS this ^com.amazonaws.services.fms.model.DisassociateAdminAccountRequest disassociate-admin-account-request]
    (-> this (.disassociateAdminAccount disassociate-admin-account-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AWSFMS this]
    (-> this (.shutdown))))

(defn delete-notification-channel
  "Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS)
   topic that is used to record AWS Firewall Manager SNS logs.

  delete-notification-channel-request - `com.amazonaws.services.fms.model.DeleteNotificationChannelRequest`

  returns: Result of the DeleteNotificationChannel operation returned by the service. - `com.amazonaws.services.fms.model.DeleteNotificationChannelResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.DeleteNotificationChannelResult [^AWSFMS this ^com.amazonaws.services.fms.model.DeleteNotificationChannelRequest delete-notification-channel-request]
    (-> this (.deleteNotificationChannel delete-notification-channel-request))))

(defn list-member-accounts
  "Returns a MemberAccounts object that lists the member accounts in the administrator's AWS
   organization.


   The ListMemberAccounts must be submitted by the account that is set as the AWS Firewall Manager
   administrator.

  list-member-accounts-request - `com.amazonaws.services.fms.model.ListMemberAccountsRequest`

  returns: Result of the ListMemberAccounts operation returned by the service. - `com.amazonaws.services.fms.model.ListMemberAccountsResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.ListMemberAccountsResult [^AWSFMS this ^com.amazonaws.services.fms.model.ListMemberAccountsRequest list-member-accounts-request]
    (-> this (.listMemberAccounts list-member-accounts-request))))

(defn get-compliance-detail
  "Returns detailed compliance information about the specified member account. Details include resources that are in
   and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy
   has not been applied to them.

  get-compliance-detail-request - `com.amazonaws.services.fms.model.GetComplianceDetailRequest`

  returns: Result of the GetComplianceDetail operation returned by the service. - `com.amazonaws.services.fms.model.GetComplianceDetailResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.GetComplianceDetailResult [^AWSFMS this ^com.amazonaws.services.fms.model.GetComplianceDetailRequest get-compliance-detail-request]
    (-> this (.getComplianceDetail get-compliance-detail-request))))

(defn get-policy
  "Returns information about the specified AWS Firewall Manager policy.

  get-policy-request - `com.amazonaws.services.fms.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.fms.model.GetPolicyResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.GetPolicyResult [^AWSFMS this ^com.amazonaws.services.fms.model.GetPolicyRequest get-policy-request]
    (-> this (.getPolicy get-policy-request))))

(defn get-notification-channel
  "Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall
   Manager SNS logs.

  get-notification-channel-request - `com.amazonaws.services.fms.model.GetNotificationChannelRequest`

  returns: Result of the GetNotificationChannel operation returned by the service. - `com.amazonaws.services.fms.model.GetNotificationChannelResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.GetNotificationChannelResult [^AWSFMS this ^com.amazonaws.services.fms.model.GetNotificationChannelRequest get-notification-channel-request]
    (-> this (.getNotificationChannel get-notification-channel-request))))

(defn get-admin-account
  "Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall
   Manager administrator.

  get-admin-account-request - `com.amazonaws.services.fms.model.GetAdminAccountRequest`

  returns: Result of the GetAdminAccount operation returned by the service. - `com.amazonaws.services.fms.model.GetAdminAccountResult`

  throws: com.amazonaws.services.fms.model.InvalidOperationException - The operation failed because there was nothing to do. For example, you might have submitted an AssociateAdminAccount request, but the account ID that you submitted was already set as the AWS Firewall Manager administrator."
  (^com.amazonaws.services.fms.model.GetAdminAccountResult [^AWSFMS this ^com.amazonaws.services.fms.model.GetAdminAccountRequest get-admin-account-request]
    (-> this (.getAdminAccount get-admin-account-request))))

(defn list-policies
  "Returns an array of PolicySummary objects in the response.

  list-policies-request - `com.amazonaws.services.fms.model.ListPoliciesRequest`

  returns: Result of the ListPolicies operation returned by the service. - `com.amazonaws.services.fms.model.ListPoliciesResult`

  throws: com.amazonaws.services.fms.model.ResourceNotFoundException - The specified resource was not found."
  (^com.amazonaws.services.fms.model.ListPoliciesResult [^AWSFMS this ^com.amazonaws.services.fms.model.ListPoliciesRequest list-policies-request]
    (-> this (.listPolicies list-policies-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AWSFMS this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-protection-status
  "If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a
   potential DDoS attack.

  get-protection-status-request - `com.amazonaws.services.fms.model.GetProtectionStatusRequest`

  returns: Result of the GetProtectionStatus operation returned by the service. - `com.amazonaws.services.fms.model.GetProtectionStatusResult`

  throws: com.amazonaws.services.fms.model.InvalidInputException - The parameters of the request were invalid."
  (^com.amazonaws.services.fms.model.GetProtectionStatusResult [^AWSFMS this ^com.amazonaws.services.fms.model.GetProtectionStatusRequest get-protection-status-request]
    (-> this (.getProtectionStatus get-protection-status-request))))

