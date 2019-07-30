(ns com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceAsyncClient
  "Client for accessing Amazon SES asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Simple Email Service

  This document contains reference information for the Amazon Simple Email
  Service (Amazon SES) API, version 2010-12-01. This document is best used in conjunction with the Amazon SES Developer Guide.



  For a list of Amazon SES endpoints to use in service requests, see Regions and Amazon SES in the Amazon SES Developer Guide."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.simpleemail AmazonSimpleEmailServiceAsyncClient]))

(defn ->amazon-simple-email-service-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonSimpleEmailServiceAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonSimpleEmailServiceAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonSimpleEmailServiceAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonSimpleEmailServiceAsyncClient aws-credentials executor-service))
  (^AmazonSimpleEmailServiceAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonSimpleEmailServiceAsyncClient client-configuration))
  (^AmazonSimpleEmailServiceAsyncClient []
    (new AmazonSimpleEmailServiceAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceAsyncClientBuilder`"
  (^com.amazonaws.services.simpleemail.AmazonSimpleEmailServiceAsyncClientBuilder []
    (AmazonSimpleEmailServiceAsyncClient/asyncBuilder )))

(defn delete-configuration-set-tracking-options-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete open and click tracking options in a configuration set. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSetTrackingOptions operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetTrackingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetTrackingOptionsRequest request]
    (-> this (.deleteConfigurationSetTrackingOptionsAsync request))))

(defn send-email-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to send a single formatted email using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendEmailResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendEmailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendEmailAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendEmailRequest request]
    (-> this (.sendEmailAsync request))))

(defn list-templates-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - `com.amazonaws.services.simpleemail.model.ListTemplatesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTemplates operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListTemplatesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListTemplatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTemplatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListTemplatesRequest request]
    (-> this (.listTemplatesAsync request))))

(defn create-receipt-rule-set-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to create an empty receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReceiptRuleSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleSetRequest request]
    (-> this (.createReceiptRuleSetAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonSimpleEmailServiceAsyncClient this]
    (-> this (.getExecutorService))))

(defn create-template-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to create an email template. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateTemplateRequest request]
    (-> this (.createTemplateAsync request))))

(defn get-identity-policies-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to return the requested sending authorization policies for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetIdentityPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetIdentityPoliciesRequest request]
    (-> this (.getIdentityPoliciesAsync request))))

(defn send-bounce-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to send a bounce message to the sender of an email you received through Amazon SES. - `com.amazonaws.services.simpleemail.model.SendBounceRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendBounce operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendBounceResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendBounceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendBounceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendBounceRequest request]
    (-> this (.sendBounceAsync request))))

(defn describe-active-receipt-rule-set-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to return the metadata and receipt rules for the receipt rule set that is currently active. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeActiveReceiptRuleSet operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeActiveReceiptRuleSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DescribeActiveReceiptRuleSetRequest request]
    (-> this (.describeActiveReceiptRuleSetAsync request))))

(defn get-identity-mail-from-domain-attributes-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to return the Amazon SES custom MAIL FROM attributes for a list of identities. For information about using a custom MAIL FROM domain, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityMailFromDomainAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityMailFromDomainAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetIdentityMailFromDomainAttributesRequest request]
    (-> this (.getIdentityMailFromDomainAttributesAsync request))))

(defn create-configuration-set-tracking-options-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to create an open and click tracking option object in a configuration set. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSetTrackingOptions operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetTrackingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetTrackingOptionsRequest request]
    (-> this (.createConfigurationSetTrackingOptionsAsync request))))

(defn update-account-sending-enabled-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to enable or disable the email sending capabilities for your entire Amazon SES account. - `com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateAccountSendingEnabled operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateAccountSendingEnabledAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateAccountSendingEnabledRequest request]
    (-> this (.updateAccountSendingEnabledAsync request))))

(defn create-receipt-rule-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to create a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReceiptRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateReceiptRuleResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReceiptRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateReceiptRuleRequest request]
    (-> this (.createReceiptRuleAsync request))))

