(ns com.amazonaws.services.route53domains.AmazonRoute53Domains
  "Interface for accessing Amazon Route 53 Domains.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonRoute53Domains instead.



  Amazon Route 53 API actions let you register domain names and perform related operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53domains AmazonRoute53Domains]))

(defn delete-tags-for-domain
  "This operation deletes the specified tags for a domain.


   All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
   operations.

  delete-tags-for-domain-request - The DeleteTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest`

  returns: Result of the DeleteTagsForDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest delete-tags-for-domain-request]
    (-> this (.deleteTagsForDomain delete-tags-for-domain-request))))

(defn resend-contact-reachability-email
  "For operations that require confirmation that the email address for the registrant contact is valid, such as
   registering a new domain, this operation resends the confirmation email to the current email address for the
   registrant contact.

  resend-contact-reachability-email-request - `com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest`

  returns: Result of the ResendContactReachabilityEmail operation returned by the service. - `com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest resend-contact-reachability-email-request]
    (-> this (.resendContactReachabilityEmail resend-contact-reachability-email-request))))

(defn disable-domain-auto-renew
  "This operation disables automatic renewal of domain registration for the specified domain.

  disable-domain-auto-renew-request - `com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest`

  returns: Result of the DisableDomainAutoRenew operation returned by the service. - `com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest disable-domain-auto-renew-request]
    (-> this (.disableDomainAutoRenew disable-domain-auto-renew-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonRoute53Domains this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-operation-detail
  "This operation returns the current status of an operation that is not completed.

  get-operation-detail-request - The GetOperationDetail request includes the following element. - `com.amazonaws.services.route53domains.model.GetOperationDetailRequest`

  returns: Result of the GetOperationDetail operation returned by the service. - `com.amazonaws.services.route53domains.model.GetOperationDetailResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.GetOperationDetailResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.GetOperationDetailRequest get-operation-detail-request]
    (-> this (.getOperationDetail get-operation-detail-request))))

(defn get-domain-detail
  "This operation returns detailed information about a specified domain that is associated with the current AWS
   account. Contact information for the domain is also returned as part of the output.

  get-domain-detail-request - The GetDomainDetail request includes the following element. - `com.amazonaws.services.route53domains.model.GetDomainDetailRequest`

  returns: Result of the GetDomainDetail operation returned by the service. - `com.amazonaws.services.route53domains.model.GetDomainDetailResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.GetDomainDetailResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.GetDomainDetailRequest get-domain-detail-request]
    (-> this (.getDomainDetail get-domain-detail-request))))

(defn transfer-domain
  "This operation transfers a domain from another registrar to Amazon Route 53. When the transfer is complete, the
   domain is registered either with Amazon Registrar (for .com, .net, and .org domains) or with our registrar
   associate, Gandi (for all other TLDs).


   For transfer requirements, a detailed procedure, and information about viewing the status of a domain transfer,
   see Transferring
   Registration for a Domain to Amazon Route 53 in the Amazon Route 53 Developer Guide.


   If the registrar for your domain is also the DNS service provider for the domain, we highly recommend that you
   consider transferring your DNS service to Amazon Route 53 or to another DNS service provider before you transfer
   your registration. Some registrars provide free DNS service when you purchase a domain registration. When you
   transfer the registration, the previous registrar will not renew your domain registration and could end your DNS
   service at any time.



   If the registrar for your domain is also the DNS service provider for the domain and you don't transfer DNS
   service to another provider, your website, email, and the web applications associated with the domain might
   become unavailable.



   If the transfer is successful, this method returns an operation ID that you can use to track the progress and
   completion of the action. If the transfer doesn't complete successfully, the domain registrant will be notified
   by email.

  transfer-domain-request - The TransferDomain request includes the following elements. - `com.amazonaws.services.route53domains.model.TransferDomainRequest`

  returns: Result of the TransferDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.TransferDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.TransferDomainResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.TransferDomainRequest transfer-domain-request]
    (-> this (.transferDomain transfer-domain-request))))

(defn get-domain-suggestions
  "The GetDomainSuggestions operation returns a list of suggested domain names given a string, which can either be a
   domain name or simply a word or phrase (without spaces).

  get-domain-suggestions-request - `com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest`

  returns: Result of the GetDomainSuggestions operation returned by the service. - `com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest get-domain-suggestions-request]
    (-> this (.getDomainSuggestions get-domain-suggestions-request))))

(defn list-tags-for-domain
  "This operation returns all of the tags that are associated with the specified domain.


   All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
   operations.

  list-tags-for-domain-request - The ListTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.ListTagsForDomainRequest`

  returns: Result of the ListTagsForDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.ListTagsForDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.ListTagsForDomainResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.ListTagsForDomainRequest list-tags-for-domain-request]
    (-> this (.listTagsForDomain list-tags-for-domain-request))))

(defn check-domain-transferability
  "Checks whether a domain name can be transferred to Amazon Route 53.

  check-domain-transferability-request - The CheckDomainTransferability request contains the following elements. - `com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest`

  returns: Result of the CheckDomainTransferability operation returned by the service. - `com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest check-domain-transferability-request]
    (-> this (.checkDomainTransferability check-domain-transferability-request))))

