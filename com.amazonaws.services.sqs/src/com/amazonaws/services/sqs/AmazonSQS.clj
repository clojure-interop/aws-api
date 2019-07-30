(ns com.amazonaws.services.sqs.AmazonSQS
  "Interface for accessing Amazon SQS.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSQS instead.



  Welcome to the Amazon Simple Queue Service API Reference.


  Amazon Simple Queue Service (Amazon SQS) is a reliable, highly-scalable hosted queue for storing messages as they
  travel between applications or microservices. Amazon SQS moves data between distributed application components and
  helps you decouple these components.


  You can use AWS SDKs to access Amazon SQS using your favorite
  programming language. The SDKs perform tasks such as the following automatically:




  Cryptographically sign your service requests




  Retry requests




  Handle error responses




  Additional Information




  Amazon SQS Product Page




  Amazon Simple Queue Service Developer Guide





  Making API Requests





  Amazon SQS Message Attributes





  Amazon SQS Dead-Letter Queues






  Amazon SQS in the AWS CLI Command
  Reference




  Amazon Web Services General Reference




  Regions and Endpoints"
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.sqs AmazonSQS]))

(defn get-queue-url
  "Returns the URL of an existing Amazon SQS queue.


   To access a queue that belongs to another AWS account, use the QueueOwnerAWSAccountId parameter to
   specify the account ID of the queue's owner. The queue's owner must grant you permission to access the queue. For
   more information about shared queue access, see  AddPermission  or see Allow Developers to Write Messages to a Shared Queue in the Amazon Simple Queue Service Developer
   Guide.

  get-queue-url-request - `com.amazonaws.services.sqs.model.GetQueueUrlRequest`

  returns: Result of the GetQueueUrl operation returned by the service. - `com.amazonaws.services.sqs.model.GetQueueUrlResult`

  throws: com.amazonaws.services.sqs.model.QueueDoesNotExistException - The specified queue doesn't exist."
  (^com.amazonaws.services.sqs.model.GetQueueUrlResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.GetQueueUrlRequest get-queue-url-request]
    (-> this (.getQueueUrl get-queue-url-request))))

(defn set-queue-attributes
  "Simplified method form for invoking the SetQueueAttributes operation.

  queue-url - `java.lang.String`
  attributes - `java.util.Map`

  returns: `com.amazonaws.services.sqs.model.SetQueueAttributesResult`"
  (^com.amazonaws.services.sqs.model.SetQueueAttributesResult [^AmazonSQS this ^java.lang.String queue-url ^java.util.Map attributes]
    (-> this (.setQueueAttributes queue-url attributes)))
  (^com.amazonaws.services.sqs.model.SetQueueAttributesResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.SetQueueAttributesRequest set-queue-attributes-request]
    (-> this (.setQueueAttributes set-queue-attributes-request))))

(defn list-dead-letter-source-queues
  "Returns a list of your queues that have the RedrivePolicy queue attribute configured with a
   dead-letter queue.


   For more information about using dead-letter queues, see Using Amazon SQS Dead-Letter Queues in the Amazon Simple Queue Service Developer Guide.

  list-dead-letter-source-queues-request - `com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest`

  returns: Result of the ListDeadLetterSourceQueues operation returned by the service. - `com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult`

  throws: com.amazonaws.services.sqs.model.QueueDoesNotExistException - The specified queue doesn't exist."
  (^com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest list-dead-letter-source-queues-request]
    (-> this (.listDeadLetterSourceQueues list-dead-letter-source-queues-request))))

