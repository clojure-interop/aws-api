(ns com.amazonaws.services.simpleemail.AbstractAmazonSimpleEmailService
  "Abstract implementation of AmazonSimpleEmailService. Convenient method forms pass through to the
  corresponding overload that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpleemail AbstractAmazonSimpleEmailService]))

(defn send-raw-email
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to send a single raw email using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendRawEmailRequest`

  returns: Result of the SendRawEmail operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendRawEmailResult`"
  (^com.amazonaws.services.simpleemail.model.SendRawEmailResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SendRawEmailRequest request]
    (-> this (.sendRawEmail request))))

(defn update-configuration-set-sending-enabled
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to enable or disable the email sending capabilities for a specific configuration set. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest`

  returns: Result of the UpdateConfigurationSetSendingEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest request]
    (-> this (.updateConfigurationSetSendingEnabled request))))

(defn get-identity-verification-attributes
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to return the Amazon SES verification status of a list of identities. For domain identities, this request also returns the verification token. For information about verifying identities with Amazon SES, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest`

  returns: Result of the GetIdentityVerificationAttributes operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult`"
  (^com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest request]
    (-> this (.getIdentityVerificationAttributes request))))

(defn set-region
  "Description copied from interface: AmazonSimpleEmailService

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonSimpleEmailService this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn list-configuration-sets
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to list the configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest`

  returns: Result of the ListConfigurationSets operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult`"
  (^com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest request]
    (-> this (.listConfigurationSets request))))

(defn delete-receipt-filter
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete an IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest`

  returns: Result of the DeleteReceiptFilter operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest request]
    (-> this (.deleteReceiptFilter request))))

(defn verify-domain-identity
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to begin Amazon SES domain verification and to generate the TXT records that you must publish to the DNS server of your domain to complete the verification. For information about domain verification, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest`

  returns: Result of the VerifyDomainIdentity operation returned by the service. - `com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult`"
  (^com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest request]
    (-> this (.verifyDomainIdentity request))))

(defn describe-receipt-rule-set
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest`

  returns: Result of the DescribeReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult`"
  (^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest request]
    (-> this (.describeReceiptRuleSet request))))

(defn create-configuration-set-event-destination
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to create a configuration set event destination. A configuration set event destination, which can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest`

  returns: Result of the CreateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult`"
  (^com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest request]
    (-> this (.createConfigurationSetEventDestination request))))

(defn put-configuration-set-delivery-options
  "Description copied from interface: AmazonSimpleEmailService

  request - A request to modify the delivery options for a configuration set. - `com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsRequest`

  returns: Result of the PutConfigurationSetDeliveryOptions operation returned by the service. - `com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsResult`"
  (^com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsRequest request]
    (-> this (.putConfigurationSetDeliveryOptions request))))

(defn test-render-template
  "Description copied from interface: AmazonSimpleEmailService

  request - `com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest`

  returns: Result of the TestRenderTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.TestRenderTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.TestRenderTemplateResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest request]
    (-> this (.testRenderTemplate request))))

(defn waiters
  "returns: `com.amazonaws.services.simpleemail.waiters.AmazonSimpleEmailServiceWaiters`"
  (^com.amazonaws.services.simpleemail.waiters.AmazonSimpleEmailServiceWaiters [^AbstractAmazonSimpleEmailService this]
    (-> this (.waiters))))

(defn verify-email-identity
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest`

  returns: Result of the VerifyEmailIdentity operation returned by the service. - `com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult`"
  (^com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest request]
    (-> this (.verifyEmailIdentity request))))

(defn delete-identity
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete one of your Amazon SES identities (an email address or domain). - `com.amazonaws.services.simpleemail.model.DeleteIdentityRequest`

  returns: Result of the DeleteIdentity operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteIdentityResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteIdentityResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteIdentityRequest request]
    (-> this (.deleteIdentity request))))

(defn create-receipt-rule-set
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest`

  returns: Result of the CreateReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult`"
  (^com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest request]
    (-> this (.createReceiptRuleSet request))))

(defn send-custom-verification-email
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to send a custom verification email to a specified recipient. - `com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest`

  returns: Result of the SendCustomVerificationEmail operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult`"
  (^com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest request]
    (-> this (.sendCustomVerificationEmail request))))

(defn send-bounce
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to send a bounce message to the sender of an email you received through Amazon SES. - `com.amazonaws.services.simpleemail.model.SendBounceRequest`

  returns: Result of the SendBounce operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendBounceResult`"
  (^com.amazonaws.services.simpleemail.model.SendBounceResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SendBounceRequest request]
    (-> this (.sendBounce request))))

