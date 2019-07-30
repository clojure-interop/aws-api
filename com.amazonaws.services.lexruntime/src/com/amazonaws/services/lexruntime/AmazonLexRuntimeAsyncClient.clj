(ns com.amazonaws.services.lexruntime.AmazonLexRuntimeAsyncClient
  "Client for accessing Amazon Lex Runtime Service asynchronously. Each asynchronous method will return a Java Future
  object representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Amazon Lex provides both build and runtime endpoints. Each endpoint provides a set of operations (API). Your
  conversational bot uses the runtime API to understand user utterances (user input text or voice). For example,
  suppose a user says \"I want pizza\", your bot sends this input to Amazon Lex using the runtime API. Amazon Lex
  recognizes that the user request is for the OrderPizza intent (one of the intents defined in the bot). Then Amazon
  Lex engages in user conversation on behalf of the bot to elicit required information (slot values, such as pizza size
  and crust type), and then performs fulfillment activity (that you configured when you created the bot). You use the
  build-time API to create and manage your Amazon Lex bot. For a list of build-time operations, see the build-time API,
  ."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.lexruntime AmazonLexRuntimeAsyncClient]))

(defn *async-builder
  "returns: `com.amazonaws.services.lexruntime.AmazonLexRuntimeAsyncClientBuilder`"
  (^com.amazonaws.services.lexruntime.AmazonLexRuntimeAsyncClientBuilder []
    (AmazonLexRuntimeAsyncClient/asyncBuilder )))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonLexRuntimeAsyncClient this]
    (-> this (.getExecutorService))))

(defn post-content-async
  "Description copied from interface: AmazonLexRuntimeAsync

  request - `com.amazonaws.services.lexruntime.model.PostContentRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostContent operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexruntime.model.PostContentResult>`"
  (^java.util.concurrent.Future [^AmazonLexRuntimeAsyncClient this ^com.amazonaws.services.lexruntime.model.PostContentRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postContentAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexRuntimeAsyncClient this ^com.amazonaws.services.lexruntime.model.PostContentRequest request]
    (-> this (.postContentAsync request))))

(defn post-text-async
  "Description copied from interface: AmazonLexRuntimeAsync

  request - `com.amazonaws.services.lexruntime.model.PostTextRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PostText operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.lexruntime.model.PostTextResult>`"
  (^java.util.concurrent.Future [^AmazonLexRuntimeAsyncClient this ^com.amazonaws.services.lexruntime.model.PostTextRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.postTextAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonLexRuntimeAsyncClient this ^com.amazonaws.services.lexruntime.model.PostTextRequest request]
    (-> this (.postTextAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonLexRuntimeAsyncClient this]
    (-> this (.shutdown))))

