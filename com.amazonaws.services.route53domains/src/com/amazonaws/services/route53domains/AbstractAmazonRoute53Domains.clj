(ns com.amazonaws.services.route53domains.AbstractAmazonRoute53Domains
  "Abstract implementation of AmazonRoute53Domains. Convenient method forms pass through to the corresponding
  overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53domains AbstractAmazonRoute53Domains]))

(defn delete-tags-for-domain
  "Description copied from interface: AmazonRoute53Domains

  request - The DeleteTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest`

  returns: Result of the DeleteTagsForDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult`"
  (^com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest request]
    (-> this (.deleteTagsForDomain request))))

(defn resend-contact-reachability-email
  "Description copied from interface: AmazonRoute53Domains

  request - `com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest`

  returns: Result of the ResendContactReachabilityEmail operation returned by the service. - `com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult`"
  (^com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest request]
    (-> this (.resendContactReachabilityEmail request))))

(defn disable-domain-auto-renew
  "Description copied from interface: AmazonRoute53Domains

  request - `com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest`

  returns: Result of the DisableDomainAutoRenew operation returned by the service. - `com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult`"
  (^com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest request]
    (-> this (.disableDomainAutoRenew request))))

(defn set-region
  "Description copied from interface: AmazonRoute53Domains

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonRoute53Domains this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn get-operation-detail
  "Description copied from interface: AmazonRoute53Domains

  request - The GetOperationDetail request includes the following element. - `com.amazonaws.services.route53domains.model.GetOperationDetailRequest`

  returns: Result of the GetOperationDetail operation returned by the service. - `com.amazonaws.services.route53domains.model.GetOperationDetailResult`"
  (^com.amazonaws.services.route53domains.model.GetOperationDetailResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.GetOperationDetailRequest request]
    (-> this (.getOperationDetail request))))

(defn get-domain-detail
  "Description copied from interface: AmazonRoute53Domains

  request - The GetDomainDetail request includes the following element. - `com.amazonaws.services.route53domains.model.GetDomainDetailRequest`

  returns: Result of the GetDomainDetail operation returned by the service. - `com.amazonaws.services.route53domains.model.GetDomainDetailResult`"
  (^com.amazonaws.services.route53domains.model.GetDomainDetailResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.GetDomainDetailRequest request]
    (-> this (.getDomainDetail request))))

(defn transfer-domain
  "Description copied from interface: AmazonRoute53Domains

  request - The TransferDomain request includes the following elements. - `com.amazonaws.services.route53domains.model.TransferDomainRequest`

  returns: Result of the TransferDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.TransferDomainResult`"
  (^com.amazonaws.services.route53domains.model.TransferDomainResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.TransferDomainRequest request]
    (-> this (.transferDomain request))))

(defn get-domain-suggestions
  "Description copied from interface: AmazonRoute53Domains

  request - `com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest`

  returns: Result of the GetDomainSuggestions operation returned by the service. - `com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult`"
  (^com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest request]
    (-> this (.getDomainSuggestions request))))

(defn list-tags-for-domain
  "Description copied from interface: AmazonRoute53Domains

  request - The ListTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.ListTagsForDomainRequest`

  returns: Result of the ListTagsForDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.ListTagsForDomainResult`"
  (^com.amazonaws.services.route53domains.model.ListTagsForDomainResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.ListTagsForDomainRequest request]
    (-> this (.listTagsForDomain request))))

(defn check-domain-transferability
  "Description copied from interface: AmazonRoute53Domains

  request - The CheckDomainTransferability request contains the following elements. - `com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest`

  returns: Result of the CheckDomainTransferability operation returned by the service. - `com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult`"
  (^com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest request]
    (-> this (.checkDomainTransferability request))))

(defn renew-domain
  "Description copied from interface: AmazonRoute53Domains

  request - A RenewDomain request includes the number of years that you want to renew for and the current expiration year. - `com.amazonaws.services.route53domains.model.RenewDomainRequest`

  returns: Result of the RenewDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.RenewDomainResult`"
  (^com.amazonaws.services.route53domains.model.RenewDomainResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.RenewDomainRequest request]
    (-> this (.renewDomain request))))

(defn disable-domain-transfer-lock
  "Description copied from interface: AmazonRoute53Domains

  request - The DisableDomainTransferLock request includes the following element. - `com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest`

  returns: Result of the DisableDomainTransferLock operation returned by the service. - `com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult`"
  (^com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest request]
    (-> this (.disableDomainTransferLock request))))

(defn shutdown
  "Description copied from interface: AmazonRoute53Domains"
  ([^AbstractAmazonRoute53Domains this]
    (-> this (.shutdown))))

(defn check-domain-availability
  "Description copied from interface: AmazonRoute53Domains

  request - The CheckDomainAvailability request contains the following elements. - `com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest`

  returns: Result of the CheckDomainAvailability operation returned by the service. - `com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult`"
  (^com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest request]
    (-> this (.checkDomainAvailability request))))

