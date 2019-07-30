(ns com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClient
  "Client for accessing Amazon SES. All service calls made using this client are blocking, and will not return until the
  service call completes.

  Amazon Simple Email Service

  This document contains reference information for the Amazon Simple Email
  Service (Amazon SES) API, version 2010-12-01. This document is best used in conjunction with the Amazon SES Developer Guide.



  For a list of Amazon SES endpoints to use in service requests, see Regions and Amazon SES in the Amazon SES Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpleemail AmazonSimpleEmailServiceClient]))

(defn ->amazon-simple-email-service-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsClientBuilder.withMetricsCollector(RequestMetricCollector)

  aws-credentials-provider - The AWS credentials provider which will provide credentials to authenticate requests with AWS services. - `com.amazonaws.auth.AWSCredentialsProvider`
  client-configuration - The client configuration options controlling how this client connects to Amazon SES (ex: proxy settings, retry counts, etc.). - `com.amazonaws.ClientConfiguration`
  request-metric-collector - optional request metric collector - `com.amazonaws.metrics.RequestMetricCollector`"
  (^AmazonSimpleEmailServiceClient [^com.amazonaws.auth.AWSCredentialsProvider aws-credentials-provider ^com.amazonaws.ClientConfiguration client-configuration ^com.amazonaws.metrics.RequestMetricCollector request-metric-collector]
    (new AmazonSimpleEmailServiceClient aws-credentials-provider client-configuration request-metric-collector))
  (^AmazonSimpleEmailServiceClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonSimpleEmailServiceClient aws-credentials client-configuration))
  (^AmazonSimpleEmailServiceClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonSimpleEmailServiceClient client-configuration))
  (^AmazonSimpleEmailServiceClient []
    (new AmazonSimpleEmailServiceClient )))

(defn *builder
  "returns: `com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder`"
  (^com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceClientBuilder []
    (AmazonSimpleEmailServiceClient/builder )))

(defn send-raw-email
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

  request - `com.amazonaws.services.simpleemail.model.SendRawEmailRequest`

  returns: Result of the SendRawEmail operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendRawEmailResult`

  throws: com.amazonaws.services.simpleemail.model.MessageRejectedException - Indicates that the action failed, and the message could not be sent. Check the error stack for more information about what caused the error."
  (^com.amazonaws.services.simpleemail.model.SendRawEmailResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SendRawEmailRequest request]
    (-> this (.sendRawEmail request))))

(defn update-configuration-set-sending-enabled
  "Enables or disables email sending for messages sent using a specific configuration set in a given AWS Region. You
   can use this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending for a
   configuration set when the reputation metrics for that configuration set (such as your bounce on complaint rate)
   exceed certain thresholds.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest`

  returns: Result of the UpdateConfigurationSetSendingEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest request]
    (-> this (.updateConfigurationSetSendingEnabled request))))

(defn get-identity-verification-attributes
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

  request - `com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest`

  returns: Result of the GetIdentityVerificationAttributes operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult`"
  (^com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest request]
    (-> this (.getIdentityVerificationAttributes request))))

(defn list-configuration-sets
  "Provides a list of the configuration sets associated with your Amazon SES account in the current AWS Region. For
   information about using configuration sets, see Monitoring Your Amazon
   SES Sending Activity in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second. This operation will return up to 1,000 configuration
   sets each time it is run. If your Amazon SES account has more than 1,000 configuration sets, this operation will
   also return a NextToken element. You can then execute the ListConfigurationSets operation again,
   passing the NextToken parameter and the value of the NextToken element to retrieve additional
   results.

  request - `com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest`

  returns: Result of the ListConfigurationSets operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult`"
  (^com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest request]
    (-> this (.listConfigurationSets request))))

(defn delete-receipt-filter
  "Deletes the specified IP address filter.


   For information about managing IP address filters, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest`

  returns: Result of the DeleteReceiptFilter operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest request]
    (-> this (.deleteReceiptFilter request))))

(defn verify-domain-identity
  "Adds a domain to the list of identities for your Amazon SES account in the current AWS Region and attempts to
   verify it. For more information about verifying domains, see Verifying Email
   Addresses and Domains in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest`

  returns: Result of the VerifyDomainIdentity operation returned by the service. - `com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult`"
  (^com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest request]
    (-> this (.verifyDomainIdentity request))))

