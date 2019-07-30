(ns com.amazonaws.services.sns.AmazonSNSAsyncClient
  "Client for accessing Amazon SNS asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Amazon Simple Notification Service

  Amazon Simple Notification Service (Amazon SNS) is a web service that enables you to build distributed web-enabled
  applications. Applications can use Amazon SNS to easily push real-time notification messages to interested
  subscribers over multiple delivery protocols. For more information about this product see https://aws.amazon.com/sns. For detailed information about Amazon SNS features
  and their associated API calls, see the Amazon SNS Developer
  Guide.


  We also provide SDKs that enable you to access Amazon SNS from your preferred programming language. The SDKs contain
  functionality that automatically takes care of tasks such as: cryptographically signing your service requests,
  retrying requests, and handling error responses. For a list of available SDKs, go to Tools for Amazon Web Services."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sns AmazonSNSAsyncClient]))

(defn ->amazon-sns-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonSNSAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonSNSAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonSNSAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonSNSAsyncClient aws-credentials executor-service))
  (^AmazonSNSAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonSNSAsyncClient client-configuration))
  (^AmazonSNSAsyncClient []
    (new AmazonSNSAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.sns.AmazonSNSAsyncClientBuilder`"
  (^com.amazonaws.services.sns.AmazonSNSAsyncClientBuilder []
    (AmazonSNSAsyncClient/asyncBuilder )))

(defn untag-resource-async
  "Description copied from interface: AmazonSNSAsync

  request - `com.amazonaws.services.sns.model.UntagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the UntagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.UntagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.UntagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.UntagResourceRequest request]
    (-> this (.untagResourceAsync request))))

(defn get-endpoint-attributes-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for GetEndpointAttributes action. - `com.amazonaws.services.sns.model.GetEndpointAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetEndpointAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.GetEndpointAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.GetEndpointAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getEndpointAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.GetEndpointAttributesRequest request]
    (-> this (.getEndpointAttributesAsync request))))

(defn list-subscriptions-by-topic-async
  "Simplified method form for invoking the ListSubscriptionsByTopic operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  next-token - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListSubscriptionsByTopicResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String next-token ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscriptionsByTopicAsync topic-arn next-token async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscriptionsByTopicAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListSubscriptionsByTopicRequest request]
    (-> this (.listSubscriptionsByTopicAsync request))))

(defn list-endpoints-by-platform-application-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for ListEndpointsByPlatformApplication action. - `com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListEndpointsByPlatformApplication operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listEndpointsByPlatformApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListEndpointsByPlatformApplicationRequest request]
    (-> this (.listEndpointsByPlatformApplicationAsync request))))

(defn subscribe-async
  "Simplified method form for invoking the Subscribe operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  protocol - `java.lang.String`
  endpoint - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.SubscribeResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String protocol ^java.lang.String endpoint ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.subscribeAsync topic-arn protocol endpoint async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String protocol ^java.lang.String endpoint]
    (-> this (.subscribeAsync topic-arn protocol endpoint)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SubscribeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.subscribeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SubscribeRequest request]
    (-> this (.subscribeAsync request))))

(defn list-phone-numbers-opted-out-async
  "Description copied from interface: AmazonSNSAsync

  request - The input for the ListPhoneNumbersOptedOut action. - `com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPhoneNumbersOptedOut operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPhoneNumbersOptedOutAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListPhoneNumbersOptedOutRequest request]
    (-> this (.listPhoneNumbersOptedOutAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonSNSAsyncClient this]
    (-> this (.getExecutorService))))

(defn opt-in-phone-number-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for the OptInPhoneNumber action. - `com.amazonaws.services.sns.model.OptInPhoneNumberRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the OptInPhoneNumber operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.OptInPhoneNumberResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.OptInPhoneNumberRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.optInPhoneNumberAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.OptInPhoneNumberRequest request]
    (-> this (.optInPhoneNumberAsync request))))

(defn delete-topic-async
  "Description copied from interface: AmazonSNSAsync

  request - `com.amazonaws.services.sns.model.DeleteTopicRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteTopic operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.DeleteTopicResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.DeleteTopicRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteTopicAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.DeleteTopicRequest request]
    (-> this (.deleteTopicAsync request))))

(defn delete-endpoint-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for DeleteEndpoint action. - `com.amazonaws.services.sns.model.DeleteEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.DeleteEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.DeleteEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.DeleteEndpointRequest request]
    (-> this (.deleteEndpointAsync request))))

