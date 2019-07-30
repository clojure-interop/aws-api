(ns com.amazonaws.services.macie.AmazonMacieAsyncClient
  "Client for accessing Amazon Macie asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Macie

  Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect
  sensitive data in AWS. Macie recognizes sensitive data such as personally identifiable information (PII) or
  intellectual property, and provides you with dashboards and alerts that give visibility into how this data is being
  accessed or moved. For more information, see the Macie User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.macie AmazonMacieAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.macie.AmazonMacieAsyncClientBuilder`"
  (^com.amazonaws.services.macie.AmazonMacieAsyncClientBuilder []
    (AmazonMacieAsyncClient/asyncBuilder )))

(defn list-s-3-resources-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.ListS3ResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.ListS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.ListS3ResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listS3ResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.ListS3ResourcesRequest request]
    (-> this (.listS3ResourcesAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonMacieAsyncClient this]
    (-> this (.getExecutorService))))

(defn disassociate-s-3-resources-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.DisassociateS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateS3ResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest request]
    (-> this (.disassociateS3ResourcesAsync request))))

(defn list-member-accounts-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.ListMemberAccountsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMemberAccounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.ListMemberAccountsResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.ListMemberAccountsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMemberAccountsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.ListMemberAccountsRequest request]
    (-> this (.listMemberAccountsAsync request))))

(defn update-s-3-resources-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.UpdateS3ResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.UpdateS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.UpdateS3ResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateS3ResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.UpdateS3ResourcesRequest request]
    (-> this (.updateS3ResourcesAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonMacieAsyncClient this]
    (-> this (.shutdown))))

(defn associate-member-account-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.AssociateMemberAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateMemberAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.AssociateMemberAccountResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.AssociateMemberAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateMemberAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.AssociateMemberAccountRequest request]
    (-> this (.associateMemberAccountAsync request))))

(defn associate-s-3-resources-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.AssociateS3ResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.AssociateS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.AssociateS3ResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateS3ResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.AssociateS3ResourcesRequest request]
    (-> this (.associateS3ResourcesAsync request))))

(defn disassociate-member-account-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.DisassociateMemberAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateMemberAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.DisassociateMemberAccountResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.DisassociateMemberAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateMemberAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsyncClient this ^com.amazonaws.services.macie.model.DisassociateMemberAccountRequest request]
    (-> this (.disassociateMemberAccountAsync request))))