(defn set-identity-notification-topic
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint, or delivery notifications for emails sent with that identity as the Source. For information about Amazon SES notifications, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest`

  returns: Result of the SetIdentityNotificationTopic operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult`"
  (^com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest request]
    (-> this (.setIdentityNotificationTopic request))))

(defn delete-receipt-rule-set
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest`

  returns: Result of the DeleteReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest request]
    (-> this (.deleteReceiptRuleSet request))))

(defn get-send-quota
  "Description copied from interface: AmazonSimpleEmailService

  request - `com.amazonaws.services.simpleemail.model.GetSendQuotaRequest`

  returns: Result of the GetSendQuota operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetSendQuotaResult`"
  (^com.amazonaws.services.simpleemail.model.GetSendQuotaResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.GetSendQuotaRequest request]
    (-> this (.getSendQuota request)))
  (^com.amazonaws.services.simpleemail.model.GetSendQuotaResult [^AbstractAmazonSimpleEmailService this]
    (-> this (.getSendQuota))))

(defn update-template
  "Description copied from interface: AmazonSimpleEmailService

  request - `com.amazonaws.services.simpleemail.model.UpdateTemplateRequest`

  returns: Result of the UpdateTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.UpdateTemplateResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.UpdateTemplateRequest request]
    (-> this (.updateTemplate request))))

(defn send-templated-email
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to send a templated email using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest`

  returns: Result of the SendTemplatedEmail operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult`"
  (^com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest request]
    (-> this (.sendTemplatedEmail request))))

(defn delete-configuration-set-event-destination
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest`

  returns: Result of the DeleteConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest request]
    (-> this (.deleteConfigurationSetEventDestination request))))

(defn create-configuration-set-tracking-options
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to create an open and click tracking option object in a configuration set. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest`

  returns: Result of the CreateConfigurationSetTrackingOptions operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult`"
  (^com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest request]
    (-> this (.createConfigurationSetTrackingOptions request))))

(defn get-identity-notification-attributes
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to return the notification attributes for a list of identities you verified with Amazon SES. For information about Amazon SES notifications, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest`

  returns: Result of the GetIdentityNotificationAttributes operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult`"
  (^com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest request]
    (-> this (.getIdentityNotificationAttributes request))))

(defn set-identity-dkim-enabled
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more information about setting up Easy DKIM, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest`

  returns: Result of the SetIdentityDkimEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest request]
    (-> this (.setIdentityDkimEnabled request))))

(defn clone-receipt-rule-set
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest`

  returns: Result of the CloneReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult`"
  (^com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest request]
    (-> this (.cloneReceiptRuleSet request))))

(defn describe-configuration-set
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to return the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest`

  returns: Result of the DescribeConfigurationSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult`"
  (^com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest request]
    (-> this (.describeConfigurationSet request))))

(defn delete-configuration-set-tracking-options
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete open and click tracking options in a configuration set. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest`

  returns: Result of the DeleteConfigurationSetTrackingOptions operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest request]
    (-> this (.deleteConfigurationSetTrackingOptions request))))

(defn delete-configuration-set
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest`

  returns: Result of the DeleteConfigurationSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest request]
    (-> this (.deleteConfigurationSet request))))

(defn put-identity-policy
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to add or update a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest`

  returns: Result of the PutIdentityPolicy operation returned by the service. - `com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult`"
  (^com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest request]
    (-> this (.putIdentityPolicy request))))

(defn update-configuration-set-tracking-options
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to update the tracking options for a configuration set. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest`

  returns: Result of the UpdateConfigurationSetTrackingOptions operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult`"
  (^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest request]
    (-> this (.updateConfigurationSetTrackingOptions request))))

(defn list-templates
  "Description copied from interface: AmazonSimpleEmailService

  request - `com.amazonaws.services.simpleemail.model.ListTemplatesRequest`

  returns: Result of the ListTemplates operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListTemplatesResult`"
  (^com.amazonaws.services.simpleemail.model.ListTemplatesResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.ListTemplatesRequest request]
    (-> this (.listTemplates request))))

(defn shutdown
  "Description copied from interface: AmazonSimpleEmailService"
  ([^AbstractAmazonSimpleEmailService this]
    (-> this (.shutdown))))

(defn send-email
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to send a single formatted email using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendEmailRequest`

  returns: Result of the SendEmail operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendEmailResult`"
  (^com.amazonaws.services.simpleemail.model.SendEmailResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SendEmailRequest request]
    (-> this (.sendEmail request))))