(defn list-domains
  "Description copied from interface: AmazonRoute53Domains

  request - The ListDomains request includes the following elements. - `com.amazonaws.services.route53domains.model.ListDomainsRequest`

  returns: Result of the ListDomains operation returned by the service. - `com.amazonaws.services.route53domains.model.ListDomainsResult`"
  (^com.amazonaws.services.route53domains.model.ListDomainsResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.ListDomainsRequest request]
    (-> this (.listDomains request)))
  (^com.amazonaws.services.route53domains.model.ListDomainsResult [^AbstractAmazonRoute53Domains this]
    (-> this (.listDomains))))

(defn enable-domain-transfer-lock
  "Description copied from interface: AmazonRoute53Domains

  request - A request to set the transfer lock for the specified domain. - `com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest`

  returns: Result of the EnableDomainTransferLock operation returned by the service. - `com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult`"
  (^com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest request]
    (-> this (.enableDomainTransferLock request))))

(defn set-endpoint
  "Description copied from interface: AmazonRoute53Domains

  endpoint - The endpoint (ex: \"route53domains.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://route53domains.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonRoute53Domains this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn update-tags-for-domain
  "Description copied from interface: AmazonRoute53Domains

  request - The UpdateTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest`

  returns: Result of the UpdateTagsForDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult`"
  (^com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest request]
    (-> this (.updateTagsForDomain request))))

(defn update-domain-nameservers
  "Description copied from interface: AmazonRoute53Domains

  request - Replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain. If successful, this operation returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email. - `com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest`

  returns: Result of the UpdateDomainNameservers operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult`"
  (^com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest request]
    (-> this (.updateDomainNameservers request))))

(defn get-contact-reachability-status
  "Description copied from interface: AmazonRoute53Domains

  request - `com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest`

  returns: Result of the GetContactReachabilityStatus operation returned by the service. - `com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult`"
  (^com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest request]
    (-> this (.getContactReachabilityStatus request))))

(defn retrieve-domain-auth-code
  "Description copied from interface: AmazonRoute53Domains

  request - A request for the authorization code for the specified domain. To transfer a domain to another registrar, you provide this value to the new registrar. - `com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest`

  returns: Result of the RetrieveDomainAuthCode operation returned by the service. - `com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult`"
  (^com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest request]
    (-> this (.retrieveDomainAuthCode request))))

(defn view-billing
  "Description copied from interface: AmazonRoute53Domains

  request - The ViewBilling request includes the following elements. - `com.amazonaws.services.route53domains.model.ViewBillingRequest`

  returns: Result of the ViewBilling operation returned by the service. - `com.amazonaws.services.route53domains.model.ViewBillingResult`"
  (^com.amazonaws.services.route53domains.model.ViewBillingResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.ViewBillingRequest request]
    (-> this (.viewBilling request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonRoute53Domains

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonRoute53Domains this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn update-domain-contact-privacy
  "Description copied from interface: AmazonRoute53Domains

  request - The UpdateDomainContactPrivacy request includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest`

  returns: Result of the UpdateDomainContactPrivacy operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult`"
  (^com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest request]
    (-> this (.updateDomainContactPrivacy request))))

(defn enable-domain-auto-renew
  "Description copied from interface: AmazonRoute53Domains

  request - `com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest`

  returns: Result of the EnableDomainAutoRenew operation returned by the service. - `com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult`"
  (^com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest request]
    (-> this (.enableDomainAutoRenew request))))

(defn list-operations
  "Description copied from interface: AmazonRoute53Domains

  request - The ListOperations request includes the following elements. - `com.amazonaws.services.route53domains.model.ListOperationsRequest`

  returns: Result of the ListOperations operation returned by the service. - `com.amazonaws.services.route53domains.model.ListOperationsResult`"
  (^com.amazonaws.services.route53domains.model.ListOperationsResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.ListOperationsRequest request]
    (-> this (.listOperations request)))
  (^com.amazonaws.services.route53domains.model.ListOperationsResult [^AbstractAmazonRoute53Domains this]
    (-> this (.listOperations))))

(defn register-domain
  "Description copied from interface: AmazonRoute53Domains

  request - The RegisterDomain request includes the following elements. - `com.amazonaws.services.route53domains.model.RegisterDomainRequest`

  returns: Result of the RegisterDomain operation returned by the service. - `com.amazonaws.services.route53domains.model.RegisterDomainResult`"
  (^com.amazonaws.services.route53domains.model.RegisterDomainResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.RegisterDomainRequest request]
    (-> this (.registerDomain request))))

(defn update-domain-contact
  "Description copied from interface: AmazonRoute53Domains

  request - The UpdateDomainContact request includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateDomainContactRequest`

  returns: Result of the UpdateDomainContact operation returned by the service. - `com.amazonaws.services.route53domains.model.UpdateDomainContactResult`"
  (^com.amazonaws.services.route53domains.model.UpdateDomainContactResult [^AbstractAmazonRoute53Domains this ^com.amazonaws.services.route53domains.model.UpdateDomainContactRequest request]
    (-> this (.updateDomainContact request))))