(defn describe-receipt-rule-set
  "Returns the details of the specified receipt rule set.


   For information about managing receipt rule sets, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest`

  returns: Result of the DescribeReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult`

  throws: com.amazonaws.services.simpleemail.model.RuleSetDoesNotExistException - Indicates that the provided receipt rule set does not exist."
  (^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest request]
    (-> this (.describeReceiptRuleSet request))))

(defn create-configuration-set-event-destination
  "Creates a configuration set event destination.



   When you create or update an event destination, you must provide one, and only one, destination. The destination
   can be CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).



   An event destination is the AWS service to which Amazon SES publishes the email sending events associated with a
   configuration set. For information about using configuration sets, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest`

  returns: Result of the CreateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest request]
    (-> this (.createConfigurationSetEventDestination request))))

(defn put-configuration-set-delivery-options
  "Adds or updates the delivery options for a configuration set.

  request - `com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsRequest`

  returns: Result of the PutConfigurationSetDeliveryOptions operation returned by the service. - `com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsRequest request]
    (-> this (.putConfigurationSetDeliveryOptions request))))

(defn test-render-template
  "Creates a preview of the MIME content of an email when provided with a template and a set of replacement data.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest`

  returns: Result of the TestRenderTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.TestRenderTemplateResult`

  throws: com.amazonaws.services.simpleemail.model.TemplateDoesNotExistException - Indicates that the Template object you specified does not exist in your Amazon SES account."
  (^com.amazonaws.services.simpleemail.model.TestRenderTemplateResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest request]
    (-> this (.testRenderTemplate request))))

(defn waiters
  "returns: `com.amazonaws.services.simpleemail.waiters.AmazonSimpleEmailServiceWaiters`"
  (^com.amazonaws.services.simpleemail.waiters.AmazonSimpleEmailServiceWaiters [^AmazonSimpleEmailServiceClient this]
    (-> this (.waiters))))

(defn verify-email-identity
  "Adds an email address to the list of identities for your Amazon SES account in the current AWS region and
   attempts to verify it. As a result of executing this operation, a verification email is sent to the specified
   address.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest`

  returns: Result of the VerifyEmailIdentity operation returned by the service. - `com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult`"
  (^com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest request]
    (-> this (.verifyEmailIdentity request))))

(defn delete-identity
  "Deletes the specified identity (an email address or a domain) from the list of verified identities.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DeleteIdentityRequest`

  returns: Result of the DeleteIdentity operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteIdentityResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteIdentityResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteIdentityRequest request]
    (-> this (.deleteIdentity request))))

(defn create-receipt-rule-set
  "Creates an empty receipt rule set.


   For information about setting up receipt rule sets, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest`

  returns: Result of the CreateReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult`

  throws: com.amazonaws.services.simpleemail.model.AlreadyExistsException - Indicates that a resource could not be created because of a naming conflict."
  (^com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest request]
    (-> this (.createReceiptRuleSet request))))

(defn send-custom-verification-email
  "Adds an email address to the list of identities for your Amazon SES account in the current AWS Region and
   attempts to verify it. As a result of executing this operation, a customized verification email is sent to the
   specified address.


   To use this operation, you must first create a custom verification email template. For more information about
   creating and using custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest`

  returns: Result of the SendCustomVerificationEmail operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult`

  throws: com.amazonaws.services.simpleemail.model.MessageRejectedException - Indicates that the action failed, and the message could not be sent. Check the error stack for more information about what caused the error."
  (^com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest request]
    (-> this (.sendCustomVerificationEmail request))))

(defn send-bounce
  "Generates and sends a bounce message to the sender of an email you received through Amazon SES. You can only use
   this API on an email up to 24 hours after you receive it.



   You cannot use this API to send generic bounces for mail that was not received by Amazon SES.



   For information about receiving email through Amazon SES, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.SendBounceRequest`

  returns: Result of the SendBounce operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendBounceResult`

  throws: com.amazonaws.services.simpleemail.model.MessageRejectedException - Indicates that the action failed, and the message could not be sent. Check the error stack for more information about what caused the error."
  (^com.amazonaws.services.simpleemail.model.SendBounceResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SendBounceRequest request]
    (-> this (.sendBounce request))))

