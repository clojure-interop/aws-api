(ns com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceAsync
  "Interface for accessing Amazon SES asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSimpleEmailServiceAsync instead.


  Amazon Simple Email Service

  This document contains reference information for the Amazon Simple Email
  Service (Amazon SES) API, version 2010-12-01. This document is best used in conjunction with the Amazon SES Developer Guide.



  For a list of Amazon SES endpoints to use in service requests, see Regions and Amazon SES in the Amazon SES Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpleemail AmazonSimpleEmailServiceAsync]))

(defn delete-configuration-set-tracking-options-async
  "Deletes an association between a configuration set and a custom domain for open and click event tracking.


   By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
   SES. You can configure a subdomain of your own to handle these events. For information about using custom
   domains, see the Amazon SES
   Developer Guide.



   Deleting this kind of association will result in emails sent using the specified configuration set to capture
   open and click events using the standard, Amazon SES-operated domains.

  delete-configuration-set-tracking-options-request - Represents a request to delete open and click tracking options in a configuration set. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSetTrackingOptions operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest delete-configuration-set-tracking-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetTrackingOptionsAsync delete-configuration-set-tracking-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest delete-configuration-set-tracking-options-request]
    (-> this (.deleteConfigurationSetTrackingOptionsAsync delete-configuration-set-tracking-options-request))))

(defn send-email-async
  "Composes an email message and immediately queues it for sending. In order to send email using the
   SendEmail operation, your message must meet the following requirements:




   The message must be sent from a verified email address or domain. If you attempt to send email using a
   non-verified address or domain, the operation will result in an \"Email address not verified\" error.




   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
   email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email
   Addresses and Domains in the Amazon SES Developer Guide.




   The maximum message size is 10 MB.




   The message must include at least one recipient email address. The recipient address can be a To: address, a CC:
   address, or a BCC: address. If a recipient email address is invalid (that is, it is not in the format
   UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even if the message
   contains other recipients that are valid.




   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an
   email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call
   the SendEmail operation several times to send the message to each group.





   For every message that you send, the total number of recipients (including each recipient in the To:, CC: and
   BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending
   quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES
   Sending Limits in the Amazon SES Developer Guide.

  send-email-request - Represents a request to send a single formatted email using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendEmailResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendEmailRequest send-email-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendEmailAsync send-email-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendEmailRequest send-email-request]
    (-> this (.sendEmailAsync send-email-request))))

(defn list-templates-async
  "Lists the email templates present in your Amazon SES account in the current AWS Region.


   You can execute this operation no more than once per second.

  list-templates-request - `com.amazonaws.services.simpleemail.model.ListTemplatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListTemplatesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListTemplatesRequest list-templates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTemplatesAsync list-templates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListTemplatesRequest list-templates-request]
    (-> this (.listTemplatesAsync list-templates-request))))

(defn create-receipt-rule-set-async
  "Creates an empty receipt rule set.


   For information about setting up receipt rule sets, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  create-receipt-rule-set-request - Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest create-receipt-rule-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReceiptRuleSetAsync create-receipt-rule-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest create-receipt-rule-set-request]
    (-> this (.createReceiptRuleSetAsync create-receipt-rule-set-request))))

(defn create-template-async
  "Creates an email template. Email templates enable you to send personalized email to one or more destinations in a
   single API operation. For more information, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  create-template-request - Represents a request to create an email template. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateTemplateRequest create-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTemplateAsync create-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateTemplateRequest create-template-request]
    (-> this (.createTemplateAsync create-template-request))))

(defn get-identity-policies-async
  "Returns the requested sending authorization policies for the given identity (an email address or a domain). The
   policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a
   time.



   This API is for the identity owner only. If you have not verified the identity, this API will return an error.



   Sending authorization is a feature that enables an identity owner to authorize other senders to use its
   identities. For information about using sending authorization, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  get-identity-policies-request - Represents a request to return the requested sending authorization policies for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest get-identity-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityPoliciesAsync get-identity-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest get-identity-policies-request]
    (-> this (.getIdentityPoliciesAsync get-identity-policies-request))))

(defn send-bounce-async
  "Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use
   this API on an email up to 24 hours after you receive it.



   You cannot use this API to send generic bounces for mail that was not received by Amazon SES.



   For information about receiving email through Amazon SES, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  send-bounce-request - Represents a request to send a bounce message to the sender of an email you received through Amazon SES. - `com.amazonaws.services.simpleemail.model.SendBounceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendBounce operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendBounceResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendBounceRequest send-bounce-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendBounceAsync send-bounce-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendBounceRequest send-bounce-request]
    (-> this (.sendBounceAsync send-bounce-request))))

(defn describe-active-receipt-rule-set-async
  "Returns the metadata and receipt rules for the receipt rule set that is currently active.


   For information about setting up receipt rule sets, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  describe-active-receipt-rule-set-request - Represents a request to return the metadata and receipt rules for the receipt rule set that is currently active. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActiveReceiptRuleSet operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest describe-active-receipt-rule-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActiveReceiptRuleSetAsync describe-active-receipt-rule-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest describe-active-receipt-rule-set-request]
    (-> this (.describeActiveReceiptRuleSetAsync describe-active-receipt-rule-set-request))))

(defn get-identity-mail-from-domain-attributes-async
  "Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains).


   This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100
   identities at a time.

  get-identity-mail-from-domain-attributes-request - Represents a request to return the Amazon SES custom MAIL FROM attributes for a list of identities. For information about using a custom MAIL FROM domain, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityMailFromDomainAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest get-identity-mail-from-domain-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityMailFromDomainAttributesAsync get-identity-mail-from-domain-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest get-identity-mail-from-domain-attributes-request]
    (-> this (.getIdentityMailFromDomainAttributesAsync get-identity-mail-from-domain-attributes-request))))