(defn set-region
  "Deprecated. use AwsClientBuilder#setRegion(String)

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AmazonSQS this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn send-message-batch
  "Simplified method form for invoking the SendMessageBatch operation.

  queue-url - `java.lang.String`
  entries - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.SendMessageBatchResult`"
  (^com.amazonaws.services.sqs.model.SendMessageBatchResult [^AmazonSQS this ^java.lang.String queue-url ^java.util.List entries]
    (-> this (.sendMessageBatch queue-url entries)))
  (^com.amazonaws.services.sqs.model.SendMessageBatchResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.SendMessageBatchRequest send-message-batch-request]
    (-> this (.sendMessageBatch send-message-batch-request))))

(defn list-queues
  "Returns a list of your queues. The maximum number of queues that can be returned is 1,000. If you specify a value
   for the optional QueueNamePrefix parameter, only queues with a name that begins with the specified
   value are returned.



   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer
   Guide.

  list-queues-request - `com.amazonaws.services.sqs.model.ListQueuesRequest`

  returns: Result of the ListQueues operation returned by the service. - `com.amazonaws.services.sqs.model.ListQueuesResult`"
  (^com.amazonaws.services.sqs.model.ListQueuesResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.ListQueuesRequest list-queues-request]
    (-> this (.listQueues list-queues-request)))
  (^com.amazonaws.services.sqs.model.ListQueuesResult [^AmazonSQS this]
    (-> this (.listQueues))))

(defn tag-queue
  "Simplified method form for invoking the TagQueue operation.

  queue-url - `java.lang.String`
  tags - `java.util.Map`

  returns: `com.amazonaws.services.sqs.model.TagQueueResult`"
  (^com.amazonaws.services.sqs.model.TagQueueResult [^AmazonSQS this ^java.lang.String queue-url ^java.util.Map tags]
    (-> this (.tagQueue queue-url tags)))
  (^com.amazonaws.services.sqs.model.TagQueueResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.TagQueueRequest tag-queue-request]
    (-> this (.tagQueue tag-queue-request))))

(defn delete-message
  "Simplified method form for invoking the DeleteMessage operation.

  queue-url - `java.lang.String`
  receipt-handle - `java.lang.String`

  returns: `com.amazonaws.services.sqs.model.DeleteMessageResult`"
  (^com.amazonaws.services.sqs.model.DeleteMessageResult [^AmazonSQS this ^java.lang.String queue-url ^java.lang.String receipt-handle]
    (-> this (.deleteMessage queue-url receipt-handle)))
  (^com.amazonaws.services.sqs.model.DeleteMessageResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.DeleteMessageRequest delete-message-request]
    (-> this (.deleteMessage delete-message-request))))

(defn list-queue-tags
  "List all cost allocation tags added to the specified Amazon SQS queue. For an overview, see Tagging
   Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide.



   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer
   Guide.

  list-queue-tags-request - `com.amazonaws.services.sqs.model.ListQueueTagsRequest`

  returns: Result of the ListQueueTags operation returned by the service. - `com.amazonaws.services.sqs.model.ListQueueTagsResult`"
  (^com.amazonaws.services.sqs.model.ListQueueTagsResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.ListQueueTagsRequest list-queue-tags-request]
    (-> this (.listQueueTags list-queue-tags-request))))

(defn create-queue
  "Creates a new standard or FIFO queue. You can pass one or more attributes in the request. Keep the following
   caveats in mind:




   If you don't specify the FifoQueue attribute, Amazon SQS creates a standard queue.



   You can't change the queue type after you create it and you can't convert an existing standard queue into a FIFO
   queue. You must either create a new FIFO queue for your application or delete your existing standard queue and
   recreate it as a FIFO queue. For more information, see Moving From a Standard Queue to a FIFO Queue in the Amazon Simple Queue Service Developer Guide.




   If you don't provide a value for an attribute, the queue is created with the default value for the attribute.




   If you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.




   To successfully create a new queue, you must provide a queue name that adheres to the limits
   related to queues and is unique within the scope of your queues.


   To get the queue URL, use the  GetQueueUrl  action.  GetQueueUrl
   requires only the QueueName parameter. be aware of existing queue names:




   If you provide the name of an existing queue along with the exact names and values of all the queue's attributes,
   CreateQueue returns the queue URL for the existing queue.




   If the queue name, attribute names, or attribute values don't match an existing queue, CreateQueue
   returns an error.




   Some actions take lists of parameters. These lists are specified using the param.n notation. Values
   of n are integers starting from 1. For example, a parameter list with two elements looks like this:


   &Attribute.1=first


   &Attribute.2=second



   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer
   Guide.

  create-queue-request - `com.amazonaws.services.sqs.model.CreateQueueRequest`

  returns: Result of the CreateQueue operation returned by the service. - `com.amazonaws.services.sqs.model.CreateQueueResult`

  throws: com.amazonaws.services.sqs.model.QueueDeletedRecentlyException - You must wait 60 seconds after deleting a queue before you can create another queue with the same name."
  (^com.amazonaws.services.sqs.model.CreateQueueResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.CreateQueueRequest create-queue-request]
    (-> this (.createQueue create-queue-request))))

(defn receive-message
  "Retrieves one or more messages (up to 10), from the specified queue. Using the WaitTimeSeconds
   parameter enables long-poll support. For more information, see Amazon
   SQS Long Polling in the Amazon Simple Queue Service Developer Guide.


   Short poll is the default behavior where a weighted random set of machines is sampled on a
   ReceiveMessage call. Thus, only the messages on the sampled machines are returned. If the number of
   messages in the queue is small (fewer than 1,000), you most likely get fewer messages than you requested per
   ReceiveMessage call. If the number of messages in the queue is extremely small, you might not
   receive any messages in a particular ReceiveMessage response. If this happens, repeat the request.


   For each message returned, the response includes the following:




   The message body.




   An MD5 digest of the message body. For information about MD5, see RFC1321.




   The MessageId you received when you sent the message to the queue.




   The receipt handle.




   The message attributes.




   An MD5 digest of the message attributes.




   The receipt handle is the identifier you must provide when deleting the message. For more information, see Queue and Message Identifiers in the Amazon Simple Queue Service Developer Guide.


   You can provide the VisibilityTimeout parameter in your request. The parameter is applied to the
   messages that Amazon SQS returns in the response. If you don't include the parameter, the overall visibility
   timeout for the queue is used for the returned messages. For more information, see Visibility Timeout in the Amazon Simple Queue Service Developer Guide.


   A message that isn't deleted or a message whose visibility isn't extended before the visibility timeout expires
   counts as a failed receive. Depending on the configuration of the queue, the message might be sent to the
   dead-letter queue.



   In the future, new attributes might be added. If you write code that calls this action, we recommend that you
   structure your code so that it can handle new attributes gracefully.

  receive-message-request - `com.amazonaws.services.sqs.model.ReceiveMessageRequest`

  returns: Result of the ReceiveMessage operation returned by the service. - `com.amazonaws.services.sqs.model.ReceiveMessageResult`

  throws: com.amazonaws.services.sqs.model.OverLimitException - The specified action violates a limit. For example, ReceiveMessage returns this error if the maximum number of inflight messages is reached and AddPermission returns this error if the maximum number of permissions for the queue is reached."
  (^com.amazonaws.services.sqs.model.ReceiveMessageResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.ReceiveMessageRequest receive-message-request]
    (-> this (.receiveMessage receive-message-request))))

(defn remove-permission
  "Simplified method form for invoking the RemovePermission operation.

  queue-url - `java.lang.String`
  label - `java.lang.String`

  returns: `com.amazonaws.services.sqs.model.RemovePermissionResult`"
  (^com.amazonaws.services.sqs.model.RemovePermissionResult [^AmazonSQS this ^java.lang.String queue-url ^java.lang.String label]
    (-> this (.removePermission queue-url label)))
  (^com.amazonaws.services.sqs.model.RemovePermissionResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.RemovePermissionRequest remove-permission-request]
    (-> this (.removePermission remove-permission-request))))

(defn delete-message-batch
  "Simplified method form for invoking the DeleteMessageBatch operation.

  queue-url - `java.lang.String`
  entries - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.DeleteMessageBatchResult`"
  (^com.amazonaws.services.sqs.model.DeleteMessageBatchResult [^AmazonSQS this ^java.lang.String queue-url ^java.util.List entries]
    (-> this (.deleteMessageBatch queue-url entries)))
  (^com.amazonaws.services.sqs.model.DeleteMessageBatchResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.DeleteMessageBatchRequest delete-message-batch-request]
    (-> this (.deleteMessageBatch delete-message-batch-request))))