(defn test-render-template-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - `com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TestRenderTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.TestRenderTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.testRenderTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.TestRenderTemplateRequest request]
    (-> this (.testRenderTemplateAsync request))))

(defn list-configuration-sets-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to list the configuration sets associated with your AWS account. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListConfigurationSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListConfigurationSetsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listConfigurationSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListConfigurationSetsRequest request]
    (-> this (.listConfigurationSetsAsync request))))

(defn update-configuration-set-event-destination-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to update the event destination of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetEventDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetEventDestinationRequest request]
    (-> this (.updateConfigurationSetEventDestinationAsync request))))

(defn get-identity-dkim-attributes-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request for the status of Amazon SES Easy DKIM signing for an identity. For domain identities, this request also returns the DKIM tokens that are required for Easy DKIM signing, and whether Amazon SES successfully verified that these tokens were published. For more information about Easy DKIM, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityDkimAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityDkimAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetIdentityDkimAttributesRequest request]
    (-> this (.getIdentityDkimAttributesAsync request))))

(defn put-identity-policy-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to add or update a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutIdentityPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.PutIdentityPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putIdentityPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.PutIdentityPolicyRequest request]
    (-> this (.putIdentityPolicyAsync request))))

(defn send-custom-verification-email-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to send a custom verification email to a specified recipient. - `com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendCustomVerificationEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendCustomVerificationEmailAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendCustomVerificationEmailRequest request]
    (-> this (.sendCustomVerificationEmailAsync request))))

(defn delete-identity-policy-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete a sending authorization policy for an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentityPolicy operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentityPolicyAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteIdentityPolicyRequest request]
    (-> this (.deleteIdentityPolicyAsync request))))

(defn get-send-quota-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - `com.amazonaws.services.simpleemail.model.GetSendQuotaRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSendQuota operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetSendQuotaResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetSendQuotaRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSendQuotaAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetSendQuotaRequest request]
    (-> this (.getSendQuotaAsync request)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this]
    (-> this (.getSendQuotaAsync))))

(defn clone-receipt-rule-set-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to create a receipt rule set by cloning an existing one. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CloneReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.cloneReceiptRuleSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CloneReceiptRuleSetRequest request]
    (-> this (.cloneReceiptRuleSetAsync request))))

(defn get-send-statistics-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - `com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSendStatistics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetSendStatisticsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSendStatisticsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetSendStatisticsRequest request]
    (-> this (.getSendStatisticsAsync request)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this]
    (-> this (.getSendStatisticsAsync))))

(defn update-receipt-rule-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to update a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateReceiptRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateReceiptRuleResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateReceiptRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateReceiptRuleRequest request]
    (-> this (.updateReceiptRuleAsync request))))

(defn list-receipt-rule-sets-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to list the receipt rule sets that exist under your AWS account. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListReceiptRuleSets operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listReceiptRuleSetsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListReceiptRuleSetsRequest request]
    (-> this (.listReceiptRuleSetsAsync request))))

(defn verify-domain-dkim-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to generate the CNAME records needed to set up Easy DKIM with Amazon SES. For more information about setting up Easy DKIM, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyDomainDkim operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.VerifyDomainDkimResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyDomainDkimAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.VerifyDomainDkimRequest request]
    (-> this (.verifyDomainDkimAsync request))))

(defn list-identities-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to return a list of all identities (email addresses and domains) that you have attempted to verify under your AWS account, regardless of verification status. - `com.amazonaws.services.simpleemail.model.ListIdentitiesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListIdentitiesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListIdentitiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentitiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListIdentitiesRequest request]
    (-> this (.listIdentitiesAsync request)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this]
    (-> this (.listIdentitiesAsync))))

(defn describe-receipt-rule-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to return the details of a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReceiptRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DescribeReceiptRuleResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReceiptRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleRequest request]
    (-> this (.describeReceiptRuleAsync request))))

(defn create-configuration-set-event-destination-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to create a configuration set event destination. A configuration set event destination, which can be either Amazon CloudWatch or Amazon Kinesis Firehose, describes an AWS service in which Amazon SES publishes the email sending events associated with a configuration set. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetEventDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetEventDestinationRequest request]
    (-> this (.createConfigurationSetEventDestinationAsync request))))

(defn delete-template-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete an email template. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteTemplateRequest request]
    (-> this (.deleteTemplateAsync request))))

(defn list-verified-email-addresses-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - `com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListVerifiedEmailAddresses operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listVerifiedEmailAddressesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListVerifiedEmailAddressesRequest request]
    (-> this (.listVerifiedEmailAddressesAsync request)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this]
    (-> this (.listVerifiedEmailAddressesAsync))))