(defn create-configuration-set-tracking-options-async
  "Creates an association between a configuration set and a custom domain for open and click event tracking.


   By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
   SES. You can configure a subdomain of your own to handle these events. For information about using custom
   domains, see the Amazon SES
   Developer Guide.

  create-configuration-set-tracking-options-request - Represents a request to create an open and click tracking option object in a configuration set. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSetTrackingOptions operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest create-configuration-set-tracking-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetTrackingOptionsAsync create-configuration-set-tracking-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest create-configuration-set-tracking-options-request]
    (-> this (.createConfigurationSetTrackingOptionsAsync create-configuration-set-tracking-options-request))))

(defn update-account-sending-enabled-async
  "Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use
   this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon
   SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain
   thresholds.


   You can execute this operation no more than once per second.

  update-account-sending-enabled-request - Represents a request to enable or disable the email sending capabilities for your entire Amazon SES account. - `com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccountSendingEnabled operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest update-account-sending-enabled-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountSendingEnabledAsync update-account-sending-enabled-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest update-account-sending-enabled-request]
    (-> this (.updateAccountSendingEnabledAsync update-account-sending-enabled-request))))

(defn create-receipt-rule-async
  "Creates a receipt rule.


   For information about setting up receipt rules, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  create-receipt-rule-request - Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReceiptRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest create-receipt-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReceiptRuleAsync create-receipt-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest create-receipt-rule-request]
    (-> this (.createReceiptRuleAsync create-receipt-rule-request))))

(defn test-render-template-async
  "Creates a preview of the MIME content of an email when provided with a template and a set of replacement data.


   You can execute this operation no more than once per second.

  test-render-template-request - `com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestRenderTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.TestRenderTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest test-render-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testRenderTemplateAsync test-render-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest test-render-template-request]
    (-> this (.testRenderTemplateAsync test-render-template-request))))

(defn list-configuration-sets-async
  "Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For
   information about using configuration sets, see Monitoring Your Amazon
   SES Sending Activity in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second. This operation will return up to 1,000 configuration
   sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will
   also return a NextToken element. You can then execute the ListConfigurationSets operation again,
   passing the NextToken parameter and the value of the NextToken element to retrieve additional
   results.

  list-configuration-sets-request - Represents a request to list the configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurationSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest list-configuration-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationSetsAsync list-configuration-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest list-configuration-sets-request]
    (-> this (.listConfigurationSetsAsync list-configuration-sets-request))))

(defn update-configuration-set-event-destination-async
  "Updates the event destination of a configuration set. Event destinations are associated with configuration sets,
   which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple
   Notification Service (Amazon SNS). For information about using configuration sets, see Monitoring Your Amazon
   SES Sending Activity in the Amazon SES Developer Guide.



   When you create or update an event destination, you must provide one, and only one, destination. The destination
   can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).



   You can execute this operation no more than once per second.

  update-configuration-set-event-destination-request - Represents a request to update the event destination of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest update-configuration-set-event-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetEventDestinationAsync update-configuration-set-event-destination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest update-configuration-set-event-destination-request]
    (-> this (.updateConfigurationSetEventDestinationAsync update-configuration-set-event-destination-request))))

(defn get-identity-dkim-attributes-async
  "Returns the current status of Easy DKIM signing for an entity. For domain name identities, this operation also
   returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES has successfully verified
   that these tokens have been published.


   This operation takes a list of identities as input and returns the following information for each:




   Whether Easy DKIM signing is enabled or disabled.




   A set of DKIM tokens that represent the identity. If the identity is an email address, the tokens represent the
   domain of that address.




   Whether Amazon SES has successfully verified the DKIM tokens published in the domain's DNS. This information is
   only returned for domain name identities, not for email addresses.




   This operation is throttled at one request per second and can only get DKIM attributes for up to 100 identities
   at a time.


   For more information about creating DNS records using DKIM tokens, go to the Amazon SES Developer
   Guide.

  get-identity-dkim-attributes-request - Represents a request for the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this request also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published. For more information about Easy DKIM, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityDkimAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest get-identity-dkim-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityDkimAttributesAsync get-identity-dkim-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest get-identity-dkim-attributes-request]
    (-> this (.getIdentityDkimAttributesAsync get-identity-dkim-attributes-request))))

(defn put-identity-policy-async
  "Adds or updates a sending authorization policy for the specified identity (an email address or a domain).



   This API is for the identity owner only. If you have not verified the identity, this API will return an error.



   Sending authorization is a feature that enables an identity owner to authorize other senders to use its
   identities. For information about using sending authorization, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  put-identity-policy-request - Represents a request to add or update a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutIdentityPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest put-identity-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putIdentityPolicyAsync put-identity-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest put-identity-policy-request]
    (-> this (.putIdentityPolicyAsync put-identity-policy-request))))

