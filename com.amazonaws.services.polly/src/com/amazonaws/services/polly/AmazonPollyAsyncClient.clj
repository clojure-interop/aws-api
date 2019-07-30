(ns com.amazonaws.services.polly.AmazonPollyAsyncClient
  "Client for accessing Amazon Polly asynchronously. Each asynchronous method will return a Java Future object
  representing the asynchronous operation; overloads which accept an AsyncHandler can be used to receive
  notification when an asynchronous operation completes.


  Amazon Polly is a web service that makes it easy to synthesize speech from text.


  The Amazon Polly service provides API operations for synthesizing high-quality speech from plain text and Speech
  Synthesis Markup Language (SSML), along with managing pronunciations lexicons that enable you to get the best results
  for your application domain."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.polly AmazonPollyAsyncClient]))

(defn ->amazon-polly-async-client
  "Constructor.

  Deprecated. use AwsClientBuilder.withCredentials(AWSCredentialsProvider) and
               AwsClientBuilder.withClientConfiguration(ClientConfiguration) and
               AwsAsyncClientBuilder.withExecutorFactory(com.amazonaws.client.builder.ExecutorFactory)

  aws-credentials - The AWS credentials (access key ID and secret key) to use when authenticating with AWS services. - `com.amazonaws.auth.AWSCredentials`
  client-configuration - Client configuration options (ex: max retry limit, proxy settings, etc). - `com.amazonaws.ClientConfiguration`
  executor-service - The executor service by which all asynchronous requests will be executed. - `java.util.concurrent.ExecutorService`"
  (^AmazonPollyAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^com.amazonaws.ClientConfiguration client-configuration ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonPollyAsyncClient aws-credentials client-configuration executor-service))
  (^AmazonPollyAsyncClient [^com.amazonaws.auth.AWSCredentials aws-credentials ^java.util.concurrent.ExecutorService executor-service]
    (new AmazonPollyAsyncClient aws-credentials executor-service))
  (^AmazonPollyAsyncClient [^com.amazonaws.ClientConfiguration client-configuration]
    (new AmazonPollyAsyncClient client-configuration))
  (^AmazonPollyAsyncClient []
    (new AmazonPollyAsyncClient )))

(defn *async-builder
  "returns: `com.amazonaws.services.polly.AmazonPollyAsyncClientBuilder`"
  (^com.amazonaws.services.polly.AmazonPollyAsyncClientBuilder []
    (AmazonPollyAsyncClient/asyncBuilder )))

(defn synthesize-speech-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.SynthesizeSpeechRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SynthesizeSpeech operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.SynthesizeSpeechResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.SynthesizeSpeechRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.synthesizeSpeechAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.SynthesizeSpeechRequest request]
    (-> this (.synthesizeSpeechAsync request))))

(defn put-lexicon-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.PutLexiconRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the PutLexicon operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.PutLexiconResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.PutLexiconRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.putLexiconAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.PutLexiconRequest request]
    (-> this (.putLexiconAsync request))))

(defn get-executor-service
  "Returns the executor service used by this client to execute async requests.

  returns: The executor service used by this client to execute async requests. - `java.util.concurrent.ExecutorService`"
  (^java.util.concurrent.ExecutorService [^AmazonPollyAsyncClient this]
    (-> this (.getExecutorService))))

(defn start-speech-synthesis-task-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartSpeechSynthesisTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.StartSpeechSynthesisTaskResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startSpeechSynthesisTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest request]
    (-> this (.startSpeechSynthesisTaskAsync request))))

(defn get-speech-synthesis-task-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetSpeechSynthesisTask operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.GetSpeechSynthesisTaskResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getSpeechSynthesisTaskAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest request]
    (-> this (.getSpeechSynthesisTaskAsync request))))

(defn shutdown
  "Shuts down the client, releasing all managed resources. This includes forcibly terminating all pending
   asynchronous service calls. Clients who wish to give pending asynchronous service calls time to complete should
   call getExecutorService().shutdown() followed by getExecutorService().awaitTermination() prior to
   calling this method."
  ([^AmazonPollyAsyncClient this]
    (-> this (.shutdown))))

(defn delete-lexicon-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.DeleteLexiconRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteLexicon operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.DeleteLexiconResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.DeleteLexiconRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteLexiconAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.DeleteLexiconRequest request]
    (-> this (.deleteLexiconAsync request))))

(defn list-speech-synthesis-tasks-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListSpeechSynthesisTasks operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.ListSpeechSynthesisTasksResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listSpeechSynthesisTasksAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest request]
    (-> this (.listSpeechSynthesisTasksAsync request))))

(defn list-lexicons-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.ListLexiconsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListLexicons operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.ListLexiconsResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.ListLexiconsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listLexiconsAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.ListLexiconsRequest request]
    (-> this (.listLexiconsAsync request))))

(defn get-lexicon-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.GetLexiconRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLexicon operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.GetLexiconResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.GetLexiconRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLexiconAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.GetLexiconRequest request]
    (-> this (.getLexiconAsync request))))

(defn describe-voices-async
  "Description copied from interface: AmazonPollyAsync

  request - `com.amazonaws.services.polly.model.DescribeVoicesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeVoices operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.polly.model.DescribeVoicesResult>`"
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.DescribeVoicesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeVoicesAsync request async-handler)))
  (^java.util.concurrent.Future [^AmazonPollyAsyncClient this ^com.amazonaws.services.polly.model.DescribeVoicesRequest request]
    (-> this (.describeVoicesAsync request))))

