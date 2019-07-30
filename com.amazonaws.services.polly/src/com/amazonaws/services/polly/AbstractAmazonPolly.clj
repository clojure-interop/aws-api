(ns com.amazonaws.services.polly.AbstractAmazonPolly
  "Abstract implementation of AmazonPolly. Convenient method forms pass through to the corresponding overload
  that takes a request object, which throws an UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.polly AbstractAmazonPolly]))

(defn list-speech-synthesis-tasks
  "Description copied from interface: AmazonPolly

  request - `com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest`

  returns: Result of the ListSpeechSynthesisTasks operation returned by the service. - `com.amazonaws.services.polly.model.ListSpeechSynthesisTasksResult`"
  (^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksResult [^AbstractAmazonPolly this ^com.amazonaws.services.polly.model.ListSpeechSynthesisTasksRequest request]
    (-> this (.listSpeechSynthesisTasks request))))

(defn set-region
  "Description copied from interface: AmazonPolly

  region - The region this client will communicate with. See Region.getRegion(com.amazonaws.regions.Regions) for accessing a given region. Must not be null and must be a region where the service is available. - `com.amazonaws.regions.Region`"
  ([^AbstractAmazonPolly this ^com.amazonaws.regions.Region region]
    (-> this (.setRegion region))))

(defn shutdown
  "Description copied from interface: AmazonPolly"
  ([^AbstractAmazonPolly this]
    (-> this (.shutdown))))

(defn get-lexicon
  "Description copied from interface: AmazonPolly

  request - `com.amazonaws.services.polly.model.GetLexiconRequest`

  returns: Result of the GetLexicon operation returned by the service. - `com.amazonaws.services.polly.model.GetLexiconResult`"
  (^com.amazonaws.services.polly.model.GetLexiconResult [^AbstractAmazonPolly this ^com.amazonaws.services.polly.model.GetLexiconRequest request]
    (-> this (.getLexicon request))))

(defn put-lexicon
  "Description copied from interface: AmazonPolly

  request - `com.amazonaws.services.polly.model.PutLexiconRequest`

  returns: Result of the PutLexicon operation returned by the service. - `com.amazonaws.services.polly.model.PutLexiconResult`"
  (^com.amazonaws.services.polly.model.PutLexiconResult [^AbstractAmazonPolly this ^com.amazonaws.services.polly.model.PutLexiconRequest request]
    (-> this (.putLexicon request))))

(defn set-endpoint
  "Description copied from interface: AmazonPolly

  endpoint - The endpoint (ex: \"polly.us-east-1.amazonaws.com\") or a full URL, including the protocol (ex: \"polly.us-east-1.amazonaws.com\") of the region specific AWS endpoint this client will communicate with. - `java.lang.String`"
  ([^AbstractAmazonPolly this ^java.lang.String endpoint]
    (-> this (.setEndpoint endpoint))))

(defn synthesize-speech
  "Description copied from interface: AmazonPolly

  request - `com.amazonaws.services.polly.model.SynthesizeSpeechRequest`

  returns: Result of the SynthesizeSpeech operation returned by the service. - `com.amazonaws.services.polly.model.SynthesizeSpeechResult`"
  (^com.amazonaws.services.polly.model.SynthesizeSpeechResult [^AbstractAmazonPolly this ^com.amazonaws.services.polly.model.SynthesizeSpeechRequest request]
    (-> this (.synthesizeSpeech request))))

(defn describe-voices
  "Description copied from interface: AmazonPolly

  request - `com.amazonaws.services.polly.model.DescribeVoicesRequest`

  returns: Result of the DescribeVoices operation returned by the service. - `com.amazonaws.services.polly.model.DescribeVoicesResult`"
  (^com.amazonaws.services.polly.model.DescribeVoicesResult [^AbstractAmazonPolly this ^com.amazonaws.services.polly.model.DescribeVoicesRequest request]
    (-> this (.describeVoices request))))

(defn get-speech-synthesis-task
  "Description copied from interface: AmazonPolly

  request - `com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest`

  returns: Result of the GetSpeechSynthesisTask operation returned by the service. - `com.amazonaws.services.polly.model.GetSpeechSynthesisTaskResult`"
  (^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskResult [^AbstractAmazonPolly this ^com.amazonaws.services.polly.model.GetSpeechSynthesisTaskRequest request]
    (-> this (.getSpeechSynthesisTask request))))

(defn delete-lexicon
  "Description copied from interface: AmazonPolly

  request - `com.amazonaws.services.polly.model.DeleteLexiconRequest`

  returns: Result of the DeleteLexicon operation returned by the service. - `com.amazonaws.services.polly.model.DeleteLexiconResult`"
  (^com.amazonaws.services.polly.model.DeleteLexiconResult [^AbstractAmazonPolly this ^com.amazonaws.services.polly.model.DeleteLexiconRequest request]
    (-> this (.deleteLexicon request))))

(defn get-cached-response-metadata
  "Description copied from interface: AmazonPolly

  request - The originally executed request. - `com.amazonaws.AmazonWebServiceRequest`

  returns: The response metadata for the specified request, or null if none is available. - `com.amazonaws.ResponseMetadata`"
  (^com.amazonaws.ResponseMetadata [^AbstractAmazonPolly this ^com.amazonaws.AmazonWebServiceRequest request]
    (-> this (.getCachedResponseMetadata request))))

(defn presigners
  "Description copied from interface: AmazonPolly

  returns: Presigners utility object. - `com.amazonaws.services.polly.presign.AmazonPollyPresigners`"
  (^com.amazonaws.services.polly.presign.AmazonPollyPresigners [^AbstractAmazonPolly this]
    (-> this (.presigners))))

(defn list-lexicons
  "Description copied from interface: AmazonPolly

  request - `com.amazonaws.services.polly.model.ListLexiconsRequest`

  returns: Result of the ListLexicons operation returned by the service. - `com.amazonaws.services.polly.model.ListLexiconsResult`"
  (^com.amazonaws.services.polly.model.ListLexiconsResult [^AbstractAmazonPolly this ^com.amazonaws.services.polly.model.ListLexiconsRequest request]
    (-> this (.listLexicons request))))

(defn start-speech-synthesis-task
  "Description copied from interface: AmazonPolly

  request - `com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest`

  returns: Result of the StartSpeechSynthesisTask operation returned by the service. - `com.amazonaws.services.polly.model.StartSpeechSynthesisTaskResult`"
  (^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskResult [^AbstractAmazonPolly this ^com.amazonaws.services.polly.model.StartSpeechSynthesisTaskRequest request]
    (-> this (.startSpeechSynthesisTask request))))