(defn send-message
  "Simplified method form for invoking the SendMessage operation.

  queue-url - `java.lang.String`
  message-body - `java.lang.String`

  returns: `com.amazonaws.services.sqs.model.SendMessageResult`"
  (^com.amazonaws.services.sqs.model.SendMessageResult [^AmazonSQS this ^java.lang.String queue-url ^java.lang.String message-body]
    (-> this (.sendMessage queue-url message-body)))
  (^com.amazonaws.services.sqs.model.SendMessageResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.SendMessageRequest send-message-request]
    (-> this (.sendMessage send-message-request))))

(defn purge-queue
  "Deletes the messages in a queue specified by the QueueURL parameter.



   When you use the PurgeQueue action, you can't retrieve any messages deleted from a queue.


   The message deletion process takes up to 60 seconds. We recommend waiting for 60 seconds regardless of your
   queue's size.



   Messages sent to the queue before you call PurgeQueue might be received but are deleted
   within the next minute.


   Messages sent to the queue after you call PurgeQueue might be deleted while the queue is
   being purged.

  purge-queue-request - `com.amazonaws.services.sqs.model.PurgeQueueRequest`

  returns: Result of the PurgeQueue operation returned by the service. - `com.amazonaws.services.sqs.model.PurgeQueueResult`

  throws: com.amazonaws.services.sqs.model.QueueDoesNotExistException - The specified queue doesn't exist."
  (^com.amazonaws.services.sqs.model.PurgeQueueResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.PurgeQueueRequest purge-queue-request]
    (-> this (.purgeQueue purge-queue-request))))

(defn shutdown
  "Shuts down this client object, releasing any resources that might be held open. This is an optional method, and
   callers are not expected to call it, but can if they want to explicitly release any open resources. Once a client
   has been shutdown, it should not be used to make any more requests."
  ([^AmazonSQS this]
    (-> this (.shutdown))))

