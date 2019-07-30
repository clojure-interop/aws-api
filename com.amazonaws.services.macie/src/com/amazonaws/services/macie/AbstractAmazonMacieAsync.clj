(ns com.amazonaws.services.macie.AbstractAmazonMacieAsync
  "Abstract implementation of AmazonMacieAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.macie AbstractAmazonMacieAsync]))

(defn associate-member-account-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.AssociateMemberAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateMemberAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.AssociateMemberAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.AssociateMemberAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateMemberAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.AssociateMemberAccountRequest request]
    (-> this (.associateMemberAccountAsync request))))

(defn associate-s-3-resources-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.AssociateS3ResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the AssociateS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.AssociateS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.AssociateS3ResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.associateS3ResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.AssociateS3ResourcesRequest request]
    (-> this (.associateS3ResourcesAsync request))))

(defn disassociate-member-account-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.DisassociateMemberAccountRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateMemberAccount operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.DisassociateMemberAccountResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.DisassociateMemberAccountRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateMemberAccountAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.DisassociateMemberAccountRequest request]
    (-> this (.disassociateMemberAccountAsync request))))

(defn disassociate-s-3-resources-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisassociateS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.DisassociateS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disassociateS3ResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest request]
    (-> this (.disassociateS3ResourcesAsync request))))

(defn list-member-accounts-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.ListMemberAccountsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListMemberAccounts operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.ListMemberAccountsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.ListMemberAccountsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listMemberAccountsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.ListMemberAccountsRequest request]
    (-> this (.listMemberAccountsAsync request))))

(defn list-s-3-resources-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.ListS3ResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.ListS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.ListS3ResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listS3ResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.ListS3ResourcesRequest request]
    (-> this (.listS3ResourcesAsync request))))

(defn update-s-3-resources-async
  "Description copied from interface: AmazonMacieAsync

  request - `com.amazonaws.services.macie.model.UpdateS3ResourcesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateS3Resources operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.macie.model.UpdateS3ResourcesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.UpdateS3ResourcesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateS3ResourcesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonMacieAsync this ^com.amazonaws.services.macie.model.UpdateS3ResourcesRequest request]
    (-> this (.updateS3ResourcesAsync request))))