(defn get-custom-verification-email-template-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to retrieve an existing custom verification email template. - `com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCustomVerificationEmailTemplate operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCustomVerificationEmailTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetCustomVerificationEmailTemplateRequest request]
    (-> this (.getCustomVerificationEmailTemplateAsync request))))

(defn describe-receipt-rule-set-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to return the details of a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeReceiptRuleSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DescribeReceiptRuleSetRequest request]
    (-> this (.describeReceiptRuleSetAsync request))))

(defn update-configuration-set-reputation-metrics-enabled-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to modify the reputation metric publishing settings for a configuration set. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetReputationMetricsEnabled operation
           returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetReputationMetricsEnabledAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetReputationMetricsEnabledRequest request]
    (-> this (.updateConfigurationSetReputationMetricsEnabledAsync request))))

(defn set-identity-dkim-enabled-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to enable or disable Amazon SES Easy DKIM signing for an identity. For more information about setting up Easy DKIM, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityDkimEnabled operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityDkimEnabledAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetIdentityDkimEnabledRequest request]
    (-> this (.setIdentityDkimEnabledAsync request))))

(defn update-template-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - `com.amazonaws.services.simpleemail.model.UpdateTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateTemplateRequest request]
    (-> this (.updateTemplateAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonSimpleEmailServiceAsyncClient this]
    (-> this (.shutdown))))

(defn delete-verified-email-address-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete an email address from the list of email addresses you have attempted to verify under your AWS account. - `com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteVerifiedEmailAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteVerifiedEmailAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteVerifiedEmailAddressRequest request]
    (-> this (.deleteVerifiedEmailAddressAsync request))))

(defn delete-receipt-rule-set-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete a receipt rule set and all of the receipt rules it contains. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReceiptRuleSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleSetRequest request]
    (-> this (.deleteReceiptRuleSetAsync request))))

(defn set-identity-headers-in-notifications-enabled-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to set whether Amazon SES includes the original email headers in the Amazon SNS notifications of a specified type. For information about notifications, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityHeadersInNotificationsEnabled operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityHeadersInNotificationsEnabledAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetIdentityHeadersInNotificationsEnabledRequest request]
    (-> this (.setIdentityHeadersInNotificationsEnabledAsync request))))

(defn list-identity-policies-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to return a list of sending authorization policies that are attached to an identity. Sending authorization is an Amazon SES feature that enables you to authorize other senders to use your identities. For information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListIdentityPolicies operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListIdentityPoliciesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listIdentityPoliciesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListIdentityPoliciesRequest request]
    (-> this (.listIdentityPoliciesAsync request))))

(defn send-templated-email-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to send a templated email using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendTemplatedEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendTemplatedEmailResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendTemplatedEmailAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendTemplatedEmailRequest request]
    (-> this (.sendTemplatedEmailAsync request))))

(defn create-configuration-set-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to create a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createConfigurationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateConfigurationSetRequest request]
    (-> this (.createConfigurationSetAsync request))))

(defn set-identity-mail-from-domain-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to enable or disable the Amazon SES custom MAIL FROM domain setup for a verified identity. For information about using a custom MAIL FROM domain, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityMailFromDomain operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityMailFromDomainAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetIdentityMailFromDomainRequest request]
    (-> this (.setIdentityMailFromDomainAsync request))))

(defn delete-custom-verification-email-template-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete an existing custom verification email template. - `com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCustomVerificationEmailTemplate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCustomVerificationEmailTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteCustomVerificationEmailTemplateRequest request]
    (-> this (.deleteCustomVerificationEmailTemplateAsync request))))