(defn renew-domain
  "This operation renews a domain for the specified number of years. The cost of renewing your domain is billed to
   your AWS account.


   We recommend that you renew your domain several weeks before the expiration date. Some TLD registries delete
   domains before the expiration date if you haven't renewed far enough in advance. For more information about
   renewing domain registration, see Renewing Registration for a
   Domain in the Amazon Route 53 Developer Guide.

  renew-domain-request - A RenewDomain request includes the number of years that you want to renew for and the current expiration year. - `com.amazonaws.services.route53domains.model.RenewDomainRequest`

  returns: Result of the RenewDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.RenewDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.RenewDomainResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.RenewDomainRequest renew-domain-request]
    (-> this (.renewDomain renew-domain-request))))

(defn disable-domain-transfer-lock
  "This operation removes the transfer lock on the domain (specifically the clientTransferProhibited
   status) to allow domain transfers. We recommend you refrain from performing this action unless you intend to
   transfer the domain to a different registrar. Successful submission returns an operation ID that you can use to
   track the progress and completion of the action. If the request is not completed successfully, the domain
   registrant will be notified by email.

  disable-domain-transfer-lock-request - The DisableDomainTransferLock request includes the following element. - `com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest`

  returns: Result of the DisableDomainTransferLock operation returned by the service. - `com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest disable-domain-transfer-lock-request]
    (-> this (.disableDomainTransferLock disable-domain-transfer-lock-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonRoute53Domains this]
    (-> this (.shutdown))))

(defn check-domain-availability
  "This operation checks the availability of one domain name. Note that if the availability status of a domain is
   pending, you must submit another request to determine the availability of the domain name.

  check-domain-availability-request - The CheckDomainAvailability request contains the following elements. - `com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest`

  returns: Result of the CheckDomainAvailability operation returned by the service. - `com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest check-domain-availability-request]
    (-> this (.checkDomainAvailability check-domain-availability-request))))

(defn list-domains
  "This operation returns all the domain names registered with Amazon Route 53 for the current AWS account.

  list-domains-request - The ListDomains request includes the following elements. - `com.amazonaws.services.route53domains.model.ListDomainsRequest`

  returns: Result of the ListDomains operation returned by the service. - `com.amazonaws.services.route53domains.model.ListDomainsResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.ListDomainsResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.ListDomainsRequest list-domains-request]
    (-> this (.listDomains list-domains-request)))
  (^com.amazonaws.services.route53domains.model.ListDomainsResult [^AmazonRoute53Domains this]
    (-> this (.listDomains))))

(defn enable-domain-transfer-lock
  "This operation sets the transfer lock on the domain (specifically the clientTransferProhibited
   status) to prevent domain transfers. Successful submission returns an operation ID that you can use to track the
   progress and completion of the action. If the request is not completed successfully, the domain registrant will
   be notified by email.

  enable-domain-transfer-lock-request - A request to set the transfer lock for the specified domain. - `com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest`

  returns: Result of the EnableDomainTransferLock operation returned by the service. - `com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest enable-domain-transfer-lock-request]
    (-> this (.enableDomainTransferLock enable-domain-transfer-lock-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"route53domains.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://route53domains.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonRoute53Domains this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-tags-for-domain
  "This operation adds or updates tags for a specified domain.


   All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
   operations.

  update-tags-for-domain-request - The UpdateTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest`

  returns: Result of the UpdateTagsForDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest update-tags-for-domain-request]
    (-> this (.updateTagsForDomain update-tags-for-domain-request))))

(defn update-domain-nameservers
  "This operation replaces the current set of name servers for the domain with the specified set of name servers. If
   you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted
   zone for the domain.


   If successful, this operation returns an operation ID that you can use to track the progress and completion of
   the action. If the request is not completed successfully, the domain registrant will be notified by email.

  update-domain-nameservers-request - Replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain. If successful, this operation returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email. - `com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest`

  returns: Result of the UpdateDomainNameservers operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest update-domain-nameservers-request]
    (-> this (.updateDomainNameservers update-domain-nameservers-request))))

(defn get-contact-reachability-status
  "For operations that require confirmation that the email address for the registrant contact is valid, such as
   registering a new domain, this operation returns information about whether the registrant contact has responded.


   If you want us to resend the email, use the ResendContactReachabilityEmail operation.

  get-contact-reachability-status-request - `com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest`

  returns: Result of the GetContactReachabilityStatus operation returned by the service. - `com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest get-contact-reachability-status-request]
    (-> this (.getContactReachabilityStatus get-contact-reachability-status-request))))