(defn verify-email-address
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest`

  returns: Result of the VerifyEmailAddress operation returned by the service. - `com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult`"
  (^com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest request]
    (-> this (.verifyEmailAddress request))))

(defn set-endpoint
  "Description copied from interface: AmazonSimpleEmailService

  endpoint - The endpoint (ex: \"email.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://email.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonSimpleEmailService this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-template
  "Description copied from interface: AmazonSimpleEmailService

  request - `com.amazonaws.services.simpleemail.model.GetTemplateRequest`

  returns: Result of the GetTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.GetTemplateResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.GetTemplateRequest request]
    (-> this (.getTemplate request))))

(defn set-identity-mail-from-domain
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified identity. For information about using a custom MAIL FROM domain, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest`

  returns: Result of the SetIdentityMailFromDomain operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult`"
  (^com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest request]
    (-> this (.setIdentityMailFromDomain request))))

(defn get-account-sending-enabled
  "Description copied from interface: AmazonSimpleEmailService

  request - `com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest`

  returns: Result of the GetAccountSendingEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest request]
    (-> this (.getAccountSendingEnabled request))))

(defn update-receipt-rule
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest`

  returns: Result of the UpdateReceiptRule operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult`"
  (^com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest request]
    (-> this (.updateReceiptRule request))))

(defn update-account-sending-enabled
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to enable or disable the email sending capabilities for your entire Amazon SES account. - `com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest`

  returns: Result of the UpdateAccountSendingEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest request]
    (-> this (.updateAccountSendingEnabled request))))

(defn update-custom-verification-email-template
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to update an existing custom verification email template. - `com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest`

  returns: Result of the UpdateCustomVerificationEmailTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest request]
    (-> this (.updateCustomVerificationEmailTemplate request))))

(defn delete-identity-policy
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest`

  returns: Result of the DeleteIdentityPolicy operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest request]
    (-> this (.deleteIdentityPolicy request))))

(defn update-configuration-set-event-destination
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to update the event destination of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest`

  returns: Result of the UpdateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult`"
  (^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest request]
    (-> this (.updateConfigurationSetEventDestination request))))

(defn list-identity-policies
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to return a list of sending authorization policies that are attached to an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest`

  returns: Result of the ListIdentityPolicies operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult`"
  (^com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest request]
    (-> this (.listIdentityPolicies request))))

(defn set-receipt-rule-position
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest`

  returns: Result of the SetReceiptRulePosition operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult`"
  (^com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest request]
    (-> this (.setReceiptRulePosition request))))

(defn reorder-receipt-rule-set
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest`

  returns: Result of the ReorderReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult`"
  (^com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest request]
    (-> this (.reorderReceiptRuleSet request))))

(defn create-custom-verification-email-template
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to create a custom verification email template. - `com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest`

  returns: Result of the CreateCustomVerificationEmailTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest request]
    (-> this (.createCustomVerificationEmailTemplate request))))

(defn get-identity-policies
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to return the requested sending authorization policies for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest`

  returns: Result of the GetIdentityPolicies operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult`"
  (^com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest request]
    (-> this (.getIdentityPolicies request))))

(defn list-identities
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to return a list of all identities (email addresses and domains) that you have attempted to verify under your AWS account, regardless of verification status. - `com.amazonaws.services.simpleemail.model.ListIdentitiesRequest`

  returns: Result of the ListIdentities operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListIdentitiesResult`"
  (^com.amazonaws.services.simpleemail.model.ListIdentitiesResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.ListIdentitiesRequest request]
    (-> this (.listIdentities request)))
  (^com.amazonaws.services.simpleemail.model.ListIdentitiesResult [^AbstractAmazonSimpleEmailService this]
    (-> this (.listIdentities))))

(defn send-bulk-templated-email
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to send a templated email to multiple destinations using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest`

  returns: Result of the SendBulkTemplatedEmail operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult`"
  (^com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest request]
    (-> this (.sendBulkTemplatedEmail request))))

(defn describe-receipt-rule
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to return the details of a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest`

  returns: Result of the DescribeReceiptRule operation returned by the service. - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult`"
  (^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest request]
    (-> this (.describeReceiptRule request))))

(defn delete-custom-verification-email-template
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete an existing custom verification email template. - `com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest`

  returns: Result of the DeleteCustomVerificationEmailTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest request]
    (-> this (.deleteCustomVerificationEmailTemplate request))))

(defn create-template
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to create an email template. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateTemplateRequest`

  returns: Result of the CreateTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.CreateTemplateResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.CreateTemplateRequest request]
    (-> this (.createTemplate request))))

(defn list-receipt-filters
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to list the IP address filters that exist under your AWS account. You use IP address filters when you receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest`

  returns: Result of the ListReceiptFilters operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult`"
  (^com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest request]
    (-> this (.listReceiptFilters request))))

(defn verify-domain-dkim
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to generate the CNAME records needed to set up Easy DKIM with Amazon SES. For more information about setting up Easy DKIM, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest`

  returns: Result of the VerifyDomainDkim operation returned by the service. - `com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult`"
  (^com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest request]
    (-> this (.verifyDomainDkim request))))

(defn delete-template
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete an email template. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteTemplateRequest`

  returns: Result of the DeleteTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteTemplateResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteTemplateRequest request]
    (-> this (.deleteTemplate request))))