(defn send-custom-verification-email-async
  "Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and
   attempts to verify it. As a result of executing this operation, a customized verification email is sent to the
   specified address.


   To use this operation, you must first create a custom verification email template. For more information about
   creating and using custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  send-custom-verification-email-request - Represents a request to send a custom verification email to a specified recipient. - `com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendCustomVerificationEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest send-custom-verification-email-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendCustomVerificationEmailAsync send-custom-verification-email-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest send-custom-verification-email-request]
    (-> this (.sendCustomVerificationEmailAsync send-custom-verification-email-request))))

(defn delete-identity-policy-async
  "Deletes the specified sending authorization policy for the given identity (an email address or a domain). This
   API returns successfully even if a policy with the specified name does not exist.



   This API is for the identity owner only. If you have not verified the identity, this API will return an error.



   Sending authorization is a feature that enables an identity owner to authorize other senders to use its
   identities. For information about using sending authorization, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  delete-identity-policy-request - Represents a request to delete a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentityPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest delete-identity-policy-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentityPolicyAsync delete-identity-policy-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest delete-identity-policy-request]
    (-> this (.deleteIdentityPolicyAsync delete-identity-policy-request))))

(defn get-send-quota-async
  "Provides the sending limits for the Amazon SES account.


   You can execute this operation no more than once per second.

  get-send-quota-request - `com.amazonaws.services.simpleemail.model.GetSendQuotaRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSendQuota operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetSendQuotaResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetSendQuotaRequest get-send-quota-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSendQuotaAsync get-send-quota-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetSendQuotaRequest get-send-quota-request]
    (-> this (.getSendQuotaAsync get-send-quota-request)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this]
    (-> this (.getSendQuotaAsync))))

(defn clone-receipt-rule-set-async
  "Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new
   receipt rule set and are completely independent of the source rule set.


   For information about setting up rule sets, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  clone-receipt-rule-set-request - Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CloneReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest clone-receipt-rule-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cloneReceiptRuleSetAsync clone-receipt-rule-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest clone-receipt-rule-set-request]
    (-> this (.cloneReceiptRuleSetAsync clone-receipt-rule-set-request))))

(defn get-send-statistics-async
  "Provides sending statistics for the current AWS Region. The result is a list of data points, representing the
   last two weeks of sending activity. Each data point in the list contains statistics for a 15-minute period of
   time.


   You can execute this operation no more than once per second.

  get-send-statistics-request - `com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSendStatistics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetSendStatisticsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest get-send-statistics-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSendStatisticsAsync get-send-statistics-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest get-send-statistics-request]
    (-> this (.getSendStatisticsAsync get-send-statistics-request)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this]
    (-> this (.getSendStatisticsAsync))))

(defn update-receipt-rule-async
  "Updates a receipt rule.


   For information about managing receipt rules, see the Amazon
   SES Developer Guide.


   You can execute this operation no more than once per second.

  update-receipt-rule-request - Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateReceiptRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest update-receipt-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateReceiptRuleAsync update-receipt-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest update-receipt-rule-request]
    (-> this (.updateReceiptRuleAsync update-receipt-rule-request))))

(defn list-receipt-rule-sets-async
  "Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional
   receipt rule sets to be retrieved, you will receive a NextToken that you can provide to the next
   call to ListReceiptRuleSets to retrieve the additional entries.


   For information about managing receipt rule sets, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  list-receipt-rule-sets-request - Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListReceiptRuleSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest list-receipt-rule-sets-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listReceiptRuleSetsAsync list-receipt-rule-sets-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest list-receipt-rule-sets-request]
    (-> this (.listReceiptRuleSetsAsync list-receipt-rule-sets-request))))

(defn verify-domain-dkim-async
  "Returns a set of DKIM tokens for a domain identity.



   When you execute the VerifyDomainDkim operation, the domain that you specify is added to the list of
   identities that are associated with your account. This is true even if you haven't already associated the domain
   with your account by using the VerifyDomainIdentity operation. However, you can't send email from
   the domain until you either successfully verify it or you
   successfully set up DKIM for
   it.



   You use the tokens that are generated by this operation to create CNAME records. When Amazon SES detects that
   you've added these records to the DNS configuration for a domain, you can start sending email from that domain.
   You can start sending email even if you haven't added the TXT record provided by the VerifyDomainIdentity
   operation to the DNS configuration for your domain. All email that you send from the domain is authenticated
   using DKIM.


   To create the CNAME records for DKIM authentication, use the following values:




   Name: token._domainkey.example.com




   Type: CNAME




   Value: token.dkim.amazonses.com




   In the preceding example, replace token with one of the tokens that are generated when you execute this
   operation. Replace example.com with your domain. Repeat this process for each token that's generated by
   this operation.


   You can execute this operation no more than once per second.

  verify-domain-dkim-request - Represents a request to generate the CNAME records needed to set up Easy DKIM with Amazon SES. For more information about setting up Easy DKIM, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyDomainDkim operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest verify-domain-dkim-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyDomainDkimAsync verify-domain-dkim-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest verify-domain-dkim-request]
    (-> this (.verifyDomainDkimAsync verify-domain-dkim-request))))

(defn list-identities-async
  "Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current
   AWS Region, regardless of verification status.


   You can execute this operation no more than once per second.

  list-identities-request - Represents a request to return a list of all identities (email addresses and domains) that you have attempted to verify under your AWS account, regardless of verification status. - `com.amazonaws.services.simpleemail.model.ListIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListIdentitiesRequest list-identities-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentitiesAsync list-identities-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListIdentitiesRequest list-identities-request]
    (-> this (.listIdentitiesAsync list-identities-request)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this]
    (-> this (.listIdentitiesAsync))))

(defn describe-receipt-rule-async
  "Returns the details of the specified receipt rule.


   For information about setting up receipt rules, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  describe-receipt-rule-request - Represents a request to return the details of a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReceiptRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest describe-receipt-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReceiptRuleAsync describe-receipt-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest describe-receipt-rule-request]
    (-> this (.describeReceiptRuleAsync describe-receipt-rule-request))))

