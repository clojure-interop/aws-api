(ns com.amazonaws.services.sqs.AmazonSQSAsync
  "Interface for accessing Amazon SQS asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonSQSAsync instead.



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
  (:import [com.amazonaws.services.sqs AmazonSQSAsync]))

(defn get-queue-url-async
  "Returns the URL of an existing Amazon SQS queue.


   To access a queue that belongs to another AWS account, use the QueueOwnerAWSAccountId parameter to
   specify the account ID of the queue's owner. The queue's owner must grant you permission to access the queue. For
   more information about shared queue access, see  AddPermission  or see Allow Developers to Write Messages to a Shared Queue in the Amazon Simple Queue Service Developer
   Guide.

  get-queue-url-request - `com.amazonaws.services.sqs.model.GetQueueUrlRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetQueueUrl operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.GetQueueUrlResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.GetQueueUrlRequest get-queue-url-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueueUrlAsync get-queue-url-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.GetQueueUrlRequest get-queue-url-request]
    (-> this (.getQueueUrlAsync get-queue-url-request))))

(defn get-queue-attributes-async
  "Simplified method form for invoking the GetQueueAttributes operation with an AsyncHandler.

  queue-url - `java.lang.String`
  attribute-names - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.GetQueueAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.util.List attribute-names ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueueAttributesAsync queue-url attribute-names async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.GetQueueAttributesRequest get-queue-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getQueueAttributesAsync get-queue-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.GetQueueAttributesRequest get-queue-attributes-request]
    (-> this (.getQueueAttributesAsync get-queue-attributes-request))))

(defn delete-message-batch-async
  "Simplified method form for invoking the DeleteMessageBatch operation with an AsyncHandler.

  queue-url - `java.lang.String`
  entries - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.DeleteMessageBatchResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.util.List entries ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMessageBatchAsync queue-url entries async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteMessageBatchRequest delete-message-batch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMessageBatchAsync delete-message-batch-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteMessageBatchRequest delete-message-batch-request]
    (-> this (.deleteMessageBatchAsync delete-message-batch-request))))

(defn list-queue-tags-async
  "List all cost allocation tags added to the specified Amazon SQS queue. For an overview, see Tagging
   Your Amazon SQS Queues in the Amazon Simple Queue Service Developer Guide.



   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer
   Guide.

  list-queue-tags-request - `com.amazonaws.services.sqs.model.ListQueueTagsRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQueueTags operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ListQueueTagsResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListQueueTagsRequest list-queue-tags-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQueueTagsAsync list-queue-tags-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListQueueTagsRequest list-queue-tags-request]
    (-> this (.listQueueTagsAsync list-queue-tags-request))))

(defn create-queue-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.CreateQueueResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.CreateQueueRequest create-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createQueueAsync create-queue-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.CreateQueueRequest create-queue-request]
    (-> this (.createQueueAsync create-queue-request))))

(defn remove-permission-async
  "Simplified method form for invoking the RemovePermission operation with an AsyncHandler.

  queue-url - `java.lang.String`
  label - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.RemovePermissionResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String label ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync queue-url label async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.RemovePermissionRequest remove-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.removePermissionAsync remove-permission-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.RemovePermissionRequest remove-permission-request]
    (-> this (.removePermissionAsync remove-permission-request))))

(defn untag-queue-async
  "Simplified method form for invoking the UntagQueue operation with an AsyncHandler.

  queue-url - `java.lang.String`
  tag-keys - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.UntagQueueResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.util.List tag-keys ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagQueueAsync queue-url tag-keys async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.UntagQueueRequest untag-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.untagQueueAsync untag-queue-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.UntagQueueRequest untag-queue-request]
    (-> this (.untagQueueAsync untag-queue-request))))

(defn send-message-async
  "Simplified method form for invoking the SendMessage operation with an AsyncHandler.

  queue-url - `java.lang.String`
  message-body - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.SendMessageResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String message-body ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendMessageAsync queue-url message-body async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.SendMessageRequest send-message-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendMessageAsync send-message-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.SendMessageRequest send-message-request]
    (-> this (.sendMessageAsync send-message-request))))

(defn change-message-visibility-async
  "Simplified method form for invoking the ChangeMessageVisibility operation with an AsyncHandler.

  queue-url - `java.lang.String`
  receipt-handle - `java.lang.String`
  visibility-timeout - `java.lang.Integer`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ChangeMessageVisibilityResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String receipt-handle ^java.lang.Integer visibility-timeout ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeMessageVisibilityAsync queue-url receipt-handle visibility-timeout async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String receipt-handle ^java.lang.Integer visibility-timeout]
    (-> this (.changeMessageVisibilityAsync queue-url receipt-handle visibility-timeout)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest change-message-visibility-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeMessageVisibilityAsync change-message-visibility-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityRequest change-message-visibility-request]
    (-> this (.changeMessageVisibilityAsync change-message-visibility-request))))

(defn add-permission-async
  "Simplified method form for invoking the AddPermission operation with an AsyncHandler.

  queue-url - `java.lang.String`
  label - `java.lang.String`
  a-ws-account-ids - `java.util.List`
  actions - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.AddPermissionResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List actions ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addPermissionAsync queue-url label a-ws-account-ids actions async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String label ^java.util.List a-ws-account-ids ^java.util.List actions]
    (-> this (.addPermissionAsync queue-url label a-ws-account-ids actions)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.AddPermissionRequest add-permission-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.addPermissionAsync add-permission-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.AddPermissionRequest add-permission-request]
    (-> this (.addPermissionAsync add-permission-request))))

