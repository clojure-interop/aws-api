(ns com.amazonaws.services.fms.AbstractAWSFMS
  "Abstract implementation of AWSFMS. Convenient method forms pass through to the corresponding overload that
  takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fms AbstractAWSFMS]))

(defn associate-admin-account
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.AssociateAdminAccountRequest`

  returns: Result of the AssociateAdminAccount operation returned by the service. - `com.amazonaws.services.fms.model.AssociateAdminAccountResult`"
  (^com.amazonaws.services.fms.model.AssociateAdminAccountResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.AssociateAdminAccountRequest request]
    (-> this (.associateAdminAccount request))))

(defn put-notification-channel
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.PutNotificationChannelRequest`

  returns: Result of the PutNotificationChannel operation returned by the service. - `com.amazonaws.services.fms.model.PutNotificationChannelResult`"
  (^com.amazonaws.services.fms.model.PutNotificationChannelResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.PutNotificationChannelRequest request]
    (-> this (.putNotificationChannel request))))

(defn put-policy
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.PutPolicyRequest`

  returns: Result of the PutPolicy operation returned by the service. - `com.amazonaws.services.fms.model.PutPolicyResult`"
  (^com.amazonaws.services.fms.model.PutPolicyResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.PutPolicyRequest request]
    (-> this (.putPolicy request))))

(defn list-compliance-status
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.ListComplianceStatusRequest`

  returns: Result of the ListComplianceStatus operation returned by the service. - `com.amazonaws.services.fms.model.ListComplianceStatusResult`"
  (^com.amazonaws.services.fms.model.ListComplianceStatusResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.ListComplianceStatusRequest request]
    (-> this (.listComplianceStatus request))))

(defn delete-policy
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.DeletePolicyRequest`

  returns: Result of the DeletePolicy operation returned by the service. - `com.amazonaws.services.fms.model.DeletePolicyResult`"
  (^com.amazonaws.services.fms.model.DeletePolicyResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.DeletePolicyRequest request]
    (-> this (.deletePolicy request))))

(defn disassociate-admin-account
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.DisassociateAdminAccountRequest`

  returns: Result of the DisassociateAdminAccount operation returned by the service. - `com.amazonaws.services.fms.model.DisassociateAdminAccountResult`"
  (^com.amazonaws.services.fms.model.DisassociateAdminAccountResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.DisassociateAdminAccountRequest request]
    (-> this (.disassociateAdminAccount request))))

(defn shutdown
  "Description copied from interface: AWSFMS"
  ([^AbstractAWSFMS this]
    (-> this (.shutdown))))

(defn delete-notification-channel
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.DeleteNotificationChannelRequest`

  returns: Result of the DeleteNotificationChannel operation returned by the service. - `com.amazonaws.services.fms.model.DeleteNotificationChannelResult`"
  (^com.amazonaws.services.fms.model.DeleteNotificationChannelResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.DeleteNotificationChannelRequest request]
    (-> this (.deleteNotificationChannel request))))

(defn list-member-accounts
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.ListMemberAccountsRequest`

  returns: Result of the ListMemberAccounts operation returned by the service. - `com.amazonaws.services.fms.model.ListMemberAccountsResult`"
  (^com.amazonaws.services.fms.model.ListMemberAccountsResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.ListMemberAccountsRequest request]
    (-> this (.listMemberAccounts request))))

(defn get-compliance-detail
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.GetComplianceDetailRequest`

  returns: Result of the GetComplianceDetail operation returned by the service. - `com.amazonaws.services.fms.model.GetComplianceDetailResult`"
  (^com.amazonaws.services.fms.model.GetComplianceDetailResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.GetComplianceDetailRequest request]
    (-> this (.getComplianceDetail request))))

(defn get-policy
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.GetPolicyRequest`

  returns: Result of the GetPolicy operation returned by the service. - `com.amazonaws.services.fms.model.GetPolicyResult`"
  (^com.amazonaws.services.fms.model.GetPolicyResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.GetPolicyRequest request]
    (-> this (.getPolicy request))))

(defn get-notification-channel
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.GetNotificationChannelRequest`

  returns: Result of the GetNotificationChannel operation returned by the service. - `com.amazonaws.services.fms.model.GetNotificationChannelResult`"
  (^com.amazonaws.services.fms.model.GetNotificationChannelResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.GetNotificationChannelRequest request]
    (-> this (.getNotificationChannel request))))

(defn get-admin-account
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.GetAdminAccountRequest`

  returns: Result of the GetAdminAccount operation returned by the service. - `com.amazonaws.services.fms.model.GetAdminAccountResult`"
  (^com.amazonaws.services.fms.model.GetAdminAccountResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.GetAdminAccountRequest request]
    (-> this (.getAdminAccount request))))

(defn list-policies
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.ListPoliciesRequest`

  returns: Result of the ListPolicies operation returned by the service. - `com.amazonaws.services.fms.model.ListPoliciesResult`"
  (^com.amazonaws.services.fms.model.ListPoliciesResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.ListPoliciesRequest request]
    (-> this (.listPolicies request))))

(defn get-cached-response-metadata
  "Description copied from interface: AWSFMS

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAWSFMS this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-protection-status
  "Description copied from interface: AWSFMS

  request - `com.amazonaws.services.fms.model.GetProtectionStatusRequest`

  returns: Result of the GetProtectionStatus operation returned by the service. - `com.amazonaws.services.fms.model.GetProtectionStatusResult`"
  (^com.amazonaws.services.fms.model.GetProtectionStatusResult [^AbstractAWSFMS this ^com.amazonaws.services.fms.model.GetProtectionStatusRequest request]
    (-> this (.getProtectionStatus request))))