(defn create-configuration-set-event-destination-async
  "Creates a configuration set event destination.



   When you create or update an event destination, you must provide one, and only one, destination. The destination
   can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).



   An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a
   configuration set. For information about using configuration sets, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  create-configuration-set-event-destination-request - Represents a request to create a configuration set event destination. A configuration set event destination, which can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest create-configuration-set-event-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetEventDestinationAsync create-configuration-set-event-destination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest create-configuration-set-event-destination-request]
    (-> this (.createConfigurationSetEventDestinationAsync create-configuration-set-event-destination-request))))

(defn delete-template-async
  "Deletes an email template.


   You can execute this operation no more than once per second.

  delete-template-request - Represents a request to delete an email template. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteTemplateRequest delete-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTemplateAsync delete-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteTemplateRequest delete-template-request]
    (-> this (.deleteTemplateAsync delete-template-request))))

(defn list-verified-email-addresses-async
  "Deprecated. Use the ListIdentities operation to list the email addresses and domains associated with
   your account.

  list-verified-email-addresses-request - `com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVerifiedEmailAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest list-verified-email-addresses-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVerifiedEmailAddressesAsync list-verified-email-addresses-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest list-verified-email-addresses-request]
    (-> this (.listVerifiedEmailAddressesAsync list-verified-email-addresses-request)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this]
    (-> this (.listVerifiedEmailAddressesAsync))))

(defn get-custom-verification-email-template-async
  "Returns the custom email verification template for the template name you specify.


   For more information about custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  get-custom-verification-email-template-request - Represents a request to retrieve an existing custom verification email template. - `com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCustomVerificationEmailTemplate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest get-custom-verification-email-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCustomVerificationEmailTemplateAsync get-custom-verification-email-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest get-custom-verification-email-template-request]
    (-> this (.getCustomVerificationEmailTemplateAsync get-custom-verification-email-template-request))))

(defn describe-receipt-rule-set-async
  "Returns the details of the specified receipt rule set.


   For information about managing receipt rule sets, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  describe-receipt-rule-set-request - Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest describe-receipt-rule-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReceiptRuleSetAsync describe-receipt-rule-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest describe-receipt-rule-set-request]
    (-> this (.describeReceiptRuleSetAsync describe-receipt-rule-set-request))))

(defn update-configuration-set-reputation-metrics-enabled-async
  "Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a
   given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon
   CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds.


   You can execute this operation no more than once per second.

  update-configuration-set-reputation-metrics-enabled-request - Represents a request to modify the reputation metric publishing settings for a configuration set. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetReputationMetricsEnabled operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest update-configuration-set-reputation-metrics-enabled-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetReputationMetricsEnabledAsync update-configuration-set-reputation-metrics-enabled-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest update-configuration-set-reputation-metrics-enabled-request]
    (-> this (.updateConfigurationSetReputationMetricsEnabledAsync update-configuration-set-reputation-metrics-enabled-request))))

(defn set-identity-dkim-enabled-async
  "Enables or disables Easy DKIM signing of email sent from an identity:




   If Easy DKIM signing is enabled for a domain name identity (such as example.com), then Amazon SES
   will DKIM-sign all email sent by addresses under that domain name (for example, user@example.com).




   If Easy DKIM signing is enabled for an email address, then Amazon SES will DKIM-sign all email sent by that email
   address.




   For email addresses (for example, user@example.com), you can only enable Easy DKIM signing if the
   corresponding domain (in this case, example.com) has been set up for Easy DKIM using the AWS Console
   or the VerifyDomainDkim operation.


   You can execute this operation no more than once per second.


   For more information about Easy DKIM signing, go to the Amazon SES Developer Guide.

  set-identity-dkim-enabled-request - Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more information about setting up Easy DKIM, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityDkimEnabled operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest set-identity-dkim-enabled-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityDkimEnabledAsync set-identity-dkim-enabled-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest set-identity-dkim-enabled-request]
    (-> this (.setIdentityDkimEnabledAsync set-identity-dkim-enabled-request))))

(defn update-template-async
  "Updates an email template. Email templates enable you to send personalized email to one or more destinations in a
   single API operation. For more information, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  update-template-request - `com.amazonaws.services.simpleemail.model.UpdateTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateTemplateRequest update-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTemplateAsync update-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateTemplateRequest update-template-request]
    (-> this (.updateTemplateAsync update-template-request))))

(defn delete-verified-email-address-async
  "Deprecated. Use the DeleteIdentity operation to delete email addresses and domains.

  delete-verified-email-address-request - Represents a request to delete an email address from the list of email addresses you have attempted to verify under your AWS account. - `com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVerifiedEmailAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest delete-verified-email-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVerifiedEmailAddressAsync delete-verified-email-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest delete-verified-email-address-request]
    (-> this (.deleteVerifiedEmailAddressAsync delete-verified-email-address-request))))

(defn delete-receipt-rule-set-async
  "Deletes the specified receipt rule set and all of the receipt rules it contains.



   The currently active rule set cannot be deleted.



   For information about managing receipt rule sets, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  delete-receipt-rule-set-request - Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest delete-receipt-rule-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReceiptRuleSetAsync delete-receipt-rule-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest delete-receipt-rule-set-request]
    (-> this (.deleteReceiptRuleSetAsync delete-receipt-rule-set-request))))

(defn set-identity-headers-in-notifications-enabled-async
  "Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in
   the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type.


   You can execute this operation no more than once per second.


   For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.

  set-identity-headers-in-notifications-enabled-request - Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS notifications of a specified type. For information about notifications, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityHeadersInNotificationsEnabled operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest set-identity-headers-in-notifications-enabled-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityHeadersInNotificationsEnabledAsync set-identity-headers-in-notifications-enabled-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest set-identity-headers-in-notifications-enabled-request]
    (-> this (.setIdentityHeadersInNotificationsEnabledAsync set-identity-headers-in-notifications-enabled-request))))

