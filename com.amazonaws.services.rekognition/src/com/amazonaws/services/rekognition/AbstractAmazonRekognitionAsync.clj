(ns com.amazonaws.services.rekognition.AbstractAmazonRekognitionAsync
  "Abstract implementation of AmazonRekognitionAsync. Convenient method forms pass through to the corresponding
  overload that takes a request object and an AsyncHandler, which throws an
  UnsupportedOperationException."
  (:refer-clojure :only [require comment defn ->])
  (:import [com.amazonaws.services.rekognition AbstractAmazonRekognitionAsync]))

(defn delete-faces-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.DeleteFacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DeleteFacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteFacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteFacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteFacesRequest request]
    (-> this (.deleteFacesAsync request))))

(defn detect-labels-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.DetectLabelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectLabels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DetectLabelsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectLabelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectLabelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectLabelsRequest request]
    (-> this (.detectLabelsAsync request))))

(defn search-faces-by-image-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.SearchFacesByImageRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchFacesByImage operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.SearchFacesByImageResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.SearchFacesByImageRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchFacesByImageAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.SearchFacesByImageRequest request]
    (-> this (.searchFacesByImageAsync request))))

(defn describe-stream-processor-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeStreamProcessor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DescribeStreamProcessorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeStreamProcessorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DescribeStreamProcessorRequest request]
    (-> this (.describeStreamProcessorAsync request))))

(defn get-face-detection-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.GetFaceDetectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFaceDetection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetFaceDetectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetFaceDetectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFaceDetectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetFaceDetectionRequest request]
    (-> this (.getFaceDetectionAsync request))))

(defn get-content-moderation-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.GetContentModerationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetContentModeration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetContentModerationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetContentModerationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getContentModerationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetContentModerationRequest request]
    (-> this (.getContentModerationAsync request))))

(defn get-face-search-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.GetFaceSearchRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetFaceSearch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetFaceSearchResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetFaceSearchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getFaceSearchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetFaceSearchRequest request]
    (-> this (.getFaceSearchAsync request))))

(defn delete-collection-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.DeleteCollectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteCollection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DeleteCollectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteCollectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteCollectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteCollectionRequest request]
    (-> this (.deleteCollectionAsync request))))

(defn list-faces-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.ListFacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.ListFacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListFacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listFacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListFacesRequest request]
    (-> this (.listFacesAsync request))))

(defn detect-moderation-labels-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectModerationLabels operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DetectModerationLabelsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectModerationLabelsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectModerationLabelsRequest request]
    (-> this (.detectModerationLabelsAsync request))))

(defn start-person-tracking-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.StartPersonTrackingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartPersonTracking operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartPersonTrackingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartPersonTrackingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startPersonTrackingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartPersonTrackingRequest request]
    (-> this (.startPersonTrackingAsync request))))

(defn get-label-detection-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.GetLabelDetectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetLabelDetection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetLabelDetectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetLabelDetectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getLabelDetectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetLabelDetectionRequest request]
    (-> this (.getLabelDetectionAsync request))))

(defn start-face-search-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.StartFaceSearchRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartFaceSearch operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartFaceSearchResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartFaceSearchRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startFaceSearchAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartFaceSearchRequest request]
    (-> this (.startFaceSearchAsync request))))

(defn start-face-detection-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.StartFaceDetectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartFaceDetection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartFaceDetectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartFaceDetectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startFaceDetectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartFaceDetectionRequest request]
    (-> this (.startFaceDetectionAsync request))))

(defn search-faces-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.SearchFacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the SearchFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.SearchFacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.SearchFacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.searchFacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.SearchFacesRequest request]
    (-> this (.searchFacesAsync request))))

(defn start-label-detection-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.StartLabelDetectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartLabelDetection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartLabelDetectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartLabelDetectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startLabelDetectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartLabelDetectionRequest request]
    (-> this (.startLabelDetectionAsync request))))

(defn describe-collection-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.DescribeCollectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DescribeCollection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DescribeCollectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DescribeCollectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.describeCollectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DescribeCollectionRequest request]
    (-> this (.describeCollectionAsync request))))

