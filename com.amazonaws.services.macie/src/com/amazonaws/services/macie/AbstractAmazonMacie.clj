(ns com.amazonaws.services.macie.AbstractAmazonMacie
  "Abstract implementation of AmazonMacie. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.macie AbstractAmazonMacie]))

(defn list-s-3-resources
  "Description copied from interface: AmazonMacie

  request - `com.amazonaws.services.macie.model.ListS3ResourcesRequest`

  returns: Result of the ListS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.ListS3ResourcesResult`"
  (^com.amazonaws.services.macie.model.ListS3ResourcesResult [^AbstractAmazonMacie this ^com.amazonaws.services.macie.model.ListS3ResourcesRequest request]
    (-> this (.listS3Resources request))))

(defn disassociate-s-3-resources
  "Description copied from interface: AmazonMacie

  request - `com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest`

  returns: Result of the DisassociateS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.DisassociateS3ResourcesResult`"
  (^com.amazonaws.services.macie.model.DisassociateS3ResourcesResult [^AbstractAmazonMacie this ^com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest request]
    (-> this (.disassociateS3Resources request))))

(defn update-s-3-resources
  "Description copied from interface: AmazonMacie

  request - `com.amazonaws.services.macie.model.UpdateS3ResourcesRequest`

  returns: Result of the UpdateS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.UpdateS3ResourcesResult`"
  (^com.amazonaws.services.macie.model.UpdateS3ResourcesResult [^AbstractAmazonMacie this ^com.amazonaws.services.macie.model.UpdateS3ResourcesRequest request]
    (-> this (.updateS3Resources request))))

(defn shutdown
  "Description copied from interface: AmazonMacie"
  ([^AbstractAmazonMacie this]
    (-> this (.shutdown))))

(defn list-member-accounts
  "Description copied from interface: AmazonMacie

  request - `com.amazonaws.services.macie.model.ListMemberAccountsRequest`

  returns: Result of the ListMemberAccounts operation returned by the service. - `com.amazonaws.services.macie.model.ListMemberAccountsResult`"
  (^com.amazonaws.services.macie.model.ListMemberAccountsResult [^AbstractAmazonMacie this ^com.amazonaws.services.macie.model.ListMemberAccountsRequest request]
    (-> this (.listMemberAccounts request))))

(defn associate-member-account
  "Description copied from interface: AmazonMacie

  request - `com.amazonaws.services.macie.model.AssociateMemberAccountRequest`

  returns: Result of the AssociateMemberAccount operation returned by the service. - `com.amazonaws.services.macie.model.AssociateMemberAccountResult`"
  (^com.amazonaws.services.macie.model.AssociateMemberAccountResult [^AbstractAmazonMacie this ^com.amazonaws.services.macie.model.AssociateMemberAccountRequest request]
    (-> this (.associateMemberAccount request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonMacie

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonMacie this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn associate-s-3-resources
  "Description copied from interface: AmazonMacie

  request - `com.amazonaws.services.macie.model.AssociateS3ResourcesRequest`

  returns: Result of the AssociateS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.AssociateS3ResourcesResult`"
  (^com.amazonaws.services.macie.model.AssociateS3ResourcesResult [^AbstractAmazonMacie this ^com.amazonaws.services.macie.model.AssociateS3ResourcesRequest request]
    (-> this (.associateS3Resources request))))

(defn disassociate-member-account
  "Description copied from interface: AmazonMacie

  request - `com.amazonaws.services.macie.model.DisassociateMemberAccountRequest`

  returns: Result of the DisassociateMemberAccount operation returned by the service. - `com.amazonaws.services.macie.model.DisassociateMemberAccountResult`"
  (^com.amazonaws.services.macie.model.DisassociateMemberAccountResult [^AbstractAmazonMacie this ^com.amazonaws.services.macie.model.DisassociateMemberAccountRequest request]
    (-> this (.disassociateMemberAccount request))))