(defn set-identity-notification-topic
  "Sets an Amazon Simple Notification Service (Amazon SNS) topic to use when delivering notifications. When you use
   this operation, you specify a verified identity, such as an email address or domain. When you send an email that
   uses the chosen identity in the Source field, Amazon SES sends notifications to the topic you specified. You can
   send bounce, complaint, or delivery notifications (or any combination of the three) to the Amazon SNS topic that
   you specify.


   You can execute this operation no more than once per second.


   For more information about feedback notification, see the Amazon SES Developer Guide.

  request - `com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest`

  returns: Result of the SetIdentityNotificationTopic operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult`"
  (^com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest request]
    (-> this (.setIdentityNotificationTopic request))))

(defn delete-receipt-rule-set
  "Deletes the specified receipt rule set and all of the receipt rules it contains.



   The currently active rule set cannot be deleted.



   For information about managing receipt rule sets, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest`

  returns: Result of the DeleteReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult`

  throws: com.amazonaws.services.simpleemail.model.CannotDeleteException - Indicates that the delete operation could not be completed."
  (^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest request]
    (-> this (.deleteReceiptRuleSet request))))

(defn get-send-quota
  "Provides the sending limits for the Amazon SES account.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.GetSendQuotaRequest`

  returns: Result of the GetSendQuota operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetSendQuotaResult`"
  (^com.amazonaws.services.simpleemail.model.GetSendQuotaResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.GetSendQuotaRequest request]
    (-> this (.getSendQuota request)))
  (^com.amazonaws.services.simpleemail.model.GetSendQuotaResult [^AmazonSimpleEmailServiceClient this]
    (-> this (.getSendQuota))))

(defn update-template
  "Updates an email template. Email templates enable you to send personalized email to one or more destinations in a
   single API operation. For more information, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.UpdateTemplateRequest`

  returns: Result of the UpdateTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateTemplateResult`

  throws: com.amazonaws.services.simpleemail.model.TemplateDoesNotExistException - Indicates that the Template object you specified does not exist in your Amazon SES account."
  (^com.amazonaws.services.simpleemail.model.UpdateTemplateResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.UpdateTemplateRequest request]
    (-> this (.updateTemplate request))))

(defn send-templated-email
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

  request - `com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest`

  returns: Result of the SendTemplatedEmail operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult`

  throws: com.amazonaws.services.simpleemail.model.MessageRejectedException - Indicates that the action failed, and the message could not be sent. Check the error stack for more information about what caused the error."
  (^com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest request]
    (-> this (.sendTemplatedEmail request))))

(defn delete-configuration-set-event-destination
  "Deletes a configuration set event destination. Configuration set event destinations are associated with
   configuration sets, which enable you to publish email sending events. For information about using configuration
   sets, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest`

  returns: Result of the DeleteConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest request]
    (-> this (.deleteConfigurationSetEventDestination request))))

(defn create-configuration-set-tracking-options
  "Creates an association between a configuration set and a custom domain for open and click event tracking.


   By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
   SES. You can configure a subdomain of your own to handle these events. For information about using custom
   domains, see the Amazon SES
   Developer Guide.

  request - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest`

  returns: Result of the CreateConfigurationSetTrackingOptions operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest request]
    (-> this (.createConfigurationSetTrackingOptions request))))

(defn get-identity-notification-attributes
  "Given a list of verified identities (email addresses and/or domains), returns a structure describing identity
   notification attributes.


   This operation is throttled at one request per second and can only get notification attributes for up to 100
   identities at a time.


   For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.

  request - `com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest`

  returns: Result of the GetIdentityNotificationAttributes operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult`"
  (^com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest request]
    (-> this (.getIdentityNotificationAttributes request))))

(defn set-identity-dkim-enabled
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

  request - `com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest`

  returns: Result of the SetIdentityDkimEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest request]
    (-> this (.setIdentityDkimEnabled request))))

(defn clone-receipt-rule-set
  "Creates a receipt rule set by cloning an existing one. All receipt rules and configurations are copied to the new
   receipt rule set and are completely independent of the source rule set.


   For information about setting up rule sets, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest`

  returns: Result of the CloneReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult`

  throws: com.amazonaws.services.simpleemail.model.RuleSetDoesNotExistException - Indicates that the provided receipt rule set does not exist."
  (^com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest request]
    (-> this (.cloneReceiptRuleSet request))))

(defn describe-configuration-set
  "Returns the details of the specified configuration set. For information about using configuration sets, see the
   Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest`

  returns: Result of the DescribeConfigurationSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest request]
    (-> this (.describeConfigurationSet request))))

