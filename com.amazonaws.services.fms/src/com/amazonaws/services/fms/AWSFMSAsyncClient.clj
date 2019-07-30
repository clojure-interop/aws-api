(ns com.amazonaws.services.fms.AWSFMSAsyncClient
  "Client for accessing FMS asynchronously. Each asynchronous method will return a Java Future object representing the
  asynchronous operation; overloads which accept an AsyncHandler can be used to receive notification when an
  asynchronous operation completes.

  AWS Firewall Manager

  This is the AWS Firewall Manager API Reference. This guide is for developers who need detailed information
  about the AWS Firewall Manager API actions, data types, and errors. For detailed information about AWS Firewall
  Manager features, see the AWS
  Firewall Manager Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.fms AWSFMSAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.fms.AWSFMSAsyncClientBuilder`"
  (^com.amazonaws.services.fms.AWSFMSAsyncClientBuilder []
    (AWSFMSAsyncClient/asyncBuilder )))

(defn delete-policy-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.DeletePolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.DeletePolicyResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.DeletePolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.DeletePolicyRequest request]
    (-> this (.deletePolicyAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AWSFMSAsyncClient this]
    (-> this (.getExecutorService))))

(defn delete-notification-channel-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.DeleteNotificationChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteNotificationChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.DeleteNotificationChannelResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.DeleteNotificationChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteNotificationChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.DeleteNotificationChannelRequest request]
    (-> this (.deleteNotificationChannelAsync request))))

(defn disassociate-admin-account-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.DisassociateAdminAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateAdminAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.DisassociateAdminAccountResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.DisassociateAdminAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateAdminAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.DisassociateAdminAccountRequest request]
    (-> this (.disassociateAdminAccountAsync request))))

(defn list-member-accounts-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.ListMemberAccountsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMemberAccounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.ListMemberAccountsResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.ListMemberAccountsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMemberAccountsAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.ListMemberAccountsRequest request]
    (-> this (.listMemberAccountsAsync request))))

(defn get-protection-status-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.GetProtectionStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetProtectionStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.GetProtectionStatusResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.GetProtectionStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getProtectionStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.GetProtectionStatusRequest request]
    (-> this (.getProtectionStatusAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AWSFMSAsyncClient this]
    (-> this (.shutdown))))

(defn get-admin-account-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.GetAdminAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAdminAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.GetAdminAccountResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.GetAdminAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAdminAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.GetAdminAccountRequest request]
    (-> this (.getAdminAccountAsync request))))

(defn list-policies-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.ListPoliciesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.ListPoliciesResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.ListPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.ListPoliciesRequest request]
    (-> this (.listPoliciesAsync request))))

(defn put-policy-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.PutPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.PutPolicyResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.PutPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.PutPolicyRequest request]
    (-> this (.putPolicyAsync request))))

(defn get-compliance-detail-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.GetComplianceDetailRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetComplianceDetail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.GetComplianceDetailResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.GetComplianceDetailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getComplianceDetailAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.GetComplianceDetailRequest request]
    (-> this (.getComplianceDetailAsync request))))

(defn get-policy-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.GetPolicyRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.GetPolicyResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.GetPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.GetPolicyRequest request]
    (-> this (.getPolicyAsync request))))

(defn associate-admin-account-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.AssociateAdminAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateAdminAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.AssociateAdminAccountResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.AssociateAdminAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateAdminAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.AssociateAdminAccountRequest request]
    (-> this (.associateAdminAccountAsync request))))

(defn put-notification-channel-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.PutNotificationChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutNotificationChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.PutNotificationChannelResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.PutNotificationChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putNotificationChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.PutNotificationChannelRequest request]
    (-> this (.putNotificationChannelAsync request))))

(defn list-compliance-status-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.ListComplianceStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListComplianceStatus operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.ListComplianceStatusResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.ListComplianceStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listComplianceStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.ListComplianceStatusRequest request]
    (-> this (.listComplianceStatusAsync request))))

(defn get-notification-channel-async
  "Description copied from interface: AWSFMSAsync

  request - `com.amazonaws.services.fms.model.GetNotificationChannelRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetNotificationChannel operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.fms.model.GetNotificationChannelResult>`"
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.GetNotificationChannelRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getNotificationChannelAsync request async-handler)))
  (^java.util.concurrent.Future [^AWSFMSAsyncClient this ^com.amazonaws.services.fms.model.GetNotificationChannelRequest request]
    (-> this (.getNotificationChannelAsync request))))