(defn list-platform-applications-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for ListPlatformApplications action. - `com.amazonaws.services.sns.model.ListPlatformApplicationsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListPlatformApplications operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListPlatformApplicationsResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListPlatformApplicationsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listPlatformApplicationsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListPlatformApplicationsRequest request]
    (-> this (.listPlatformApplicationsAsync request)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this]
    (-> this (.listPlatformApplicationsAsync))))

(defn remove-permission-async
  "Simplified method form for invoking the RemovePermission operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  label - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.RemovePermissionResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String label ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync topic-arn label async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.RemovePermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.RemovePermissionRequest request]
    (-> this (.removePermissionAsync request))))

(defn publish-async
  "Simplified method form for invoking the Publish operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  message - `java.lang.String`
  subject - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.PublishResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String message ^java.lang.String subject ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishAsync topic-arn message subject async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String message ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishAsync topic-arn message async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.PublishRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.publishAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.PublishRequest request]
    (-> this (.publishAsync request))))

(defn list-subscriptions-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for ListSubscriptions action. - `com.amazonaws.services.sns.model.ListSubscriptionsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSubscriptions operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListSubscriptionsResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListSubscriptionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSubscriptionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListSubscriptionsRequest request]
    (-> this (.listSubscriptionsAsync request)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this]
    (-> this (.listSubscriptionsAsync))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonSNSAsyncClient this]
    (-> this (.shutdown))))

(defn create-platform-application-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for CreatePlatformApplication action. - `com.amazonaws.services.sns.model.CreatePlatformApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlatformApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.CreatePlatformApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.CreatePlatformApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlatformApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.CreatePlatformApplicationRequest request]
    (-> this (.createPlatformApplicationAsync request))))

(defn get-topic-attributes-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for GetTopicAttributes action. - `com.amazonaws.services.sns.model.GetTopicAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetTopicAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.GetTopicAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.GetTopicAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getTopicAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.GetTopicAttributesRequest request]
    (-> this (.getTopicAttributesAsync request))))

(defn delete-platform-application-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for DeletePlatformApplication action. - `com.amazonaws.services.sns.model.DeletePlatformApplicationRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeletePlatformApplication operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.DeletePlatformApplicationResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.DeletePlatformApplicationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deletePlatformApplicationAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.DeletePlatformApplicationRequest request]
    (-> this (.deletePlatformApplicationAsync request))))

(defn add-permission-async
  "Simplified method form for invoking the AddPermission operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  label - `java.lang.String`
  a-ws-account-ids - `java.util.List`
  action-names - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.AddPermissionResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List action-names ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addPermissionAsync topic-arn label a-ws-account-ids action-names async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List action-names]
    (-> this (.addPermissionAsync topic-arn label a-ws-account-ids action-names)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.AddPermissionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addPermissionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.AddPermissionRequest request]
    (-> this (.addPermissionAsync request))))

(defn unsubscribe-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for Unsubscribe action. - `com.amazonaws.services.sns.model.UnsubscribeRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the Unsubscribe operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.UnsubscribeResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.UnsubscribeRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.unsubscribeAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.UnsubscribeRequest request]
    (-> this (.unsubscribeAsync request))))

(defn confirm-subscription-async
  "Simplified method form for invoking the ConfirmSubscription operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  token - `java.lang.String`
  authenticate-on-unsubscribe - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.ConfirmSubscriptionResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String token ^java.lang.String authenticate-on-unsubscribe ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmSubscriptionAsync topic-arn token authenticate-on-unsubscribe async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String token ^java.lang.String authenticate-on-unsubscribe]
    (-> this (.confirmSubscriptionAsync topic-arn token authenticate-on-unsubscribe)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ConfirmSubscriptionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.confirmSubscriptionAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ConfirmSubscriptionRequest request]
    (-> this (.confirmSubscriptionAsync request))))

(defn create-platform-endpoint-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for CreatePlatformEndpoint action. - `com.amazonaws.services.sns.model.CreatePlatformEndpointRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreatePlatformEndpoint operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.CreatePlatformEndpointResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.CreatePlatformEndpointRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createPlatformEndpointAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.CreatePlatformEndpointRequest request]
    (-> this (.createPlatformEndpointAsync request))))

(defn get-platform-application-attributes-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for GetPlatformApplicationAttributes action. - `com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPlatformApplicationAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.GetPlatformApplicationAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPlatformApplicationAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.GetPlatformApplicationAttributesRequest request]
    (-> this (.getPlatformApplicationAttributesAsync request))))