(defn delete-configuration-set-tracking-options
  "Deletes an association between a configuration set and a custom domain for open and click event tracking.


   By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
   SES. You can configure a subdomain of your own to handle these events. For information about using custom
   domains, see the Amazon SES
   Developer Guide.



   Deleting this kind of association will result in emails sent using the specified configuration set to capture
   open and click events using the standard, Amazon SES-operated domains.

  request - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest`

  returns: Result of the DeleteConfigurationSetTrackingOptions operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest request]
    (-> this (.deleteConfigurationSetTrackingOptions request))))

(defn delete-configuration-set
  "Deletes a configuration set. Configuration sets enable you to publish email sending events. For information about
   using configuration sets, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest`

  returns: Result of the DeleteConfigurationSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest request]
    (-> this (.deleteConfigurationSet request))))

(defn put-identity-policy
  "Adds or updates a sending authorization policy for the specified identity (an email address or a domain).



   This API is for the identity owner only. If you have not verified the identity, this API will return an error.



   Sending authorization is a feature that enables an identity owner to authorize other senders to use its
   identities. For information about using sending authorization, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest`

  returns: Result of the PutIdentityPolicy operation returned by the service. - `com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult`

  throws: com.amazonaws.services.simpleemail.model.InvalidPolicyException - Indicates that the provided policy is invalid. Check the error stack for more information about what caused the error."
  (^com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest request]
    (-> this (.putIdentityPolicy request))))

(defn update-configuration-set-tracking-options
  "Modifies an association between a configuration set and a custom domain for open and click event tracking.


   By default, images and links used for tracking open and click events are hosted on domains operated by Amazon
   SES. You can configure a subdomain of your own to handle these events. For information about using custom
   domains, see the Amazon SES
   Developer Guide.

  request - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest`

  returns: Result of the UpdateConfigurationSetTrackingOptions operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest request]
    (-> this (.updateConfigurationSetTrackingOptions request))))

(defn list-templates
  "Lists the email templates present in your Amazon SES account in the current AWS Region.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.ListTemplatesRequest`

  returns: Result of the ListTemplates operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListTemplatesResult`"
  (^com.amazonaws.services.simpleemail.model.ListTemplatesResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.ListTemplatesRequest request]
    (-> this (.listTemplates request))))

(defn shutdown
  "Description copied from class: AmazonWebServiceClient"
  ([^AmazonSimpleEmailServiceClient this]
    (-> this (.shutdown))))

(defn send-email
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

  request - `com.amazonaws.services.simpleemail.model.SendEmailRequest`

  returns: Result of the SendEmail operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendEmailResult`

  throws: com.amazonaws.services.simpleemail.model.MessageRejectedException - Indicates that the action failed, and the message could not be sent. Check the error stack for more information about what caused the error."
  (^com.amazonaws.services.simpleemail.model.SendEmailResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SendEmailRequest request]
    (-> this (.sendEmail request))))

(defn verify-email-address
  "Deprecated. Use the VerifyEmailIdentity operation to verify a new email address.

  request - `com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest`

  returns: Result of the VerifyEmailAddress operation returned by the service. - `com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult`"
  (^com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest request]
    (-> this (.verifyEmailAddress request))))

(defn get-template
  "Displays the template object (which includes the Subject line, HTML part and text part) for the template you
   specify.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.GetTemplateRequest`

  returns: Result of the GetTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetTemplateResult`

  throws: com.amazonaws.services.simpleemail.model.TemplateDoesNotExistException - Indicates that the Template object you specified does not exist in your Amazon SES account."
  (^com.amazonaws.services.simpleemail.model.GetTemplateResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.GetTemplateRequest request]
    (-> this (.getTemplate request))))