(defn set-identity-feedback-forwarding-enabled
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint notifications through email. For information about email feedback forwarding, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest`

  returns: Result of the SetIdentityFeedbackForwardingEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest request]
    (-> this (.setIdentityFeedbackForwardingEnabled request))))

(defn delete-verified-email-address
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete an email address from the list of email addresses you have attempted to verify under your AWS account. - `com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest`

  returns: Result of the DeleteVerifiedEmailAddress operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest request]
    (-> this (.deleteVerifiedEmailAddress request))))

(defn describe-active-receipt-rule-set
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to return the metadata and receipt rules for the receipt rule set that is currently active. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest`

  returns: Result of the DescribeActiveReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult`"
  (^com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest request]
    (-> this (.describeActiveReceiptRuleSet request))))

(defn get-send-statistics
  "Description copied from interface: AmazonSimpleEmailService

  request - `com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest`

  returns: Result of the GetSendStatistics operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetSendStatisticsResult`"
  (^com.amazonaws.services.simpleemail.model.GetSendStatisticsResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest request]
    (-> this (.getSendStatistics request)))
  (^com.amazonaws.services.simpleemail.model.GetSendStatisticsResult [^AbstractAmazonSimpleEmailService this]
    (-> this (.getSendStatistics))))

(defn set-active-receipt-rule-set
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest`

  returns: Result of the SetActiveReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult`"
  (^com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest request]
    (-> this (.setActiveReceiptRuleSet request))))

(defn create-receipt-rule
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest`

  returns: Result of the CreateReceiptRule operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult`"
  (^com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest request]
    (-> this (.createReceiptRule request))))

(defn get-custom-verification-email-template
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to retrieve an existing custom verification email template. - `com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest`

  returns: Result of the GetCustomVerificationEmailTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest request]
    (-> this (.getCustomVerificationEmailTemplate request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonSimpleEmailService

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonSimpleEmailService this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-identity-mail-from-domain-attributes
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to return the Amazon SES custom MAIL FROM attributes for a list of identities. For information about using a custom MAIL FROM domain, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest`

  returns: Result of the GetIdentityMailFromDomainAttributes operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult`"
  (^com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest request]
    (-> this (.getIdentityMailFromDomainAttributes request))))

(defn get-identity-dkim-attributes
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request for the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this request also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published. For more information about Easy DKIM, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest`

  returns: Result of the GetIdentityDkimAttributes operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult`"
  (^com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest request]
    (-> this (.getIdentityDkimAttributes request))))

(defn list-verified-email-addresses
  "Description copied from interface: AmazonSimpleEmailService

  request - `com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest`

  returns: Result of the ListVerifiedEmailAddresses operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult`"
  (^com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest request]
    (-> this (.listVerifiedEmailAddresses request)))
  (^com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult [^AbstractAmazonSimpleEmailService this]
    (-> this (.listVerifiedEmailAddresses))))

(defn create-receipt-filter
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to create a new IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest`

  returns: Result of the CreateReceiptFilter operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult`"
  (^com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest request]
    (-> this (.createReceiptFilter request))))

(defn list-receipt-rule-sets
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest`

  returns: Result of the ListReceiptRuleSets operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult`"
  (^com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest request]
    (-> this (.listReceiptRuleSets request))))

(defn delete-receipt-rule
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest`

  returns: Result of the DeleteReceiptRule operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest request]
    (-> this (.deleteReceiptRule request))))

(defn update-configuration-set-reputation-metrics-enabled
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to modify the reputation metric publishing settings for a configuration set. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest`

  returns: Result of the UpdateConfigurationSetReputationMetricsEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest request]
    (-> this (.updateConfigurationSetReputationMetricsEnabled request))))

(defn create-configuration-set
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to create a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest`

  returns: Result of the CreateConfigurationSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult`"
  (^com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest request]
    (-> this (.createConfigurationSet request))))

(defn set-identity-headers-in-notifications-enabled
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS notifications of a specified type. For information about notifications, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest`

  returns: Result of the SetIdentityHeadersInNotificationsEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest request]
    (-> this (.setIdentityHeadersInNotificationsEnabled request))))

(defn list-custom-verification-email-templates
  "Description copied from interface: AmazonSimpleEmailService

  request - Represents a request to list the existing custom verification email templates for your account. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest`

  returns: Result of the ListCustomVerificationEmailTemplates operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult`"
  (^com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult [^AbstractAmazonSimpleEmailService this ^com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest request]
    (-> this (.listCustomVerificationEmailTemplates request))))