(defn retrieve-domain-auth-code
  "This operation returns the AuthCode for the domain. To transfer a domain to another registrar, you provide this
   value to the new registrar.

  retrieve-domain-auth-code-request - A request for the authorization code for the specified domain. To transfer a domain to another registrar, you provide this value to the new registrar. - `com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest`

  returns: Result of the RetrieveDomainAuthCode operation returned by the service. - `com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest retrieve-domain-auth-code-request]
    (-> this (.retrieveDomainAuthCode retrieve-domain-auth-code-request))))

(defn view-billing
  "Returns all the domain-related billing records for the current AWS account for a specified period

  view-billing-request - The ViewBilling request includes the following elements. - `com.amazonaws.services.route53domains.model.ViewBillingRequest`

  returns: Result of the ViewBilling operation returned by the service. - `com.amazonaws.services.route53domains.model.ViewBillingResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.ViewBillingResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.ViewBillingRequest view-billing-request]
    (-> this (.viewBilling view-billing-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonRoute53Domains this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-domain-contact-privacy
  "This operation updates the specified domain contact's privacy setting. When privacy protection is enabled,
   contact information such as email address is replaced either with contact information for Amazon Registrar (for
   .com, .net, and .org domains) or with contact information for our registrar associate, Gandi.


   This operation affects only the contact information for the specified contact type (registrant, administrator, or
   tech). If the request succeeds, Amazon Route 53 returns an operation ID that you can use with
   GetOperationDetail to track the progress and completion of the action. If the request doesn't complete
   successfully, the domain registrant will be notified by email.

  update-domain-contact-privacy-request - The UpdateDomainContactPrivacy request includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest`

  returns: Result of the UpdateDomainContactPrivacy operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest update-domain-contact-privacy-request]
    (-> this (.updateDomainContactPrivacy update-domain-contact-privacy-request))))

(defn enable-domain-auto-renew
  "This operation configures Amazon Route 53 to automatically renew the specified domain before the domain
   registration expires. The cost of renewing your domain registration is billed to your AWS account.


   The period during which you can renew a domain name varies by TLD. For a list of TLDs and their renewal policies,
   see
   \"Renewal, restoration, and deletion times\" on the website for our registrar associate, Gandi. Amazon Route 53
   requires that you renew before the end of the renewal period that is listed on the Gandi website so we can
   complete processing before the deadline.

  enable-domain-auto-renew-request - `com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest`

  returns: Result of the EnableDomainAutoRenew operation returned by the service. - `com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest enable-domain-auto-renew-request]
    (-> this (.enableDomainAutoRenew enable-domain-auto-renew-request))))

(defn list-operations
  "This operation returns the operation IDs of operations that are not yet complete.

  list-operations-request - The ListOperations request includes the following elements. - `com.amazonaws.services.route53domains.model.ListOperationsRequest`

  returns: Result of the ListOperations operation returned by the service. - `com.amazonaws.services.route53domains.model.ListOperationsResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.ListOperationsResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.ListOperationsRequest list-operations-request]
    (-> this (.listOperations list-operations-request)))
  (^com.amazonaws.services.route53domains.model.ListOperationsResult [^AmazonRoute53Domains this]
    (-> this (.listOperations))))

(defn register-domain
  "This operation registers a domain. Domains are registered either by Amazon Registrar (for .com, .net, and .org
   domains) or by our registrar associate, Gandi (for all other domains). For some top-level domains (TLDs), this
   operation requires extra parameters.


   When you register a domain, Amazon Route 53 does the following:




   Creates a Amazon Route 53 hosted zone that has the same name as the domain. Amazon Route 53 assigns four name
   servers to your hosted zone and automatically updates your domain registration with the names of these name
   servers.




   Enables autorenew, so your domain registration will renew automatically each year. We'll notify you in advance of
   the renewal date so you can choose whether to renew the registration.




   Optionally enables privacy protection, so WHOIS queries return contact information either for Amazon Registrar
   (for .com, .net, and .org domains) or for our registrar associate, Gandi (for all other TLDs). If you don't
   enable privacy protection, WHOIS queries return the information that you entered for the registrant, admin, and
   tech contacts.




   If registration is successful, returns an operation ID that you can use to track the progress and completion of
   the action. If the request is not completed successfully, the domain registrant is notified by email.




   Charges your AWS account an amount based on the top-level domain. For more information, see Amazon Route 53 Pricing.

  register-domain-request - The RegisterDomain request includes the following elements. - `com.amazonaws.services.route53domains.model.RegisterDomainRequest`

  returns: Result of the RegisterDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.RegisterDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.RegisterDomainResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.RegisterDomainRequest register-domain-request]
    (-> this (.registerDomain register-domain-request))))

(defn update-domain-contact
  "This operation updates the contact information for a particular domain. You must specify information for at least
   one contact: registrant, administrator, or technical.


   If the update is successful, this method returns an operation ID that you can use to track the progress and
   completion of the action. If the request is not completed successfully, the domain registrant will be notified by
   email.

  update-domain-contact-request - The UpdateDomainContact request includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateDomainContactRequest`

  returns: Result of the UpdateDomainContact operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateDomainContactResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.UpdateDomainContactResult [^AmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.UpdateDomainContactRequest update-domain-contact-request]
    (-> this (.updateDomainContact update-domain-contact-request))))