(defn check-if-phone-number-is-opted-out-async
  "Description copied from interface: AmazonSNSAsync

  request - The input for the CheckIfPhoneNumberIsOptedOut action. - `com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CheckIfPhoneNumberIsOptedOut operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.checkIfPhoneNumberIsOptedOutAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.CheckIfPhoneNumberIsOptedOutRequest request]
    (-> this (.checkIfPhoneNumberIsOptedOutAsync request))))

(defn list-tags-for-resource-async
  "Description copied from interface: AmazonSNSAsync

  request - `com.amazonaws.services.sns.model.ListTagsForResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTagsForResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListTagsForResourceResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListTagsForResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTagsForResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListTagsForResourceRequest request]
    (-> this (.listTagsForResourceAsync request))))

(defn list-topics-async
  "Description copied from interface: AmazonSNSAsync

  request - `com.amazonaws.services.sns.model.ListTopicsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListTopics operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.ListTopicsResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListTopicsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listTopicsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.ListTopicsRequest request]
    (-> this (.listTopicsAsync request)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this]
    (-> this (.listTopicsAsync))))

(defn get-subscription-attributes-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for GetSubscriptionAttributes. - `com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSubscriptionAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.GetSubscriptionAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSubscriptionAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.GetSubscriptionAttributesRequest request]
    (-> this (.getSubscriptionAttributesAsync request))))

(defn set-topic-attributes-async
  "Simplified method form for invoking the SetTopicAttributes operation with an AsyncHandler.

  topic-arn - `java.lang.String`
  attribute-name - `java.lang.String`
  attribute-value - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.SetTopicAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String attribute-name ^java.lang.String attribute-value ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTopicAttributesAsync topic-arn attribute-name attribute-value async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String topic-arn ^java.lang.String attribute-name ^java.lang.String attribute-value]
    (-> this (.setTopicAttributesAsync topic-arn attribute-name attribute-value)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SetTopicAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setTopicAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SetTopicAttributesRequest request]
    (-> this (.setTopicAttributesAsync request))))

(defn create-topic-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for CreateTopic action. - `com.amazonaws.services.sns.model.CreateTopicRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateTopic operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.CreateTopicResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.CreateTopicRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createTopicAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.CreateTopicRequest request]
    (-> this (.createTopicAsync request))))

(defn set-platform-application-attributes-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for SetPlatformApplicationAttributes action. - `com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetPlatformApplicationAttributes operation returned by the
           service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.SetPlatformApplicationAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setPlatformApplicationAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SetPlatformApplicationAttributesRequest request]
    (-> this (.setPlatformApplicationAttributesAsync request))))

(defn set-subscription-attributes-async
  "Simplified method form for invoking the SetSubscriptionAttributes operation with an AsyncHandler.

  subscription-arn - `java.lang.String`
  attribute-name - `java.lang.String`
  attribute-value - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sns.model.SetSubscriptionAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String subscription-arn ^java.lang.String attribute-name ^java.lang.String attribute-value ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSubscriptionAttributesAsync subscription-arn attribute-name attribute-value async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^java.lang.String subscription-arn ^java.lang.String attribute-name ^java.lang.String attribute-value]
    (-> this (.setSubscriptionAttributesAsync subscription-arn attribute-name attribute-value)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSubscriptionAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SetSubscriptionAttributesRequest request]
    (-> this (.setSubscriptionAttributesAsync request))))

(defn set-sms-attributes-async
  "Description copied from interface: AmazonSNSAsync

  request - The input for the SetSMSAttributes action. - `com.amazonaws.services.sns.model.SetSMSAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetSMSAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.SetSMSAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SetSMSAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setSMSAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SetSMSAttributesRequest request]
    (-> this (.setSMSAttributesAsync request))))

(defn set-endpoint-attributes-async
  "Description copied from interface: AmazonSNSAsync

  request - Input for SetEndpointAttributes action. - `com.amazonaws.services.sns.model.SetEndpointAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SetEndpointAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.SetEndpointAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SetEndpointAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setEndpointAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.SetEndpointAttributesRequest request]
    (-> this (.setEndpointAttributesAsync request))))

(defn tag-resource-async
  "Description copied from interface: AmazonSNSAsync

  request - `com.amazonaws.services.sns.model.TagResourceRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the TagResource operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.TagResourceResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.TagResourceRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagResourceAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.TagResourceRequest request]
    (-> this (.tagResourceAsync request))))

(defn get-sms-attributes-async
  "Description copied from interface: AmazonSNSAsync

  request - The input for the GetSMSAttributes request. - `com.amazonaws.services.sns.model.GetSMSAttributesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSMSAttributes operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sns.model.GetSMSAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.GetSMSAttributesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSMSAttributesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonSNSAsyncClient this ^com.amazonaws.services.sns.model.GetSMSAttributesRequest request]
    (-> this (.getSMSAttributesAsync request))))