(defn list-identity-policies-async
  "Returns a list of sending authorization policies that are attached to the given identity (an email address or a
   domain). This API returns only a list. If you want the actual policy content, you can use
   GetIdentityPolicies.



   This API is for the identity owner only. If you have not verified the identity, this API will return an error.



   Sending authorization is a feature that enables an identity owner to authorize other senders to use its
   identities. For information about using sending authorization, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  list-identity-policies-request - Represents a request to return a list of sending authorization policies that are attached to an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentityPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest list-identity-policies-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentityPoliciesAsync list-identity-policies-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest list-identity-policies-request]
    (-> this (.listIdentityPoliciesAsync list-identity-policies-request))))

(defn send-templated-email-async
  "Composes an email message using an email template and immediately queues it for sending.


   In order to send email using the SendTemplatedEmail operation, your call to the API must meet the
   following requirements:




   The call must refer to an existing email template. You can create email templates using the CreateTemplate
   operation.




   The message must be sent from a verified email address or domain.




   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
   email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email
   Addresses and Domains in the Amazon SES Developer Guide.




   The maximum message size is 10 MB.




   Calls to the SendTemplatedEmail operation may only include one Destination parameter. A
   destination is a set of recipients who will receive the same version of the email. The Destination
   parameter can include up to 50 recipients, across the To:, CC: and BCC: fields.




   The Destination parameter must include at least one recipient email address. The recipient address
   can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is
   not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even
   if the message contains other recipients that are valid.





   If your call to the SendTemplatedEmail operation includes all of the required parameters, Amazon SES
   accepts it and returns a Message ID. However, if Amazon SES can't render the email because the template contains
   errors, it doesn't send the email. Additionally, because it already accepted the message, Amazon SES doesn't
   return a message stating that it was unable to send the email.


   For these reasons, we highly recommend that you set up Amazon SES to send you notifications when Rendering
   Failure events occur. For more information, see Sending
   Personalized Email Using the Amazon SES API in the Amazon Simple Email Service Developer Guide.

  send-templated-email-request - Represents a request to send a templated email using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTemplatedEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest send-templated-email-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTemplatedEmailAsync send-templated-email-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest send-templated-email-request]
    (-> this (.sendTemplatedEmailAsync send-templated-email-request))))

(defn create-configuration-set-async
  "Creates a configuration set.


   Configuration sets enable you to publish email sending events. For information about using configuration sets,
   see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  create-configuration-set-request - Represents a request to create a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest create-configuration-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetAsync create-configuration-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest create-configuration-set-request]
    (-> this (.createConfigurationSetAsync create-configuration-set-request))))

(defn set-identity-mail-from-domain-async
  "Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).



   To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS
   settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an
   SPF record. For more information, see the Amazon SES Developer Guide.



   You can execute this operation no more than once per second.

  set-identity-mail-from-domain-request - Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified identity. For information about using a custom MAIL FROM domain, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityMailFromDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest set-identity-mail-from-domain-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityMailFromDomainAsync set-identity-mail-from-domain-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest set-identity-mail-from-domain-request]
    (-> this (.setIdentityMailFromDomainAsync set-identity-mail-from-domain-request))))

(defn delete-custom-verification-email-template-async
  "Deletes an existing custom verification email template.


   For more information about custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  delete-custom-verification-email-template-request - Represents a request to delete an existing custom verification email template. - `com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCustomVerificationEmailTemplate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest delete-custom-verification-email-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCustomVerificationEmailTemplateAsync delete-custom-verification-email-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest delete-custom-verification-email-template-request]
    (-> this (.deleteCustomVerificationEmailTemplateAsync delete-custom-verification-email-template-request))))

(defn get-account-sending-enabled-async
  "Returns the email sending status of the Amazon SES account for the current region.


   You can execute this operation no more than once per second.

  get-account-sending-enabled-request - `com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountSendingEnabled operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest get-account-sending-enabled-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountSendingEnabledAsync get-account-sending-enabled-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest get-account-sending-enabled-request]
    (-> this (.getAccountSendingEnabledAsync get-account-sending-enabled-request))))

(defn set-active-receipt-rule-set-async
  "Sets the specified receipt rule set as the active receipt rule set.



   To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to
   null.



   For information about managing receipt rule sets, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  set-active-receipt-rule-set-request - Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetActiveReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest set-active-receipt-rule-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setActiveReceiptRuleSetAsync set-active-receipt-rule-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest set-active-receipt-rule-set-request]
    (-> this (.setActiveReceiptRuleSetAsync set-active-receipt-rule-set-request))))

(defn set-identity-feedback-forwarding-enabled-async
  "Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and
   complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification
   Service (Amazon SNS) topics are specified for both bounces and complaints.



   Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through
   Amazon SNS.



   You can execute this operation no more than once per second.


   For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.

  set-identity-feedback-forwarding-enabled-request - Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint notifications through email. For information about email feedback forwarding, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityFeedbackForwardingEnabled operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest set-identity-feedback-forwarding-enabled-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityFeedbackForwardingEnabledAsync set-identity-feedback-forwarding-enabled-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest set-identity-feedback-forwarding-enabled-request]
    (-> this (.setIdentityFeedbackForwardingEnabledAsync set-identity-feedback-forwarding-enabled-request))))

(defn set-receipt-rule-position-async
  "Sets the position of the specified receipt rule in the receipt rule set.


   For information about managing receipt rules, see the Amazon
   SES Developer Guide.


   You can execute this operation no more than once per second.

  set-receipt-rule-position-request - Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetReceiptRulePosition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest set-receipt-rule-position-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setReceiptRulePositionAsync set-receipt-rule-position-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest set-receipt-rule-position-request]
    (-> this (.setReceiptRulePositionAsync set-receipt-rule-position-request))))