(defn delete-queue
  "Deletes the queue specified by the QueueUrl, regardless of the queue's contents. If the specified
   queue doesn't exist, Amazon SQS returns a successful response.



   Be careful with the DeleteQueue action: When you delete a queue, any messages in the queue are no
   longer available.



   When you delete a queue, the deletion process takes up to 60 seconds. Requests you send involving that queue
   during the 60 seconds might succeed. For example, a  SendMessage  request might succeed, but
   after 60 seconds the queue and the message you sent no longer exist.


   When you delete a queue, you must wait at least 60 seconds before creating a queue with the same name.



   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer
   Guide.

  delete-queue-request - `com.amazonaws.services.sqs.model.DeleteQueueRequest`

  returns: Result of the DeleteQueue operation returned by the service. - `com.amazonaws.services.sqs.model.DeleteQueueResult`"
  (^com.amazonaws.services.sqs.model.DeleteQueueResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.DeleteQueueRequest delete-queue-request]
    (-> this (.deleteQueue delete-queue-request))))

(defn untag-queue
  "Simplified method form for invoking the UntagQueue operation.

  queue-url - `java.lang.String`
  tag-keys - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.UntagQueueResult`"
  (^com.amazonaws.services.sqs.model.UntagQueueResult [^AmazonSQS this ^java.lang.String queue-url ^java.util.List tag-keys]
    (-> this (.untagQueue queue-url tag-keys)))
  (^com.amazonaws.services.sqs.model.UntagQueueResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.UntagQueueRequest untag-queue-request]
    (-> this (.untagQueue untag-queue-request))))

(defn set-endpoint
  "Deprecated. use AwsClientBuilder#setEndpointConfiguration(AwsClientBuilder.EndpointConfiguration) for
               example:
               builder.setEndpointConfiguration(new EndpointConfiguration(endpoint, signingRegion));

  endpoint - The endpoint (ex: \"sqs.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"https://sqs.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AmazonSQS this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn get-queue-attributes
  "Simplified method form for invoking the GetQueueAttributes operation.

  queue-url - `java.lang.String`
  attribute-names - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.GetQueueAttributesResult`"
  (^com.amazonaws.services.sqs.model.GetQueueAttributesResult [^AmazonSQS this ^java.lang.String queue-url ^java.util.List attribute-names]
    (-> this (.getQueueAttributes queue-url attribute-names)))
  (^com.amazonaws.services.sqs.model.GetQueueAttributesResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.GetQueueAttributesRequest get-queue-attributes-request]
    (-> this (.getQueueAttributes get-queue-attributes-request))))

(defn change-message-visibility-batch
  "Simplified method form for invoking the ChangeMessageVisibilityBatch operation.

  queue-url - `java.lang.String`
  entries - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult`"
  (^com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult [^AmazonSQS this ^java.lang.String queue-url ^java.util.List entries]
    (-> this (.changeMessageVisibilityBatch queue-url entries)))
  (^com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest change-message-visibility-batch-request]
    (-> this (.changeMessageVisibilityBatch change-message-visibility-batch-request))))

(defn get-cached-response-metadata
  "Returns additional metadata for a previously executed successful request, typically used for debugging issues
   where a service isn't acting as expected. This data isn't considered part of the result data returned by an
   operation, so it's available through this separate, diagnostic interface.

   Response metadata is only cached for a limited period of time, so if you need to access this extra diagnostic
   information for an executed request, you should use this method to retrieve it as soon as possible after
   executing a request.

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AmazonSQS this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn change-message-visibility
  "Simplified method form for invoking the ChangeMessageVisibility operation.

  queue-url - `java.lang.String`
  receipt-handle - `java.lang.String`
  visibility-timeout - `java.lang.Integer`

  returns: `com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult`"
  (^com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult [^AmazonSQS this ^java.lang.String queue-url ^java.lang.String receipt-handle ^java.lang.Integer visibility-timeout]
    (-> this (.changeMessageVisibility queue-url receipt-handle visibility-timeout)))
  (^com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest change-message-visibility-request]
    (-> this (.changeMessageVisibility change-message-visibility-request))))

(defn add-permission
  "Simplified method form for invoking the AddPermission operation.

  queue-url - `java.lang.String`
  label - `java.lang.String`
  a-ws-account-ids - `java.util.List`
  actions - `java.util.List`

  returns: `com.amazonaws.services.sqs.model.AddPermissionResult`"
  (^com.amazonaws.services.sqs.model.AddPermissionResult [^AmazonSQS this ^java.lang.String queue-url ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List actions]
    (-> this (.addPermission queue-url label a-ws-account-ids actions)))
  (^com.amazonaws.services.sqs.model.AddPermissionResult [^AmazonSQS this ^com.amazonaws.services.sqs.model.AddPermissionRequest add-permission-request]
    (-> this (.addPermission add-permission-request))))