(defn set-identity-mail-from-domain
  "Enables or disables the custom MAIL FROM domain setup for a verified identity (an email address or a domain).



   To send emails using the specified MAIL FROM domain, you must add an MX record to your MAIL FROM domain's DNS
   settings. If you want your emails to pass Sender Policy Framework (SPF) checks, you must also add or update an
   SPF record. For more information, see the Amazon SES Developer Guide.



   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest`

  returns: Result of the SetIdentityMailFromDomain operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult`"
  (^com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest request]
    (-> this (.setIdentityMailFromDomain request))))

(defn get-account-sending-enabled
  "Returns the email sending status of the Amazon SES account for the current region.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest`

  returns: Result of the GetAccountSendingEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest request]
    (-> this (.getAccountSendingEnabled request))))

(defn update-receipt-rule
  "Updates a receipt rule.


   For information about managing receipt rules, see the Amazon
   SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest`

  returns: Result of the UpdateReceiptRule operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult`

  throws: com.amazonaws.services.simpleemail.model.InvalidSnsTopicException - Indicates that the provided Amazon SNS topic is invalid, or that Amazon SES could not publish to the topic, possibly due to permissions issues. For information about giving permissions, see the Amazon SES Developer Guide."
  (^com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest request]
    (-> this (.updateReceiptRule request))))

(defn update-account-sending-enabled
  "Enables or disables email sending across your entire Amazon SES account in the current AWS Region. You can use
   this operation in conjunction with Amazon CloudWatch alarms to temporarily pause email sending across your Amazon
   SES account in a given AWS Region when reputation metrics (such as your bounce or complaint rates) reach certain
   thresholds.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest`

  returns: Result of the UpdateAccountSendingEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest request]
    (-> this (.updateAccountSendingEnabled request))))

(defn update-custom-verification-email-template
  "Updates an existing custom verification email template.


   For more information about custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest`

  returns: Result of the UpdateCustomVerificationEmailTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult`

  throws: com.amazonaws.services.simpleemail.model.CustomVerificationEmailTemplateDoesNotExistException - Indicates that a custom verification email template with the name you specified does not exist."
  (^com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest request]
    (-> this (.updateCustomVerificationEmailTemplate request))))

(defn delete-identity-policy
  "Deletes the specified sending authorization policy for the given identity (an email address or a domain). This
   API returns successfully even if a policy with the specified name does not exist.



   This API is for the identity owner only. If you have not verified the identity, this API will return an error.



   Sending authorization is a feature that enables an identity owner to authorize other senders to use its
   identities. For information about using sending authorization, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest`

  returns: Result of the DeleteIdentityPolicy operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest request]
    (-> this (.deleteIdentityPolicy request))))

