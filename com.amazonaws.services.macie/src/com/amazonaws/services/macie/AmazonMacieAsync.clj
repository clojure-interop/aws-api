(ns com.amazonaws.services.macie.AmazonMacieAsync
  "Interface for accessing Amazon Macie asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonMacieAsync instead.


  Amazon Macie

  Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect
  sensitive data in AWS. Macie recognizes sensitive data such as personally identifiable information (PII) or
  intellectual property, and provides you with dashboards and alerts that give visibility into how this data is being
  accessed or moved. For more information, see the Macie User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.macie AmazonMacieAsync]))

(defn associate-member-account-async
  "Associates a specified AWS account with Amazon Macie as a member account.

  associate-member-account-request - `com.amazonaws.services.macie.model.AssociateMemberAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateMemberAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.AssociateMemberAccountResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.AssociateMemberAccountRequest associate-member-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateMemberAccountAsync associate-member-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.AssociateMemberAccountRequest associate-member-account-request]
    (-> this (.associateMemberAccountAsync associate-member-account-request))))

(defn associate-s-3-resources-async
  "Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId
   isn't specified, the action associates specified S3 resources with Macie for the current master account. If
   memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member
   account.

  associate-s-3-resources-request - `com.amazonaws.services.macie.model.AssociateS3ResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.AssociateS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.AssociateS3ResourcesRequest associate-s-3-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateS3ResourcesAsync associate-s-3-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.AssociateS3ResourcesRequest associate-s-3-resources-request]
    (-> this (.associateS3ResourcesAsync associate-s-3-resources-request))))

(defn disassociate-member-account-async
  "Removes the specified member account from Amazon Macie.

  disassociate-member-account-request - `com.amazonaws.services.macie.model.DisassociateMemberAccountRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateMemberAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.DisassociateMemberAccountResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.DisassociateMemberAccountRequest disassociate-member-account-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateMemberAccountAsync disassociate-member-account-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.DisassociateMemberAccountRequest disassociate-member-account-request]
    (-> this (.disassociateMemberAccountAsync disassociate-member-account-request))))

(defn disassociate-s-3-resources-async
  "Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the
   action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified,
   the action removes specified S3 resources from Macie for the specified member account.

  disassociate-s-3-resources-request - `com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.DisassociateS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest disassociate-s-3-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateS3ResourcesAsync disassociate-s-3-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest disassociate-s-3-resources-request]
    (-> this (.disassociateS3ResourcesAsync disassociate-s-3-resources-request))))

(defn list-member-accounts-async
  "Lists all Amazon Macie member accounts for the current Amazon Macie master account.

  list-member-accounts-request - `com.amazonaws.services.macie.model.ListMemberAccountsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMemberAccounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.ListMemberAccountsResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.ListMemberAccountsRequest list-member-accounts-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMemberAccountsAsync list-member-accounts-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.ListMemberAccountsRequest list-member-accounts-request]
    (-> this (.listMemberAccountsAsync list-member-accounts-request))))

(defn list-s-3-resources-async
  "Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the
   S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the
   action lists the S3 resources associated with Amazon Macie for the specified member account.

  list-s-3-resources-request - `com.amazonaws.services.macie.model.ListS3ResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.ListS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.ListS3ResourcesRequest list-s-3-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listS3ResourcesAsync list-s-3-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.ListS3ResourcesRequest list-s-3-resources-request]
    (-> this (.listS3ResourcesAsync list-s-3-resources-request))))

(defn update-s-3-resources-async
  "Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action
   updates the classification types of the S3 resources associated with Amazon Macie for the current master account.
   If memberAccountId is specified, the action updates the classification types of the S3 resources associated with
   Amazon Macie for the specified member account.

  update-s-3-resources-request - `com.amazonaws.services.macie.model.UpdateS3ResourcesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.UpdateS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.UpdateS3ResourcesRequest update-s-3-resources-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateS3ResourcesAsync update-s-3-resources-request async-handler)))
  (^java.util.concurrent.Future [^AmazonMacieAsync this ^com.amazonaws.services.macie.model.UpdateS3ResourcesRequest update-s-3-resources-request]
    (-> this (.updateS3ResourcesAsync update-s-3-resources-request))))

