(ns com.amazonaws.services.route53domains.AmazonRoute53DomainsAsync
  "Interface for accessing Amazon Route 53 Domains asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonRoute53DomainsAsync instead.



  Amazon Route 53 API actions let you register domain names and perform related operations."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53domains AmazonRoute53DomainsAsync]))

(defn retrieve-domain-auth-code-async
  "This operation returns the AuthCode for the domain. To transfer a domain to another registrar, you provide this
   value to the new registrar.

  retrieve-domain-auth-code-request - A request for the authorization code for the specified domain. To transfer a domain to another registrar, you provide this value to the new registrar. - `com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetrieveDomainAuthCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest retrieve-domain-auth-code-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retrieveDomainAuthCodeAsync retrieve-domain-auth-code-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest retrieve-domain-auth-code-request]
    (-> this (.retrieveDomainAuthCodeAsync retrieve-domain-auth-code-request))))

(defn update-domain-nameservers-async
  "This operation replaces the current set of name servers for the domain with the specified set of name servers. If
   you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted
   zone for the domain.


   If successful, this operation returns an operation ID that you can use to track the progress and completion of
   the action. If the request is not completed successfully, the domain registrant will be notified by email.

  update-domain-nameservers-request - Replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain. If successful, this operation returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email. - `com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainNameservers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest update-domain-nameservers-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainNameserversAsync update-domain-nameservers-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest update-domain-nameservers-request]
    (-> this (.updateDomainNameserversAsync update-domain-nameservers-request))))

(defn get-operation-detail-async
  "This operation returns the current status of an operation that is not completed.

  get-operation-detail-request - The GetOperationDetail request includes the following element. - `com.amazonaws.services.route53domains.model.GetOperationDetailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOperationDetail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.GetOperationDetailResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetOperationDetailRequest get-operation-detail-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOperationDetailAsync get-operation-detail-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetOperationDetailRequest get-operation-detail-request]
    (-> this (.getOperationDetailAsync get-operation-detail-request))))

(defn check-domain-transferability-async
  "Checks whether a domain name can be transferred to Amazon Route 53.

  check-domain-transferability-request - The CheckDomainTransferability request contains the following elements. - `com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CheckDomainTransferability operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest check-domain-transferability-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.checkDomainTransferabilityAsync check-domain-transferability-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest check-domain-transferability-request]
    (-> this (.checkDomainTransferabilityAsync check-domain-transferability-request))))

(defn view-billing-async
  "Returns all the domain-related billing records for the current AWS account for a specified period

  view-billing-request - The ViewBilling request includes the following elements. - `com.amazonaws.services.route53domains.model.ViewBillingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ViewBilling operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.ViewBillingResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ViewBillingRequest view-billing-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.viewBillingAsync view-billing-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ViewBillingRequest view-billing-request]
    (-> this (.viewBillingAsync view-billing-request))))

(defn disable-domain-auto-renew-async
  "This operation disables automatic renewal of domain registration for the specified domain.

  disable-domain-auto-renew-request - `com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableDomainAutoRenew operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest disable-domain-auto-renew-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableDomainAutoRenewAsync disable-domain-auto-renew-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest disable-domain-auto-renew-request]
    (-> this (.disableDomainAutoRenewAsync disable-domain-auto-renew-request))))

(defn update-domain-contact-async
  "This operation updates the contact information for a particular domain. You must specify information for at least
   one contact: registrant, administrator, or technical.


   If the update is successful, this method returns an operation ID that you can use to track the progress and
   completion of the action. If the request is not completed successfully, the domain registrant will be notified by
   email.

  update-domain-contact-request - The UpdateDomainContact request includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateDomainContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.UpdateDomainContactResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainContactRequest update-domain-contact-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainContactAsync update-domain-contact-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainContactRequest update-domain-contact-request]
    (-> this (.updateDomainContactAsync update-domain-contact-request))))