(defn update-configuration-set-event-destination
  "Updates the event destination of a configuration set. Event destinations are associated with configuration sets,
   which enable you to publish email sending events to Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple
   Notification Service (Amazon SNS). For information about using configuration sets, see Monitoring Your Amazon
   SES Sending Activity in the Amazon SES Developer Guide.



   When you create or update an event destination, you must provide one, and only one, destination. The destination
   can be Amazon CloudWatch, Amazon Kinesis Firehose, or Amazon Simple Notification Service (Amazon SNS).



   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest`

  returns: Result of the UpdateConfigurationSetEventDestination operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest request]
    (-> this (.updateConfigurationSetEventDestination request))))

(defn list-identity-policies
  "Returns a list of sending authorization policies that are attached to the given identity (an email address or a
   domain). This API returns only a list. If you want the actual policy content, you can use
   GetIdentityPolicies.



   This API is for the identity owner only. If you have not verified the identity, this API will return an error.



   Sending authorization is a feature that enables an identity owner to authorize other senders to use its
   identities. For information about using sending authorization, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest`

  returns: Result of the ListIdentityPolicies operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult`"
  (^com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest request]
    (-> this (.listIdentityPolicies request))))

(defn set-receipt-rule-position
  "Sets the position of the specified receipt rule in the receipt rule set.


   For information about managing receipt rules, see the Amazon
   SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest`

  returns: Result of the SetReceiptRulePosition operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult`

  throws: com.amazonaws.services.simpleemail.model.RuleSetDoesNotExistException - Indicates that the provided receipt rule set does not exist."
  (^com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest request]
    (-> this (.setReceiptRulePosition request))))

(defn reorder-receipt-rule-set
  "Reorders the receipt rules within a receipt rule set.



   All of the rules in the rule set must be represented in this request. That is, this API will return an error if
   the reorder request doesn't explicitly position all of the rules.



   For information about managing receipt rule sets, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest`

  returns: Result of the ReorderReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult`

  throws: com.amazonaws.services.simpleemail.model.RuleSetDoesNotExistException - Indicates that the provided receipt rule set does not exist."
  (^com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest request]
    (-> this (.reorderReceiptRuleSet request))))

(defn create-custom-verification-email-template
  "Creates a new custom verification email template.


   For more information about custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest`

  returns: Result of the CreateCustomVerificationEmailTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult`

  throws: com.amazonaws.services.simpleemail.model.CustomVerificationEmailTemplateAlreadyExistsException - Indicates that a custom verification email template with the name you specified already exists."
  (^com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest request]
    (-> this (.createCustomVerificationEmailTemplate request))))

(defn get-identity-policies
  "Returns the requested sending authorization policies for the given identity (an email address or a domain). The
   policies are returned as a map of policy names to policy contents. You can retrieve a maximum of 20 policies at a
   time.



   This API is for the identity owner only. If you have not verified the identity, this API will return an error.



   Sending authorization is a feature that enables an identity owner to authorize other senders to use its
   identities. For information about using sending authorization, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest`

  returns: Result of the GetIdentityPolicies operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult`"
  (^com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest request]
    (-> this (.getIdentityPolicies request))))

(defn list-identities
  "Returns a list containing all of the identities (email addresses and domains) for your AWS account in the current
   AWS Region, regardless of verification status.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.ListIdentitiesRequest`

  returns: Result of the ListIdentities operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListIdentitiesResult`"
  (^com.amazonaws.services.simpleemail.model.ListIdentitiesResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.ListIdentitiesRequest request]
    (-> this (.listIdentities request)))
  (^com.amazonaws.services.simpleemail.model.ListIdentitiesResult [^AmazonSimpleEmailServiceClient this]
    (-> this (.listIdentities))))

(defn send-bulk-templated-email
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

  request - `com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest`

  returns: Result of the SendBulkTemplatedEmail operation returned by the service. - `com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult`

  throws: com.amazonaws.services.simpleemail.model.MessageRejectedException - Indicates that the action failed, and the message could not be sent. Check the error stack for more information about what caused the error."
  (^com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest request]
    (-> this (.sendBulkTemplatedEmail request))))

(defn describe-receipt-rule
  "Returns the details of the specified receipt rule.


   For information about setting up receipt rules, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest`

  returns: Result of the DescribeReceiptRule operation returned by the service. - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult`

  throws: com.amazonaws.services.simpleemail.model.RuleDoesNotExistException - Indicates that the provided receipt rule does not exist."
  (^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest request]
    (-> this (.describeReceiptRule request))))

(defn delete-custom-verification-email-template
  "Deletes an existing custom verification email template.


   For more information about custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest`

  returns: Result of the DeleteCustomVerificationEmailTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest request]
    (-> this (.deleteCustomVerificationEmailTemplate request))))

(defn create-template
  "Creates an email template. Email templates enable you to send personalized email to one or more destinations in a
   single API operation. For more information, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.CreateTemplateRequest`

  returns: Result of the CreateTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateTemplateResult`

  throws: com.amazonaws.services.simpleemail.model.AlreadyExistsException - Indicates that a resource could not be created because of a naming conflict."
  (^com.amazonaws.services.simpleemail.model.CreateTemplateResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.CreateTemplateRequest request]
    (-> this (.createTemplate request))))

(defn list-receipt-filters
  "Lists the IP address filters associated with your AWS account in the current AWS Region.


   For information about managing IP address filters, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest`

  returns: Result of the ListReceiptFilters operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult`"
  (^com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest request]
    (-> this (.listReceiptFilters request))))

(defn verify-domain-dkim
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

  request - `com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest`

  returns: Result of the VerifyDomainDkim operation returned by the service. - `com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult`"
  (^com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest request]
    (-> this (.verifyDomainDkim request))))

