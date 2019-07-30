(ns com.amazonaws.services.lexruntime.AmazonLexRuntimeAsync
  "Interface for accessing Amazon Lex Runtime Service asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.

  Note: Do not directly implement this interface, new methods are added to it regularly. Extend from
  AbstractAmazonLexRuntimeAsync instead.



  Amazon Lex provides both build and runtime endpoints. Each endpoint provides a set of operations (API). Your
  conversational bot uses the runtime API to understand user utterances (user input text or voice). For example,
  suppose a user says \"I want pizza\", your bot sends this input to Amazon Lex using the runtime API. Amazon Lex
  recognizes that the user request is for the OrderPizza intent (one of the intents defined in the bot). Then Amazon
  Lex engages in user conversation on behalf of the bot to elicit required information (slot values, such as pizza size
  and crust type), and then performs fulfillment activity (that you configured when you created the bot). You use the
  build-time API to create and manage your Amazon Lex bot. For a list of build-time operations, see the build-time API,
  ."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lexruntime AmazonLexRuntimeAsync]))

(defn post-content-async
  "Sends user input (text or speech) to Amazon Lex. Clients use this API to send text and audio requests to Amazon
   Lex at runtime. Amazon Lex interprets the user input using the machine learning model that it built for the bot.


   The PostContent operation supports audio input at 8kHz and 16kHz. You can use 8kHz audio to achieve
   higher speech recognition accuracy in telephone audio applications.


   In response, Amazon Lex returns the next message to convey to the user. Consider the following example messages:




   For a user input \"I would like a pizza,\" Amazon Lex might return a response with a message eliciting slot data
   (for example, PizzaSize): \"What size pizza would you like?\".




   After the user provides all of the pizza order information, Amazon Lex might return a response with a message to
   get user confirmation: \"Order the pizza?\".




   After the user replies \"Yes\" to the confirmation prompt, Amazon Lex might return a conclusion statement:
   \"Thank you, your cheese pizza has been ordered.\".




   Not all Amazon Lex messages require a response from the user. For example, conclusion statements do not require a
   response. Some messages require only a yes or no response. In addition to the message, Amazon Lex
   provides additional context about the message in the response that you can use to enhance client behavior, such
   as displaying the appropriate client user interface. Consider the following examples:




   If the message is to elicit slot data, Amazon Lex returns the following context information:




   x-amz-lex-dialog-state header set to ElicitSlot




   x-amz-lex-intent-name header set to the intent name in the current context




   x-amz-lex-slot-to-elicit header set to the slot name for which the message is eliciting
   information




   x-amz-lex-slots header set to a map of slots configured for the intent with their current values






   If the message is a confirmation prompt, the x-amz-lex-dialog-state header is set to
   Confirmation and the x-amz-lex-slot-to-elicit header is omitted.




   If the message is a clarification prompt configured for the intent, indicating that the user intent is not
   understood, the x-amz-dialog-state header is set to ElicitIntent and the
   x-amz-slot-to-elicit header is omitted.




   In addition, Amazon Lex also returns your application-specific sessionAttributes. For more
   information, see Managing Conversation
   Context.

  post-content-request - `com.amazonaws.services.lexruntime.model.PostContentRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexruntime.model.PostContentResult>`"
  (^java.util.concurrent.Future [^AmazonLexRuntimeAsync this ^com.amazonaws.services.lexruntime.model.PostContentRequest post-content-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postContentAsync post-content-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexRuntimeAsync this ^com.amazonaws.services.lexruntime.model.PostContentRequest post-content-request]
    (-> this (.postContentAsync post-content-request))))

(defn post-text-async
  "Sends user input (text-only) to Amazon Lex. Client applications can use this API to send requests to Amazon Lex
   at runtime. Amazon Lex then interprets the user input using the machine learning model it built for the bot.


   In response, Amazon Lex returns the next message to convey to the user an optional
   responseCard to display. Consider the following example messages:




   For a user input \"I would like a pizza\", Amazon Lex might return a response with a message eliciting slot data
   (for example, PizzaSize): \"What size pizza would you like?\"




   After the user provides all of the pizza order information, Amazon Lex might return a response with a message to
   obtain user confirmation \"Proceed with the pizza order?\".




   After the user replies to a confirmation prompt with a \"yes\", Amazon Lex might return a conclusion statement:
   \"Thank you, your cheese pizza has been ordered.\".




   Not all Amazon Lex messages require a user response. For example, a conclusion statement does not require a
   response. Some messages require only a \"yes\" or \"no\" user response. In addition to the message,
   Amazon Lex provides additional context about the message in the response that you might use to enhance client
   behavior, for example, to display the appropriate client user interface. These are the slotToElicit,
   dialogState, intentName, and slots fields in the response. Consider the
   following examples:




   If the message is to elicit slot data, Amazon Lex returns the following context information:




   dialogState set to ElicitSlot




   intentName set to the intent name in the current context




   slotToElicit set to the slot name for which the message is eliciting information




   slots set to a map of slots, configured for the intent, with currently known values






   If the message is a confirmation prompt, the dialogState is set to ConfirmIntent and
   SlotToElicit is set to null.




   If the message is a clarification prompt (configured for the intent) that indicates that user intent is not
   understood, the dialogState is set to ElicitIntent and slotToElicit is set to null.




   In addition, Amazon Lex also returns your application-specific sessionAttributes. For more
   information, see Managing Conversation
   Context.

  post-text-request - `com.amazonaws.services.lexruntime.model.PostTextRequest`
  async-handler - Asynchronous callback handler for events in the lifecycle of the request. Users can provide an implementation of the callback methods in this interface to receive notification of successful or unsuccessful completion of the operation. - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostText operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexruntime.model.PostTextResult>`"
  (^java.util.concurrent.Future [^AmazonLexRuntimeAsync this ^com.amazonaws.services.lexruntime.model.PostTextRequest post-text-request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postTextAsync post-text-request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexRuntimeAsync this ^com.amazonaws.services.lexruntime.model.PostTextRequest post-text-request]
    (-> this (.postTextAsync post-text-request))))