(defn renew-domain-async
  "This operation renews a domain for the specified number of years. The cost of renewing your domain is billed to
   your AWS account.


   We recommend that you renew your domain several weeks before the expiration date. Some TLD registries delete
   domains before the expiration date if you haven't renewed far enough in advance. For more information about
   renewing domain registration, see Renewing Registration for a
   Domain in the Amazon Route 53 Developer Guide.

  renew-domain-request - A RenewDomain request includes the number of years that you want to renew for and the current expiration year. - `com.amazonaws.services.route53domains.model.RenewDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RenewDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.RenewDomainResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RenewDomainRequest renew-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.renewDomainAsync renew-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RenewDomainRequest renew-domain-request]
    (-> this (.renewDomainAsync renew-domain-request))))

(defn list-operations-async
  "This operation returns the operation IDs of operations that are not yet complete.

  list-operations-request - The ListOperations request includes the following elements. - `com.amazonaws.services.route53domains.model.ListOperationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOperations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.ListOperationsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListOperationsRequest list-operations-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOperationsAsync list-operations-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListOperationsRequest list-operations-request]
    (-> this (.listOperationsAsync list-operations-request)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this]
    (-> this (.listOperationsAsync))))

(defn update-tags-for-domain-async
  "This operation adds or updates tags for a specified domain.


   All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
   operations.

  update-tags-for-domain-request - The UpdateTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTagsForDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest update-tags-for-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTagsForDomainAsync update-tags-for-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest update-tags-for-domain-request]
    (-> this (.updateTagsForDomainAsync update-tags-for-domain-request))))

(defn enable-domain-auto-renew-async
  "This operation configures Amazon Route 53 to automatically renew the specified domain before the domain
   registration expires. The cost of renewing your domain registration is billed to your AWS account.


   The period during which you can renew a domain name varies by TLD. For a list of TLDs and their renewal policies,
   see
   \"Renewal, restoration, and deletion times\" on the website for our registrar associate, Gandi. Amazon Route 53
   requires that you renew before the end of the renewal period that is listed on the Gandi website so we can
   complete processing before the deadline.

  enable-domain-auto-renew-request - `com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableDomainAutoRenew operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest enable-domain-auto-renew-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableDomainAutoRenewAsync enable-domain-auto-renew-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest enable-domain-auto-renew-request]
    (-> this (.enableDomainAutoRenewAsync enable-domain-auto-renew-request))))

(defn check-domain-availability-async
  "This operation checks the availability of one domain name. Note that if the availability status of a domain is
   pending, you must submit another request to determine the availability of the domain name.

  check-domain-availability-request - The CheckDomainAvailability request contains the following elements. - `com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CheckDomainAvailability operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest check-domain-availability-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.checkDomainAvailabilityAsync check-domain-availability-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest check-domain-availability-request]
    (-> this (.checkDomainAvailabilityAsync check-domain-availability-request))))

(defn register-domain-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.RegisterDomainResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RegisterDomainRequest register-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerDomainAsync register-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RegisterDomainRequest register-domain-request]
    (-> this (.registerDomainAsync register-domain-request))))

(defn delete-tags-for-domain-async
  "This operation deletes the specified tags for a domain.


   All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
   operations.

  delete-tags-for-domain-request - The DeleteTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTagsForDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest delete-tags-for-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsForDomainAsync delete-tags-for-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest delete-tags-for-domain-request]
    (-> this (.deleteTagsForDomainAsync delete-tags-for-domain-request))))

(defn list-tags-for-domain-async
  "This operation returns all of the tags that are associated with the specified domain.


   All tag operations are eventually consistent; subsequent operations might not immediately represent all issued
   operations.

  list-tags-for-domain-request - The ListTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.ListTagsForDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.ListTagsForDomainResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListTagsForDomainRequest list-tags-for-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForDomainAsync list-tags-for-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListTagsForDomainRequest list-tags-for-domain-request]
    (-> this (.listTagsForDomainAsync list-tags-for-domain-request))))

(defn enable-domain-transfer-lock-async
  "This operation sets the transfer lock on the domain (specifically the clientTransferProhibited
   status) to prevent domain transfers. Successful submission returns an operation ID that you can use to track the
   progress and completion of the action. If the request is not completed successfully, the domain registrant will
   be notified by email.

  enable-domain-transfer-lock-request - A request to set the transfer lock for the specified domain. - `com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableDomainTransferLock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest enable-domain-transfer-lock-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableDomainTransferLockAsync enable-domain-transfer-lock-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest enable-domain-transfer-lock-request]
    (-> this (.enableDomainTransferLockAsync enable-domain-transfer-lock-request))))

(defn resend-contact-reachability-email-async
  "For operations that require confirmation that the email address for the registrant contact is valid, such as
   registering a new domain, this operation resends the confirmation email to the current email address for the
   registrant contact.

  resend-contact-reachability-email-request - `com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResendContactReachabilityEmail operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest resend-contact-reachability-email-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resendContactReachabilityEmailAsync resend-contact-reachability-email-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest resend-contact-reachability-email-request]
    (-> this (.resendContactReachabilityEmailAsync resend-contact-reachability-email-request))))

