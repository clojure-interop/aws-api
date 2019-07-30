(ns com.amazonaws.services.fms.AWSFMSAsync
  "Interface for accessing FMS asynchronously. Each asynchronous method will return a Java Future object representing
  the asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when
  an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAWSFMSAsync instead.


  AWS Firewall Manager

  This is the AWS Firewall Manager API Reference. This guide is for developers who need detailed information
  about the AWS Firewall Manager API actions, data types, and errors. For detailed information about AWS Firewall
  Manager features, see the AWS
  Firewall Manager Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fms AWSFMSAsync]))

(defn delete-policy-async
  "Permanently deletes an AWS Firewall Manager policy.

  delete-policy-request - `com.amazonaws.services.fms.model.DeletePolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.DeletePolicyResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.DeletePolicyRequest delete-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyAsync delete-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.DeletePolicyRequest delete-policy-request]
    (-> this (.deletePolicyAsync delete-policy-request))))

(defn delete-notification-channel-async
  "Deletes an AWS Firewall Manager association with the IAM role and the Amazon Simple Notification Service (SNS)
   topic that is used to record AWS Firewall Manager SNS logs.

  delete-notification-channel-request - `com.amazonaws.services.fms.model.DeleteNotificationChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotificationChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.DeleteNotificationChannelResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.DeleteNotificationChannelRequest delete-notification-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotificationChannelAsync delete-notification-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.DeleteNotificationChannelRequest delete-notification-channel-request]
    (-> this (.deleteNotificationChannelAsync delete-notification-channel-request))))

(defn disassociate-admin-account-async
  "Disassociates the account that has been set as the AWS Firewall Manager administrator account. To set a different
   account as the administrator account, you must submit an AssociateAdminAccount request .

  disassociate-admin-account-request - `com.amazonaws.services.fms.model.DisassociateAdminAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateAdminAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.DisassociateAdminAccountResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.DisassociateAdminAccountRequest disassociate-admin-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateAdminAccountAsync disassociate-admin-account-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.DisassociateAdminAccountRequest disassociate-admin-account-request]
    (-> this (.disassociateAdminAccountAsync disassociate-admin-account-request))))

(defn list-member-accounts-async
  "Returns a MemberAccounts object that lists the member accounts in the administrator's AWS
   organization.


   The ListMemberAccounts must be submitted by the account that is set as the AWS Firewall Manager
   administrator.

  list-member-accounts-request - `com.amazonaws.services.fms.model.ListMemberAccountsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMemberAccounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.ListMemberAccountsResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.ListMemberAccountsRequest list-member-accounts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMemberAccountsAsync list-member-accounts-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.ListMemberAccountsRequest list-member-accounts-request]
    (-> this (.listMemberAccountsAsync list-member-accounts-request))))

(defn get-protection-status-async
  "If you created a Shield Advanced policy, returns policy-level attack summary information in the event of a
   potential DDoS attack.

  get-protection-status-request - `com.amazonaws.services.fms.model.GetProtectionStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProtectionStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.GetProtectionStatusResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.GetProtectionStatusRequest get-protection-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProtectionStatusAsync get-protection-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.GetProtectionStatusRequest get-protection-status-request]
    (-> this (.getProtectionStatusAsync get-protection-status-request))))

(defn get-admin-account-async
  "Returns the AWS Organizations master account that is associated with AWS Firewall Manager as the AWS Firewall
   Manager administrator.

  get-admin-account-request - `com.amazonaws.services.fms.model.GetAdminAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAdminAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.GetAdminAccountResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.GetAdminAccountRequest get-admin-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAdminAccountAsync get-admin-account-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.GetAdminAccountRequest get-admin-account-request]
    (-> this (.getAdminAccountAsync get-admin-account-request))))

