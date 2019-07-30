(ns com.amazonaws.services.route53domains.AbstractAmazonRoute53DomainsAsync
  "Abstract implementation of AmazonRoute53DomainsAsync. Convenient method forms pass through to the
  corresponding overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.route53domains AbstractAmazonRoute53DomainsAsync]))

(defn retrieve-domain-auth-code-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - A request for the authorization code for the specified domain. To transfer a domain to another registrar, you provide this value to the new registrar. - `com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RetrieveDomainAuthCode operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.retrieveDomainAuthCodeAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RetrieveDomainAuthCodeRequest request]
    (-> this (.retrieveDomainAuthCodeAsync request))))

(defn update-domain-nameservers-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - Replaces the current set of name servers for the domain with the specified set of name servers. If you use Amazon Route 53 as your DNS service, specify the four name servers in the delegation set for the hosted zone for the domain. If successful, this operation returns an operation ID that you can use to track the progress and completion of the action. If the request is not completed successfully, the domain registrant will be notified by email. - `com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainNameservers operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.UpdateDomainNameserversResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainNameserversAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainNameserversRequest request]
    (-> this (.updateDomainNameserversAsync request))))

(defn get-operation-detail-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The GetOperationDetail request includes the following element. - `com.amazonaws.services.route53domains.model.GetOperationDetailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetOperationDetail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.GetOperationDetailResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetOperationDetailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getOperationDetailAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetOperationDetailRequest request]
    (-> this (.getOperationDetailAsync request))))

(defn check-domain-transferability-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The CheckDomainTransferability request contains the following elements. - `com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CheckDomainTransferability operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.CheckDomainTransferabilityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.checkDomainTransferabilityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.CheckDomainTransferabilityRequest request]
    (-> this (.checkDomainTransferabilityAsync request))))

(defn view-billing-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The ViewBilling request includes the following elements. - `com.amazonaws.services.route53domains.model.ViewBillingRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ViewBilling operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.ViewBillingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ViewBillingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.viewBillingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ViewBillingRequest request]
    (-> this (.viewBillingAsync request))))

(defn disable-domain-auto-renew-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - `com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableDomainAutoRenew operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.DisableDomainAutoRenewResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableDomainAutoRenewAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DisableDomainAutoRenewRequest request]
    (-> this (.disableDomainAutoRenewAsync request))))

(defn update-domain-contact-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The UpdateDomainContact request includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateDomainContactRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainContact operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.UpdateDomainContactResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainContactRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainContactAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainContactRequest request]
    (-> this (.updateDomainContactAsync request))))

(defn renew-domain-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - A RenewDomain request includes the number of years that you want to renew for and the current expiration year. - `com.amazonaws.services.route53domains.model.RenewDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RenewDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.RenewDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RenewDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.renewDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RenewDomainRequest request]
    (-> this (.renewDomainAsync request))))

(defn list-operations-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The ListOperations request includes the following elements. - `com.amazonaws.services.route53domains.model.ListOperationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListOperations operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.ListOperationsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListOperationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listOperationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListOperationsRequest request]
    (-> this (.listOperationsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this]
    (-> this (.listOperationsAsync))))

(defn update-tags-for-domain-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The UpdateTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTagsForDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.UpdateTagsForDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTagsForDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateTagsForDomainRequest request]
    (-> this (.updateTagsForDomainAsync request))))

(defn enable-domain-auto-renew-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - `com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableDomainAutoRenew operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.EnableDomainAutoRenewResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableDomainAutoRenewAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.EnableDomainAutoRenewRequest request]
    (-> this (.enableDomainAutoRenewAsync request))))

(defn check-domain-availability-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The CheckDomainAvailability request contains the following elements. - `com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CheckDomainAvailability operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.CheckDomainAvailabilityResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.checkDomainAvailabilityAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.CheckDomainAvailabilityRequest request]
    (-> this (.checkDomainAvailabilityAsync request))))

(defn register-domain-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The RegisterDomain request includes the following elements. - `com.amazonaws.services.route53domains.model.RegisterDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RegisterDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.RegisterDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RegisterDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.registerDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.RegisterDomainRequest request]
    (-> this (.registerDomainAsync request))))

(defn delete-tags-for-domain-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The DeleteTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTagsForDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.DeleteTagsForDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTagsForDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DeleteTagsForDomainRequest request]
    (-> this (.deleteTagsForDomainAsync request))))

(defn list-tags-for-domain-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The ListTagsForDomainRequest includes the following elements. - `com.amazonaws.services.route53domains.model.ListTagsForDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.ListTagsForDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListTagsForDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListTagsForDomainRequest request]
    (-> this (.listTagsForDomainAsync request))))

(defn enable-domain-transfer-lock-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - A request to set the transfer lock for the specified domain. - `com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the EnableDomainTransferLock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.EnableDomainTransferLockResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.enableDomainTransferLockAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.EnableDomainTransferLockRequest request]
    (-> this (.enableDomainTransferLockAsync request))))

(defn resend-contact-reachability-email-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - `com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ResendContactReachabilityEmail operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.resendContactReachabilityEmailAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ResendContactReachabilityEmailRequest request]
    (-> this (.resendContactReachabilityEmailAsync request))))

(defn update-domain-contact-privacy-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The UpdateDomainContactPrivacy request includes the following elements. - `com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateDomainContactPrivacy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateDomainContactPrivacyAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.UpdateDomainContactPrivacyRequest request]
    (-> this (.updateDomainContactPrivacyAsync request))))

(defn get-domain-detail-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The GetDomainDetail request includes the following element. - `com.amazonaws.services.route53domains.model.GetDomainDetailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainDetail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.GetDomainDetailResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetDomainDetailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainDetailAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetDomainDetailRequest request]
    (-> this (.getDomainDetailAsync request))))

(defn list-domains-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The ListDomains request includes the following elements. - `com.amazonaws.services.route53domains.model.ListDomainsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDomains operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.ListDomainsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListDomainsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDomainsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.ListDomainsRequest request]
    (-> this (.listDomainsAsync request)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this]
    (-> this (.listDomainsAsync))))

(defn disable-domain-transfer-lock-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The DisableDomainTransferLock request includes the following element. - `com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DisableDomainTransferLock operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.DisableDomainTransferLockResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.disableDomainTransferLockAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.DisableDomainTransferLockRequest request]
    (-> this (.disableDomainTransferLockAsync request))))

(defn transfer-domain-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - The TransferDomain request includes the following elements. - `com.amazonaws.services.route53domains.model.TransferDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TransferDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.TransferDomainResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.TransferDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.transferDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.TransferDomainRequest request]
    (-> this (.transferDomainAsync request))))

(defn get-contact-reachability-status-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - `com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContactReachabilityStatus operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.GetContactReachabilityStatusResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContactReachabilityStatusAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetContactReachabilityStatusRequest request]
    (-> this (.getContactReachabilityStatusAsync request))))

(defn get-domain-suggestions-async
  "Description copied from interface: AmazonRoute53DomainsAsync

  request - `com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetDomainSuggestions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.route53domains.model.GetDomainSuggestionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getDomainSuggestionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRoute53DomainsAsync this ^com.amazonaws.services.route53domains.model.GetDomainSuggestionsRequest request]
    (-> this (.getDomainSuggestionsAsync request))))