(defn update-domain-contact-privacy-async
  "This operation updates the specified domain contact's privacy setting. When privacy protection is enabled,
   contact information such as email address is replaced either with contact information for Amazon Registrar (for
   .com, .net, and .org domains) or with contact information for our registrar associate, Gandi.


   This operation affects only the contact information for the specified contact type (registrant, administrator, or
   tech). If the request succeeds, Amazon Route 53 returns an operation ID that you can use with
   GetOperationDetail to track the progress and completion of the action. If the request doesn't complete
   successfully, the domain registrant will be notified by email.

  update-domain-contact-privacy-request - The UpdateDomainContactPrivacy request includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainContactPrivacy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest update-domain-contact-privacy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainContactPrivacyAsync update-domain-contact-privacy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest update-domain-contact-privacy-request]
    (-> this (.updateDomainContactPrivacyAsync update-domain-contact-privacy-request))))

(defn get-domain-detail-async
  "This operation returns detailed information about a specified domain that is associated with the current AWS
   account. Contact information for the domain is also returned as part of the output.

  get-domain-detail-request - The GetDomainDetail request includes the following element. - `com.amazonaws.services.route53domains.model.GetDomainDetailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainDetail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.GetDomainDetailResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetDomainDetailRequest get-domain-detail-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainDetailAsync get-domain-detail-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetDomainDetailRequest get-domain-detail-request]
    (-> this (.getDomainDetailAsync get-domain-detail-request))))

(defn list-domains-async
  "This operation returns all the domain names registered with Amazon Route 53 for the current AWS account.

  list-domains-request - The ListDomains request includes the following elements. - `com.amazonaws.services.route53domains.model.ListDomainsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.ListDomainsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListDomainsRequest list-domains-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainsAsync list-domains-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListDomainsRequest list-domains-request]
    (-> this (.listDomainsAsync list-domains-request)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this]
    (-> this (.listDomainsAsync))))

(defn disable-domain-transfer-lock-async
  "This operation removes the transfer lock on the domain (specifically the clientTransferProhibited
   status) to allow domain transfers. We recommend you refrain from performing this action unless you intend to
   transfer the domain to a different registrar. Successful submission returns an operation ID that you can use to
   track the progress and completion of the action. If the request is not completed successfully, the domain
   registrant will be notified by email.

  disable-domain-transfer-lock-request - The DisableDomainTransferLock request includes the following element. - `com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableDomainTransferLock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest disable-domain-transfer-lock-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableDomainTransferLockAsync disable-domain-transfer-lock-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest disable-domain-transfer-lock-request]
    (-> this (.disableDomainTransferLockAsync disable-domain-transfer-lock-request))))

(defn transfer-domain-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TransferDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.TransferDomainResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.TransferDomainRequest transfer-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.transferDomainAsync transfer-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.TransferDomainRequest transfer-domain-request]
    (-> this (.transferDomainAsync transfer-domain-request))))

(defn get-contact-reachability-status-async
  "For operations that require confirmation that the email address for the registrant contact is valid, such as
   registering a new domain, this operation returns information about whether the registrant contact has responded.


   If you want us to resend the email, use the ResendContactReachabilityEmail operation.

  get-contact-reachability-status-request - `com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContactReachabilityStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest get-contact-reachability-status-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContactReachabilityStatusAsync get-contact-reachability-status-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest get-contact-reachability-status-request]
    (-> this (.getContactReachabilityStatusAsync get-contact-reachability-status-request))))

(defn get-domain-suggestions-async
  "The GetDomainSuggestions operation returns a list of suggested domain names given a string, which can either be a
   domain name or simply a word or phrase (without spaces).

  get-domain-suggestions-request - `com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainSuggestions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult>`"
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest get-domain-suggestions-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainSuggestionsAsync get-domain-suggestions-request async-handler)))
  (^java.util.concurrent.Future [^AmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest get-domain-suggestions-request]
    (-> this (.getDomainSuggestionsAsync get-domain-suggestions-request))))