(defn list-policies-async
  "Returns an array of PolicySummary objects in the response.

  list-policies-request - `com.amazonaws.services.fms.model.ListPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.ListPoliciesResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.ListPoliciesRequest list-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesAsync list-policies-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.ListPoliciesRequest list-policies-request]
    (-> this (.listPoliciesAsync list-policies-request))))

(defn put-policy-async
  "Creates an AWS Firewall Manager policy.


   Firewall Manager provides two types of policies: A Shield Advanced policy, which applies Shield Advanced
   protection to specified accounts and resources, or a WAF policy, which contains a rule group and defines which
   resources are to be protected by that rule group. A policy is specific to either WAF or Shield Advanced. If you
   want to enforce both WAF rules and Shield Advanced protection across accounts, you can create multiple policies.
   You can create one or more policies for WAF rules, and one or more policies for Shield Advanced.


   You must be subscribed to Shield Advanced to create a Shield Advanced policy. For more information on subscribing
   to Shield Advanced, see CreateSubscription.

  put-policy-request - `com.amazonaws.services.fms.model.PutPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.PutPolicyResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.PutPolicyRequest put-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPolicyAsync put-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.PutPolicyRequest put-policy-request]
    (-> this (.putPolicyAsync put-policy-request))))

(defn get-compliance-detail-async
  "Returns detailed compliance information about the specified member account. Details include resources that are in
   and out of compliance with the specified policy. Resources are considered non-compliant if the specified policy
   has not been applied to them.

  get-compliance-detail-request - `com.amazonaws.services.fms.model.GetComplianceDetailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComplianceDetail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.GetComplianceDetailResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.GetComplianceDetailRequest get-compliance-detail-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getComplianceDetailAsync get-compliance-detail-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.GetComplianceDetailRequest get-compliance-detail-request]
    (-> this (.getComplianceDetailAsync get-compliance-detail-request))))

(defn get-policy-async
  "Returns information about the specified AWS Firewall Manager policy.

  get-policy-request - `com.amazonaws.services.fms.model.GetPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.GetPolicyResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.GetPolicyRequest get-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyAsync get-policy-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.GetPolicyRequest get-policy-request]
    (-> this (.getPolicyAsync get-policy-request))))

(defn associate-admin-account-async
  "Sets the AWS Firewall Manager administrator account. AWS Firewall Manager must be associated with the master
   account your AWS organization or associated with a member account that has the appropriate permissions. If the
   account ID that you submit is not an AWS Organizations master account, AWS Firewall Manager will set the
   appropriate permissions for the given member account.


   The account that you associate with AWS Firewall Manager is called the AWS Firewall Manager administrator
   account.

  associate-admin-account-request - `com.amazonaws.services.fms.model.AssociateAdminAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateAdminAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.AssociateAdminAccountResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.AssociateAdminAccountRequest associate-admin-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateAdminAccountAsync associate-admin-account-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.AssociateAdminAccountRequest associate-admin-account-request]
    (-> this (.associateAdminAccountAsync associate-admin-account-request))))

(defn put-notification-channel-async
  "Designates the IAM role and Amazon Simple Notification Service (SNS) topic that AWS Firewall Manager uses to
   record SNS logs.

  put-notification-channel-request - `com.amazonaws.services.fms.model.PutNotificationChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutNotificationChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.PutNotificationChannelResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.PutNotificationChannelRequest put-notification-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putNotificationChannelAsync put-notification-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.PutNotificationChannelRequest put-notification-channel-request]
    (-> this (.putNotificationChannelAsync put-notification-channel-request))))

(defn list-compliance-status-async
  "Returns an array of PolicyComplianceStatus objects in the response. Use
   PolicyComplianceStatus to get a summary of which member accounts are protected by the specified
   policy.

  list-compliance-status-request - `com.amazonaws.services.fms.model.ListComplianceStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListComplianceStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.ListComplianceStatusResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.ListComplianceStatusRequest list-compliance-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listComplianceStatusAsync list-compliance-status-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.ListComplianceStatusRequest list-compliance-status-request]
    (-> this (.listComplianceStatusAsync list-compliance-status-request))))

(defn get-notification-channel-async
  "Returns information about the Amazon Simple Notification Service (SNS) topic that is used to record AWS Firewall
   Manager SNS logs.

  get-notification-channel-request - `com.amazonaws.services.fms.model.GetNotificationChannelRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNotificationChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.GetNotificationChannelResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.GetNotificationChannelRequest get-notification-channel-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNotificationChannelAsync get-notification-channel-request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsync this ^com.amazonaws.services.fms.model.GetNotificationChannelRequest get-notification-channel-request]
    (-> this (.getNotificationChannelAsync get-notification-channel-request))))