(defn delete-stream-processor-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DeleteStreamProcessor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DeleteStreamProcessorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.deleteStreamProcessorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DeleteStreamProcessorRequest request]
    (-> this (.deleteStreamProcessorAsync request))))

(defn index-faces-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.IndexFacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the IndexFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.IndexFacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.IndexFacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.indexFacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.IndexFacesRequest request]
    (-> this (.indexFacesAsync request))))

(defn recognize-celebrities-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the RecognizeCelebrities operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.RecognizeCelebritiesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.recognizeCelebritiesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.RecognizeCelebritiesRequest request]
    (-> this (.recognizeCelebritiesAsync request))))

(defn get-celebrity-info-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCelebrityInfo operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetCelebrityInfoResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCelebrityInfoAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetCelebrityInfoRequest request]
    (-> this (.getCelebrityInfoAsync request))))

(defn start-content-moderation-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.StartContentModerationRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartContentModeration operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartContentModerationResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartContentModerationRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startContentModerationAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartContentModerationRequest request]
    (-> this (.startContentModerationAsync request))))

(defn stop-stream-processor-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.StopStreamProcessorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StopStreamProcessor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StopStreamProcessorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StopStreamProcessorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.stopStreamProcessorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StopStreamProcessorRequest request]
    (-> this (.stopStreamProcessorAsync request))))

(defn create-stream-processor-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateStreamProcessor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.CreateStreamProcessorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createStreamProcessorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CreateStreamProcessorRequest request]
    (-> this (.createStreamProcessorAsync request))))

(defn start-stream-processor-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.StartStreamProcessorRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartStreamProcessor operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartStreamProcessorResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartStreamProcessorRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startStreamProcessorAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartStreamProcessorRequest request]
    (-> this (.startStreamProcessorAsync request))))

(defn detect-faces-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.DetectFacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DetectFacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectFacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectFacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectFacesRequest request]
    (-> this (.detectFacesAsync request))))

(defn get-person-tracking-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.GetPersonTrackingRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetPersonTracking operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetPersonTrackingResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetPersonTrackingRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getPersonTrackingAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetPersonTrackingRequest request]
    (-> this (.getPersonTrackingAsync request))))

(defn detect-text-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.DetectTextRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the DetectText operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.DetectTextResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectTextRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.detectTextAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.DetectTextRequest request]
    (-> this (.detectTextAsync request))))

(defn create-collection-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.CreateCollectionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CreateCollection operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.CreateCollectionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CreateCollectionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.createCollectionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CreateCollectionRequest request]
    (-> this (.createCollectionAsync request))))

(defn list-stream-processors-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListStreamProcessors operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.ListStreamProcessorsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listStreamProcessorsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListStreamProcessorsRequest request]
    (-> this (.listStreamProcessorsAsync request))))

(defn compare-faces-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.CompareFacesRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the CompareFaces operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.CompareFacesResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CompareFacesRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.compareFacesAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.CompareFacesRequest request]
    (-> this (.compareFacesAsync request))))

(defn list-collections-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.ListCollectionsRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the ListCollections operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.ListCollectionsResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListCollectionsRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.listCollectionsAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.ListCollectionsRequest request]
    (-> this (.listCollectionsAsync request))))

(defn start-celebrity-recognition-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the StartCelebrityRecognition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.StartCelebrityRecognitionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.startCelebrityRecognitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.StartCelebrityRecognitionRequest request]
    (-> this (.startCelebrityRecognitionAsync request))))

(defn get-celebrity-recognition-async
  "Description copied from interface: AmazonRekognitionAsync

  request - `com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest`
  async-handler - `com.amazonaws.handlers.AsyncHandler`

  returns: A Java Future containing the result of the GetCelebrityRecognition operation returned by the service. - `java.util.concurrent.Future<com.amazonaws.services.rekognition.model.GetCelebrityRecognitionResult>`"
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest request ^com.amazonaws.handlers.AsyncHandler async-handler]
    (-> this (.getCelebrityRecognitionAsync request async-handler)))
  (^java.util.concurrent.Future [^AbstractAmazonRekognitionAsync this ^com.amazonaws.services.rekognition.model.GetCelebrityRecognitionRequest request]
    (-> this (.getCelebrityRecognitionAsync request))))