(defn put-configuration-set-delivery-options-async
  "Adds or updates the delivery options for a configuration set.

  put-configuration-set-delivery-options-request - A request to modify the delivery options for a configuration set. - `com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationSetDeliveryOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsRequest put-configuration-set-delivery-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationSetDeliveryOptionsAsync put-configuration-set-delivery-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsRequest put-configuration-set-delivery-options-request]
    (-> this (.putConfigurationSetDeliveryOptionsAsync put-configuration-set-delivery-options-request))))

(defn get-identity-notification-attributes-async
  "Given a list of verified identities (email addresses and/or domains), returns a structure describing identity
   notification attributes.


   This operation is throttled at one request per second and can only get notification attributes for up to 100
   identities at a time.


   For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.

  get-identity-notification-attributes-request - Represents a request to return the notification attributes for a list of identities you verified with Amazon SES. For information about Amazon SES notifications, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityNotificationAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest get-identity-notification-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityNotificationAttributesAsync get-identity-notification-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest get-identity-notification-attributes-request]
    (-> this (.getIdentityNotificationAttributesAsync get-identity-notification-attributes-request))))

(defn list-custom-verification-email-templates-async
  "Lists the existing custom verification email templates for your account in the current AWS Region.


   For more information about custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  list-custom-verification-email-templates-request - Represents a request to list the existing custom verification email templates for your account. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCustomVerificationEmailTemplates operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest list-custom-verification-email-templates-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCustomVerificationEmailTemplatesAsync list-custom-verification-email-templates-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest list-custom-verification-email-templates-request]
    (-> this (.listCustomVerificationEmailTemplatesAsync list-custom-verification-email-templates-request))))

(defn list-receipt-filters-async
  "Lists the IP address filters associated with your AWS account in the current AWS Region.


   For information about managing IP address filters, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  list-receipt-filters-request - Represents a request to list the IP address filters that exist under your AWS account. You use IP address filters when you receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListReceiptFilters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest list-receipt-filters-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listReceiptFiltersAsync list-receipt-filters-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest list-receipt-filters-request]
    (-> this (.listReceiptFiltersAsync list-receipt-filters-request))))

(defn create-receipt-filter-async
  "Creates a new IP address filter.


   For information about setting up IP address filters, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  create-receipt-filter-request - Represents a request to create a new IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReceiptFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest create-receipt-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReceiptFilterAsync create-receipt-filter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest create-receipt-filter-request]
    (-> this (.createReceiptFilterAsync create-receipt-filter-request))))

(defn delete-configuration-set-event-destination-async
  "Deletes a configuration set event destination. Configuration set event destinations are associated with
   configuration sets, which enable you to publish email sending events. For information about using configuration
   sets, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  delete-configuration-set-event-destination-request - Represents a request to delete a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest delete-configuration-set-event-destination-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetEventDestinationAsync delete-configuration-set-event-destination-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest delete-configuration-set-event-destination-request]
    (-> this (.deleteConfigurationSetEventDestinationAsync delete-configuration-set-event-destination-request))))

(defn set-identity-notification-topic-async
  "Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use
   this operation, you specify a verified identity, such as an email address or domain. When you send an email that
   uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can
   send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that
   you specify.


   You can execute this operation no more than once per second.


   For more information about feedback notification, see the Amazon SES Developer Guide.

  set-identity-notification-topic-request - Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint, or delivery notifications for emails sent with that identity as the Source. For information about Amazon SES notifications, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityNotificationTopic operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest set-identity-notification-topic-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityNotificationTopicAsync set-identity-notification-topic-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest set-identity-notification-topic-request]
    (-> this (.setIdentityNotificationTopicAsync set-identity-notification-topic-request))))

(defn verify-email-address-async
  "Deprecated. Use the VerifyEmailIdentity operation to verify a new email address.

  verify-email-address-request - Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyEmailAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest verify-email-address-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyEmailAddressAsync verify-email-address-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest verify-email-address-request]
    (-> this (.verifyEmailAddressAsync verify-email-address-request))))

(defn send-raw-email-async
  "Composes an email message and immediately queues it for sending.


   This operation is more flexible than the SendEmail API operation. When you use the
   SendRawEmail operation, you can specify the headers of the message as well as its content. This
   flexibility is useful, for example, when you want to send a multipart MIME email (such a message that contains
   both a text and an HTML version). You can also use this operation to send messages that include attachments.


   The SendRawEmail operation has the following requirements:




   You can only send email from verified email
   addresses or domains. If you try to send email from an address that isn't verified, the operation results in
   an \"Email address not verified\" error.




   If your account is still in the Amazon SES
   sandbox, you can only send email to other verified addresses in your account, or to addresses that are
   associated with the Amazon
   SES mailbox simulator.




   The maximum message size, including attachments, is 10 MB.




   Each message has to include at least one recipient address. A recipient address includes any address on the To:,
   CC:, or BCC: lines.




   If you send a single message to more than one recipient address, and one of the recipient addresses isn't in a
   valid format (that is, it's not in the format UserName@[SubDomain.]Domain.TopLevelDomain), Amazon SES
   rejects the entire message, even if the other addresses are valid.




   Each message can include up to 50 recipient addresses across the To:, CC:, or BCC: lines. If you need to send a
   single message to more than 50 recipients, you have to split the list of recipient addresses into groups of less
   than 50 recipients, and send separate messages to each group.




   Amazon SES allows you to specify 8-bit Content-Transfer-Encoding for MIME message parts. However, if Amazon SES
   has to modify the contents of your message (for example, if you use open and click tracking), 8-bit content isn't
   preserved. For this reason, we highly recommend that you encode all content that isn't 7-bit ASCII. For more
   information, see MIME
   Encoding in the Amazon SES Developer Guide.




   Additionally, keep the following considerations in mind when using the SendRawEmail operation:




   Although you can customize the message headers when using the SendRawEmail operation, Amazon SES
   will automatically apply its own Message-ID and Date headers; if you passed these
   headers when creating the message, they will be overwritten by the values that Amazon SES provides.




   If you are using sending authorization to send on behalf of another user, SendRawEmail enables you
   to specify the cross-account identity for the email's Source, From, and Return-Path parameters in one of two
   ways: you can pass optional parameters SourceArn, FromArn, and/or
   ReturnPathArn to the API, or you can include the following X-headers in the header of your raw
   email:




   X-SES-SOURCE-ARN




   X-SES-FROM-ARN




   X-SES-RETURN-PATH-ARN





   Do not include these X-headers in the DKIM signature; Amazon SES will remove them before sending the email.



   For most common sending authorization scenarios, we recommend that you specify the SourceIdentityArn
   parameter and not the FromIdentityArn or ReturnPathIdentityArn parameters. If you only
   specify the SourceIdentityArn parameter, Amazon SES will set the From and Return Path addresses to
   the identity specified in SourceIdentityArn. For more information about sending authorization, see
   the Using Sending
   Authorization with Amazon SES in the Amazon SES Developer Guide.




   For every message that you send, the total number of recipients (including each recipient in the To:, CC: and
   BCC: fields) is counted against the maximum number of emails you can send in a 24-hour period (your sending
   quota). For more information about sending quotas in Amazon SES, see Managing Your Amazon SES
   Sending Limits in the Amazon SES Developer Guide.

  send-raw-email-request - Represents a request to send a single raw email using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendRawEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendRawEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendRawEmailResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendRawEmailRequest send-raw-email-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendRawEmailAsync send-raw-email-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendRawEmailRequest send-raw-email-request]
    (-> this (.sendRawEmailAsync send-raw-email-request))))

(defn create-custom-verification-email-template-async
  "Creates a new custom verification email template.


   For more information about custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  create-custom-verification-email-template-request - Represents a request to create a custom verification email template. - `com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCustomVerificationEmailTemplate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest create-custom-verification-email-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCustomVerificationEmailTemplateAsync create-custom-verification-email-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest create-custom-verification-email-template-request]
    (-> this (.createCustomVerificationEmailTemplateAsync create-custom-verification-email-template-request))))