(defn delete-template
  "Deletes an email template.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DeleteTemplateRequest`

  returns: Result of the DeleteTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteTemplateResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteTemplateResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteTemplateRequest request]
    (-> this (.deleteTemplate request))))

(defn set-identity-feedback-forwarding-enabled
  "Given an identity (an email address or a domain), enables or disables whether Amazon SES forwards bounce and
   complaint notifications as email. Feedback forwarding can only be disabled when Amazon Simple Notification
   Service (Amazon SNS) topics are specified for both bounces and complaints.



   Feedback forwarding does not apply to delivery notifications. Delivery notifications are only available through
   Amazon SNS.



   You can execute this operation no more than once per second.


   For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.

  request - `com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest`

  returns: Result of the SetIdentityFeedbackForwardingEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest request]
    (-> this (.setIdentityFeedbackForwardingEnabled request))))

(defn delete-verified-email-address
  "Deprecated. Use the DeleteIdentity operation to delete email addresses and domains.

  request - `com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest`

  returns: Result of the DeleteVerifiedEmailAddress operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult`"
  (^com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest request]
    (-> this (.deleteVerifiedEmailAddress request))))

(defn describe-active-receipt-rule-set
  "Returns the metadata and receipt rules for the receipt rule set that is currently active.


   For information about setting up receipt rule sets, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest`

  returns: Result of the DescribeActiveReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult`"
  (^com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest request]
    (-> this (.describeActiveReceiptRuleSet request))))

(defn get-send-statistics
  "Provides sending statistics for the current AWS Region. The result is a list of data points, representing the
   last two weeks of sending activity. Each data point in the list contains statistics for a 15-minute period of
   time.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest`

  returns: Result of the GetSendStatistics operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetSendStatisticsResult`"
  (^com.amazonaws.services.simpleemail.model.GetSendStatisticsResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest request]
    (-> this (.getSendStatistics request)))
  (^com.amazonaws.services.simpleemail.model.GetSendStatisticsResult [^AmazonSimpleEmailServiceClient this]
    (-> this (.getSendStatistics))))

(defn set-active-receipt-rule-set
  "Sets the specified receipt rule set as the active receipt rule set.



   To disable your email-receiving through Amazon SES completely, you can call this API with RuleSetName set to
   null.



   For information about managing receipt rule sets, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest`

  returns: Result of the SetActiveReceiptRuleSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult`

  throws: com.amazonaws.services.simpleemail.model.RuleSetDoesNotExistException - Indicates that the provided receipt rule set does not exist."
  (^com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest request]
    (-> this (.setActiveReceiptRuleSet request))))

(defn create-receipt-rule
  "Creates a receipt rule.


   For information about setting up receipt rules, see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest`

  returns: Result of the CreateReceiptRule operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult`

  throws: com.amazonaws.services.simpleemail.model.InvalidSnsTopicException - Indicates that the provided Amazon SNS topic is invalid, or that Amazon SES could not publish to the topic, possibly due to permissions issues. For information about giving permissions, see the Amazon SES Developer Guide."
  (^com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest request]
    (-> this (.createReceiptRule request))))

(defn get-custom-verification-email-template
  "Returns the custom email verification template for the template name you specify.


   For more information about custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest`

  returns: Result of the GetCustomVerificationEmailTemplate operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult`

  throws: com.amazonaws.services.simpleemail.model.CustomVerificationEmailTemplateDoesNotExistException - Indicates that a custom verification email template with the name you specified does not exist."
  (^com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest request]
    (-> this (.getCustomVerificationEmailTemplate request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful, request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing the request.

  request - The originally executed request - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonSimpleEmailServiceClient this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn get-identity-mail-from-domain-attributes
  "Returns the custom MAIL FROM attributes for a list of identities (email addresses : domains).


   This operation is throttled at one request per second and can only get custom MAIL FROM attributes for up to 100
   identities at a time.

  request - `com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest`

  returns: Result of the GetIdentityMailFromDomainAttributes operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult`"
  (^com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest request]
    (-> this (.getIdentityMailFromDomainAttributes request))))