(defn set-queue-attributes-async
  "Simplified method form for invoking the SetQueueAttributes operation with an AsyncHandler.

  queue-url - `java.lang.String`
  attributes - `java.util.Map`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.SetQueueAttributesResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.util.Map attributes ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setQueueAttributesAsync queue-url attributes async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.SetQueueAttributesRequest set-queue-attributes-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.setQueueAttributesAsync set-queue-attributes-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.SetQueueAttributesRequest set-queue-attributes-request]
    (-> this (.setQueueAttributesAsync set-queue-attributes-request))))

(defn receive-message-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ReceiveMessage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ReceiveMessageResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ReceiveMessageRequest receive-message-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.receiveMessageAsync receive-message-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ReceiveMessageRequest receive-message-request]
    (-> this (.receiveMessageAsync receive-message-request))))

(defn tag-queue-async
  "Simplified method form for invoking the TagQueue operation with an AsyncHandler.

  queue-url - `java.lang.String`
  tags - `java.util.Map`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.TagQueueResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.util.Map tags ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagQueueAsync queue-url tags async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.TagQueueRequest tag-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.tagQueueAsync tag-queue-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.TagQueueRequest tag-queue-request]
    (-> this (.tagQueueAsync tag-queue-request))))

(defn delete-message-async
  "Simplified method form for invoking the DeleteMessage operation with an AsyncHandler.

  queue-url - `java.lang.String`
  receipt-handle - `java.lang.String`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.DeleteMessageResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.lang.String receipt-handle ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMessageAsync queue-url receipt-handle async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteMessageRequest delete-message-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteMessageAsync delete-message-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteMessageRequest delete-message-request]
    (-> this (.deleteMessageAsync delete-message-request))))

(defn send-message-batch-async
  "Simplified method form for invoking the SendMessageBatch operation with an AsyncHandler.

  queue-url - `java.lang.String`
  entries - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.SendMessageBatchResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.util.List entries ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendMessageBatchAsync queue-url entries async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.SendMessageBatchRequest send-message-batch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.sendMessageBatchAsync send-message-batch-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.SendMessageBatchRequest send-message-batch-request]
    (-> this (.sendMessageBatchAsync send-message-batch-request))))

(defn change-message-visibility-batch-async
  "Simplified method form for invoking the ChangeMessageVisibilityBatch operation with an AsyncHandler.

  queue-url - `java.lang.String`
  entries - `java.util.List`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^java.lang.String queue-url ^java.util.List entries ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeMessageVisibilityBatchAsync queue-url entries async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest change-message-visibility-batch-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.changeMessageVisibilityBatchAsync change-message-visibility-batch-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ChangeMessageVisibilityBatchRequest change-message-visibility-batch-request]
    (-> this (.changeMessageVisibilityBatchAsync change-message-visibility-batch-request))))

(defn purge-queue-async
  "Deletes the messages in a queue specified by the QueueURL parameter.



   When you use the PurgeQueue action, you can't retrieve any messages deleted from a queue.


   The message deletion process takes up to 60 seconds. We recommend waiting for 60 seconds regardless of your
   queue's size.



   Messages sent to the queue before you call PurgeQueue might be received but are deleted
   within the next minute.


   Messages sent to the queue after you call PurgeQueue might be deleted while the queue is
   being purged.

  purge-queue-request - `com.amazonaws.services.sqs.model.PurgeQueueRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PurgeQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.PurgeQueueResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.PurgeQueueRequest purge-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.purgeQueueAsync purge-queue-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.PurgeQueueRequest purge-queue-request]
    (-> this (.purgeQueueAsync purge-queue-request))))

(defn list-queues-async
  "Returns a list of your queues. The maximum number of queues that can be returned is 1,000. If you specify a value
   for the optional QueueNamePrefix parameter, only queues with a name that begins with the specified
   value are returned.



   Cross-account permissions don't apply to this action. For more information, see Grant Cross-Account Permissions to a Role and a User Name in the Amazon Simple Queue Service Developer
   Guide.

  list-queues-request - `com.amazonaws.services.sqs.model.ListQueuesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListQueues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ListQueuesResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListQueuesRequest list-queues-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listQueuesAsync list-queues-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListQueuesRequest list-queues-request]
    (-> this (.listQueuesAsync list-queues-request)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this]
    (-> this (.listQueuesAsync))))

(defn delete-queue-async
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
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteQueue operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.DeleteQueueResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteQueueRequest delete-queue-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteQueueAsync delete-queue-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.DeleteQueueRequest delete-queue-request]
    (-> this (.deleteQueueAsync delete-queue-request))))

(defn list-dead-letter-source-queues-async
  "Returns a list of your queues that have the RedrivePolicy queue attribute configured with a
   dead-letter queue.


   For more information about using dead-letter queues, see Using Amazon SQS Dead-Letter Queues in the Amazon Simple Queue Service Developer Guide.

  list-dead-letter-source-queues-request - `com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListDeadLetterSourceQueues operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesResult>`"
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest list-dead-letter-source-queues-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listDeadLetterSourceQueuesAsync list-dead-letter-source-queues-request async-handler)))
  (^java.util.concurrent.Future [^AmazonSQSAsync this ^com.amazonaws.services.sqs.model.ListDeadLetterSourceQueuesRequest list-dead-letter-source-queues-request]
    (-> this (.listDeadLetterSourceQueuesAsync list-dead-letter-source-queues-request))))