(defn describe-configuration-set-async
  "Returns the details of the specified configuration set. For information about using configuration sets, see the
   Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  describe-configuration-set-request - Represents a request to return the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest describe-configuration-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationSetAsync describe-configuration-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest describe-configuration-set-request]
    (-> this (.describeConfigurationSetAsync describe-configuration-set-request))))

(defn delete-identity-async
  "Deletes the specified identity (an email address or a domain) from the list of verified identities.


   You can execute this operation no more than once per second.

  delete-identity-request - Represents a request to delete one of your Amazon SES identities (an email address or domain). - `com.amazonaws.services.simpleemail.model.DeleteIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteIdentityRequest delete-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentityAsync delete-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteIdentityRequest delete-identity-request]
    (-> this (.deleteIdentityAsync delete-identity-request))))

(defn reorder-receipt-rule-set-async
  "Reorders the receipt rules within a receipt rule set.



   All of the rules in the rule set must be represented in this request. That is, this API will return an error if
   the reorder request doesn't explicitly position all of the rules.



   For information about managing receipt rule sets, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  reorder-receipt-rule-set-request - Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReorderReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest reorder-receipt-rule-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reorderReceiptRuleSetAsync reorder-receipt-rule-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest reorder-receipt-rule-set-request]
    (-> this (.reorderReceiptRuleSetAsync reorder-receipt-rule-set-request))))

(defn verify-domain-identity-async
  "Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to
   verify it. For more information about verifying domains, see Verifying Email
   Addresses and Domains in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  verify-domain-identity-request - Represents a request to begin Amazon SES domain verification and to generate the TXT records that you must publish to the DNS server of your domain to complete the verification. For information about domain verification, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyDomainIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest verify-domain-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyDomainIdentityAsync verify-domain-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest verify-domain-identity-request]
    (-> this (.verifyDomainIdentityAsync verify-domain-identity-request))))

(defn get-template-async
  "Displays the template object (which includes the Subject line, HTML part and text part) for the template you
   specify.


   You can execute this operation no more than once per second.

  get-template-request - `com.amazonaws.services.simpleemail.model.GetTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetTemplateRequest get-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTemplateAsync get-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetTemplateRequest get-template-request]
    (-> this (.getTemplateAsync get-template-request))))

(defn update-configuration-set-sending-enabled-async
  "Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You
   can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a
   configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate)
   exceed certain thresholds.


   You can execute this operation no more than once per second.

  update-configuration-set-sending-enabled-request - Represents a request to enable or disable the email sending capabilities for a specific configuration set. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetSendingEnabled operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest update-configuration-set-sending-enabled-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetSendingEnabledAsync update-configuration-set-sending-enabled-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest update-configuration-set-sending-enabled-request]
    (-> this (.updateConfigurationSetSendingEnabledAsync update-configuration-set-sending-enabled-request))))

