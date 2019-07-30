(ns com.amazonaws.services.route53domains.AmazonRoute53DomainsClient
  "Client for accessing Amazon Route 53 Domains. All service calls made using this client are blocking, and will not
  return until the service call completes.


  Amazon Route 53 API actions let you register domain names and perform related operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53domains AmazonRoute53DomainsClient]))

(defn ->amazon-route-53-domains-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon Route 53 Domains (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonRoute53DomainsClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonRoute53DomainsClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonRoute53DomainsClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonRoute53DomainsClient aws-credentials client-configuration))
  (^AmazonRoute53DomainsClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonRoute53DomainsClient client-configuration))
  (^AmazonRoute53DomainsClient []
    (new AmazonRoute53DomainsClient )))

(defn *builder
  "returns: `com.amazonaws.services.route53domains.AmazonRoute53DomainsClientBuilder`"
  (^com.amazonaws.services.route53domains.AmazonRoute53DomainsClientBuilder []
    (AmazonRoute53DomainsClient/builder )))

(defn delete-tags-for-domain
  "This operation deletes the specified tags for a domain.


   All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
   operations.

  request - `com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest`

  returns: Result of the DeleteTagsForDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest request]
    (-> this (.deleteTagsForDomain request))))

(defn resend-contact-reachability-email
  "For operations that require confirmation that the email address for the registrant contact is valid, such as
   registering a new domain, this operation resends the confirmation email to the current email address for the
   registrant contact.

  request - `com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest`

  returns: Result of the ResendContactReachabilityEmail operation returned by the service. - `com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest request]
    (-> this (.resendContactReachabilityEmail request))))

(defn disable-domain-auto-renew
  "This operation disables automatic renewal of domain registration for the specified domain.

  request - `com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest`

  returns: Result of the DisableDomainAutoRenew operation returned by the service. - `com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest request]
    (-> this (.disableDomainAutoRenew request))))

(defn get-operation-detail
  "This operation returns the current status of an operation that is not completed.

  request - `com.amazonaws.services.route53domains.model.GetOperationDetailRequest`

  returns: Result of the GetOperationDetail operation returned by the service. - `com.amazonaws.services.route53domains.model.GetOperationDetailResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.GetOperationDetailResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.GetOperationDetailRequest request]
    (-> this (.getOperationDetail request))))

(defn get-domain-detail
  "This operation returns detailed information about a specified domain that is associated with the current AWS
   account. Contact information for the domain is also returned as part of the output.

  request - `com.amazonaws.services.route53domains.model.GetDomainDetailRequest`

  returns: Result of the GetDomainDetail operation returned by the service. - `com.amazonaws.services.route53domains.model.GetDomainDetailResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.GetDomainDetailResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.GetDomainDetailRequest request]
    (-> this (.getDomainDetail request))))

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

  request - `com.amazonaws.services.route53domains.model.TransferDomainRequest`

  returns: Result of the TransferDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.TransferDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.TransferDomainResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.TransferDomainRequest request]
    (-> this (.transferDomain request))))

(defn get-domain-suggestions
  "The GetDomainSuggestions operation returns a list of suggested domain names given a string, which can either be a
   domain name or simply a word or phrase (without spaces).

  request - `com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest`

  returns: Result of the GetDomainSuggestions operation returned by the service. - `com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest request]
    (-> this (.getDomainSuggestions request))))

(defn list-tags-for-domain
  "This operation returns all of the tags that are associated with the specified domain.


   All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
   operations.

  request - `com.amazonaws.services.route53domains.model.ListTagsForDomainRequest`

  returns: Result of the ListTagsForDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.ListTagsForDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.ListTagsForDomainResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.ListTagsForDomainRequest request]
    (-> this (.listTagsForDomain request))))

(defn check-domain-transferability
  "Checks whether a domain name can be transferred to Amazon Route 53.

  request - `com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest`

  returns: Result of the CheckDomainTransferability operation returned by the service. - `com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest request]
    (-> this (.checkDomainTransferability request))))

(defn renew-domain
  "This operation renews a domain for the specified number of years. The cost of renewing your domain is billed to
   your AWS account.


   We recommend that you renew your domain several weeks before the expiration date. Some TLD registries delete
   domains before the expiration date if you haven't renewed far enough in advance. For more information about
   renewing domain registration, see Renewing Registration for a
   Domain in the Amazon Route 53 Developer Guide.

  request - `com.amazonaws.services.route53domains.model.RenewDomainRequest`

  returns: Result of the RenewDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.RenewDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.RenewDomainResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.RenewDomainRequest request]
    (-> this (.renewDomain request))))

(defn disable-domain-transfer-lock
  "This operation removes the transfer lock on the domain (specifically the clientTransferProhibited
   status) to allow domain transfers. We recommend you refrain from performing this action unless you intend to
   transfer the domain to a different registrar. Successful submission returns an operation ID that you can use to
   track the progress and completion of the action. If the request is not completed successfully, the domain
   registrant will be notified by email.

  request - `com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest`

  returns: Result of the DisableDomainTransferLock operation returned by the service. - `com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest request]
    (-> this (.disableDomainTransferLock request))))

(defn check-domain-availability
  "This operation checks the availability of one domain name. Note that if the availability status of a domain is
   pending, you must submit another request to determine the availability of the domain name.

  request - `com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest`

  returns: Result of the CheckDomainAvailability operation returned by the service. - `com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest request]
    (-> this (.checkDomainAvailability request))))