(defn get-account-sending-enabled-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - `com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetAccountSendingEnabled operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getAccountSendingEnabledAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetAccountSendingEnabledRequest request]
    (-> this (.getAccountSendingEnabledAsync request))))

(defn set-active-receipt-rule-set-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to set a receipt rule set as the active receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetActiveReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setActiveReceiptRuleSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetActiveReceiptRuleSetRequest request]
    (-> this (.setActiveReceiptRuleSetAsync request))))

(defn set-identity-feedback-forwarding-enabled-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to enable or disable whether Amazon SES forwards you bounce and complaint notifications through email. For information about email feedback forwarding, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityFeedbackForwardingEnabled operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityFeedbackForwardingEnabledAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetIdentityFeedbackForwardingEnabledRequest request]
    (-> this (.setIdentityFeedbackForwardingEnabledAsync request))))

(defn set-receipt-rule-position-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to set the position of a receipt rule in a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetReceiptRulePosition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetReceiptRulePositionResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setReceiptRulePositionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetReceiptRulePositionRequest request]
    (-> this (.setReceiptRulePositionAsync request))))

(defn put-configuration-set-delivery-options-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - A request to modify the delivery options for a configuration set. - `com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutConfigurationSetDeliveryOptions operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putConfigurationSetDeliveryOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.PutConfigurationSetDeliveryOptionsRequest request]
    (-> this (.putConfigurationSetDeliveryOptionsAsync request))))

(defn get-identity-notification-attributes-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to return the notification attributes for a list of identities you verified with Amazon SES. For information about Amazon SES notifications, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityNotificationAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityNotificationAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetIdentityNotificationAttributesRequest request]
    (-> this (.getIdentityNotificationAttributesAsync request))))

(defn list-custom-verification-email-templates-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to list the existing custom verification email templates for your account. For more information about custom verification email templates, see Using Custom Verification Email Templates in the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCustomVerificationEmailTemplates operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCustomVerificationEmailTemplatesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListCustomVerificationEmailTemplatesRequest request]
    (-> this (.listCustomVerificationEmailTemplatesAsync request))))

(defn list-receipt-filters-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to list the IP address filters that exist under your AWS account. You use IP address filters when you receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListReceiptFilters operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ListReceiptFiltersResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listReceiptFiltersAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ListReceiptFiltersRequest request]
    (-> this (.listReceiptFiltersAsync request))))

(defn create-receipt-filter-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to create a new IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateReceiptFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateReceiptFilterResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createReceiptFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateReceiptFilterRequest request]
    (-> this (.createReceiptFilterAsync request))))

(defn delete-configuration-set-event-destination-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete a configuration set event destination. Configuration set event destinations are associated with configuration sets, which enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSetEventDestination operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetEventDestinationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetEventDestinationRequest request]
    (-> this (.deleteConfigurationSetEventDestinationAsync request))))

(defn set-identity-notification-topic-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to specify the Amazon SNS topic to which Amazon SES will publish bounce, complaint, or delivery notifications for emails sent with that identity as the Source. For information about Amazon SES notifications, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetIdentityNotificationTopic operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setIdentityNotificationTopicAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SetIdentityNotificationTopicRequest request]
    (-> this (.setIdentityNotificationTopicAsync request))))

(defn verify-email-address-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyEmailAddress operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.VerifyEmailAddressResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyEmailAddressAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.VerifyEmailAddressRequest request]
    (-> this (.verifyEmailAddressAsync request))))

(defn send-raw-email-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to send a single raw email using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendRawEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendRawEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendRawEmailResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendRawEmailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendRawEmailAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendRawEmailRequest request]
    (-> this (.sendRawEmailAsync request))))

(defn create-custom-verification-email-template-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to create a custom verification email template. - `com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCustomVerificationEmailTemplate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCustomVerificationEmailTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.CreateCustomVerificationEmailTemplateRequest request]
    (-> this (.createCustomVerificationEmailTemplateAsync request))))

(defn describe-configuration-set-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to return the details of a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DescribeConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeConfigurationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DescribeConfigurationSetRequest request]
    (-> this (.describeConfigurationSetAsync request))))

(defn delete-identity-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete one of your Amazon SES identities (an email address or domain). - `com.amazonaws.services.simpleemail.model.DeleteIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteIdentityRequest request]
    (-> this (.deleteIdentityAsync request))))

