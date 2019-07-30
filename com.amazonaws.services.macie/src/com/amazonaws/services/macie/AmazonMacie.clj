(ns com.amazonaws.services.macie.AmazonMacie
  "Interface for accessing Amazon Macie.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonMacie instead.


  Amazon Macie

  Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect
  sensitive data in AWS. Macie recognizes sensitive data such as personally identifiable information (PII) or
  intellectual property, and provides you with dashboards and alerts that give visibility into how this data is being
  accessed or moved. For more information, see the Macie User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.macie AmazonMacie]))

(defn list-s-3-resources
  "Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the
   S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the
   action lists the S3 resources associated with Amazon Macie for the specified member account.

  list-s-3-resources-request - `com.amazonaws.services.macie.model.ListS3ResourcesRequest`

  returns: Result of the ListS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.ListS3ResourcesResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.ListS3ResourcesResult [^AmazonMacie this ^com.amazonaws.services.macie.model.ListS3ResourcesRequest list-s-3-resources-request]
    (-> this (.listS3Resources list-s-3-resources-request))))

(defn disassociate-s-3-resources
  "Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the
   action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified,
   the action removes specified S3 resources from Macie for the specified member account.

  disassociate-s-3-resources-request - `com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest`

  returns: Result of the DisassociateS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.DisassociateS3ResourcesResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.DisassociateS3ResourcesResult [^AmazonMacie this ^com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest disassociate-s-3-resources-request]
    (-> this (.disassociateS3Resources disassociate-s-3-resources-request))))

(defn update-s-3-resources
  "Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action
   updates the classification types of the S3 resources associated with Amazon Macie for the current master account.
   If memberAccountId is specified, the action updates the classification types of the S3 resources associated with
   Amazon Macie for the specified member account.

  update-s-3-resources-request - `com.amazonaws.services.macie.model.UpdateS3ResourcesRequest`

  returns: Result of the UpdateS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.UpdateS3ResourcesResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.UpdateS3ResourcesResult [^AmazonMacie this ^com.amazonaws.services.macie.model.UpdateS3ResourcesRequest update-s-3-resources-request]
    (-> this (.updateS3Resources update-s-3-resources-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonMacie this]
    (-> this (.shutdown))))

(defn list-member-accounts
  "Lists all Amazon Macie member accounts for the current Amazon Macie master account.

  list-member-accounts-request - `com.amazonaws.services.macie.model.ListMemberAccountsRequest`

  returns: Result of the ListMemberAccounts operation returned by the service. - `com.amazonaws.services.macie.model.ListMemberAccountsResult`

  throws: com.amazonaws.services.macie.model.InternalException - Internal server error."
  (^com.amazonaws.services.macie.model.ListMemberAccountsResult [^AmazonMacie this ^com.amazonaws.services.macie.model.ListMemberAccountsRequest list-member-accounts-request]
    (-> this (.listMemberAccounts list-member-accounts-request))))

(defn associate-member-account
  "Associates a specified AWS account with Amazon Macie as a member account.

  associate-member-account-request - `com.amazonaws.services.macie.model.AssociateMemberAccountRequest`

  returns: Result of the AssociateMemberAccount operation returned by the service. - `com.amazonaws.services.macie.model.AssociateMemberAccountResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.AssociateMemberAccountResult [^AmazonMacie this ^com.amazonaws.services.macie.model.AssociateMemberAccountRequest associate-member-account-request]
    (-> this (.associateMemberAccount associate-member-account-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonMacie this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn associate-s-3-resources
  "Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId
   isn't specified, the action associates specified S3 resources with Macie for the current master account. If
   memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member
   account.

  associate-s-3-resources-request - `com.amazonaws.services.macie.model.AssociateS3ResourcesRequest`

  returns: Result of the AssociateS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.AssociateS3ResourcesResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.AssociateS3ResourcesResult [^AmazonMacie this ^com.amazonaws.services.macie.model.AssociateS3ResourcesRequest associate-s-3-resources-request]
    (-> this (.associateS3Resources associate-s-3-resources-request))))

(defn disassociate-member-account
  "Removes the specified member account from Amazon Macie.

  disassociate-member-account-request - `com.amazonaws.services.macie.model.DisassociateMemberAccountRequest`

  returns: Result of the DisassociateMemberAccount operation returned by the service. - `com.amazonaws.services.macie.model.DisassociateMemberAccountResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.DisassociateMemberAccountResult [^AmazonMacie this ^com.amazonaws.services.macie.model.DisassociateMemberAccountRequest disassociate-member-account-request]
    (-> this (.disassociateMemberAccount disassociate-member-account-request))))

