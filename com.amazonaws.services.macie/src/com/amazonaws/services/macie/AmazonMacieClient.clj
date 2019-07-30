(ns com.amazonaws.services.macie.AmazonMacieClient
  "Client for accessing Amazon Macie. All service calls made using this client are blocking, and will not return until
  the service call completes.

  Amazon Macie

  Amazon Macie is a security service that uses machine learning to automatically discover, classify, and protect
  sensitive data in AWS. Macie recognizes sensitive data such as personally identifiable information (PII) or
  intellectual property, and provides you with dashboards and alerts that give visibility into how this data is being
  accessed or moved. For more information, see the Macie User Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.macie AmazonMacieClient]))

(defn *builder
  "returns: `com.amazonaws.services.macie.AmazonMacieClientBuilder`"
  (^com.amazonaws.services.macie.AmazonMacieClientBuilder []
    (AmazonMacieClient/builder )))

(defn associate-member-account
  "Associates a specified AWS account with Amazon Macie as a member account.

  request - `com.amazonaws.services.macie.model.AssociateMemberAccountRequest`

  returns: Result of the AssociateMemberAccount operation returned by the service. - `com.amazonaws.services.macie.model.AssociateMemberAccountResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.AssociateMemberAccountResult [^AmazonMacieClient this ^com.amazonaws.services.macie.model.AssociateMemberAccountRequest request]
    (-> this (.associateMemberAccount request))))

(defn associate-s-3-resources
  "Associates specified S3 resources with Amazon Macie for monitoring and data classification. If memberAccountId
   isn't specified, the action associates specified S3 resources with Macie for the current master account. If
   memberAccountId is specified, the action associates specified S3 resources with Macie for the specified member
   account.

  request - `com.amazonaws.services.macie.model.AssociateS3ResourcesRequest`

  returns: Result of the AssociateS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.AssociateS3ResourcesResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.AssociateS3ResourcesResult [^AmazonMacieClient this ^com.amazonaws.services.macie.model.AssociateS3ResourcesRequest request]
    (-> this (.associateS3Resources request))))

(defn disassociate-member-account
  "Removes the specified member account from Amazon Macie.

  request - `com.amazonaws.services.macie.model.DisassociateMemberAccountRequest`

  returns: Result of the DisassociateMemberAccount operation returned by the service. - `com.amazonaws.services.macie.model.DisassociateMemberAccountResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.DisassociateMemberAccountResult [^AmazonMacieClient this ^com.amazonaws.services.macie.model.DisassociateMemberAccountRequest request]
    (-> this (.disassociateMemberAccount request))))

(defn disassociate-s-3-resources
  "Removes specified S3 resources from being monitored by Amazon Macie. If memberAccountId isn't specified, the
   action removes specified S3 resources from Macie for the current master account. If memberAccountId is specified,
   the action removes specified S3 resources from Macie for the specified member account.

  request - `com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest`

  returns: Result of the DisassociateS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.DisassociateS3ResourcesResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.DisassociateS3ResourcesResult [^AmazonMacieClient this ^com.amazonaws.services.macie.model.DisassociateS3ResourcesRequest request]
    (-> this (.disassociateS3Resources request))))

(defn list-member-accounts
  "Lists all Amazon Macie member accounts for the current Amazon Macie master account.

  request - `com.amazonaws.services.macie.model.ListMemberAccountsRequest`

  returns: Result of the ListMemberAccounts operation returned by the service. - `com.amazonaws.services.macie.model.ListMemberAccountsResult`

  throws: com.amazonaws.services.macie.model.InternalException - Internal server error."
  (^com.amazonaws.services.macie.model.ListMemberAccountsResult [^AmazonMacieClient this ^com.amazonaws.services.macie.model.ListMemberAccountsRequest request]
    (-> this (.listMemberAccounts request))))

(defn list-s-3-resources
  "Lists all the S3 resources associated with Amazon Macie. If memberAccountId isn't specified, the action lists the
   S3 resources associated with Amazon Macie for the current master account. If memberAccountId is specified, the
   action lists the S3 resources associated with Amazon Macie for the specified member account.

  request - `com.amazonaws.services.macie.model.ListS3ResourcesRequest`

  returns: Result of the ListS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.ListS3ResourcesResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.ListS3ResourcesResult [^AmazonMacieClient this ^com.amazonaws.services.macie.model.ListS3ResourcesRequest request]
    (-> this (.listS3Resources request))))

(defn update-s-3-resources
  "Updates the classification types for the specified S3 resources. If memberAccountId isn't specified, the action
   updates the classification types of the S3 resources associated with Amazon Macie for the current master account.
   If memberAccountId is specified, the action updates the classification types of the S3 resources associated with
   Amazon Macie for the specified member account.

  request - `com.amazonaws.services.macie.model.UpdateS3ResourcesRequest`

  returns: Result of the UpdateS3Resources operation returned by the service. - `com.amazonaws.services.macie.model.UpdateS3ResourcesResult`

  throws: com.amazonaws.services.macie.model.InvalidInputException - The request was rejected because an invalid or out-of-range value was supplied for an input parameter."
  (^com.amazonaws.services.macie.model.UpdateS3ResourcesResult [^AmazonMacieClient this ^com.amazonaws.services.macie.model.UpdateS3ResourcesRequest request]
    (-> this (.updateS3Resources request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonMacieClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