(defn get-identity-dkim-attributes
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

  request - `com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest`

  returns: Result of the GetIdentityDkimAttributes operation returned by the service. - `com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult`"
  (^com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest request]
    (-> this (.getIdentityDkimAttributes request))))

(defn list-verified-email-addresses
  "Deprecated. Use the ListIdentities operation to list the email addresses and domains associated with
   your account.

  request - `com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest`

  returns: Result of the ListVerifiedEmailAddresses operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult`"
  (^com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest request]
    (-> this (.listVerifiedEmailAddresses request)))
  (^com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult [^AmazonSimpleEmailServiceClient this]
    (-> this (.listVerifiedEmailAddresses))))

(defn create-receipt-filter
  "Creates a new IP address filter.


   For information about setting up IP address filters, see the Amazon SES Developer
   Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest`

  returns: Result of the CreateReceiptFilter operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult`

  throws: com.amazonaws.services.simpleemail.model.LimitExceededException - Indicates that a resource could not be created because of service limits. For a list of Amazon SES limits, see the Amazon SES Developer Guide."
  (^com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest request]
    (-> this (.createReceiptFilter request))))

(defn list-receipt-rule-sets
  "Lists the receipt rule sets that exist under your AWS account in the current AWS Region. If there are additional
   receipt rule sets to be retrieved, you will receive a NextToken that you can provide to the next
   call to ListReceiptRuleSets to retrieve the additional entries.


   For information about managing receipt rule sets, see the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest`

  returns: Result of the ListReceiptRuleSets operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult`"
  (^com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest request]
    (-> this (.listReceiptRuleSets request))))

(defn delete-receipt-rule
  "Deletes the specified receipt rule.


   For information about managing receipt rules, see the Amazon
   SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest`

  returns: Result of the DeleteReceiptRule operation returned by the service. - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult`

  throws: com.amazonaws.services.simpleemail.model.RuleSetDoesNotExistException - Indicates that the provided receipt rule set does not exist."
  (^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest request]
    (-> this (.deleteReceiptRule request))))

(defn update-configuration-set-reputation-metrics-enabled
  "Enables or disables the publishing of reputation metrics for emails sent using a specific configuration set in a
   given AWS Region. Reputation metrics include bounce and complaint rates. These metrics are published to Amazon
   CloudWatch. By using CloudWatch, you can create alarms when bounce or complaint rates exceed certain thresholds.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest`

  returns: Result of the UpdateConfigurationSetReputationMetricsEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetDoesNotExistException - Indicates that the configuration set does not exist."
  (^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest request]
    (-> this (.updateConfigurationSetReputationMetricsEnabled request))))

(defn create-configuration-set
  "Creates a configuration set.


   Configuration sets enable you to publish email sending events. For information about using configuration sets,
   see the Amazon SES
   Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest`

  returns: Result of the CreateConfigurationSet operation returned by the service. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult`

  throws: com.amazonaws.services.simpleemail.model.ConfigurationSetAlreadyExistsException - Indicates that the configuration set could not be created because of a naming conflict."
  (^com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest request]
    (-> this (.createConfigurationSet request))))

(defn set-identity-headers-in-notifications-enabled
  "Given an identity (an email address or a domain), sets whether Amazon SES includes the original email headers in
   the Amazon Simple Notification Service (Amazon SNS) notifications of a specified type.


   You can execute this operation no more than once per second.


   For more information about using notifications with Amazon SES, see the Amazon SES Developer Guide.

  request - `com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest`

  returns: Result of the SetIdentityHeadersInNotificationsEnabled operation returned by the service. - `com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult`"
  (^com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest request]
    (-> this (.setIdentityHeadersInNotificationsEnabled request))))

(defn list-custom-verification-email-templates
  "Lists the existing custom verification email templates for your account in the current AWS Region.


   For more information about custom verification email templates, see Using Custom
   Verification Email Templates in the Amazon SES Developer Guide.


   You can execute this operation no more than once per second.

  request - `com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest`

  returns: Result of the ListCustomVerificationEmailTemplates operation returned by the service. - `com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult`"
  (^com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult [^AmazonSimpleEmailServiceClient this ^com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest request]
    (-> this (.listCustomVerificationEmailTemplates request))))