(defn list-domains
  "This operation returns all the domain names registered with Amazon Route 53 for the current AWS account.

  request - `com.amazonaws.services.route53domains.model.ListDomainsRequest`

  returns: Result of the ListDomains operation returned by the service. - `com.amazonaws.services.route53domains.model.ListDomainsResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.ListDomainsResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.ListDomainsRequest request]
    (-> this (.listDomains request)))
  (^com.amazonaws.services.route53domains.model.ListDomainsResult [^AmazonRoute53DomainsClient this]
    (-> this (.listDomains))))

(defn enable-domain-transfer-lock
  "This operation sets the transfer lock on the domain (specifically the clientTransferProhibited
   status) to prevent domain transfers. Successful submission returns an operation ID that you can use to track the
   progress and completion of the action. If the request is not completed successfully, the domain registrant will
   be notified by email.

  request - `com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest`

  returns: Result of the EnableDomainTransferLock operation returned by the service. - `com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest request]
    (-> this (.enableDomainTransferLock request))))

(defn update-tags-for-domain
  "This operation adds or updates tags for a specified domain.


   All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
   operations.

  request - `com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest`

  returns: Result of the UpdateTagsForDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest request]
    (-> this (.updateTagsForDomain request))))

(defn update-domain-nameservers
  "This operation replaces the current set of name servers for the domain with the specified set of name servers. If
   you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted
   zone for the domain.


   If successful, this operation returns an operation ID that you can use to track the progress and completion of
   the action. If the request is not completed successfully, the domain registrant will be notified by email.

  request - `com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest`

  returns: Result of the UpdateDomainNameservers operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest request]
    (-> this (.updateDomainNameservers request))))

(defn get-contact-reachability-status
  "For operations that require confirmation that the email address for the registrant contact is valid, such as
   registering a new domain, this operation returns information about whether the registrant contact has responded.


   If you want us to resend the email, use the ResendContactReachabilityEmail operation.

  request - `com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest`

  returns: Result of the GetContactReachabilityStatus operation returned by the service. - `com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest request]
    (-> this (.getContactReachabilityStatus request))))

(defn retrieve-domain-auth-code
  "This operation returns the AuthCode for the domain. To transfer a domain to another registrar, you provide this
   value to the new registrar.

  request - `com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest`

  returns: Result of the RetrieveDomainAuthCode operation returned by the service. - `com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest request]
    (-> this (.retrieveDomainAuthCode request))))

(defn view-billing
  "Returns all the domain-related billing records for the current AWS account for a specified period

  request - `com.amazonaws.services.route53domains.model.ViewBillingRequest`

  returns: Result of the ViewBilling operation returned by the service. - `com.amazonaws.services.route53domains.model.ViewBillingResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.ViewBillingResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.ViewBillingRequest request]
    (-> this (.viewBilling request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonRoute53DomainsClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-domain-contact-privacy
  "This operation updates the specified domain contact's privacy setting. When privacy protection is enabled,
   contact information such as email address is replaced either with contact information for Amazon Registrar (for
   .com, .net, and .org domains) or with contact information for our registrar associate, Gandi.


   This operation affects only the contact information for the specified contact type (registrant, administrator, or
   tech). If the request succeeds, Amazon Route 53 returns an operation ID that you can use with
   GetOperationDetail to track the progress and completion of the action. If the request doesn't complete
   successfully, the domain registrant will be notified by email.

  request - `com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest`

  returns: Result of the UpdateDomainContactPrivacy operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest request]
    (-> this (.updateDomainContactPrivacy request))))

(defn enable-domain-auto-renew
  "This operation configures Amazon Route 53 to automatically renew the specified domain before the domain
   registration expires. The cost of renewing your domain registration is billed to your AWS account.


   The period during which you can renew a domain name varies by TLD. For a list of TLDs and their renewal policies,
   see
   \"Renewal, restoration, and deletion times\" on the website for our registrar associate, Gandi. Amazon Route 53
   requires that you renew before the end of the renewal period that is listed on the Gandi website so we can
   complete processing before the deadline.

  request - `com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest`

  returns: Result of the EnableDomainAutoRenew operation returned by the service. - `com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest request]
    (-> this (.enableDomainAutoRenew request))))

(defn list-operations
  "This operation returns the operation IDs of operations that are not yet complete.

  request - `com.amazonaws.services.route53domains.model.ListOperationsRequest`

  returns: Result of the ListOperations operation returned by the service. - `com.amazonaws.services.route53domains.model.ListOperationsResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.ListOperationsResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.ListOperationsRequest request]
    (-> this (.listOperations request)))
  (^com.amazonaws.services.route53domains.model.ListOperationsResult [^AmazonRoute53DomainsClient this]
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

  request - `com.amazonaws.services.route53domains.model.RegisterDomainRequest`

  returns: Result of the RegisterDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.RegisterDomainResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.RegisterDomainResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.RegisterDomainRequest request]
    (-> this (.registerDomain request))))

(defn update-domain-contact
  "This operation updates the contact information for a particular domain. You must specify information for at least
   one contact: registrant, administrator, or technical.


   If the update is successful, this method returns an operation ID that you can use to track the progress and
   completion of the action. If the request is not completed successfully, the domain registrant will be notified by
   email.

  request - `com.amazonaws.services.route53domains.model.UpdateDomainContactRequest`

  returns: Result of the UpdateDomainContact operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateDomainContactResult`

  throws: com.amazonaws.services.route53domains.model.InvalidInputException - The requested item is not acceptable. For example, for an OperationId it might refer to the ID of an operation that is already completed. For a domain name, it might not be a valid domain name or belong to the requester account."
  (^com.amazonaws.services.route53domains.model.UpdateDomainContactResult [^AmazonRoute53DomainsClient this ^com.amazonaws.services.route53domains.model.UpdateDomainContactRequest request]
    (-> this (.updateDomainContact request))))