(defn reorder-receipt-rule-set-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to reorder the receipt rules within a receipt rule set. You use receipt rule sets to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReorderReceiptRuleSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.reorderReceiptRuleSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.ReorderReceiptRuleSetRequest request]
    (-> this (.reorderReceiptRuleSetAsync request))))

(defn verify-domain-identity-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to begin Amazon SES domain verification and to generate the TXT records that you must publish to the DNS server of your domain to complete the verification. For information about domain verification, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyDomainIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.VerifyDomainIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyDomainIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.VerifyDomainIdentityRequest request]
    (-> this (.verifyDomainIdentityAsync request))))

(defn get-template-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - `com.amazonaws.services.simpleemail.model.GetTemplateRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTemplate operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetTemplateRequest request]
    (-> this (.getTemplateAsync request))))

(defn update-configuration-set-sending-enabled-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to enable or disable the email sending capabilities for a specific configuration set. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetSendingEnabled operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetSendingEnabledAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetSendingEnabledRequest request]
    (-> this (.updateConfigurationSetSendingEnabledAsync request))))

(defn delete-receipt-filter-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete an IP address filter. You use IP address filters when you receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReceiptFilter operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteReceiptFilterResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReceiptFilterAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteReceiptFilterRequest request]
    (-> this (.deleteReceiptFilterAsync request))))

(defn update-custom-verification-email-template-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to update an existing custom verification email template. - `com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateCustomVerificationEmailTemplate operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateCustomVerificationEmailTemplateAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateCustomVerificationEmailTemplateRequest request]
    (-> this (.updateCustomVerificationEmailTemplateAsync request))))

(defn get-identity-verification-attributes-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to return the Amazon SES verification status of a list of identities. For domain identities, this request also returns the verification token. For information about verifying identities with Amazon SES, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetIdentityVerificationAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getIdentityVerificationAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.GetIdentityVerificationAttributesRequest request]
    (-> this (.getIdentityVerificationAttributesAsync request))))

(defn delete-receipt-rule-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete a receipt rule. You use receipt rules to receive email with Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteReceiptRule operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteReceiptRuleResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteReceiptRuleAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteReceiptRuleRequest request]
    (-> this (.deleteReceiptRuleAsync request))))

(defn verify-email-identity-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to begin email address verification with Amazon SES. For information about email address verification, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the VerifyEmailIdentity operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.VerifyEmailIdentityResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.verifyEmailIdentityAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.VerifyEmailIdentityRequest request]
    (-> this (.verifyEmailIdentityAsync request))))

(defn update-configuration-set-tracking-options-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to update the tracking options for a configuration set. - `com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UpdateConfigurationSetTrackingOptions operation returned by
           the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.updateConfigurationSetTrackingOptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.UpdateConfigurationSetTrackingOptionsRequest request]
    (-> this (.updateConfigurationSetTrackingOptionsAsync request))))

(defn delete-configuration-set-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to delete a configuration set. Configuration sets enable you to publish email sending events. For information about using configuration sets, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteConfigurationSet operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.DeleteConfigurationSetResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteConfigurationSetAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.DeleteConfigurationSetRequest request]
    (-> this (.deleteConfigurationSetAsync request))))

(defn send-bulk-templated-email-async
  "Description copied from interface: AmazonSimpleEmailServiceAsync

  request - Represents a request to send a templated email to multiple destinations using Amazon SES. For more information, see the Amazon SES Developer Guide. - `com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SendBulkTemplatedEmail operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailResult>`"
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendBulkTemplatedEmailAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSimpleEmailServiceAsyncClient this ^com.amazonaws.services.simpleemail.model.SendBulkTemplatedEmailRequest request]
    (-> this (.sendBulkTemplatedEmailAsync request))))