(defn delete-receipt-filter-async
  "Deletes the specified IP address filter.


   For information about managing IP address filters, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  delete-receipt-filter-request - Represents a request to delete an IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReceiptFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest delete-receipt-filter-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReceiptFilterAsync delete-receipt-filter-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest delete-receipt-filter-request]
    (-> this (.deleteReceiptFilterAsync delete-receipt-filter-request))))

(defn update-custom-verification-email-template-async
  "Updates an existing custom verification email template.


   For more information about custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  update-custom-verification-email-template-request - Represents a request to update an existing custom verification email template. - `com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCustomVerificationEmailTemplate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest update-custom-verification-email-template-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCustomVerificationEmailTemplateAsync update-custom-verification-email-template-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest update-custom-verification-email-template-request]
    (-> this (.updateCustomVerificationEmailTemplateAsync update-custom-verification-email-template-request))))

(defn get-identity-verification-attributes-async
  "Given a list of identities (email addresses and/or domains), returns the verification status and (for domain
   identities) the verification token for each identity.


   The verification status of an email address is \"Pending\" until the email address owner clicks the link within the
   verification email that Amazon SES sent to that address. If the email address owner clicks the link within 24
   hours, the verification status of the email address changes to \"Success\". If the link is not clicked within 24
   hours, the verification status changes to \"Failed.\" In that case, if you still want to verify the email address,
   you must restart the verification process from the beginning.


   For domain identities, the domain's verification status is \"Pending\" as Amazon SES searches for the required TXT
   record in the DNS settings of the domain. When Amazon SES detects the record, the domain's verification status
   changes to \"Success\". If Amazon SES is unable to detect the record within 72 hours, the domain's verification
   status changes to \"Failed.\" In that case, if you still want to verify the domain, you must restart the
   verification process from the beginning.


   This operation is throttled at one request per second and can only get verification attributes for up to 100
   identities at a time.

  get-identity-verification-attributes-request - Represents a request to return the Amazon SES verification status of a list of identities. For domain identities, this request also returns the verification token. For information about verifying identities with Amazon SES, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityVerificationAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest get-identity-verification-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityVerificationAttributesAsync get-identity-verification-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest get-identity-verification-attributes-request]
    (-> this (.getIdentityVerificationAttributesAsync get-identity-verification-attributes-request))))

(defn delete-receipt-rule-async
  "Deletes the specified receipt rule.


   For information about managing receipt rules, see the Amazon
   SES Developer Guide.


   You can execute this operation no more than once per second.

  delete-receipt-rule-request - Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReceiptRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest delete-receipt-rule-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReceiptRuleAsync delete-receipt-rule-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest delete-receipt-rule-request]
    (-> this (.deleteReceiptRuleAsync delete-receipt-rule-request))))

(defn verify-email-identity-async
  "Adds an email address to the list of identities for your Amazon SES account in the current AWS region and
   attempts to verify it. As a result of executing this operation, a verification email is sent to the specified
   address.


   You can execute this operation no more than once per second.

  verify-email-identity-request - Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyEmailIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest verify-email-identity-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyEmailIdentityAsync verify-email-identity-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest verify-email-identity-request]
    (-> this (.verifyEmailIdentityAsync verify-email-identity-request))))

(defn update-configuration-set-tracking-options-async
  "Modifies an association between a configuration set and a custom domain for open and click event tracking.


   By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
   SES. You can configure a subdomain of your own to handle these events. For information about using custom
   domains, see the Amazon SES
   Developer Guide.

  update-configuration-set-tracking-options-request - Represents a request to update the tracking options for a configuration set. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetTrackingOptions operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest update-configuration-set-tracking-options-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetTrackingOptionsAsync update-configuration-set-tracking-options-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest update-configuration-set-tracking-options-request]
    (-> this (.updateConfigurationSetTrackingOptionsAsync update-configuration-set-tracking-options-request))))

(defn delete-configuration-set-async
  "Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about
   using configuration sets, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  delete-configuration-set-request - Represents a request to delete a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest delete-configuration-set-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetAsync delete-configuration-set-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest delete-configuration-set-request]
    (-> this (.deleteConfigurationSetAsync delete-configuration-set-request))))

(defn send-bulk-templated-email-async
  "Composes an email message to multiple destinations. The message body is created using an email template.


   In order to send email using the SendBulkTemplatedEmail operation, your call to the API must meet
   the following requirements:




   The call must refer to an existing email template. You can create email templates using the CreateTemplate
   operation.




   The message must be sent from a verified email address or domain.




   If your account is still in the Amazon SES sandbox, you may only send to verified addresses or domains, or to
   email addresses associated with the Amazon SES Mailbox Simulator. For more information, see Verifying Email
   Addresses and Domains in the Amazon SES Developer Guide.




   The maximum message size is 10 MB.




   Each Destination parameter must include at least one recipient email address. The recipient address
   can be a To: address, a CC: address, or a BCC: address. If a recipient email address is invalid (that is, it is
   not in the format UserName@[SubDomain.]Domain.TopLevelDomain), the entire message will be rejected, even
   if the message contains other recipients that are valid.




   The message may not include more than 50 recipients, across the To:, CC: and BCC: fields. If you need to send an
   email message to a larger audience, you can divide your recipient list into groups of 50 or fewer, and then call
   the SendBulkTemplatedEmail operation several times to send the message to each group.




   The number of destinations you can contact in a single call to the API may be limited by your account's maximum
   sending rate.

  send-bulk-templated-email-request - Represents a request to send a templated email to multiple destinations using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendBulkTemplatedEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest send-bulk-templated-email-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendBulkTemplatedEmailAsync send-bulk-templated-email-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsync this ^com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest send-bulk-templated-email-request]
    (-> this (.sendBulkTemplatedEmailAsync send-bulk-templated-email-request))))

